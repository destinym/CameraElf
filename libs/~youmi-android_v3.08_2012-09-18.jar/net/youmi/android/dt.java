// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.widget.FrameLayout;

// Referenced classes of package net.youmi.android:
//			dh, di, du, dw, 
//			dm, ac

class dt extends FrameLayout
{

	Activity a;
	dm b;
	dw c;
	du d;
	private int g;
	private int h;
	static int e = -1;
	protected int f;

	public dt(Activity activity, ac ac, dm dm)
	{
		super(activity);
		h = -1;
		f = ++e;
		a = activity;
		b = dm;
		c = new dw(a, ac, b);
		addView(c);
		d = new du(a);
		addView(d);
	}

	void a(di di1)
	{
		g = 0;
		if (d != null)
			d.setVisibility(8);
		c.a(di1);
	}

	void a(dh dh1)
	{
		g = 1;
		if (c != null)
			c.setVisibility(8);
		d.a(dh1);
	}

	void a(int i)
	{
		h = i;
	}

}
