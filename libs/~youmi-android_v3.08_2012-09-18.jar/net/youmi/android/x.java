// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.RelativeLayout;

// Referenced classes of package net.youmi.android:
//			cz, dm, dn, dp, 
//			u, y, q

class x extends RelativeLayout
	implements u
{

	dm a;
	int b;
	Activity c;
	int d;
	y e;
	final q f;

	public x(q q, Activity activity, dm dm1, int i, int j)
	{
		f = q;
		super(activity);
		b = -1;
		a = dm1;
		b = i;
		c = activity;
		d = j;
		e();
	}

	private void e()
	{
		if (e == null)
		{
			e = new y(f, c, b, a, d);
			e.setVisibility(0);
		}
		e.setId(1003);
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
		int i = a.a().c().b();
		layoutparams.addRule(9);
		layoutparams.addRule(15);
		addView(e, layoutparams);
	}

	public boolean a(cz cz1)
	{
		if (cz1 == null)
			return false;
		return e.a(cz1);
		Exception exception;
		exception;
		return false;
	}

	public void d()
	{
		e.d();
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
	}
}
