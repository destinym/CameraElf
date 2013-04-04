// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;

// Referenced classes of package net.youmi.android:
//			ag, ah, ai, as, 
//			aw, az, bc, bd, 
//			gz

class bb
{

	static long a = 0L;

	static void a(Activity activity, Handler handler)
	{
		int i;
		i = activity.getTaskId();
		if (ah.a(i))
		{
			az.b(activity);
			return;
		}
		long l;
		l = System.currentTimeMillis();
		if (l - a < 30000L)
		{
			az.b(activity);
			return;
		}
		try
		{
			a = l;
			ah.b(i);
			try
			{
				az.a(activity);
			}
			catch (Exception exception1) { }
			try
			{
				bd.a(activity, handler);
			}
			catch (Exception exception2) { }
			try
			{
				handler.post(new bc(activity));
			}
			catch (Throwable throwable) { }
			try
			{
				as.a(activity, handler);
			}
			catch (Exception exception3) { }
			try
			{
				aw.a(activity);
			}
			catch (Exception exception4) { }
		}
		catch (Exception exception) { }
		return;
	}

	static void a(Context context)
	{
		try
		{
			gz.a("*****");
			gz.a((new StringBuilder("Current SDK Version is youmi android sdk ")).append(ai.f()).toString());
			gz.a((new StringBuilder("App ID is set to ")).append(ag.b()).toString());
			gz.a((new StringBuilder("App Sec is set to ")).append(ag.c(context)).toString());
			try
			{
				gz.a((new StringBuilder("App PackageName is set to ")).append(context.getPackageName()).toString());
				PackageInfo packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
				if (packageinfo != null)
				{
					gz.a((new StringBuilder("App Version Code is set to ")).append(packageinfo.versionCode).toString());
					gz.a((new StringBuilder("App Version Name is set to ")).append(packageinfo.versionName).toString());
				}
			}
			catch (Exception exception) { }
			try
			{
				gz.a((new StringBuilder("Promotion Channel ID is set to ")).append(ag.e(context)).toString());
			}
			catch (Exception exception1) { }
			gz.a((new StringBuilder("Requesting Interval is set to ")).append(ag.c()).append(" seconds").toString());
			try
			{
				String s = "TestMode is set to ";
				if (ag.a())
					s = (new StringBuilder(String.valueOf(s))).append("TRUE").toString();
				else
				if (ah.f(context))
					s = (new StringBuilder(String.valueOf(s))).append("FALSE.").toString();
				else
					s = (new StringBuilder(String.valueOf(s))).append("FALSE").toString();
				gz.a(s);
			}
			catch (Exception exception2) { }
			try
			{
				gz.a((new StringBuilder("Build.10")).append(Integer.toHexString(ai.h())).toString());
			}
			catch (Exception exception3) { }
		}
		catch (Exception exception4) { }
	}

}
