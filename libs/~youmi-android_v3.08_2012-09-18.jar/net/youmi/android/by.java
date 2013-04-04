// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;

// Referenced classes of package net.youmi.android:
//			a, bg, bh, bm, 
//			bu, bx, bz, ca, 
//			cb, cc, ce, cz, 
//			fr, fs, gz, cd

final class by extends WebView
	implements fs
{

	cc a;
	Activity b;
	cz c;

	public by(Activity activity, cd cd)
	{
		super(activity);
		a = new cc(this, cd);
		b = activity;
		i();
	}

	public by(Activity activity, cz cz1, cd cd)
	{
		super(activity);
		a = new cc(this, cd);
		b = activity;
		c = cz1;
		i();
	}

	private void i()
	{
		try
		{
			WebView.enablePlatformNotifications();
		}
		catch (Exception exception) { }
		j();
		k();
		l();
		m();
	}

	private void j()
	{
		WebSettings websettings = getSettings();
		websettings.setCacheMode(1);
		websettings.setAllowFileAccess(true);
		websettings.setJavaScriptEnabled(true);
		websettings.setSupportZoom(true);
		websettings.setBuiltInZoomControls(true);
		websettings.setUseWideViewPort(true);
		websettings.setLightTouchEnabled(true);
		websettings.setSavePassword(true);
	}

	private void k()
	{
		setWebViewClient(new bz(this));
	}

	private void l()
	{
		setWebChromeClient(new ca(this));
	}

	private void m()
	{
		try
		{
			setDownloadListener(new cb(this));
		}
		catch (Exception exception) { }
	}

	void a(bx bx1)
	{
		bx1 = a.a(bx1);
		b(bx1);
	}

	void a()
	{
		bx bx1 = a.a();
		b(bx1);
	}

	void b()
	{
		bx bx1 = a.c();
		b(bx1);
	}

	boolean c()
	{
		return a.f();
	}

	void d()
	{
		bx bx1 = a.b();
		b(bx1);
	}

	private void b(bx bx1)
	{
		try
		{
			if (bx1 != null)
				loadDataWithBaseURL(bx1.a(), bx1.b(), "text/html", "utf-8", null);
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	public void a(fr fr1, bx bx1)
	{
		if (bx1 != null)
		{
			if (c != null)
				bx1.a(bh.a(b, bx1.b(), c.H(), c.o(), c.k()));
			a(bx1);
		}
	}

	public void e()
	{
		a(100);
	}

	public void a(fr fr1, File file, String s)
	{
		bg.d(b);
		if (file != null && file.exists())
		{
			bu.a(b, "下载成功");
			try
			{
				ce ce1 = net.youmi.android.a.a(b, file.getPath(), s, fr1.a(), fr1.b(), fr1.c());
				net.youmi.android.a.a(b, ce1, 2);
				net.youmi.android.a.a(b, ce1, 3);
			}
			catch (Exception exception)
			{
				gz.a(exception);
			}
			bm.b(b, file.getPath());
		}
	}

	public void f()
	{
		bu.a(b, "正在下载");
		a(100);
	}

	public void b(fr fr1, File file, String s)
	{
		a(100);
		if (file != null && file.exists())
		{
			bu.a(b, "下载成功");
			try
			{
				ce ce1 = net.youmi.android.a.a(b, file.getPath(), s, fr1.a(), fr1.b(), fr1.c());
				net.youmi.android.a.a(b, ce1, 3);
			}
			catch (Exception exception)
			{
				gz.a(exception);
			}
			bm.b(b, file.getPath());
		}
	}

	public void a(fr fr1)
	{
		bg.c(b);
		bu.a(b, "开始下载");
		a(100);
		try
		{
			ce ce1 = new ce();
			ce1.a = fr1.c();
			ce1.c = fr1.a();
			ce1.d = fr1.b();
			net.youmi.android.a.a(b, ce1, 1);
		}
		catch (Exception exception) { }
	}

	public void g()
	{
		bu.a(b, "存储卡不可用,请启用存储卡", 1);
		a(100);
	}

	public void h()
	{
		bg.d(b);
		bu.a(b, "下载失败");
	}

	public void a(int i1)
	{
		if (i1 < 0)
			return;
		try
		{
			if (b != null)
				if (i1 >= 100)
				{
					b.setProgressBarVisibility(false);
				} else
				{
					b.setProgressBarIndeterminateVisibility(true);
					b.setProgress(i1 * 100);
				}
		}
		catch (Exception exception) { }
		return;
	}
}
