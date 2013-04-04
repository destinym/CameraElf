// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import org.json.JSONObject;

// Referenced classes of package net.youmi.android:
//			ce, dl, gw, hb

class fy
{

	private String a;
	private String b;
	private String c;
	private long d;
	private ce e;

	public static fy a(String s, String s1, String s2, ce ce1)
	{
		return a(s, s1, s2, System.currentTimeMillis(), ce1);
	}

	private static fy a(String s, String s1, String s2, long l, ce ce1)
	{
		if (s != null)
			s = s.trim();
		if (s.length() == 0)
			return null;
		s1 = gw.a(s1);
		s2 = gw.a(s2);
		return new fy(s, s1, s2, l, ce1);
		Throwable throwable;
		throwable;
		return null;
	}

	fy(String s, String s1, String s2, long l, ce ce1)
	{
		a = s;
		b = s1;
		c = s2;
		d = l;
		e = ce1;
	}

	public String a()
	{
		return a;
	}

	public String b()
	{
		return c;
	}

	public String c()
	{
		return b;
	}

	public long d()
	{
		return d;
	}

	public ce e()
	{
		return e;
	}

	public boolean f()
	{
		if (a == null)
			return false;
		return a.length() != 0;
	}

	public boolean a(long l)
	{
		return System.currentTimeMillis() - d > l;
	}

	public static String a(fy fy1, String s)
	{
		String s1;
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("a", dl.a(fy1.a(), s));
		if (fy1.b() != null)
			jsonobject.put("b", dl.a(fy1.b(), s));
		if (fy1.c() != null)
			jsonobject.put("c", dl.a(fy1.c(), s));
		jsonobject.put("d", fy1.d());
		jsonobject.put("e", fy1.e().a());
		s1 = jsonobject.toString();
		return dl.a(s1, s);
		Throwable throwable;
		throwable;
		return null;
	}

	public static fy a(String s, String s1)
	{
		s = gw.a(s);
		if (s == null)
			return null;
		JSONObject jsonobject;
		String s2 = dl.b(s, s1);
		jsonobject = hb.a(s2);
		if (jsonobject == null)
			return null;
		String s3 = hb.a(jsonobject, "a", null);
		if (s3 == null)
			return null;
		String s4 = dl.b(s3, s1);
		if (s4 == null)
			return null;
		String s6;
		String s8;
		long l;
		ce ce1;
		String s5 = hb.a(jsonobject, "b", null);
		s6 = null;
		try
		{
			if (s5 != null)
				s6 = dl.b(s5, s1);
		}
		catch (Throwable throwable1) { }
		String s7 = hb.a(jsonobject, "c", null);
		s8 = null;
		try
		{
			if (s7 != null)
				s8 = dl.b(s7, s1);
		}
		catch (Throwable throwable2) { }
		l = hb.a(jsonobject, "d", System.currentTimeMillis());
		ce1 = new ce(hb.a(jsonobject, "e", null));
		return a(s4, s8, s6, l, ce1);
		Throwable throwable;
		throwable;
		return null;
	}
}
