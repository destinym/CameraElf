// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.net.URLDecoder;

// Referenced classes of package net.youmi.android:
//			dj

class ak
{

	static String a(String s)
	{
		String s1;
		if (s.indexOf("%20") > -1)
			s = s.replace("%20", "+");
		s1 = URLDecoder.decode(s, "UTF-8");
		return s1;
		Exception exception;
		exception;
		return "";
	}

	static String a(String s, String s1)
	{
		StringBuffer stringbuffer = new StringBuffer();
		StringBuffer stringbuffer1 = new StringBuffer();
		try
		{
			String s2 = dj.b(s1);
			String s3 = (new StringBuilder(String.valueOf(dj.b(s2.substring(12))))).append(dj.b(s2.substring(0, 20))).toString();
			int i = 0;
			int j = s3.length();
			int k = s.length();
			for (int l = 0; l < k; l += 2)
			{
				stringbuffer1.delete(0, stringbuffer1.length());
				stringbuffer1.append(s.charAt(l));
				stringbuffer1.append(s.charAt(l + 1));
				String s4 = stringbuffer1.toString();
				int i1 = Integer.valueOf(s4, 16).intValue();
				char c = (char)i1;
				int j1 = c ^ s3.charAt(i);
				char c1 = (char)j1;
				stringbuffer.append(c1);
				i = ++i % j;
			}

		}
		catch (Exception exception) { }
		return stringbuffer.toString();
	}
}
