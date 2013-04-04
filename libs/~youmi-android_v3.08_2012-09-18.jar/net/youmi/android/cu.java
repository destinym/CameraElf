// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package net.youmi.android:
//			cv

class cu extends InputStream
{

	private InputStream a;
	private int b[];
	private int c;
	private boolean d;

	public cu(InputStream inputstream)
	{
		c = 0;
		d = false;
		a = inputstream;
	}

	public int read()
	{
		if (b == null || c == b.length)
		{
			if (d)
				return -1;
			a();
			if (b.length == 0)
			{
				b = null;
				return -1;
			}
			c = 0;
		}
		return b[c++];
	}

	private void a()
	{
		char ac[] = new char[4];
		int i = 0;
		do
		{
			int i1 = a.read();
			if (i1 == -1)
				if (i != 0)
				{
					throw new IOException("Bad base64 stream");
				} else
				{
					b = new int[0];
					d = true;
					return;
				}
			char c1 = (char)i1;
			if (cv.a.indexOf(c1) != -1 || c1 == cv.b)
				ac[i++] = c1;
			else
			if (c1 != '\r' && c1 != '\n')
				throw new IOException("Bad base64 stream");
		} while (i < 4);
		boolean flag = false;
		for (int j = 0; j < 4; j++)
			if (ac[j] != cv.b)
			{
				if (flag)
					throw new IOException("Bad base64 stream");
			} else
			if (!flag)
				flag = true;

		byte byte0;
		if (ac[3] == cv.b)
		{
			if (a.read() != -1)
				throw new IOException("Bad base64 stream");
			d = true;
			if (ac[2] == cv.b)
				byte0 = 1;
			else
				byte0 = 2;
		} else
		{
			byte0 = 3;
		}
		int j1 = 0;
		for (int k = 0; k < 4; k++)
			if (ac[k] != cv.b)
				j1 |= cv.a.indexOf(ac[k]) << 6 * (3 - k);

		b = new int[byte0];
		for (int l = 0; l < byte0; l++)
			b[l] = j1 >>> 8 * (2 - l) & 0xff;

	}

	public void close()
	{
		a.close();
	}
}
