// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.os.Build;
import java.util.Locale;

class ej
{

	private static String a;

	public static String a()
	{
		if (a == null)
		{
			Locale locale = Locale.getDefault();
			a = String.format("%s-%s", new Object[] {
				locale.getLanguage(), locale.getCountry()
			});
		}
		return a;
	}

	public static String b()
	{
		return Build.MODEL;
	}
}
