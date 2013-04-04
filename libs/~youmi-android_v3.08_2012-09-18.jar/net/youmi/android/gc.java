// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			gw

class gc
{

	private String a;
	private String b;
	private long c;

	public gc(String s, String s1, long l)
	{
		c = 0L;
		a = gw.a(s);
		b = gw.a(s1);
		c = l;
	}

	public String h()
	{
		return a;
	}

	public String i()
	{
		return b;
	}

	public boolean j()
	{
		return b != null;
	}

	public long k()
	{
		return c;
	}
}
