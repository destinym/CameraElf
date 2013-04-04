// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package net.youmi.android:
//			fd

class hl extends WebChromeClient
{

	fd a;

	static hl a(fd fd1)
	{
		return new hl(fd1);
		Throwable throwable;
		throwable;
		return null;
	}

	hl(fd fd1)
	{
		a = fd1;
	}

	public void onProgressChanged(WebView webview, int i)
	{
		super.onProgressChanged(webview, i);
		try
		{
			if (a != null)
				a.a(webview, i);
		}
		catch (Throwable throwable) { }
	}
}
