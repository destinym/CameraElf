// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package net.youmi.android:
//			hw

class hc
{

	static String a(Context context)
	{
		String s;
		if (!hw.d(context))
			break MISSING_BLOCK_LABEL_83;
		ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
		NetworkInfo networkinfo = connectivitymanager.getActiveNetworkInfo();
		if (networkinfo == null || !networkinfo.isAvailable())
			break MISSING_BLOCK_LABEL_83;
		if (networkinfo.getType() != 0)
			break MISSING_BLOCK_LABEL_79;
		s = networkinfo.getExtraInfo();
		if (s == null)
			break MISSING_BLOCK_LABEL_76;
		s = s.trim().toLowerCase();
		if (s.length() > 25)
			return s.substring(0, 25);
		return s;
		return "";
		return "wifi";
		Throwable throwable;
		throwable;
		return "";
	}
}
