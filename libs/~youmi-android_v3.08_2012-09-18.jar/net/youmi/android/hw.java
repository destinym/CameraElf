// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

// Referenced classes of package net.youmi.android:
//			hj

class hw
{

	public static boolean a(Context context, String s)
	{
label0:
		{
			if (context.checkCallingOrSelfPermission(s) == -1)
				return false;
			break label0;
		}
		Throwable throwable;
		throwable;
		return true;
	}

	public static boolean a(Context context)
	{
		int j = hj.a();
		if (j < 4)
			return true;
		return a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
		Throwable throwable;
		throwable;
		return false;
	}

	public static boolean b(Context context)
	{
		return a(context, "android.permission.INTERNET");
	}

	public static boolean c(Context context)
	{
		return a(context, "android.permission.READ_PHONE_STATE");
	}

	public static boolean d(Context context)
	{
		return a(context, "android.permission.ACCESS_NETWORK_STATE");
	}

	public static boolean e(Context context)
	{
		return a(context, "android.permission.ACCESS_FINE_LOCATION");
	}

	public static boolean f(Context context)
	{
		return a(context, "android.permission.ACCESS_COARSE_LOCATION");
	}

	public static boolean g(Context context)
	{
		return a(context, "android.permission.ACCESS_WIFI_STATE");
	}

	public static boolean h(Context context)
	{
		return a(context, "com.android.launcher.permission.INSTALL_SHORTCUT");
	}

	public static boolean i(Context context)
	{
		try
		{
			context.getPackageManager().getReceiverInfo(new ComponentName(context, "net.youmi.android.YoumiReceiver"), 128);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}
}
