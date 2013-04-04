// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.webkit.WebView;

// Referenced classes of package net.youmi.android:
//			gs, gw, he

class hs
	implements Runnable
{

	private final Context a;
	private final String b;
	private final WebView c;

	hs(Context context, String s, WebView webview)
	{
		a = context;
		b = s;
		c = webview;
		super();
	}

	public void run()
	{
		try
		{
			String s = he.a(a, b);
			String s1 = (new StringBuilder(String.valueOf(gw.a()))).append(s).toString();
			c.post(new gs(c, s1));
		}
		catch (Throwable throwable) { }
	}
}
