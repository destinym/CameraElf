// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.util.Log;
import java.util.Hashtable;

class ha
{

	private static Hashtable a = new Hashtable();

	public static void a(String s)
	{
		try
		{
			if (a == null)
				a = new Hashtable();
			long l = System.currentTimeMillis();
			a.put(s, Long.valueOf(l));
		}
		catch (Throwable throwable) { }
	}

	public static void a(String s, String s1)
	{
		try
		{
			if (a == null)
				a = new Hashtable();
			long l = 0L;
			if (a.containsKey(s))
				l = ((Long)a.get(s)).longValue();
			long l1 = System.currentTimeMillis() - l;
			double d = (double)l1 / 1000D;
			Log.d("YoumiSDKCounter", (new StringBuilder("花费时间:")).append(d).append("秒\t[").append(s1).append("]").toString());
		}
		catch (Throwable throwable) { }
	}

	public static void b(String s)
	{
		try
		{
			Log.d("YoumiSDKCounter", s);
		}
		catch (Throwable throwable) { }
	}

	public static String a(long l)
	{
		return l <= 1024L ? (new StringBuilder(String.valueOf(l))).append("B").toString() : (new StringBuilder(String.valueOf((float)l / 1024F))).append("KB").toString();
		Throwable throwable;
		throwable;
		return (new StringBuilder()).append(l).toString();
	}

	public static String b(long l)
	{
		return l <= 1000L ? (new StringBuilder(String.valueOf(l))).append("毫秒").toString() : (new StringBuilder(String.valueOf((double)l / 1000D))).append("秒").toString();
		Throwable throwable;
		throwable;
		return (new StringBuilder()).append(l).toString();
	}

}
