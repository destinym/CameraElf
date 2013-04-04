// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.content.pm.*;
import android.os.Bundle;

// Referenced classes of package net.youmi.android:
//			gz

class bp
{

	static PackageInfo a(Context context, String s)
	{
		return context.getPackageManager().getPackageArchiveInfo(s, 1);
		Exception exception;
		exception;
		return null;
	}

	static int a(Context context, String s, int i)
	{
		double d;
		ApplicationInfo applicationinfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
		if (applicationinfo == null)
			break MISSING_BLOCK_LABEL_74;
		Bundle bundle = applicationinfo.metaData;
		if (bundle == null)
			break MISSING_BLOCK_LABEL_74;
		Object obj = bundle.get(s);
		if (obj == null)
			break MISSING_BLOCK_LABEL_74;
		String s1 = obj.toString();
		if (s1 == null)
			break MISSING_BLOCK_LABEL_74;
		s1 = s1.trim();
		d = Double.parseDouble(s1);
		return (int)d;
		Exception exception;
		exception;
		return i;
	}

	static boolean b(Context context, String s)
	{
		if (s == null || "".equals(s))
			return false;
		ApplicationInfo applicationinfo;
		try
		{
			applicationinfo = context.getPackageManager().getApplicationInfo(s, 8192);
		}
		catch (Exception exception)
		{
			gz.c((new StringBuilder("package:")).append(s).append(" not exsisted").toString());
			return false;
		}
		return true;
	}

	static int c(Context context, String s)
	{
		if (s == null || "".equals(s))
			return 0;
		PackageInfo packageinfo = context.getPackageManager().getPackageInfo(s, 0);
		return packageinfo.versionCode;
		Exception exception;
		exception;
		exception.printStackTrace();
		return 0;
	}

	static boolean b(Context context, String s, int i)
	{
		if (i <= 0 || s == null || s.equals(""))
			return false;
		return i > c(context, s);
	}
}
