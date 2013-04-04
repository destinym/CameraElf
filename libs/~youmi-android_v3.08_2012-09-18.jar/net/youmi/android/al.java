// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.*;

// Referenced classes of package net.youmi.android:
//			cu

class al
{

	static byte[] a(byte abyte0[])
	{
		ByteArrayInputStream bytearrayinputstream;
		ByteArrayOutputStream bytearrayoutputstream;
		bytearrayinputstream = new ByteArrayInputStream(abyte0);
		bytearrayoutputstream = new ByteArrayOutputStream();
		try
		{
			a(((InputStream) (bytearrayinputstream)), ((OutputStream) (bytearrayoutputstream)));
		}
		catch (IOException ioexception)
		{
			throw new RuntimeException("Unexpected I/O error", ioexception);
		}
		break MISSING_BLOCK_LABEL_60;
		Exception exception;
		exception;
		try
		{
			bytearrayinputstream.close();
		}
		catch (Throwable throwable) { }
		try
		{
			bytearrayoutputstream.close();
		}
		catch (Throwable throwable1) { }
		throw exception;
		try
		{
			bytearrayinputstream.close();
		}
		catch (Throwable throwable2) { }
		try
		{
			bytearrayoutputstream.close();
		}
		catch (Throwable throwable3) { }
		return bytearrayoutputstream.toByteArray();
	}

	static void a(InputStream inputstream, OutputStream outputstream)
	{
		b(new cu(inputstream), outputstream);
	}

	private static void b(InputStream inputstream, OutputStream outputstream)
	{
		byte abyte0[] = new byte[1024];
		int i;
		while ((i = inputstream.read(abyte0)) != -1) 
			outputstream.write(abyte0, 0, i);
	}
}
