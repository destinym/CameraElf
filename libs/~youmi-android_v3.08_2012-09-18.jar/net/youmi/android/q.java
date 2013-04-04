// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// Referenced classes of package net.youmi.android:
//			AdView, ay, cz, gz, 
//			ib, s, t, u, 
//			v, w, x, dm

class q extends FrameLayout
{

	private cz a;
	private v b;
	private w c;
	private x d;
	private s e;
	private t f;
	private u g;
	private AdView h;
	private ib i;
	private dm j;
	private Activity k;
	private int l;
	private int m;
	private int n;
	private android.widget.FrameLayout.LayoutParams o;

	public q(Activity activity, AdView adview, ib ib1, dm dm, int i1, int j1)
	{
		super(activity);
		j = dm;
		k = activity;
		h = adview;
		h = adview;
		l = h.getAdWidth();
		m = h.getAdHeight();
		i = ib1;
		a(i1, j1, adview.c());
	}

	void a(cz cz1)
	{
		try
		{
			a = cz1;
			try
			{
				Object obj = null;
				setVisibility(0);
				switch (a.b())
				{
				case 0: // '\0'
					x x1 = c();
					if (x1.a(a))
						obj = x1;
					break;

				case 2: // '\002'
					w w1 = b();
					if (w1.a(a))
						obj = w1;
					break;

				case 1: // '\001'
					v v1 = a();
					if (v1.a(a))
						obj = v1;
					break;

				case 3: // '\003'
					s s1 = d();
					if (s1.a(a))
						obj = s1;
					break;

				case 4: // '\004'
					t t1 = e();
					if (t1.a(a))
						obj = t1;
					break;
				}
				if (obj != null)
				{
					if (i.getVisibility() != 0)
						i.setVisibility(0);
					if (obj != g)
					{
						((u) (obj)).b();
						if (g != null)
							if (a.b() == 3)
							{
								g.a();
							} else
							{
								android.view.animation.Animation animation = ay.b(j);
								g.a(animation);
								g.a();
							}
						android.view.animation.Animation animation1 = ay.a(j);
						((u) (obj)).c();
						((u) (obj)).a(animation1);
						g = ((u) (obj));
					} else
					{
						g.d();
					}
				}
			}
			catch (Exception exception)
			{
				gz.a(exception);
			}
		}
		catch (Exception exception1)
		{
			gz.a(exception1);
		}
	}

	v a()
	{
		if (b == null)
		{
			b = new v(this, k, j, h.d(), n);
			b.setVisibility(8);
			addView(b, o);
		}
		return b;
	}

	w b()
	{
		if (c == null)
		{
			c = new w(this, k, j, false);
			c.setBackgroundColor(h.c());
			c.setVisibility(8);
			addView(c, o);
		}
		return c;
	}

	x c()
	{
		if (d == null)
		{
			d = new x(this, k, j, h.d(), n);
			d.setVisibility(8);
			addView(d, o);
		}
		return d;
	}

	s d()
	{
		if (e == null)
		{
			e = new s(this, k, h.c());
			e.setVisibility(8);
			addView(e, o);
		}
		return e;
	}

	t e()
	{
		if (f == null)
		{
			f = new t(this, k, h);
			f.setVisibility(8);
			addView(f, o);
		}
		return f;
	}

	private void a(int i1, int j1, int k1)
	{
		o = new android.widget.FrameLayout.LayoutParams(l, m);
		n = j1;
	}

	static int a(q q1)
	{
		return q1.l;
	}

	static int b(q q1)
	{
		return q1.m;
	}
}
