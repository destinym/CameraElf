// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package net.youmi.android:
//			fe

class ho extends WebViewClient
{

	private fe a;

	static ho a(fe fe1)
	{
		return new ho(fe1);
		Throwable throwable;
		throwable;
		return null;
	}

	ho(fe fe1)
	{
		a = fe1;
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		return super.shouldOverrideUrlLoading(webview, s);
	}

	public void onPageFinished(WebView webview, String s)
	{
		super.onPageFinished(webview, s);
		try
		{
			if (a != null)
				a.a(webview, s);
		}
		catch (Throwable throwable) { }
	}

	public void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		super.onPageStarted(webview, s, bitmap);
		try
		{
			if (a != null)
				a.a(webview, s, bitmap);
		}
		catch (Throwable throwable) { }
	}

	public void onReceivedError(WebView webview, int i, String s, String s1)
	{
		super.onReceivedError(webview, i, s, s1);
		try
		{
			if (a != null)
				a.a(webview, i, s, s1);
		}
		catch (Throwable throwable) { }
	}
}
