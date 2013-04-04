// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			ao, cz, fr, ib

class ic
	implements Runnable
{

	final ib a;
	private final cz b;
	private final fr c;

	ic(ib ib1, cz cz1, fr fr1)
	{
		a = ib1;
		b = cz1;
		c = fr1;
		super();
	}

	public void run()
	{
		try
		{
			ao.a(a.g, b.J(), b.o(), b.k(), c.d(), c.e() - b.I(), 0L, b.D(), b.ac(), b.ad(), b.ae());
		}
		catch (Exception exception) { }
	}
}
