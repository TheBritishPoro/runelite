/*
 * Copyright (c) 2016, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. All advertising materials mentioning features or use of this software
 *    must display the following acknowledgement:
 *    This product includes software developed by Adam <Adam@sigterm.info>
 * 4. Neither the name of the Adam <Adam@sigterm.info> nor the
 *    names of its contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY Adam <Adam@sigterm.info> ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL Adam <Adam@sigterm.info> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.runelite.asm;

import net.runelite.asm.attributes.Attributes;
import net.runelite.asm.pool.Class;
import net.runelite.asm.pool.NameAndType;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.runelite.asm.signature.Signature;

public class ClassFile
{
	private static final int MAGIC = 0xcafebabe;

	private static final short ACC_FINAL = 0x0010;
	private static final short ACC_ABSTRACT = 0x0400;
	
	private ClassGroup group;

	private ClassFile parent; // super class
	private List<ClassFile> children = new ArrayList<>(); // classes which inherit from this

	private short minor_version;
	private short major_version;
	private ConstantPool pool;
	private short access_flags;
	private Class name;
	private Class super_class;
	private Interfaces interfaces;
	private Fields fields;
	private Methods methods;
	private Attributes attributes;

	public ClassFile(ClassGroup group, DataInputStream is) throws IOException
	{
		this.group = group;

		int magic = is.readInt();
		if (magic != MAGIC)
			throw new IOException("File is not a java class file.");

		minor_version = is.readShort();
		major_version = is.readShort();

		pool = new ConstantPool(this, is);

		access_flags = is.readShort();
		name = pool.getClass(is.readUnsignedShort());
		super_class = pool.getClass(is.readUnsignedShort());

		interfaces = new Interfaces(this, is);

		fields = new Fields(this, is);

		methods = new Methods(this, is);

		attributes = new Attributes(this, is);
	}
	
	public ClassFile(ClassGroup group)
	{
		this.group = group;
		
		interfaces = new Interfaces(this);
		fields = new Fields(this);
		methods = new Methods(this);
		attributes = new Attributes(this);
	}

	@Override
	public String toString()
	{
		return "ClassFile{" + "name=" + name + '}';
	}
	
	public void write(DataOutputStream out) throws IOException
	{
		out.writeInt(MAGIC);
		
		out.writeShort(minor_version);
		out.writeShort(major_version);
		
		/* constant pool will be rebuilt now */
		pool.reset();
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		DataOutputStream rest = new DataOutputStream(bout);
		rest.writeShort(access_flags);
		rest.writeShort(pool.make(name));
		rest.writeShort(pool.make(super_class));
		
		interfaces.write(rest);
		
		fields.write(rest);
		
		methods.write(rest);
		
		attributes.write(rest);
		
		// Now the pool is created
		
		pool.write(out);
		out.write(bout.toByteArray());
	}

	public ClassGroup getGroup()
	{
		return group;
	}
	
	public ConstantPool getPool()
	{
		return pool;
	}
	
	public Interfaces getInterfaces()
	{
		return interfaces;
	}

	public Fields getFields()
	{
		return fields;
	}
	
	public Methods getMethods()
	{
		return methods;
	}

	public Attributes getAttributes()
	{
		return attributes;
	}

	public String getName()
	{
		return name.getName();
	}
	
	public void setName(String name)
	{
		this.name = new Class(name);
	}
	
	public String getClassName()
	{
		String n = getName();
		int i = n.lastIndexOf('/');
		return n.substring(i + 1);
	}
	
	public String getSuperName()
	{
		return super_class.getName();
	}
	
	public void setSuperName(String name)
	{
		super_class = new Class(name);
	}
	
	public Class getParentClass()
	{
		return this.super_class;
	}
	
	public void setParentClass(Class c)
	{
		super_class = c;
	}

	public ClassFile getParent()
	{
		return parent;
	}
	
	public List<ClassFile> getChildren()
	{
		return children;
	}
	
	public Field findField(String name)
	{
		return fields.findField(name);
	}
	
	public Field findField(NameAndType nat)
	{
		return fields.findField(nat);
	}
	
	public Class getPoolClass()
	{
		return name;
	}

	public Field findFieldDeep(NameAndType nat)
	{
		Field f = fields.findField(nat);
		if (f != null)
			return f;

		ClassFile parent = getParent();
		if (parent != null)
			return parent.findFieldDeep(nat);

		return null;
	}
	
	public Method findMethodDeep(NameAndType nat)
	{
		Method m = methods.findMethod(nat);
		if (m != null)
			return m;

		ClassFile parent = getParent();
		if (parent != null)
			return parent.findMethodDeep(nat);

		return null;
	}
	
	public Method findMethodDeepStatic(NameAndType nat)
	{
		Method m = methods.findMethod(nat);
		if (m != null && m.isStatic())
			return m;

		ClassFile parent = getParent();
		if (parent != null)
			return parent.findMethodDeepStatic(nat);

		return null;
	}
	
	public Method findMethod(NameAndType nat)
	{
		return methods.findMethod(nat);
	}
	
	public Method findMethod(String name)
	{
		return methods.findMethod(name);
	}

	public Method findMethod(String name, Signature signature)
	{
		return methods.findMethod(new NameAndType(name, signature));
	}
	
	public Method findMethodDeep(String name)
	{
		Method m = methods.findMethod(name);
		if (m != null)
			return m;
		
		ClassFile parent = getParent();
		if (parent != null)
			return parent.findMethodDeep(name);

		return null;
	}
	
	public void clearClassGraph()
	{
		parent = null;
		children.clear();
	}

	public void buildClassGraph()
	{
		ClassFile other = group.findClass(super_class.getName());
		if (other != null)
		{
			this.parent = other;
			parent.children.add(this);
		}
		
		for (ClassFile i : interfaces.getMyInterfaces())
		{
			i.children.add(this);
		}
	}
	
	public boolean instanceOf(ClassFile other)
	{
		return this == other || interfaces.instanceOf(other) || (getParent() != null && getParent().instanceOf(other));
	}

	public boolean isAbstract()
	{
		return (this.access_flags & ACC_ABSTRACT) != 0;
	}

	public boolean isFinal()
	{
		return (this.access_flags & ACC_FINAL) != 0;
	}

	public void clearFinal()
	{
		this.access_flags &= ~ACC_FINAL;
	}

	public void clearAbstract()
	{
		this.access_flags &= ~ACC_ABSTRACT;
	}
}
