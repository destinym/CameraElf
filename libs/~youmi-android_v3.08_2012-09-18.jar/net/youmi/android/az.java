// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import java.util.Properties;

// Referenced classes of package net.youmi.android:
//			bq, cg

class az
{

	static cg a = null;
	static String b = "E2FDAA28C7344D2F9FAA4A0FEC1296AA";
	static String c = "DCDAE4873D1F4c64BB121FDE4131DDFF";
	static String d = "E91A62B2CF0744bd9CA37BA14615050F";

	static Properties a(Context context)
	{
		return bq.a(context, b);
	}

	static void a(Activity activity)
	{
		try
		{
			a = c(activity);
			d(activity);
		}
		catch (Exception exception) { }
	}

	static void b(Activity activity)
	{
		try
		{
			e(activity);
		}
		catch (Exception exception) { }
	}

	private static cg c(Activity activity)
	{
		cg cg1;
		Properties properties = a(activity);
		if (properties == null)
			break MISSING_BLOCK_LABEL_44;
		cg1 = new cg();
		cg1.a = bq.a(properties, c, 0);
		cg1.b = bq.a(properties, d, 0);
		return cg1;
		Exception exception;
		exception;
		return new cg();
	}

	private static boolean d(Activity activity)
	{
		Properties properties;
		int i = (int)(System.currentTimeMillis() / 1000L);
		properties = new Properties();
		properties.setProperty(c, (new StringBuilder(String.valueOf(i))).toString());
		properties.setProperty(d, (new StringBuilder(String.valueOf(i))).toString());
		return bq.a(activity, properties, b);
		Exception exception;
		exception;
		return false;
	}

	private static boolean e(Activity activity)
	{
		Properties properties;
		cg cg1 = c(activity);
		properties = new Properties();
		long l = System.currentTimeMillis() / 1000L;
		if (cg1.c() != 0)
		{
			properties.setProperty(c, (new StringBuilder(String.valueOf(cg1.c()))).toString());
			properties.setProperty(d, (new StringBuilder(String.valueOf(l))).toString());
		} else
		{
			properties.setProperty(c, (new StringBuilder(String.valueOf(l))).toString());
			properties.setProperty(d, (new StringBuilder(String.valueOf(l))).toString());
		}
		return bq.a(activity, properties, b);
		Exception exception;
		exception;
		return false;
	}

}
