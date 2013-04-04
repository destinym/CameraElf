// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;

// Referenced classes of package net.youmi.android:
//			ay, cz, dm, dn, 
//			dp, gz, q, u

class w extends FrameLayout
	implements u
{

	ImageView a;
	ImageView b;
	ImageView c;
	Animation d;
	Animation e;
	final q f;

	public w(q q1, Activity activity, dm dm1, boolean flag)
	{
		f = q1;
		super(activity);
		a = new ImageView(activity);
		b = new ImageView(activity);
		a.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
		b.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
		a.setVisibility(8);
		b.setVisibility(8);
		int i = q.a(q1);
		int j = q.b(q1);
		if (flag)
		{
			i = dm1.a().c().b();
			j = dm1.a().c().b();
		}
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(i, j);
		addView(a, layoutparams);
		addView(b, layoutparams);
		if (flag)
		{
			d = ay.c(dm1);
			e = ay.d(dm1);
		} else
		{
			d = ay.a(dm1);
			e = ay.b(dm1);
		}
	}

	ImageView e()
	{
		if (a == c)
			return b;
		else
			return a;
	}

	public boolean a(cz cz1)
	{
		if (cz1 == null)
			return false;
label0:
		{
			if (cz1.e() == null)
				return false;
			try
			{
				ImageView imageview = e();
				if (imageview == null)
					break label0;
				try
				{
					imageview.setImageBitmap(cz1.e());
				}
				catch (Exception exception1) { }
			}
			catch (Exception exception)
			{
				return false;
			}
			return true;
		}
		return false;
	}

	public void d()
	{
		ImageView imageview = e();
		if (imageview == null)
			return;
		if (c != null)
		{
			c.startAnimation(e);
			c.setVisibility(8);
		}
		imageview.setVisibility(0);
		imageview.startAnimation(d);
		c = imageview;
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
		ImageView imageview;
		imageview = e();
		if (imageview == null)
			return;
		try
		{
			if (c != null)
				c.setVisibility(8);
			imageview.setVisibility(0);
			c = imageview;
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
		return;
	}
}
