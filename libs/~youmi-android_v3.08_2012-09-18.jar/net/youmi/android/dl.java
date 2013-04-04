// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.ByteArrayOutputStream;

// Referenced classes of package net.youmi.android:
//			dk, gx

class dl
{

	static String a(String s, String s1)
	{
		if (s == null)
			return "";
		s = s.trim();
label0:
		{
			if (s.length() == 0)
				return "";
			break label0;
		}
		Throwable throwable;
		throwable;
		if (s1 == null)
			return "";
		if (s1.length() == 0)
			return "";
		StringBuilder stringbuilder = new StringBuilder();
		try
		{
			s1 = dk.a(s1);
			s1 = (new StringBuilder(String.valueOf(dk.a(s1.substring(12))))).append(dk.a(s1.substring(0, 20))).toString();
			int i = 0;
			byte abyte0[] = s1.getBytes("UTF-8");
			byte abyte1[] = s.getBytes("UTF-8");
			int j = abyte0.length;
			int k = abyte1.length;
			for (int l = 0; l < k; l++)
			{
				byte byte0 = abyte1[l];
				byte byte1 = abyte0[i];
				int i1 = (byte0 ^ byte1) & 0xff;
				String s2 = Integer.toHexString(i1);
				if (s2 == null)
				{
					stringbuilder.append("00");
				} else
				{
					s2 = s2.trim();
					if (s2.length() == 1)
					{
						stringbuilder.append("0");
						stringbuilder.append(s2);
					} else
					if (s2.length() == 0)
						stringbuilder.append("00");
					else
						stringbuilder.append(s2);
				}
				i = ++i % j;
			}

		}
		catch (Throwable throwable1) { }
		return stringbuilder.toString();
	}

	static String b(String s, String s1)
	{
		if (s == null)
			return null;
		s = s.trim();
label0:
		{
			if (s.length() == 0)
				return null;
			break label0;
		}
		Throwable throwable;
		throwable;
		ByteArrayOutputStream bytearrayoutputstream;
		if (s1 == null)
			return null;
		if (s1.length() == 0)
			return null;
		bytearrayoutputstream = new ByteArrayOutputStream();
		s1 = dk.a(s1);
		s1 = (new StringBuilder(String.valueOf(dk.a(s1.substring(12))))).append(dk.a(s1.substring(0, 20))).toString();
		int i = 0;
		byte abyte0[] = s1.getBytes("UTF-8");
		int j = abyte0.length;
		int k = s.length();
		for (int l = 0; l < k; l += 2)
		{
			char c = s.charAt(l);
			char c1 = s.charAt(l + 1);
			byte byte0 = gx.a(c);
			byte byte1 = gx.a(c1);
			byte byte2 = (byte)(byte0 << 4 | byte1);
			byte2 ^= abyte0[i];
			bytearrayoutputstream.write(byte2);
			i = ++i % j;
		}

		return new String(bytearrayoutputstream.toByteArray(), "UTF-8");
		Throwable throwable1;
		throwable1;
		return null;
	}
}
