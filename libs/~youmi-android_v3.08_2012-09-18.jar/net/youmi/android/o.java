// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;

// Referenced classes of package net.youmi.android:
//			cz, p

class o
{

	private long c;
	private String d;
	private String e;
	private long f;
	private long g;
	private long h;
	private long i;
	boolean a;
	Context b;

	o(Context context, cz cz1, long l, long l1)
	{
		c = 0L;
		f = 0L;
		g = 0L;
		h = 0L;
		i = 0L;
		a = false;
		if (cz1 == null)
		{
			a = true;
			return;
		}
		if (cz1.s())
			a = true;
		b = context;
		d = cz1.o();
		e = cz1.k();
		c = cz1.J();
		f = l;
		g = l1;
		i = System.currentTimeMillis();
	}

	void a()
	{
		if (a)
			return;
		a = true;
		h = System.currentTimeMillis() - i;
		try
		{
			(new Thread(new p(this))).start();
		}
		catch (Exception exception) { }
	}

	static long a(o o1)
	{
		return o1.c;
	}

	static String b(o o1)
	{
		return o1.d;
	}

	static String c(o o1)
	{
		return o1.e;
	}

	static long d(o o1)
	{
		return o1.g;
	}

	static long e(o o1)
	{
		return o1.f;
	}

	static long f(o o1)
	{
		return o1.h;
	}
}
