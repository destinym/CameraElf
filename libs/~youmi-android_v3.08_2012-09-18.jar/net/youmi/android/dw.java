// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.File;

// Referenced classes of package net.youmi.android:
//			ac, bo, di, dm, 
//			gt

class dw extends RelativeLayout
{

	Activity a;
	dm b;
	ac c;
	TextView d;
	TextView e;
	gt f;

	public dw(Activity activity, ac ac1, dm dm1)
	{
		super(activity);
		a = activity;
		c = ac1;
		b = dm1;
		a();
	}

	void a()
	{
		d = new TextView(a);
		d.setId(1013);
		e = new TextView(a);
		e.setId(1014);
		f = new gt(a, b);
		f.setId(1016);
		android.widget.RelativeLayout.LayoutParams layoutparams = bo.a();
		layoutparams.addRule(9);
		layoutparams.addRule(10);
		android.widget.RelativeLayout.LayoutParams layoutparams1 = bo.a();
		layoutparams1.addRule(9);
		layoutparams1.addRule(3, d.getId());
		android.widget.RelativeLayout.LayoutParams layoutparams2 = bo.b((b.e() * 80) / 100);
		layoutparams2.addRule(12);
		layoutparams2.addRule(3, e.getId());
		layoutparams2.setMargins(0, 10, 0, 10);
		addView(f, layoutparams2);
		addView(d, layoutparams);
		addView(e, layoutparams1);
	}

	void a(di di1)
	{
		if (di1 != null)
			if (di1.c.exists())
			{
				d.setText(di1.a);
				long l = di1.c.length();
				if (di1.d > 0L)
				{
					e.setText((new StringBuilder(String.valueOf(l))).append("/").append(di1.d).toString());
					long l1 = di1.d;
					int i = (int)((l * 100L) / l1);
					f.a(i);
				} else
				{
					e.setText((new StringBuilder(String.valueOf(l))).toString());
					f.setVisibility(4);
				}
			} else
			{
				c.a();
			}
		setVisibility(0);
	}
}
