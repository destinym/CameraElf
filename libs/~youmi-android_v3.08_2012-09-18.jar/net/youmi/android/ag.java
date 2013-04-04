// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

// Referenced classes of package net.youmi.android:
//			ba, bp, dj

class ag
{

	private static boolean a = false;
	private static boolean b = false;
	private static boolean c = false;
	private static String d = "";
	private static String e = "";
	private static String f = "";
	private static int g = -1;
	private static long h = 30000L;
	private static int i = 30;
	private static int j = -1;
	private static boolean k = true;
	private static boolean l = true;

	static void a(boolean flag)
	{
		c = flag;
	}

	static boolean a()
	{
		return c;
	}

	static void a(String s)
	{
		if (s != null)
		{
			s = s.trim();
			if (s.length() > 0)
			{
				e = s;
				d = (new StringBuilder(String.valueOf(s.substring(0, 1)))).append(dj.c(s.substring(1))).toString();
			}
		}
	}

	static String a(Context context)
	{
		if (d == null || d.length() <= 0)
			break MISSING_BLOCK_LABEL_39;
		if (a)
			break MISSING_BLOCK_LABEL_35;
		a = ba.a(context, d);
		return d;
		return d;
		String s = ba.a(context);
		if (s == null)
			break MISSING_BLOCK_LABEL_61;
		d = s;
		a = true;
		return d;
		Exception exception;
		exception;
		return d;
	}

	static String b()
	{
		return e;
	}

	static void b(String s)
	{
		if (s != null)
		{
			s = s.trim();
			if (s.length() > 0)
				f = s;
		}
	}

	static boolean b(Context context)
	{
		String s;
		String s1;
		s = a(context);
		s1 = c(context);
label0:
		{
			if (s != null && s.length() > 0 && s1 != null && s1.length() > 0)
				return true;
			break label0;
		}
		Exception exception;
		exception;
		return false;
	}

	static String c(Context context)
	{
		if (f != null && f.length() > 0)
			if (!b)
			{
				b = ba.b(context, f);
				return f;
			} else
			{
				return f;
			}
		String s = ba.b(context);
		if (s != null)
		{
			f = s;
			b = true;
			return f;
		} else
		{
			return f;
		}
	}

	static int d(Context context)
	{
		if (g < 0)
			try
			{
				g = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode * 100;
			}
			catch (Exception exception) { }
		return g;
	}

	static void a(int i1)
	{
		i1 = Math.abs(i1);
		i = i1;
		h = i1 * 1000;
	}

	static int c()
	{
		return i;
	}

	static long d()
	{
		return h;
	}

	static int e(Context context)
	{
		if (j < 0)
			try
			{
				j = bp.a(context, "YOUMI_CHANNEL", 0);
			}
			catch (Exception exception) { }
		return j;
	}

	static boolean e()
	{
		return k;
	}

	static void f()
	{
		k = false;
	}

	static void g()
	{
		l = false;
	}

	static boolean h()
	{
		return l;
	}

}
