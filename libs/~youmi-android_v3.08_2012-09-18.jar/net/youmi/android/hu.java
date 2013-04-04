// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.*;

class hu
{

	static boolean a(File file, String s)
	{
		if (file == null)
			return false;
		if (!file.exists())
			return false;
		if (s == null)
			break MISSING_BLOCK_LABEL_68;
		StringBuilder stringbuilder = new StringBuilder(100);
		stringbuilder.append("chmod ").append(s).append(" ").append(file.getAbsolutePath());
		String s1 = stringbuilder.toString();
		Runtime.getRuntime().exec(s1);
		return true;
		Throwable throwable;
		throwable;
		return false;
	}

	static boolean a(File file, File file1)
	{
		if (file == null || file1 == null)
			return false;
		if (!file.exists())
			return false;
		if (file.renameTo(file1))
			return true;
		if (!b(file, file1))
			break MISSING_BLOCK_LABEL_51;
		try
		{
			if (!file.delete());
		}
		catch (Throwable throwable) { }
		return true;
		Throwable throwable1;
		throwable1;
		return false;
	}

	static boolean b(File file, File file1)
	{
		FileOutputStream fileoutputstream;
		FileInputStream fileinputstream;
		fileoutputstream = null;
		fileinputstream = null;
		long l = System.currentTimeMillis();
		long l1 = 0L;
		Object obj = null;
		Object obj1 = null;
		if (file != null) goto _L2; else goto _L1
_L1:
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Throwable throwable2) { }
		try
		{
			if (fileinputstream != null)
				fileinputstream.close();
		}
		catch (Throwable throwable3) { }
		return false;
_L2:
		if (file.exists() && file1 != null) goto _L3; else goto _L1
_L3:
		try
		{
			long l2 = file.length();
			String s = file.getAbsolutePath();
			String s1 = file1.getAbsolutePath();
		}
		catch (Throwable throwable) { }
		fileinputstream = new FileInputStream(file);
		fileoutputstream = new FileOutputStream(file1);
		byte abyte0[] = new byte[1024];
		for (int i = 0; (i = fileinputstream.read(abyte0)) > 0;)
			fileoutputstream.write(abyte0, 0, i);

		fileoutputstream.flush();
		fileoutputstream.close();
		fileoutputstream = null;
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Throwable throwable4) { }
		try
		{
			if (fileinputstream != null)
				fileinputstream.close();
		}
		catch (Throwable throwable5) { }
		return true;
		Throwable throwable1;
		throwable1;
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Throwable throwable6) { }
		try
		{
			if (fileinputstream != null)
				fileinputstream.close();
		}
		catch (Throwable throwable7) { }
		break MISSING_BLOCK_LABEL_242;
		Exception exception;
		exception;
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Throwable throwable8) { }
		try
		{
			if (fileinputstream != null)
				fileinputstream.close();
		}
		catch (Throwable throwable9) { }
		throw exception;
		return false;
	}
}
