// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;

// Referenced classes of package net.youmi.android:
//			cp, cz, gz, ih

class bc
	implements Runnable
{

	private final Activity a;

	bc(Activity activity)
	{
		a = activity;
		super();
	}

	public void run()
	{
		gz.c("º”‘ÿœÍ«È“≥£°£°£°£°");
		cz cz1 = cp.a();
		if (cz1 != null && cz1.Y() == 1)
			cz1.a(new ih(a, a, cz1));
	}
}
