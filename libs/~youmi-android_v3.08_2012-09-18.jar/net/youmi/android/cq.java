// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;

// Referenced classes of package net.youmi.android:
//			ao, cz, dm

class cq
	implements Runnable
{

	private final cz a;
	private final Activity b;
	private final dm c;

	cq(cz cz1, Activity activity, dm dm)
	{
		a = cz1;
		b = activity;
		c = dm;
		super();
	}

	public void run()
	{
		try
		{
			if (a != null && !a.q())
				try
				{
					ao.a(b, c, a);
				}
				catch (Exception exception) { }
		}
		catch (Exception exception1) { }
	}
}
