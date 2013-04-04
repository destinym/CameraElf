// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.webkit.WebView;

// Referenced classes of package net.youmi.android:
//			hs

class hr
{

	public static void a(Context context, WebView webview, String s)
	{
		if (context == null)
			return;
		if (webview == null)
			return;
		if (s == null)
			return;
		try
		{
			(new Thread(new hs(context, s, webview))).start();
		}
		catch (Throwable throwable) { }
		return;
	}
}
