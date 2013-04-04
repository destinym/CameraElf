// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;

// Referenced classes of package net.youmi.android:
//			ao, gz

class cr
	implements Runnable
{

	private final Context a;
	private final long b;

	cr(Context context, long l)
	{
		a = context;
		b = l;
		super();
	}

	public void run()
	{
		try
		{
			ao.a(a, b);
		}
		catch (Throwable throwable)
		{
			gz.a(throwable);
		}
	}
}
