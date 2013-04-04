// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.*;

// Referenced classes of package net.youmi.android:
//			bo, cc, dm, dq, 
//			dx, h, i, j, 
//			k, l, m, n

final class g extends TableLayout
{

	Activity a;
	View b;
	View c;
	View d;
	View e;
	View f;
	n g;
	dm h;
	m i;

	public g(Activity activity, dm dm1, n n)
	{
		super(activity);
		i = new m(this);
		a = activity;
		g = n;
		h = dm1;
		e();
		d();
		setBackgroundDrawable(dx.a(h));
	}

	private void d()
	{
		TableRow tablerow = new TableRow(a);
		int i1 = h.b().a();
		int j1 = h.b().a();
		android.widget.TableRow.LayoutParams layoutparams = new android.widget.TableRow.LayoutParams(-2, -2);
		layoutparams.column = 0;
		android.widget.TableRow.LayoutParams layoutparams1 = new android.widget.TableRow.LayoutParams(-2, -2);
		layoutparams1.column = 0;
		android.widget.TableRow.LayoutParams layoutparams2 = new android.widget.TableRow.LayoutParams(-2, -2);
		layoutparams2.column = 0;
		android.widget.TableRow.LayoutParams layoutparams3 = new android.widget.TableRow.LayoutParams(-2, -2);
		layoutparams3.column = 0;
		android.widget.TableRow.LayoutParams layoutparams4 = new android.widget.TableRow.LayoutParams(-2, -2);
		layoutparams4.column = 0;
		setStretchAllColumns(true);
		RelativeLayout relativelayout = new RelativeLayout(a);
		android.widget.RelativeLayout.LayoutParams layoutparams5 = bo.a(i1, j1);
		layoutparams5.addRule(13);
		relativelayout.addView(c, layoutparams5);
		tablerow.addView(relativelayout, layoutparams);
		RelativeLayout relativelayout1 = new RelativeLayout(a);
		android.widget.RelativeLayout.LayoutParams layoutparams6 = bo.a(i1, j1);
		layoutparams6.addRule(13);
		relativelayout1.addView(d, layoutparams6);
		tablerow.addView(relativelayout1, layoutparams1);
		RelativeLayout relativelayout2 = new RelativeLayout(a);
		android.widget.RelativeLayout.LayoutParams layoutparams7 = bo.a(i1, j1);
		layoutparams7.addRule(13);
		relativelayout2.addView(e, layoutparams7);
		tablerow.addView(relativelayout2, layoutparams2);
		RelativeLayout relativelayout3 = new RelativeLayout(a);
		android.widget.RelativeLayout.LayoutParams layoutparams8 = bo.a(i1, j1);
		layoutparams8.addRule(13);
		relativelayout3.addView(b, layoutparams8);
		tablerow.addView(relativelayout3, layoutparams3);
		RelativeLayout relativelayout4 = new RelativeLayout(a);
		android.widget.RelativeLayout.LayoutParams layoutparams9 = bo.a(i1, j1);
		layoutparams9.addRule(13);
		relativelayout4.addView(f, layoutparams9);
		tablerow.addView(relativelayout4, layoutparams4);
		android.widget.TableLayout.LayoutParams layoutparams10 = new android.widget.TableLayout.LayoutParams(-1, -2);
		layoutparams10.gravity = 17;
		addView(tablerow, layoutparams10);
	}

	private void e()
	{
		c = a(new h(this));
		c.setId(201);
		Drawable drawable = dx.a(h, EMPTY_STATE_SET, ENABLED_STATE_SET, PRESSED_ENABLED_STATE_SET);
		if (drawable == null)
			c.setBackgroundDrawable(i.a());
		else
			c.setBackgroundDrawable(drawable);
		c.setClickable(true);
		d = a(new i(this));
		d.setId(202);
		Drawable drawable1 = dx.b(h, EMPTY_STATE_SET, ENABLED_STATE_SET, PRESSED_ENABLED_STATE_SET);
		if (drawable1 == null)
			d.setBackgroundDrawable(i.b());
		else
			d.setBackgroundDrawable(drawable1);
		e = a(new j(this));
		e.setId(203);
		Drawable drawable2 = dx.c(h, EMPTY_STATE_SET, ENABLED_STATE_SET, PRESSED_ENABLED_STATE_SET);
		if (drawable2 != null)
			e.setBackgroundDrawable(drawable2);
		else
			e.setBackgroundDrawable(i.e());
		b = a(new k(this));
		b.setId(200);
		Drawable drawable3 = dx.b(h, EMPTY_STATE_SET, PRESSED_ENABLED_STATE_SET);
		if (drawable3 != null)
			b.setBackgroundDrawable(drawable3);
		else
			b.setBackgroundDrawable(i.c());
		f = a(new l(this));
		f.setId(204);
		Drawable drawable4 = dx.a(h, EMPTY_STATE_SET, PRESSED_ENABLED_STATE_SET);
		if (drawable4 != null)
			f.setBackgroundDrawable(drawable4);
		else
			f.setBackgroundDrawable(i.d());
	}

	private View a(android.view.View.OnClickListener onclicklistener)
	{
		View view = new View(a);
		view.setOnClickListener(onclicklistener);
		return view;
	}

	void a(cc cc1)
	{
		c.setEnabled(cc1.f());
		d.setEnabled(cc1.e());
		e.setEnabled(cc1.d());
	}

	static int[] a()
	{
		return PRESSED_ENABLED_STATE_SET;
	}

	static int[] b()
	{
		return ENABLED_STATE_SET;
	}

	static int[] c()
	{
		return EMPTY_STATE_SET;
	}
}
