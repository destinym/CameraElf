// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.ByteArrayOutputStream;

class bj
{

	static final int a[] = {
		255, 65280, 0xff0000, 0xff000000
	};

	static final int a(byte abyte0[], int i, int j)
	{
		int k = 0;
		int l = 0;
		for (int i1 = 0; i1 < j; i1++)
		{
			k |= abyte0[i + i1] << l & a[i1];
			l += 8;
		}

		return k;
	}

	static final int a(byte byte0, int i, int j)
	{
		if (i + j > 8)
		{
			return byte0;
		} else
		{
			int k = byte0;
			k = k << 8 - i - j & 0xff;
			k >>>= 8 - j;
			return k;
		}
	}

	static final void a(int i, int j, ByteArrayOutputStream bytearrayoutputstream)
	{
		byte abyte0[] = new byte[j];
		for (int k = j - 1; k >= 0; k--)
		{
			abyte0[k] = (byte)(i & 0xff);
			i >>>= 8;
		}

		bytearrayoutputstream.write(abyte0);
	}

	static final void a(long l, int i, ByteArrayOutputStream bytearrayoutputstream)
	{
		byte abyte0[] = new byte[i];
		for (int j = i - 1; j >= 0; j--)
		{
			abyte0[j] = (byte)(int)(l & 255L);
			l >>>= 8;
		}

		bytearrayoutputstream.write(abyte0);
	}

	static final void a(String s, ByteArrayOutputStream bytearrayoutputstream)
	{
		if (s == null)
			return;
		try
		{
			if (s.indexOf(' ') > -1)
				s = s.trim();
			if (s.indexOf('&') > -1)
				s = s.replace('&', '_');
			bytearrayoutputstream.write(s.getBytes("UTF-8"));
		}
		catch (Exception exception) { }
		return;
	}

}
