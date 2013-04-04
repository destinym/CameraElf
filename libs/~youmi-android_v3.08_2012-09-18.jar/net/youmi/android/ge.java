// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.location.*;
import android.os.Bundle;

// Referenced classes of package net.youmi.android:
//			as, gz

class ge
	implements LocationListener
{

	private Context a;

	public ge(Context context)
	{
		if (context == null)
		{
			throw new NullPointerException();
		} else
		{
			a = context;
			return;
		}
	}

	public void onLocationChanged(Location location)
	{
		try
		{
			if (location != null && (location.getLatitude() != 0.0D || location.getLongitude() != 0.0D))
			{
				as.a(location);
				a();
			}
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	private void a()
	{
		try
		{
			LocationManager locationmanager = (LocationManager)a.getSystemService("location");
			if (locationmanager != null)
				locationmanager.removeUpdates(this);
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	public void onProviderDisabled(String s)
	{
	}

	public void onProviderEnabled(String s)
	{
	}

	public void onStatusChanged(String s, int i, Bundle bundle)
	{
	}
}
