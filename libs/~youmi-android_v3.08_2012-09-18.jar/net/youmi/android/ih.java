// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.widget.*;
import java.util.Hashtable;

// Referenced classes of package net.youmi.android:
//			a, cp, cz, dm, 
//			dx, eu, fd, fe, 
//			fn, gh, gz, hy, 
//			ii, ij

class ih
	implements eu, fd, fe
{

	Dialog a;
	private Context e;
	private Activity f;
	private String g;
	private String h;
	cz b;
	protected hy c;
	private FrameLayout i;
	private FrameLayout j;
	private ProgressBar k;
	private RelativeLayout l;
	private LinearLayout m;
	private ij n;
	private LinearLayout o;
	private ImageButton p;
	private long q;
	private long r;
	dm d;

	public ih(Context context, Activity activity, cz cz1)
	{
		q = 0L;
		r = 0L;
		e = context;
		f = activity;
		g = cz1.W();
		h = cz1.X();
		b = cz1;
		d = dm.a(activity);
		a = new Dialog(context, 0x1030010);
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
		l = new RelativeLayout(context);
		a.setContentView(l, layoutparams);
		m = new LinearLayout(context);
		m.setPadding(15, 10, 15, 10);
		l.addView(m);
		i = new FrameLayout(activity);
		i.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
		j = new FrameLayout(activity);
		j.setLayoutParams(new android.widget.FrameLayout.LayoutParams(d.e() - 40, d.f() - 30));
		k = new ProgressBar(context, null, 0x101007a);
		android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(-2, -2);
		layoutparams1.gravity = 17;
		android.widget.LinearLayout.LayoutParams layoutparams2 = new android.widget.LinearLayout.LayoutParams(-1, -1);
		o = new LinearLayout(context);
		o.setLayoutParams(layoutparams2);
		if (g == null || !g.equals(g) || c == null)
			a(g, h);
		i.addView(c);
		j.addView(k, layoutparams1);
		i.addView(j);
		o.addView(i);
		p = new ImageButton(context);
		p.setBackgroundDrawable(dx.b(d));
		android.widget.RelativeLayout.LayoutParams layoutparams3 = new android.widget.RelativeLayout.LayoutParams(30, 30);
		layoutparams3.addRule(9);
		layoutparams3.addRule(10);
		layoutparams3.leftMargin = 5;
		layoutparams3.topMargin = 0;
		n = new ij(this, context);
		n.addView(o);
		n.setPadding(5, 5, 5, 5);
		m.addView(n);
		l.addView(p, layoutparams3);
		p.setOnClickListener(new ii(this));
	}

	public void c()
	{
		q = System.currentTimeMillis();
		a.show();
		b.a(0);
		b.c(1);
		b.d(0);
		b.e(b.Y());
		cp.a(e, b, false);
		try
		{
			if (a.b == null)
			{
				a.b = new Hashtable();
			} else
			{
				cz cz1 = (cz)a.b.get(b.A());
				if (cz1 != null)
					a.b.remove(b.A());
			}
			a.b.put(b.A(), b);
		}
		catch (Throwable throwable)
		{
			gz.a(throwable);
		}
	}

	public void d()
	{
		a.dismiss();
		r = System.currentTimeMillis();
		if (r >= q)
		{
			long l1 = r - q;
			cp.a(e, l1);
		}
	}

	private void a(String s, String s1)
	{
		g = s;
		h = s1;
		c = new hy(e, this, this, new fn(this), 1);
		c.a(true);
		c.b(true);
		if (s1 != null && !s1.equals(""))
		{
			String s2 = (new StringBuilder("javascript:")).append(s1).toString();
			gh.a().a(s, s2);
		}
		c.loadUrl(s);
	}

	public Context a()
	{
		return e;
	}

	public boolean a(Runnable runnable)
	{
		try
		{
			f.runOnUiThread(runnable);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean b()
	{
		if (c.getUrl().equals(g))
			c.loadUrl(g);
		else
			c.reload();
		return true;
	}

	public void a(WebView webview, String s, Bitmap bitmap)
	{
	}

	public void a(WebView webview, int i1, String s, String s1)
	{
	}

	public void a(WebView webview, String s)
	{
		j.setVisibility(4);
		k.setVisibility(4);
	}

	public void a(WebView webview, int i1)
	{
	}
}
