// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package net.youmi.android:
//			by, gz

class ca extends WebChromeClient
{

	final by a;

	ca(by by1)
	{
		a = by1;
		super();
	}

	public void onReceivedTitle(WebView webview, String s)
	{
		super.onReceivedTitle(webview, s);
		try
		{
			if (a.b != null)
				a.b.setTitle(s);
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	public void onProgressChanged(WebView webview, int i)
	{
		super.onProgressChanged(webview, i);
		a.a(i);
	}
}
