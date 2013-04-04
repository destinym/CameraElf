// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			AdView

class bw
{

	boolean a;
	boolean b;
	boolean c;
	private boolean d;
	private long e;

	bw()
	{
		a = false;
		b = false;
		c = false;
		d = false;
		e = 0L;
	}

	boolean a()
	{
		return d;
	}

	void b()
	{
		e = System.currentTimeMillis();
		d = true;
	}

	void c()
	{
		d = false;
	}

	boolean a(AdView adview)
	{
		if (d && System.currentTimeMillis() - e > 7500L)
		{
			c();
			try
			{
				adview.postInvalidate();
			}
			catch (Exception exception) { }
		}
		return !a && !b && !c && !d;
	}
}
