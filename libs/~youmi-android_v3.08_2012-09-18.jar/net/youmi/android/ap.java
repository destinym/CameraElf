// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;

// Referenced classes of package net.youmi.android:
//			fu

class ap
	implements Runnable
{

	private final Activity a;
	private final String b;

	ap(Activity activity, String s)
	{
		a = activity;
		b = s;
		super();
	}

	public void run()
	{
		try
		{
			int i = fu.a(a, b);
			if (i != 200);
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}
	}
}
