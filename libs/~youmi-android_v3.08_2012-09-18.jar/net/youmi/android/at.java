// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.location.LocationManager;

// Referenced classes of package net.youmi.android:
//			as, gz

class at
	implements Runnable
{

	private final LocationManager a;

	at(LocationManager locationmanager)
	{
		a = locationmanager;
		super();
	}

	public void run()
	{
		try
		{
			a.requestLocationUpdates("network", 3000L, 0.0F, as.a());
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}
}
