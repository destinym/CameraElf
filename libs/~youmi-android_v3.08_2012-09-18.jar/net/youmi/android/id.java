// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			ao, ea, ib

class id
	implements Runnable
{

	final ib a;
	private final ea b;

	id(ib ib1, ea ea1)
	{
		a = ib1;
		b = ea1;
		super();
	}

	public void run()
	{
		try
		{
			if (!b.b())
				ao.a(a.g, b.c(), b.g(), b.h(), b.a(), b.d(), 0L, 0, 0, 0, 0);
		}
		catch (Exception exception) { }
	}
}
