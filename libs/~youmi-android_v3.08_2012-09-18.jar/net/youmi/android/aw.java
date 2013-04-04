// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;

// Referenced classes of package net.youmi.android:
//			ak, ax

class aw
{

	private static long a = 0L;
	private static long b = 0x1b7740L;

	static void a(Context context)
	{
		long l = System.currentTimeMillis();
		if (l - a < b)
			return;
		try
		{
			(new Thread(new ax(context))).start();
		}
		catch (Exception exception) { }
		return;
	}

	static boolean a(String s, String s1)
	{
		Class class1;
		String s2 = ak.a(s, s1);
		if (s2 == null)
			break MISSING_BLOCK_LABEL_34;
		s2 = s2.trim();
		if (s2.length() <= 0)
			break MISSING_BLOCK_LABEL_34;
		class1 = Class.forName(s2);
		if (class1 != null)
			return true;
		break MISSING_BLOCK_LABEL_34;
		Exception exception;
		exception;
		return false;
	}

}
