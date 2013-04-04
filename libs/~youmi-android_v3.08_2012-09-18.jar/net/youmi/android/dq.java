// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			dm

class dq
{

	private int b;
	private int c;
	private int d;
	final dm a;

	dq(dm dm1, dm dm2)
	{
		a = dm1;
		super();
		b = 48;
		c = 11;
		d = 26;
		b = dm2.a(b);
		d = dm2.a(d);
		int i = b - d;
		c = i / 2;
	}

	int a()
	{
		return b;
	}

	int b()
	{
		return d;
	}

	int c()
	{
		return c;
	}
}
