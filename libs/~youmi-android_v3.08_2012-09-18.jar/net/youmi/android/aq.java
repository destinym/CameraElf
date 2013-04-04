// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

// Referenced classes of package net.youmi.android:
//			ag, ah, ai, as, 
//			av, bj, bt, cy, 
//			cz, dg, dj, dm, 
//			dn, ei, gz, hc

class aq
{

	static void a(ByteArrayOutputStream bytearrayoutputstream)
	{
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
	}

	static String a(Activity activity, dm dm1, long l)
	{
		if (!ag.b(activity))
			return null;
		String s4;
		ah.e();
		StringBuilder stringbuilder = new StringBuilder(512);
		String s = dj.a(4);
		stringbuilder.append(av.a());
		stringbuilder.append("00000");
		stringbuilder.append(ai.b());
		stringbuilder.append(ag.a(activity));
		stringbuilder.append(s);
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
		bj.a(ag.d(activity), 2, bytearrayoutputstream);
		int i = 0;
		boolean flag = true;
		byte byte0 = 2;
		byte byte1 = 4;
		byte byte2 = 8;
		byte byte3 = 16;
		if (bt.a(activity))
			i = flag | byte0;
		try
		{
			String s1 = hc.a(activity);
			if (s1.equals("3gnet") || s1.equals("3gwap") || s1.equals("wifi"))
				i |= byte2;
		}
		catch (Exception exception1) { }
		try
		{
			Location location = as.a(activity);
			if (location != null)
				i |= byte1;
		}
		catch (Exception exception2) { }
		i |= byte3;
		bj.a(i, 2, bytearrayoutputstream);
		bj.a(dm1.a().a(), 2, bytearrayoutputstream);
		bj.a(dm1.a().b().a(), 2, bytearrayoutputstream);
		bj.a(ag.e(activity), 2, bytearrayoutputstream);
		bj.a(ai.a(), 1, bytearrayoutputstream);
		bj.a(ah.f(), 2, bytearrayoutputstream);
		bj.a(l, 4, bytearrayoutputstream);
		bj.a(ai.h(), 2, bytearrayoutputstream);
		bj.a(ai.e(), 2, bytearrayoutputstream);
		bj.a(ah.f(activity) ? 1 : 0, 1, bytearrayoutputstream);
		bj.a(ai.c(), 1, bytearrayoutputstream);
		bj.a(hc.a(activity), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		dg dg1 = ah.a(activity);
		bj.a(dg1.c(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(dg1.b(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(dg1.a(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(ah.e(activity), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(ah.b(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(ah.d(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(dg1.e(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a("", bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		try
		{
			bj.a(activity.getPackageName(), bytearrayoutputstream);
		}
		catch (Exception exception3) { }
		bytearrayoutputstream.write(38);
		bj.a(ah.b(activity), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(ah.d(activity), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(ah.c(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a("", bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(dg1.d(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(ah.g(activity), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		try
		{
			bj.a((new StringBuilder(String.valueOf(ah.h()))).append("|").append(ah.i()).toString(), bytearrayoutputstream);
		}
		catch (Exception exception4) { }
		bytearrayoutputstream.write(38);
		bj.a(ei.a(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		String s2 = dj.b((new StringBuilder(String.valueOf(ai.d()))).append(ag.c(activity)).append(s).toString());
		try
		{
			String s3 = dj.a(bytearrayoutputstream.toByteArray(), s2);
			stringbuilder.append(s3);
		}
		catch (Exception exception5) { }
		s4 = stringbuilder.toString();
		return s4;
		Exception exception;
		exception;
		return null;
	}

	static String a(Context context, long l)
	{
		String s = (new StringBuilder("http://stat.gw.youmi.net/stat/v2/error?pid=3&pd=1&ver=308&k=btn_dt_cls&e=")).append(l).toString();
		return s;
		Throwable throwable;
		throwable;
		gz.a(throwable);
		return null;
	}

	static String a(Context context, cz cz1)
	{
		String s2;
		long l = cz1.J();
		long l1 = cz1.K();
		StringBuilder stringbuilder = new StringBuilder(512);
		stringbuilder.append(av.b());
		stringbuilder.append("00000");
		stringbuilder.append(ai.b());
		stringbuilder.append(ag.a(context));
		stringbuilder.append(cz1.o());
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
		bj.a(ai.a(), 1, bytearrayoutputstream);
		bj.a(l, 4, bytearrayoutputstream);
		bj.a(ai.c(), 1, bytearrayoutputstream);
		bj.a(String.valueOf(l1 - l), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		String s = dj.b((new StringBuilder(String.valueOf(ai.d()))).append(ag.c(context)).append(cz1.o()).toString());
		try
		{
			String s1 = dj.a(bytearrayoutputstream.toByteArray(), s);
			stringbuilder.append(s1);
		}
		catch (Exception exception1) { }
		stringbuilder.append(',');
		stringbuilder.append(cz1.k());
		s2 = stringbuilder.toString();
		return s2;
		Exception exception;
		exception;
		return null;
	}

	static String a(Context context, long l, String s, String s1, long l1, long l2, long l3, int i, int j, int k, int i1)
	{
		String s4;
		long l4 = l;
		StringBuilder stringbuilder = new StringBuilder(512);
		stringbuilder.append(av.c());
		stringbuilder.append("00000");
		stringbuilder.append(ai.b());
		stringbuilder.append(ag.a(context));
		stringbuilder.append(s);
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
		bj.a(l1, 4, bytearrayoutputstream);
		bj.a(l2, 4, bytearrayoutputstream);
		bj.a(l3, 4, bytearrayoutputstream);
		bj.a(ai.a(), 1, bytearrayoutputstream);
		bj.a(l4, 4, bytearrayoutputstream);
		bj.a(ai.c(), 1, bytearrayoutputstream);
		bj.a(String.valueOf(i), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(String.valueOf(j), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(String.valueOf(k), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(String.valueOf(i1), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		String s2 = dj.b((new StringBuilder(String.valueOf(ai.d()))).append(ag.c(context)).append(s).toString());
		try
		{
			String s3 = dj.a(bytearrayoutputstream.toByteArray(), s2);
			stringbuilder.append(s3);
		}
		catch (Exception exception1) { }
		stringbuilder.append(',');
		stringbuilder.append(s1);
		s4 = stringbuilder.toString();
		return s4;
		Exception exception;
		exception;
		return null;
	}

	static String a(Context context, String s, String s1, int i)
	{
		String s4;
		StringBuilder stringbuilder = new StringBuilder(512);
		stringbuilder.append(av.d());
		stringbuilder.append("00000");
		stringbuilder.append(ai.b());
		stringbuilder.append(ag.a(context));
		stringbuilder.append(s);
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
		bj.a(i, 1, bytearrayoutputstream);
		bj.a(ai.a(), 1, bytearrayoutputstream);
		int j = (int)(System.currentTimeMillis() / 1000L);
		bj.a(j, 4, bytearrayoutputstream);
		bj.a(ai.c(), 1, bytearrayoutputstream);
		a(bytearrayoutputstream);
		String s2 = dj.b((new StringBuilder(String.valueOf(ai.d()))).append(ag.c(context)).append(s).toString());
		try
		{
			String s3 = dj.a(bytearrayoutputstream.toByteArray(), s2);
			stringbuilder.append(s3);
		}
		catch (Exception exception1) { }
		stringbuilder.append(',');
		stringbuilder.append(s1);
		s4 = stringbuilder.toString();
		return s4;
		Exception exception;
		exception;
		return null;
	}

	private static String b(Context context)
	{
		String s3;
		StringBuilder stringbuilder = new StringBuilder(512);
		String s = dj.a(4);
		stringbuilder.append(av.h());
		stringbuilder.append("00000");
		stringbuilder.append(ai.b());
		stringbuilder.append(ag.a(context));
		stringbuilder.append(s);
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
		bj.a(ah.a(context).a(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		a(bytearrayoutputstream);
		String s1 = dj.b((new StringBuilder(String.valueOf(ai.d()))).append(ag.c(context)).append(s).toString());
		try
		{
			String s2 = dj.a(bytearrayoutputstream.toByteArray(), s1);
			stringbuilder.append(s2);
		}
		catch (Exception exception1) { }
		s3 = stringbuilder.toString();
		return s3;
		Exception exception;
		exception;
		return null;
	}

	private static String b(Context context, ArrayList arraylist)
	{
		String s3;
		StringBuilder stringbuilder = new StringBuilder(512);
		String s = dj.a(4);
		stringbuilder.append(av.i());
		stringbuilder.append("00000");
		stringbuilder.append(ai.b());
		stringbuilder.append(ag.a(context));
		stringbuilder.append(s);
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
		bj.a(ah.a(context).a(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		if (arraylist != null && arraylist.size() > 0)
		{
			StringBuilder stringbuilder1 = new StringBuilder(50);
			for (int i = 0; i < arraylist.size(); i++)
			{
				stringbuilder1.append(arraylist.get(i));
				if (i < arraylist.size() - 1)
					stringbuilder1.append("|");
			}

			bj.a(stringbuilder1.toString(), bytearrayoutputstream);
		}
		bytearrayoutputstream.write(38);
		a(bytearrayoutputstream);
		String s1 = dj.b((new StringBuilder(String.valueOf(ai.d()))).append(ag.c(context)).append(s).toString());
		try
		{
			String s2 = dj.a(bytearrayoutputstream.toByteArray(), s1);
			stringbuilder.append(s2);
		}
		catch (Exception exception1) { }
		s3 = stringbuilder.toString();
		return s3;
		Exception exception;
		exception;
		return null;
	}

	static String a(Context context)
	{
		return b(context);
	}

	static String a(Context context, ArrayList arraylist)
	{
		return b(context, arraylist);
	}
}
