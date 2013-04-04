// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;

// Referenced classes of package net.youmi.android:
//			dn, dq, dr, ds

class dm
{

	private boolean a;
	private dn b;
	private dq c;
	private dr d;
	private int e;
	private int f;
	private float g;
	private int h;
	private int i;
	private int j;
	private ds k;

	public dn a()
	{
		if (b == null)
			b = new dn(this, this);
		return b;
	}

	dq b()
	{
		if (c == null)
			c = new dq(this, this);
		return c;
	}

	dr c()
	{
		if (d == null)
			d = new dr(this, this);
		return d;
	}

	boolean d()
	{
		return a;
	}

	public int e()
	{
		return i;
	}

	public int f()
	{
		return j;
	}

	public int g()
	{
		return h;
	}

	public float h()
	{
		return g;
	}

	public static dm a(Activity activity)
	{
		DisplayMetrics displaymetrics;
		DisplayMetrics displaymetrics1;
		displaymetrics = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
		displaymetrics1 = activity.getResources().getDisplayMetrics();
		return new dm(displaymetrics1, displaymetrics);
		Exception exception;
		exception;
		return null;
	}

	protected dm(DisplayMetrics displaymetrics, DisplayMetrics displaymetrics1)
	{
		a = true;
		g = 1.0F;
		h = 160;
		i = displaymetrics.widthPixels;
		j = displaymetrics.heightPixels;
		g = displaymetrics.density;
		h = 160;
		try
		{
			Field field = displaymetrics.getClass().getField("densityDpi");
			if (field != null)
				h = field.getInt(displaymetrics);
		}
		catch (Exception exception) { }
		if (h == 160)
		{
			e = Math.round((float)displaymetrics1.widthPixels * displaymetrics1.density);
			f = Math.round((float)displaymetrics1.heightPixels * displaymetrics1.density);
			a = true;
		} else
		{
			e = i;
			f = j;
			a = false;
		}
		if (e > f)
		{
			int i1 = e;
			e = f;
			f = i1;
		}
	}

	int i()
	{
		if (i > j)
			return j;
		else
			return i;
	}

	int j()
	{
		return e;
	}

	int k()
	{
		return f;
	}

	public int a(int i1)
	{
		if (i1 <= 0)
			i1 = 1;
		if (d())
			return i1;
		int j1 = Math.round((float)i1 * g);
		if (j1 <= 0)
			j1 = 1;
		return j1;
	}

	public float a(float f1)
	{
		if (f1 <= 0.0F)
			f1 = 1.0F;
		if (d())
			return f1;
		float f2 = f1 * g;
		if (f2 <= 0.0F)
			f2 = 1.0F;
		return f2;
	}

	ds l()
	{
		if (k == null)
			k = new ds(this, this);
		return k;
	}
}
