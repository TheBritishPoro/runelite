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
package net.runelite.cache.io;

import java.io.IOException;
import java.nio.ByteBuffer;

public class InputStream extends java.io.InputStream
{
	private static final char[] CHARACTERS = new char[]
	{
		'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026',
		'\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039',
		'\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018',
		'\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014',
		'\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000',
		'\u017e', '\u0178'
	};

	private final ByteBuffer buffer;

	public InputStream(byte[] buffer)
	{
		this.buffer = ByteBuffer.wrap(buffer);
	}

	public int read24BitInt()
	{
		return (this.readUnsignedByte() << 16) + (this.readUnsignedByte() << 8) + this.readUnsignedByte();
	}

	public void skip(int length)
	{
		int pos = buffer.position();
		pos += length;
		buffer.position(pos);
	}

	public void setOffset(int offset)
	{
		buffer.position(offset);
	}

	public int getOffset()
	{
		return buffer.position();
	}

	public int getLength()
	{
		return buffer.limit();
	}

	public byte readByte()
	{
		return buffer.get();
	}

	public void readBytes(byte[] buffer, int off, int len)
	{
		this.buffer.get(buffer, off, len);
	}

	public void readBytes(byte[] buffer)
	{
		this.buffer.get(buffer);
	}

	public int readUnsignedByte()
	{
		return this.readByte() & 0xFF;
	}

	public int readUnsignedShort()
	{
		return buffer.getShort() & 0xFFFF;
	}

	public short readShort()
	{
		return buffer.getShort();
	}

	public int readInt()
	{
		return buffer.getInt();
	}

	public byte peek()
	{
		int position = buffer.position();
		try
		{
			return buffer.get();
		}
		finally
		{
			buffer.position(position);
		}
	}

	public int readBigSmart()
	{
		return peek() >= 0 ? this.readUnsignedShort() : Integer.MAX_VALUE & this.readInt();
	}

	public int readShortSmart()
	{
		int var2 = this.peek() & 0xFF;
		return var2 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 0xc000;
	}

	public String readString()
	{
		StringBuilder sb = new StringBuilder();

		for (;;)
		{
			int ch = this.readByte();

			if (ch == 0)
				break;

			if (ch >= 128 && ch < 160)
			{
				char var7 = CHARACTERS[ch - 128];
				if (0 == var7)
				{
					var7 = 63;
				}

				ch = var7;
			}

			sb.append((char) ch);
		}
		return sb.toString();
	}


	public String readStringOrNull()
	{
		if (this.peek() != 0)
		{
			return readString();
		}
		else
		{
			this.readByte(); // discard
			return null;
		}
	}

	public byte[] getRemaining()
	{
		byte[] b = new byte[buffer.remaining()];
		buffer.get(b);
		return b;
	}

	@Override
	public int read() throws IOException
	{
		return this.readUnsignedByte();
	}
}
