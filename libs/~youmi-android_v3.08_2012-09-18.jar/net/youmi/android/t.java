// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.RelativeLayout;

// Referenced classes of package net.youmi.android:
//			AdView, bo, by, cz, 
//			gz, u, bx, q

class t extends RelativeLayout
	implements u
{

	private by b;
	private Activity c;
	private AdView d;
	private bx e;
	final q a;

	public t(q q, Activity activity, AdView adview)
	{
		a = q;
		super(activity);
		c = activity;
		d = adview;
	}

	private void e()
	{
		if (b == null)
		{
			b = new by(c, null);
			android.widget.RelativeLayout.LayoutParams layoutparams = bo.a(d.getAdWidth(), d.getAdHeight());
			b.setClickable(false);
			b.setScrollContainer(false);
			addView(b, layoutparams);
		}
	}

	public boolean a(cz cz1)
	{
		e();
		if (cz1 == null)
			break MISSING_BLOCK_LABEL_29;
		bx bx = cz1.j();
		if (bx == null)
			break MISSING_BLOCK_LABEL_29;
		e = bx;
		return true;
		Exception exception;
		exception;
		gz.a(exception);
		return false;
	}

	public void b()
	{
		e();
		try
		{
			b.a(e);
			setVisibility(0);
		}
		catch (Exception exception) { }
	}

	public void d()
	{
		e();
		try
		{
			b.a(e);
			setVisibility(0);
		}
		catch (Exception exception) { }
	}

	public void a(Animation animation)
	{
	}

	public void a()
	{
		setVisibility(8);
	}

	public void c()
	{
		setVisibility(0);
	}
}
