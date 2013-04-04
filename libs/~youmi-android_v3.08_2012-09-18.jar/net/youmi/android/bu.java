// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.widget.Toast;

class bu
{

	static void a(Context context, String s, int i)
	{
		try
		{
			Toast.makeText(context, s, i).show();
		}
		catch (Exception exception) { }
	}

	static void a(Context context, String s)
	{
		a(context, s, 0);
	}

	static void b(Context context, String s)
	{
		a(context, s, 1);
	}
}
