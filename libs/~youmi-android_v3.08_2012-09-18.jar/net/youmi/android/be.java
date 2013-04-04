// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;

// Referenced classes of package net.youmi.android:
//			ci

class be
	implements Runnable
{

	private final Activity a;

	be(Activity activity)
	{
		a = activity;
		super();
	}

	public void run()
	{
		try
		{
			ci ci1 = new ci(a);
			ci1.execute(new Void[0]);
		}
		catch (Exception exception) { }
	}
}
