// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;

// Referenced classes of package net.youmi.android:
//			AdActivity, aa, ac, bg, 
//			bo, d, dm, dq, 
//			dz

final class z extends RelativeLayout
	implements d, dz
{

	AdActivity a;
	private ac b;
	private aa c;
	private dm d;

	public z(AdActivity adactivity, dm dm1)
	{
		super(adactivity);
		a = adactivity;
		d = dm1;
		b = new ac(a, dm1);
		c = new aa(a, this, dm1);
		b.setId(1010);
		c.setId(1009);
		android.widget.RelativeLayout.LayoutParams layoutparams = bo.a(dm1.b().a());
		layoutparams.addRule(12);
		addView(c, layoutparams);
		android.widget.RelativeLayout.LayoutParams layoutparams1 = bo.b();
		layoutparams1.addRule(2, c.getId());
		addView(b, layoutparams1);
	}

	public void c()
	{
		d();
	}

	public void a()
	{
		d();
	}

	private void d()
	{
		try
		{
			ArrayList arraylist = bg.a();
			if (arraylist != null && arraylist.size() > 0)
				bg.b(a);
		}
		catch (Exception exception) { }
		a.a();
	}

	public View b()
	{
		return this;
	}
}
