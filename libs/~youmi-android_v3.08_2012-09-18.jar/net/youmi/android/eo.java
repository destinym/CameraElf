// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.graphics.Color;
import android.view.*;
import android.view.animation.*;
import android.widget.*;

// Referenced classes of package net.youmi.android:
//			AdActivity, bu, d, dm, 
//			ec, ed, ep, eq, 
//			er, es, et, hx

class eo extends RelativeLayout
	implements android.view.GestureDetector.OnGestureListener, android.widget.ViewSwitcher.ViewFactory, d
{

	private String e[];
	private String f;
	private String g;
	AdActivity a;
	private dm h;
	private int i;
	private Gallery j;
	private ImageSwitcher k;
	private ImageView l;
	private ImageView m;
	GestureDetector b;
	private ec n;
	private ed o;
	private Animation p;
	private Animation q;
	private Animation r;
	private Animation s;
	private Animation t;
	private Animation u;
	int c;
	long d;

	eo(AdActivity adactivity, dm dm1, String as[], String s1, String s2)
	{
		super(adactivity);
		i = 60;
		c = 350;
		d = 0L;
		if (as == null)
			adactivity.finish();
		if (as.length == 0)
			adactivity.finish();
		a = adactivity;
		e = as;
		f = s1;
		g = s2;
		h = dm1;
		i = h.a(60);
		if (c())
		{
			d();
			e();
		} else
		{
			a.finish();
		}
	}

	private boolean c()
	{
		n = ec.a(a, e, h.a(80));
		return n != null;
	}

	private void d()
	{
		setBackgroundColor(-1);
		k = new ImageSwitcher(a);
		k.setFactory(this);
		k.setBackgroundColor(Color.rgb(245, 245, 245));
		o = n.a(0);
		k.setImageURI(o.b);
		if (n.getCount() > 1)
		{
			j = new Gallery(a);
			j.setAdapter(n);
			j.setOnItemClickListener(new ep(this));
			b = new GestureDetector(this);
			k.setOnTouchListener(new eq(this));
			k.setOnClickListener(new er(this));
		}
		l = new ImageView(a);
		l.setImageResource(0x1080052);
		l.setOnClickListener(new es(this));
		if (hx.a(a))
		{
			m = new ImageView(a);
			m.setImageResource(0x108004e);
			m.setOnClickListener(new et(this));
		}
	}

	private void e()
	{
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
		layoutparams.addRule(13);
		addView(k, layoutparams);
		if (j != null)
		{
			android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
			layoutparams1.addRule(12);
			addView(j, layoutparams1);
		}
		android.widget.RelativeLayout.LayoutParams layoutparams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
		layoutparams2.addRule(9);
		layoutparams2.addRule(10);
		addView(l, layoutparams2);
		if (m != null)
		{
			android.widget.RelativeLayout.LayoutParams layoutparams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
			layoutparams3.addRule(10);
			layoutparams3.addRule(11);
			addView(m, layoutparams3);
		}
	}

	private void f()
	{
		try
		{
			if (k != null)
			{
				if (t == null)
					t = AnimationUtils.loadAnimation(a, 0x10a0000);
				k.setInAnimation(t);
				if (u == null)
					u = AnimationUtils.loadAnimation(a, 0x10a0001);
				k.setOutAnimation(u);
			}
		}
		catch (Exception exception) { }
	}

	private void g()
	{
		try
		{
			if (k != null)
			{
				if (p == null)
				{
					p = new TranslateAnimation(h.e(), 0.0F, 0.0F, 0.0F);
					p.setDuration(c);
				}
				k.setInAnimation(p);
				if (q == null)
				{
					q = new TranslateAnimation(0.0F, -h.e(), 0.0F, 0.0F);
					q.setDuration(c);
				}
				k.setOutAnimation(q);
			}
		}
		catch (Exception exception) { }
	}

	private void h()
	{
		try
		{
			if (k != null)
			{
				if (r == null)
				{
					r = new TranslateAnimation(-h.e(), 0.0F, 0.0F, 0.0F);
					r.setDuration(c);
				}
				k.setInAnimation(r);
				if (s == null)
				{
					s = new TranslateAnimation(0.0F, h.e(), 0.0F, 0.0F);
					s.setDuration(c);
				}
				k.setOutAnimation(s);
			}
		}
		catch (Exception exception) { }
	}

	public View makeView()
	{
		ImageView imageview = new ImageView(a);
		imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
		return imageview;
	}

	public boolean onDown(MotionEvent motionevent)
	{
		return false;
	}

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
	{
		int i1;
		if (j == null || n == null)
			break MISSING_BLOCK_LABEL_276;
		i1 = j.getSelectedItemPosition();
		if (motionevent.getX() - motionevent1.getX() <= (float)i)
			break MISSING_BLOCK_LABEL_148;
		if (++i1 >= n.getCount())
			i1 = 0;
		if (i1 <= -1 || i1 >= n.getCount())
			break MISSING_BLOCK_LABEL_276;
		j.setVisibility(0);
		j.setSelection(i1);
		g();
		try
		{
			ed ed1 = n.a(i1);
			if (ed1 != null && o != ed1)
			{
				k.setImageURI(ed1.b);
				o = ed1;
			}
		}
		catch (Exception exception1) { }
		return true;
		if (motionevent1.getX() - motionevent.getX() <= (float)i)
			break MISSING_BLOCK_LABEL_276;
		if (--i1 < 0)
			i1 = n.getCount() - 1;
		if (i1 <= -1 || i1 >= n.getCount())
			break MISSING_BLOCK_LABEL_276;
		j.setVisibility(0);
		j.setSelection(i1);
		h();
		try
		{
			ed ed2 = n.a(i1);
			if (ed2 != null && o != ed2)
			{
				k.setImageURI(ed2.b);
				o = ed2;
			}
		}
		catch (Exception exception2) { }
		return true;
		Exception exception;
		exception;
		return false;
	}

	public void onLongPress(MotionEvent motionevent)
	{
	}

	public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
	{
		return false;
	}

	public void onShowPress(MotionEvent motionevent)
	{
	}

	public boolean onSingleTapUp(MotionEvent motionevent)
	{
		return false;
	}

	public void a()
	{
		long l1 = System.currentTimeMillis();
		if (l1 - d > 5000L)
		{
			d = l1;
			bu.a(a, "再次按后退键返回");
			return;
		} else
		{
			a.a();
			return;
		}
	}

	public View b()
	{
		return this;
	}

	static ec a(eo eo1)
	{
		return eo1.n;
	}

	static ed b(eo eo1)
	{
		return eo1.o;
	}

	static void c(eo eo1)
	{
		eo1.f();
	}

	static ImageSwitcher d(eo eo1)
	{
		return eo1.k;
	}

	static void a(eo eo1, ed ed1)
	{
		eo1.o = ed1;
	}

	static Gallery e(eo eo1)
	{
		return eo1.j;
	}

	static String f(eo eo1)
	{
		return eo1.f;
	}

	static String g(eo eo1)
	{
		return eo1.g;
	}
}
