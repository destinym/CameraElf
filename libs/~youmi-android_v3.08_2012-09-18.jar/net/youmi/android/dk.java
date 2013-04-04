// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;

// Referenced classes of package net.youmi.android:
//			gx

class dk
{

	static String a(String s)
	{
		String s1;
		s1 = null;
		if (s != null && s.length() > 0)
			try
			{
				MessageDigest messagedigest = MessageDigest.getInstance("MD5");
				byte abyte0[] = s.getBytes();
				messagedigest.update(abyte0, 0, abyte0.length);
				s1 = String.format("%032x", new Object[] {
					new BigInteger(1, messagedigest.digest())
				});
			}
			catch (Throwable throwable1) { }
		return s1;
		Throwable throwable;
		throwable;
		return "";
	}

	static String a(File file)
	{
		if (file == null)
			return null;
label0:
		{
			if (!file.exists())
				return null;
			break label0;
		}
		Throwable throwable;
		throwable;
label1:
		{
			FileInputStream fileinputstream = null;
			byte abyte0[] = new byte[1024];
			boolean flag = false;
			String s;
			try
			{
				fileinputstream = new FileInputStream(file);
				MessageDigest messagedigest = MessageDigest.getInstance("MD5");
				int i;
				while ((i = fileinputstream.read(abyte0)) > 0) 
					messagedigest.update(abyte0, 0, i);
				s = gx.a(messagedigest.digest());
			}
			catch (Throwable throwable1)
			{
				try
				{
					if (fileinputstream != null)
						fileinputstream.close();
				}
				catch (Throwable throwable3) { }
				break label1;
			}
			finally
			{
				try
				{
					if (fileinputstream != null)
						fileinputstream.close();
				}
				catch (Throwable throwable4) { }
				throw exception;
			}
			try
			{
				if (fileinputstream != null)
					fileinputstream.close();
			}
			catch (Throwable throwable2) { }
			return s;
		}
		return null;
	}

	static boolean a(File file, String s)
	{
		String s1 = a(file);
		if (s1 == null)
			return false;
		s1 = s1.toLowerCase();
		if (s == null)
			return false;
		s = s.toLowerCase();
		return s1.equals(s);
		Throwable throwable;
		throwable;
		return false;
	}
}
