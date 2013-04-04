// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;

// Referenced classes of package net.youmi.android:
//			at, ge, gz, hw

class as
{

	private static Location a;
	private static ge b;

	static void a(Context context, Handler handler)
	{
		if (a != null)
			return;
		if (!hw.f(context) && !hw.e(context))
			return;
		LocationManager locationmanager;
		locationmanager = (LocationManager)context.getSystemService("location");
		if (locationmanager == null)
			break MISSING_BLOCK_LABEL_338;
		Object obj = null;
		try
		{
			Location location = locationmanager.getLastKnownLocation("network");
			if (location != null && (location.getLongitude() != 0.0D || location.getLatitude() != 0.0D))
			{
				a = location;
				return;
			}
		}
		catch (Exception exception1)
		{
			gz.a(exception1);
		}
		try
		{
			TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
			if (telephonymanager != null && telephonymanager.getPhoneType() == 2)
			{
				int i = 0;
				int j = 0;
				try
				{
					CellLocation celllocation = telephonymanager.getCellLocation();
					Method amethod[] = celllocation.getClass().getMethods();
					if (amethod != null)
					{
						for (int k = 0; k < amethod.length; k++)
						{
							Method method = amethod[k];
							if (method != null)
								if (method.getName().equals("getBaseStationLatitude"))
									i = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
								else
								if (method.getName().equals("getBaseStationLongitude"))
									j = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
						}

					}
				}
				catch (Exception exception3)
				{
					gz.a(exception3);
				}
				if (i != 0 || j != 0)
				{
					Location location1 = new Location("network");
					location1.setLatitude((double)i / 14400D);
					location1.setLongitude((double)j / 14400D);
					a = location1;
					return;
				}
			}
		}
		catch (Exception exception2)
		{
			gz.a(exception2);
		}
		if (b != null)
			return;
		try
		{
			b = new ge(context.getApplicationContext());
			if (handler != null)
				handler.post(new at(locationmanager));
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	static void a(Location location)
	{
		if (location != null)
			a = location;
	}

	static Location a(Context context)
	{
		return a;
	}

	static ge a()
	{
		return b;
	}
}
