// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import java.util.ArrayList;

// Referenced classes of package net.youmi.android:
//			ad, bg, fo, dm

class ac extends LinearLayout
{

	Activity a;
	dm b;
	boolean c;
	boolean d;
	ad e;
	ArrayList f;
	ArrayList g;
	ExpandableListView h;
	fo i;

	public ac(Activity activity, dm dm)
	{
		super(activity);
		c = false;
		d = false;
		a = activity;
		b = dm;
		g = bg.b();
		f = bg.a();
		b();
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
		try
		{
			if (flag)
			{
				if (i == null)
					i = fo.a(e);
				else
					i = i.b(e);
			} else
			if (i != null)
				i.cancel(false);
		}
		catch (Exception exception) { }
	}

	void a()
	{
		g = bg.b();
		f = bg.a();
		if (f == null)
			bg.e(a);
		else
		if (f.size() == 0)
			bg.e(a);
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
		try
		{
			if (i != null)
				i.cancel(false);
		}
		catch (Exception exception) { }
	}

	protected void b()
	{
		h = new ExpandableListView(a);
		e = new ad(this, a, this, b, h, g, f);
		h.setAdapter(e);
		android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -1);
		addView(h, layoutparams);
	}
}
