// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			dm

class dr
{

	private int b;
	private int c;
	private int d;
	final dm a;

	dr(dm dm1, dm dm2)
	{
		a = dm1;
		super();
		b = 15;
		c = 15;
		d = 5;
		b = dm2.a(b);
		c = dm2.a(c);
		d = dm2.a(d);
	}

	int a()
	{
		return b;
	}

	int b()
	{
		return c;
	}

	int c()
	{
		return d;
	}
}
