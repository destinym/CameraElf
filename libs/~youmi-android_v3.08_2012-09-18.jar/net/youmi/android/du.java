// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.widget.*;

// Referenced classes of package net.youmi.android:
//			bo, dh, dv

class du extends RelativeLayout
{

	TextView a;
	Activity b;
	String c;

	public du(Activity activity)
	{
		super(activity);
		b = activity;
		a = new TextView(activity);
		a.setId(1011);
		Button button = new Button(activity);
		button.setText("´ò¿ª");
		button.setId(1017);
		button.setOnClickListener(new dv(this));
		android.widget.RelativeLayout.LayoutParams layoutparams = bo.a();
		layoutparams.addRule(11);
		layoutparams.addRule(15);
		android.widget.RelativeLayout.LayoutParams layoutparams1 = bo.c();
		layoutparams1.addRule(9);
		layoutparams1.addRule(0, button.getId());
		addView(button, layoutparams);
		addView(a, layoutparams1);
	}

	void a(dh dh1)
	{
		a.setText(dh1.d);
		c = dh1.e;
		setVisibility(0);
	}
}
