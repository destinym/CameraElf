// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.RelativeLayout;

// Referenced classes of package net.youmi.android:
//			ab, bo, dm, dq, 
//			dx, dz

class aa extends RelativeLayout
{

	Button a;
	dz b;
	dm c;

	public aa(Activity activity, dz dz1, dm dm1)
	{
		super(activity);
		b = dz1;
		c = dm1;
		a = new Button(activity);
		Drawable drawable = dx.a(c, EMPTY_STATE_SET, PRESSED_ENABLED_STATE_SET);
		if (drawable != null)
			a.setBackgroundDrawable(drawable);
		else
			a.setText("·µ»Ø");
		a.setOnClickListener(new ab(this));
		android.widget.RelativeLayout.LayoutParams layoutparams = bo.a(c.b().a(), c.b().a());
		layoutparams.addRule(15);
		layoutparams.addRule(11);
		addView(a, layoutparams);
		setBackgroundDrawable(dx.a(c));
	}
}
