// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.RelativeLayout;

// Referenced classes of package net.youmi.android:
//			cz, dm, dn, dp, 
//			gz, u, w, y, 
//			q

class v extends RelativeLayout
	implements u
{

	dm a;
	Activity b;
	int c;
	y d;
	w e;
	final q f;

	public v(q q, Activity activity, dm dm1, int i, int j)
	{
		f = q;
		super(activity);
		a = dm1;
		b = activity;
		c = j;
		a(activity, i);
	}

	private void a(Activity activity, int i)
	{
		if (d == null)
		{
			d = new y(f, activity, i, a, c);
			d.setVisibility(0);
		}
		if (e == null)
		{
			e = new w(f, activity, a, true);
			e.setVisibility(0);
		}
		e.setId(1000);
		d.setId(1001);
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(a.a().c().b(), a.a().c().b());
		android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-2, c);
		int j = a.a().c().a();
		layoutparams.addRule(9);
		layoutparams.addRule(15);
		layoutparams.setMargins(j, j, 0, j);
		layoutparams1.addRule(1, e.getId());
		layoutparams1.addRule(15);
		addView(e, layoutparams);
		addView(d, layoutparams1);
	}

	public boolean a(cz cz1)
	{
		if (cz1 == null)
			return false;
		if (cz1.e() != null)
		{
			if (!e.a(cz1))
				return false;
		} else
		{
			return false;
		}
		return d.a(cz1);
		Exception exception;
		exception;
		gz.a(exception);
		return false;
	}

	public void d()
	{
		e.d();
		d.d();
	}

	public void a()
	{
		setVisibility(8);
	}

	public void c()
	{
		setVisibility(0);
	}

	public void a(Animation animation)
	{
		try
		{
			startAnimation(animation);
		}
		catch (Exception exception) { }
	}

	public void b()
	{
		e.b();
		d.b();
	}
}
