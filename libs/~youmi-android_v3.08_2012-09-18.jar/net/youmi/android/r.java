// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package net.youmi.android:
//			bo, cz, dm, ds, 
//			q

class r extends RelativeLayout
{

	TextView a;
	TextView b;
	final q c;

	public r(q q, Activity activity, int i, dm dm1, int j)
	{
		c = q;
		super(activity);
		a = new TextView(activity);
		a.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
		a.setFocusable(true);
		a.setFocusableInTouchMode(true);
		a.setMarqueeRepeatLimit(-1);
		a.setTextColor(i);
		a.setId(1018);
		a.setTextSize(dm1.l().b());
		a.setSingleLine(true);
		a.setWidth(j);
		b = new TextView(activity);
		b.setSingleLine(true);
		b.setTextColor(i);
		b.setTextSize(dm1.l().c());
		b.setId(1019);
		android.widget.RelativeLayout.LayoutParams layoutparams = bo.b(j);
		android.widget.RelativeLayout.LayoutParams layoutparams1 = bo.b(j);
		layoutparams.addRule(10);
		layoutparams.addRule(9);
		layoutparams1.addRule(3, a.getId());
		layoutparams1.addRule(9);
		addView(a, layoutparams);
		addView(b, layoutparams1);
	}

	boolean a(cz cz1)
	{
		if (cz1 == null)
			return false;
		if (cz1.b() != 1 && cz1.b() != 0)
			return false;
		String s;
		String s1;
		s = cz1.c();
		s1 = cz1.d();
		if (s != null)
		{
			s = s.trim();
			if (s.length() == 0)
				s = null;
		}
		if (s1 != null)
		{
			s1 = s1.trim();
			if (s1.length() == 0)
				s1 = null;
		}
		if (s == null && s1 == null)
			return false;
		if (s == null || s1 == null)
			break MISSING_BLOCK_LABEL_129;
		a.setSingleLine(true);
		b.setLines(1);
		b.setVisibility(0);
		a.setText(s);
		b.setText(s1);
		return true;
		try
		{
			String s2 = s == null ? s1 : s;
			a.setMaxLines(2);
			a.setSingleLine(false);
			a.setGravity(17);
			a.setText(s2);
			b.setVisibility(8);
		}
		catch (Exception exception)
		{
			return false;
		}
		return true;
	}
}
