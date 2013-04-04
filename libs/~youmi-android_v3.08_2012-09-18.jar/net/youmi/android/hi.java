// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package net.youmi.android:
//			hw

class hi
{

	public static boolean a(Context context)
	{
		if (!hw.b(context))
			return false;
		else
			return b(context);
	}

	public static boolean b(Context context)
	{
		if (!hw.d(context))
			return true;
		NetworkInfo networkinfo;
		ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
		networkinfo = connectivitymanager.getActiveNetworkInfo();
label0:
		{
			if (networkinfo != null && networkinfo.isAvailable())
				return true;
			break label0;
		}
		Throwable throwable;
		throwable;
		return false;
	}
}
