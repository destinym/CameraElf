// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;

// Referenced classes of package net.youmi.android:
//			ao

class ax
	implements Runnable
{

	private final Context a;

	ax(Context context)
	{
		a = context;
		super();
	}

	public void run()
	{
		try
		{
			ao.b(a);
		}
		catch (Exception exception) { }
	}
}
