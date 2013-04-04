// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;

class hv
{

	public static boolean a(Context context, String s)
	{
		if (s == null)
			return false;
		PackageInfo packageinfo = context.getPackageManager().getPackageInfo(s, 0);
label0:
		{
			if (packageinfo != null)
				return true;
			break label0;
		}
		Throwable throwable;
		throwable;
		return false;
	}

	public static PackageInfo b(Context context, String s)
	{
		if (s == null)
			return null;
		return context.getPackageManager().getPackageInfo(s, 0);
		Throwable throwable;
		throwable;
		return null;
	}

	static void c(Context context, String s)
	{
		try
		{
			Intent intent = new Intent("android.intent.action.VIEW");
			intent.setDataAndType(Uri.parse(s), "application/vnd.android.package-archive");
			intent.addFlags(0x10000000);
			context.startActivity(intent);
		}
		catch (Throwable throwable) { }
	}

	public static void d(Context context, String s)
	{
		c(context, (new StringBuilder("file://")).append(s).toString());
	}
}
