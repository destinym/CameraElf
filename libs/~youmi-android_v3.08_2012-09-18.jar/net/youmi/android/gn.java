// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;

// Referenced classes of package net.youmi.android:
//			dk, ey, gc, gv

abstract class gn
	implements ey
{

	gn()
	{
	}

	public gv a(Context context, gc gc1)
	{
		String s = d(gc1);
		return a(context, s, gc1.k());
	}

	public String a(String s)
	{
label0:
		{
			if (s != null)
				return dk.a(s);
			break label0;
		}
		Throwable throwable;
		throwable;
		return null;
	}

	public String a(gc gc1)
	{
		return a(gc1.h());
		Throwable throwable;
		throwable;
		return null;
	}

	public String c(gc gc1)
	{
		return a(gc1);
	}

	public String d(gc gc1)
	{
		return String.format("%s.tmp2", new Object[] {
			a(gc1)
		});
	}
}
