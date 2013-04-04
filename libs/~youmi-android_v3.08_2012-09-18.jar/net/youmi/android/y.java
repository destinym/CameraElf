// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.FrameLayout;

// Referenced classes of package net.youmi.android:
//			ay, cz, dm, gz, 
//			r, u, q

class y extends FrameLayout
	implements u
{

	r a;
	r b;
	r c;
	Animation d;
	Animation e;
	int f;
	final q g;

	public y(q q, Activity activity, int i, dm dm1, int j)
	{
		g = q;
		super(activity);
		f = j;
		a = new r(q, activity, i, dm1, j);
		a.setGravity(17);
		b = new r(q, activity, i, dm1, j);
		b.setGravity(17);
		a.setVisibility(8);
		b.setVisibility(8);
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(j, -2);
		layoutparams.gravity = 16;
		layoutparams.leftMargin = dm1.a(10);
		addView(a, layoutparams);
		addView(b, layoutparams);
		d = ay.a(dm1);
		e = ay.b(dm1);
	}

	r e()
	{
		if (a == c)
			return b;
		else
			return a;
	}

	public void a()
	{
		setVisibility(8);
	}

	public boolean a(cz cz1)
	{
		r r1 = e();
		if (r1 != null)
			return r1.a(cz1);
		else
			return false;
		Exception exception;
		exception;
		return false;
	}

	public void b()
	{
		r r1;
		r1 = e();
		if (r1 == null)
			return;
		try
		{
			if (c != null)
				c.setVisibility(8);
			r1.setVisibility(0);
			c = r1;
			c();
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
		return;
	}

	public void c()
	{
		setVisibility(0);
	}

	public void a(Animation animation)
	{
		try
		{
			a(animation);
		}
		catch (Exception exception) { }
	}

	public void d()
	{
		r r1 = e();
		if (r1 == null)
			return;
		if (c != null)
		{
			c.startAnimation(e);
			c.setVisibility(8);
		}
		r1.setVisibility(0);
		r1.startAnimation(d);
		c = r1;
	}
}
