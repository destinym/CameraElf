// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package net.youmi.android:
//			AdActivity, bm, bx, by, 
//			cc, cd, d, dm, 
//			dq, f, g, n

class e extends RelativeLayout
	implements cd, d, n
{

	private by a;
	private g b;
	private AdActivity c;
	private dm d;

	public e(AdActivity adactivity, dm dm1)
	{
		super(adactivity);
		c = adactivity;
		d = dm1;
		c();
		d();
	}

	void c()
	{
		a = new by(c, c.a, this);
		a.setId(1005);
		b = new g(c, d, this);
		b.setId(1006);
	}

	void d()
	{
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
		layoutparams.addRule(2, b.getId());
		android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-1, d.b().a());
		layoutparams1.addRule(12);
		addView(b, layoutparams1);
		addView(a, layoutparams);
	}

	void a(bx bx1)
	{
		try
		{
			a.a(bx1);
		}
		catch (Exception exception) { }
	}

	public void e()
	{
		a.b();
	}

	public void f()
	{
		a.d();
	}

	public void g()
	{
		a.a();
	}

	public void h()
	{
		try
		{
			(new Thread(new f(this))).start();
		}
		catch (Exception exception) { }
		c.a();
	}

	public void i()
	{
		bm.a(c);
	}

	public void a()
	{
		if (a.c())
			a.b();
		else
			h();
	}

	public View b()
	{
		return this;
	}

	public void a(cc cc1)
	{
		try
		{
			b.a(cc1);
		}
		catch (Exception exception) { }
	}

	static AdActivity a(e e1)
	{
		return e1.c;
	}

	static by b(e e1)
	{
		return e1.a;
	}
}
