// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;

// Referenced classes of package net.youmi.android:
//			ao, cz

class ct
	implements Runnable
{

	private final Context a;
	private final cz b;

	ct(Context context, cz cz1)
	{
		a = context;
		b = cz1;
		super();
	}

	public void run()
	{
		try
		{
			ao.a(a, b.o(), b.k(), b.S());
		}
		catch (Exception exception) { }
	}
}
