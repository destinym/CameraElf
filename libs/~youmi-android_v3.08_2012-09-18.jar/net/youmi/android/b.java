// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;

// Referenced classes of package net.youmi.android:
//			a, gz, ce

class b
	implements Runnable
{

	private final Context a;
	private final ce b;
	private final int c;

	b(Context context, ce ce, int i)
	{
		a = context;
		b = ce;
		c = i;
		super();
	}

	public void run()
	{
		try
		{
			net.youmi.android.a.b(a, b, c);
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}
}
