// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.*;

// Referenced classes of package net.youmi.android:
//			ew, fd, fe, fm, 
//			gg, gh, gi, ha, 
//			hj, hz, ia

final class hy extends WebView
	implements ew, fd, fe
{

	private boolean b;
	private boolean c;
	private boolean d;
	private boolean e;
	private fd f;
	private fe g;
	Context a;

	public hy(Context context, fe fe1, fd fd1, fm fm1, int i)
	{
		super(context);
		b = false;
		c = false;
		d = false;
		e = false;
		try
		{
			a = context;
			f = fd1;
			g = fe1;
			WebView.enablePlatformNotifications();
			a();
			a(i);
			b();
			a(this);
			a(this);
			a(fm1, i);
		}
		catch (Throwable throwable) { }
	}

	private void a()
	{
		setScrollBarStyle(0x2000000);
	}

	private void a(fm fm1, int i)
	{
		try
		{
			if ((i & 1) != 0 && fm1 != null)
				addJavascriptInterface(fm1, "youmi");
		}
		catch (Throwable throwable) { }
	}

	private void a(int i)
	{
		try
		{
			WebSettings websettings = getSettings();
			websettings.setCacheMode(2);
			websettings.setAllowFileAccess(true);
			websettings.setJavaScriptEnabled(true);
			websettings.setJavaScriptCanOpenWindowsAutomatically(true);
			boolean flag = (i & 2) != 0;
			websettings.setSupportZoom(flag);
			websettings.setBuiltInZoomControls(flag);
			websettings.setSavePassword(true);
			websettings.setSaveFormData(true);
			try
			{
				hj.a(a, websettings);
			}
			catch (Throwable throwable1) { }
		}
		catch (Throwable throwable) { }
	}

	private void b()
	{
		try
		{
			setDownloadListener(new hz(this));
		}
		catch (Throwable throwable) { }
	}

	private void a(fe fe1)
	{
		try
		{
			WebViewClient webviewclient = hj.a(fe1);
			if (webviewclient != null)
				setWebViewClient(webviewclient);
		}
		catch (Throwable throwable) { }
	}

	private void a(fd fd1)
	{
		try
		{
			WebChromeClient webchromeclient = hj.a(fd1);
			if (webchromeclient != null)
				setWebChromeClient(webchromeclient);
		}
		catch (Throwable throwable) { }
	}

	public void a(boolean flag)
	{
		b = flag;
	}

	public void b(boolean flag)
	{
		c = flag;
	}

	public void a(WebView webview, String s, Bitmap bitmap)
	{
		try
		{
			if (g != null)
				g.a(webview, s, bitmap);
			try
			{
				ha.a((new StringBuilder("load")).append(s).toString());
			}
			catch (Throwable throwable) { }
		}
		catch (Throwable throwable1) { }
	}

	public void a(WebView webview, int i, String s, String s1)
	{
		try
		{
			if (g != null)
				g.a(webview, i, s, s1);
		}
		catch (Throwable throwable) { }
	}

	public void a(WebView webview, String s)
	{
		try
		{
			ha.a((new StringBuilder("load")).append(s).toString(), (new StringBuilder("╪сть:")).append(s).toString());
		}
		catch (Throwable throwable) { }
		try
		{
			if (b)
				gh.a().a(a, this, s);
		}
		catch (Throwable throwable1) { }
		try
		{
			if (c)
				gi.a().a(a, this, s);
		}
		catch (Throwable throwable2) { }
		try
		{
			if (g != null)
				g.a(webview, s);
		}
		catch (Throwable throwable3) { }
	}

	public void a(WebView webview, int i)
	{
		try
		{
			if (f != null)
				f.a(webview, i);
		}
		catch (Throwable throwable) { }
	}

	public void a(String s, String s1)
	{
		try
		{
			try
			{
				if (!getUrl().equals(s))
				{
					Uri uri = Uri.parse(getUrl());
					Uri uri1 = Uri.parse(s);
				}
			}
			catch (Throwable throwable) { }
			post(new ia(this, s1));
		}
		catch (Throwable throwable1) { }
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
		try
		{
			gg.a().a(this);
		}
		catch (Throwable throwable) { }
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
		try
		{
			gg.a().b(this);
		}
		catch (Throwable throwable) { }
	}
}
