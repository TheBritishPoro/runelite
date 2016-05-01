package net.runelite.asm.attributes.code.instructions;

import net.runelite.asm.ClassFile;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instruction.types.GetFieldInstruction;
import net.runelite.asm.execution.Frame;
import net.runelite.asm.execution.InstructionContext;
import net.runelite.asm.execution.Stack;
import net.runelite.asm.execution.StackContext;
import net.runelite.asm.execution.Type;
import net.runelite.asm.pool.Class;
import net.runelite.asm.pool.Field;
import net.runelite.asm.pool.NameAndType;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import net.runelite.asm.Method;
import net.runelite.asm.execution.Value;

public class GetStatic extends Instruction implements GetFieldInstruction
{
	private Field field;
	private net.runelite.asm.Field myField;

	public GetStatic(Instructions instructions, InstructionType type, int pc)
	{
		super(instructions, type, pc);
	}
	
	public GetStatic(Instructions instructions, Field field)
	{
		super(instructions, InstructionType.GETSTATIC, -1);
		
		this.field = field;
		length += 2;
	}
	
	@Override
	public String toString()
	{
		Method m = this.getInstructions().getCode().getAttributes().getMethod();
		return "getstatic " + myField + " in " + m;
	}
	
	@Override
	public void load(DataInputStream is) throws IOException
	{
		field = this.getPool().getField(is.readUnsignedShort());
		length += 2;
	}
	
	@Override
	public void write(DataOutputStream out) throws IOException
	{
		super.write(out);
		out.writeShort(this.getPool().make(field));
	}

	@Override
	public InstructionContext execute(Frame frame)
	{
		InstructionContext ins = new InstructionContext(this, frame);
		Stack stack = frame.getStack();
		
		StackContext ctx = new StackContext(ins, new Type(field.getNameAndType().getDescriptorType()), Value.UNKNOWN);		
		stack.push(ctx);
		
		ins.push(ctx);
		
		return ins;
	}

	@Override
	public Field getField()
	{
		return field;
	}
	
	@Override
	public net.runelite.asm.Field getMyField()
	{
		Class clazz = field.getClassEntry();
		NameAndType nat = field.getNameAndType();

		ClassFile cf = this.getInstructions().getCode().getAttributes().getClassFile().getGroup().findClass(clazz.getName());
		if (cf == null)
			return null;

		net.runelite.asm.Field f2 = cf.findFieldDeep(nat);
		return f2;
	}
	
	@Override
	public void lookup()
	{
		myField = this.getMyField();
	}
	
	@Override
	public void regeneratePool()
	{
		if (myField != null)
			if (getMyField() != myField)
				field = myField.getPoolField();
	}
}
