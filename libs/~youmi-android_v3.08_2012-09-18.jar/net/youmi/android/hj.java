// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.webkit.*;

// Referenced classes of package net.youmi.android:
//			fd, fe, hk, hl, 
//			hm, hn, ho, hp, 
//			hq

class hj
{

	public static WebViewClient a(fe fe1)
	{
		return ho.a(fe1);
		Throwable throwable;
		throwable;
		return null;
	}

	public static int a()
	{
		try
		{
			hk.a();
		}
		catch (Throwable throwable) { }
		return 1;
	}

	public static WebChromeClient a(fd fd1)
	{
		int i;
		i = 1;
		try
		{
			i = hk.a();
		}
		catch (Throwable throwable1) { }
		if (i <= 4)
			return hl.a(fd1);
		if (i < 7)
			return hm.a(fd1);
		return hn.a(fd1);
		Throwable throwable;
		throwable;
		return null;
	}

	public static void a(Context context, WebSettings websettings)
	{
		int i;
		i = 1;
		try
		{
			i = hk.a();
		}
		catch (Throwable throwable1) { }
		if (i <= 4)
			return;
		try
		{
			if (i >= 5)
				try
				{
					hp.a(context, websettings);
				}
				catch (Throwable throwable2) { }
			if (i >= 7)
				try
				{
					hq.a(context, websettings);
				}
				catch (Throwable throwable3) { }
		}
		catch (Throwable throwable) { }
		return;
	}
}
