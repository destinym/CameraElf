// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package net.youmi.android:
//			fd

class hm extends WebChromeClient
{

	fd a;

	static hm a(fd fd1)
	{
		return new hm(fd1);
		Throwable throwable;
		throwable;
		return null;
	}

	hm(fd fd1)
	{
		a = fd1;
	}

	public void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
	{
		try
		{
			quotaupdater.updateQuota(l1 * 2L);
		}
		catch (Throwable throwable) { }
	}

	public void onGeolocationPermissionsShowPrompt(String s, android.webkit.GeolocationPermissions.Callback callback)
	{
		try
		{
			callback.invoke(s, true, false);
			super.onGeolocationPermissionsShowPrompt(s, callback);
		}
		catch (Throwable throwable) { }
	}

	public void onProgressChanged(WebView webview, int i)
	{
		try
		{
			super.onProgressChanged(webview, i);
		}
		catch (Throwable throwable) { }
		try
		{
			if (a != null)
				a.a(webview, i);
		}
		catch (Throwable throwable1) { }
	}
}
