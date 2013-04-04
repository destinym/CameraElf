// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.webkit.WebView;

class gs
	implements Runnable
{

	private WebView a;
	private String b;

	public gs(WebView webview, String s)
	{
		a = webview;
		b = s;
	}

	public void run()
	{
		try
		{
			if (a != null && b != null)
				a.loadUrl(b);
		}
		catch (Throwable throwable) { }
	}
}
