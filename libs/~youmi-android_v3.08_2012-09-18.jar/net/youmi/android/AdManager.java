// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;

// Referenced classes of package net.youmi.android:
//			ag, bb

public class AdManager
{

	public AdManager()
	{
	}

	public static void init(Context context, String s, String s1, int i, boolean flag)
	{
		ag.a(flag);
		ag.a(s);
		ag.b(s1);
		ag.a(i);
		bb.a(context);
	}

	public static void disableUpdateApp()
	{
		ag.f();
	}

	public static void setDonotClearWebViewCache()
	{
		ag.g();
	}
}
