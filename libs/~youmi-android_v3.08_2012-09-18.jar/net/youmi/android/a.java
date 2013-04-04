// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Hashtable;

// Referenced classes of package net.youmi.android:
//			ai, ao, b, bm, 
//			br, ce, cf, cp, 
//			cz, gz, hw

class a
{

	public static Hashtable a;
	public static Hashtable b;
	public static Hashtable c;
	public static Hashtable d;

	static synchronized void a(Context context, String s, ce ce1, int i)
	{
		try
		{
			PackageInfo packageinfo = context.getPackageManager().getPackageInfo(s, 0);
			if (packageinfo != null)
			{
				cf cf1 = new cf();
				cf1.a = packageinfo.packageName;
				cf1.c = packageinfo.versionCode;
				cf1.b = packageinfo.versionName;
				ce1.g = cf1;
				a(context, ce1, 4);
			}
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
		cz cz1 = null;
		try
		{
			if (c != null)
				cz1 = (cz)c.get(s);
			if (cz1 != null && cz1.E())
			{
				if (ce1.e != null)
					cz1.a(3);
				else
					cz1.a(5);
				cz1.c(2);
				cz1.d(i);
				cz1.e(cz1.Y());
				cp.a(context, cz1, false);
				c.remove(s);
			}
		}
		catch (Exception exception1) { }
		try
		{
			Intent intent = context.getPackageManager().getLaunchIntentForPackage(s);
			intent.addFlags(0x10000000);
			context.startActivity(intent);
		}
		catch (Exception exception2) { }
		try
		{
			if (cz1 != null && cz1.B() != null && !cz1.B().equals(""))
				bm.a((Activity)context, cz1.B(), cz1.C());
		}
		catch (Exception exception3) { }
		cz cz2;
		if (d == null)
			break MISSING_BLOCK_LABEL_358;
		cz2 = (cz)d.get(s);
		if (cz2 == null || cz2.Q() == null)
			return;
		if (hw.h(context) && cz2.Q() != null && !cz2.Q().equals(""))
		{
			br.a(context, cz2.O(), cz2.Q(), cz2.R(), cz2);
			cz2.b(0);
			cp.a(context, cz2);
			d.remove(s);
		}
		break MISSING_BLOCK_LABEL_361;
		return;
		Throwable throwable1;
		throwable1;
		return;
		Throwable throwable;
		throwable;
		gz.a(throwable);
		return;
	}

	static synchronized void a(Context context, String s, String s1)
	{
		if (s == null || s.equals("") || s1 == null || !s1.equals("android.intent.action.PACKAGE_ADDED"))
			return;
		if (a == null)
		{
			gz.b("apkDIHashtable is null");
			return;
		}
		ce ce1 = null;
		if (a.containsKey(s))
			ce1 = (ce)a.get(s);
		if (ce1 != null)
			a(context, s, ce1, 0);
		try
		{
			a.remove(s);
		}
		catch (Throwable throwable)
		{
			gz.a(throwable);
		}
	}

	public static synchronized void a(Context context, String s, ce ce1)
	{
		if (s == null || s.equals(""))
			return;
		if (ce1 != null)
			a(context, s, ce1, 1);
	}

	public static void a(Context context, ce ce1, int i)
	{
		try
		{
			(new Thread(new b(context, ce1, i))).start();
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	static void b(Context context, ce ce1, int i)
	{
		byte byte0 = 2;
		if (ce1 == null)
			return;
		if (ce1.f != null)
			if (ce1.e != null)
				byte0 = 1;
			else
				byte0 = 0;
		String s = null;
		int j = 0;
		String s1 = null;
		if (ce1.e != null)
		{
			j = ce1.e.c;
			s1 = ce1.e.b;
			s = ce1.e.a;
		}
		int k = 0;
		String s2 = null;
		if (ce1.f != null)
		{
			k = ce1.f.c;
			s2 = ce1.f.b;
			s = ce1.f.a;
		}
		int l = 0;
		String s3 = null;
		if (ce1.g != null)
		{
			l = ce1.g.c;
			s3 = ce1.g.b;
			s = ce1.g.a;
		}
		ao.b(context, i, byte0, j, k, l, ce1.a, s, s1, s2, s3, ce1.c, ce1.d, ce1.b, ce1.h, ce1.j, "", ai.e());
	}

	public static ce a(Context context, String s, String s1, String s2, String s3, String s4)
	{
		ce ce1;
		PackageInfo packageinfo = context.getPackageManager().getPackageArchiveInfo(s, 1);
		if (packageinfo == null)
			break MISSING_BLOCK_LABEL_173;
		ce1 = new ce();
		ce1.a = s4;
		ce1.b = s1;
		ce1.d = s3;
		ce1.c = s2;
		cf cf1 = new cf();
		cf1.a = packageinfo.packageName;
		cf1.c = packageinfo.versionCode;
		cf1.b = packageinfo.versionName;
		ce1.f = cf1;
		try
		{
			PackageInfo packageinfo1 = context.getPackageManager().getPackageInfo(packageinfo.packageName, 0);
			if (packageinfo1 != null)
			{
				cf cf2 = new cf();
				cf2.a = packageinfo1.packageName;
				cf2.c = packageinfo1.versionCode;
				cf2.b = packageinfo1.versionName;
				ce1.e = cf2;
			}
		}
		catch (Throwable throwable1) { }
		return ce1;
		Throwable throwable;
		throwable;
		return null;
	}
}
