// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;

// Referenced classes of package net.youmi.android:
//			ah, ao, cq, cr, 
//			cs, ct, cz, dm, 
//			gz

class cp
{

	private static cz a;
	private static String b;

	static cz a()
	{
		return a;
	}

	static void a(cz cz1)
	{
		a = cz1;
	}

	static void a(String s)
	{
		b = s;
	}

	static synchronized cz a(Activity activity, dm dm1)
	{
		cz cz1;
		long l = System.currentTimeMillis();
		if (!ah.a(l))
			break MISSING_BLOCK_LABEL_77;
		ah.a = l;
		ah.c = true;
		cz1 = null;
		try
		{
			cz1 = ao.a(activity, dm1);
			if (cz1 != null)
			{
				a = cz1;
				ah.b = System.currentTimeMillis();
				a(cz1, activity, dm1);
			} else
			{
				ah.b = System.currentTimeMillis() - 10000L;
			}
		}
		catch (Exception exception1) { }
		ah.c = false;
		return cz1;
		return a;
		Exception exception;
		exception;
		return null;
	}

	static synchronized void a(cz cz1, Activity activity, dm dm1)
	{
		try
		{
			if (cz1 != null && !cz1.t())
				try
				{
					ao.a(activity, cz1);
				}
				catch (Exception exception) { }
		}
		catch (Exception exception1) { }
		try
		{
			Thread thread = new Thread(new cq(cz1, activity, dm1));
			thread.start();
		}
		catch (Exception exception2) { }
	}

	static void a(Context context, long l)
	{
		try
		{
			(new Thread(new cr(context, l))).start();
		}
		catch (Throwable throwable)
		{
			gz.a(throwable);
		}
	}

	static void a(Context context, cz cz1, boolean flag)
	{
		if (cz1 == null)
			return;
		if (flag && cz1.s())
			return;
		cz1.v();
		try
		{
			(new Thread(new cs(context, cz1))).start();
		}
		catch (Exception exception) { }
	}

	static void a(Context context, cz cz1)
	{
		if (cz1 == null)
			return;
		try
		{
			(new Thread(new ct(context, cz1))).start();
		}
		catch (Exception exception) { }
	}
}
