// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;

// Referenced classes of package net.youmi.android:
//			gk, fi, gb

class fj
	implements Runnable
{

	final fi a;
	private final Context b;
	private final gb c;

	fj(fi fi, Context context, gb gb)
	{
		a = fi;
		b = context;
		c = gb;
		super();
	}

	public void run()
	{
		try
		{
			gk.a().a(b, c);
		}
		catch (Throwable throwable) { }
	}
}
