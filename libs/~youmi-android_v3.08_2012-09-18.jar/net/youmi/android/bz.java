// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package net.youmi.android:
//			bm, by, cz, fr, 
//			gz

class bz extends WebViewClient
{

	final by a;

	bz(by by1)
	{
		a = by1;
		super();
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		if (bm.h(a.b, s))
			return true;
		break MISSING_BLOCK_LABEL_21;
		Exception exception;
		exception;
		gz.a(exception);
		if (bm.f(a.b, s))
			return true;
		break MISSING_BLOCK_LABEL_42;
		exception;
		gz.a(exception);
		if (bm.g(a.b, s))
			return true;
		break MISSING_BLOCK_LABEL_63;
		exception;
		gz.a(exception);
		if (s.toLowerCase().indexOf("market://") <= -1)
			break MISSING_BLOCK_LABEL_108;
		Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
		a.b.startActivity(intent);
		return true;
		intent;
		gz.a(intent);
		try
		{
			fr fr1 = new fr(a.b, a, a.c == null ? null : a.c.f());
			fr1.execute(new String[] {
				s
			});
		}
		catch (Exception exception1)
		{
			gz.a(exception1);
			return true;
		}
		return true;
	}
}
