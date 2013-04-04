// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.content.pm.PackageInfo;

// Referenced classes of package net.youmi.android:
//			hv

class fz
{

	private boolean a;
	private boolean b;
	private boolean c;
	private boolean d;
	private int e;

	fz()
	{
		a = false;
		b = false;
		c = false;
		d = false;
		e = -1;
	}

	public boolean a(Context context, String s)
	{
		if (a)
			return false;
		try
		{
			PackageInfo packageinfo = hv.b(context, s);
			if (packageinfo != null)
			{
				c = true;
				e = packageinfo.versionCode;
			}
			a = true;
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public void a(boolean flag)
	{
		b = flag;
	}

	public boolean a()
	{
		return b;
	}

	public boolean b()
	{
		return c;
	}
}
