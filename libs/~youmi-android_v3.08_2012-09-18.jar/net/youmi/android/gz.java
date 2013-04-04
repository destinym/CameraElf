// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.util.Log;

class gz
{

	private static boolean a = true;

	public static void a(String s)
	{
		if (a)
			a("YoumiSdk", s);
	}

	private static void a(String s, String s1)
	{
		try
		{
			Log.i(s, s1);
		}
		catch (Throwable throwable) { }
	}

	public static void b(String s)
	{
		if (a)
			b("YoumiSdk", s);
	}

	public static void a(String s, Throwable throwable)
	{
		if (a)
			a("YoumiSdk", s, throwable);
	}

	private static void b(String s, String s1)
	{
		try
		{
			Log.e(s, s1);
		}
		catch (Throwable throwable) { }
	}

	public static void c(String s)
	{
	}

	public static void a(Throwable throwable)
	{
	}

	private static void a(String s, String s1, Throwable throwable)
	{
		try
		{
			Log.e(s, s1, throwable);
		}
		catch (Throwable throwable1) { }
	}

	public static void d(String s)
	{
		if (a)
			c("YoumiSdk", s);
	}

	private static void c(String s, String s1)
	{
		try
		{
			Log.d(s, s1);
		}
		catch (Throwable throwable) { }
	}

	public static void e(String s)
	{
		if (a)
			d("YoumiSdk", s);
	}

	private static void d(String s, String s1)
	{
		try
		{
			Log.w(s, s1);
		}
		catch (Throwable throwable) { }
	}

}
