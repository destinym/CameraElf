// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.content.pm.PackageManager;

class bt
{

	static boolean a(Context context)
	{
		android.content.pm.PackageInfo packageinfo = context.getPackageManager().getPackageInfo("com.android.phone", 0);
label0:
		{
			if (packageinfo != null)
				return true;
			break label0;
		}
		Exception exception;
		exception;
		return false;
	}
}
