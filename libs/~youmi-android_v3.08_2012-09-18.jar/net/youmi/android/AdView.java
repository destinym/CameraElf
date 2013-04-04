// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package net.youmi.android:
//			AdViewListener, bv, bw, cp, 
//			cz, dm, dn, fp, 
//			gz, ib

public final class AdView extends RelativeLayout
{

	private bw a;
	private ib b;
	private Handler c;
	private Activity d;
	private fp e;
	private dm f;
	private int g;
	private int h;
	private int i;
	private AdViewListener j;
	private int k;
	private int l;

	public AdView(Activity activity)
	{
		super(activity);
		a = new bw();
		c = new Handler();
		g = Color.rgb(64, 118, 170);
		h = 255;
		i = -1;
		k = 0;
		l = 0;
		a(activity);
	}

	public AdView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
		a = new bw();
		c = new Handler();
		g = Color.rgb(64, 118, 170);
		h = 255;
		i = -1;
		k = 0;
		l = 0;
		Activity activity = (Activity)context;
		a(activity, attributeset);
	}

	public AdView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
		a = new bw();
		c = new Handler();
		g = Color.rgb(64, 118, 170);
		h = 255;
		i = -1;
		k = 0;
		l = 0;
		Activity activity = (Activity)context;
		a(activity, attributeset, i1);
	}

	public AdView(Activity activity, int i1, int j1, int k1)
	{
		super(activity);
		a = new bw();
		c = new Handler();
		g = Color.rgb(64, 118, 170);
		h = 255;
		i = -1;
		k = 0;
		l = 0;
		a(activity, i1, j1, k1);
	}

	void a(Activity activity)
	{
		int i1 = g;
		int j1 = h;
		int k1 = i;
		a(activity, null, 0, i1, k1, j1);
	}

	void a(Activity activity, AttributeSet attributeset)
	{
		int i1 = g;
		int j1 = h;
		int k1 = i;
		a(activity, attributeset, 0, i1, k1, j1);
	}

	void a(Activity activity, AttributeSet attributeset, int i1)
	{
		int j1 = g;
		int k1 = h;
		int l1 = i;
		a(activity, attributeset, i1, j1, l1, k1);
	}

	void a(Activity activity, int i1, int j1, int k1)
	{
		int l1 = i1;
		int i2 = k1;
		int j2 = j1;
		a(activity, null, 0, l1, j2, i2);
	}

	void a(Activity activity, AttributeSet attributeset, int i1, int j1, int k1, int l1)
	{
		d = activity;
		try
		{
			f = dm.a(d);
		}
		catch (Exception exception) { }
		int i2 = k1;
		int j2 = j1;
		int k2 = l1;
		try
		{
			if (attributeset != null)
			{
				String s = (new StringBuilder("http://schemas.android.com/apk/res/")).append(activity.getPackageName()).toString();
				i2 = attributeset.getAttributeUnsignedIntValue(s, "textColor", k1);
				j2 = attributeset.getAttributeUnsignedIntValue(s, "backgroundColor", j1);
				k2 = attributeset.getAttributeUnsignedIntValue(s, "backgroundTransparent", l1);
			}
			if (k2 > 255)
				k2 = 255;
			if (k2 < 0)
				k2 = 0;
		}
		catch (Exception exception1) { }
		i = i2;
		g = j2;
		h = k2;
	}

	bw a()
	{
		return a;
	}

	public void setAdViewListener(AdViewListener adviewlistener)
	{
		j = adviewlistener;
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
		try
		{
			if (e != null)
				e.cancel(false);
		}
		catch (Throwable throwable) { }
	}

	public void onWindowFocusChanged(boolean flag)
	{
		try
		{
			a.a = !flag;
			if (flag)
			{
				if (!a.b)
					if (e == null)
						e = fp.a(d, b, c);
					else
					if (e.isCancelled())
						e = e.a();
			} else
			if (e != null)
				e.cancel(false);
		}
		catch (Throwable throwable) { }
		super.onWindowFocusChanged(flag);
	}

	public void setVisibility(int i1)
	{
		super.setVisibility(i1);
		gz.c((new StringBuilder("AdView.setVisibility : the actully VISIBLE:")).append(i1).toString());
		try
		{
			if (i1 == 0)
			{
				a.b = false;
				try
				{
					if (!a.a)
						if (e == null)
						{
							e = fp.a(d, b, c);
							try
							{
								gz.c("AdView.setVisibility: 界面有焦点,adLoader==null，创建并启动新的AdLoader");
							}
							catch (Exception exception) { }
						} else
						if (e.isCancelled())
						{
							e = e.a();
							gz.c("AdView.setVisibility: 界面有焦点,adLoader!=null && isCancelled，停止当前并创建并启动新的AdLoader");
						} else
						{
							gz.c("AdView.setVisibility: 界面有焦点,adLoader!=null,并且正在运行中，不做处理");
						}
				}
				catch (Exception exception1) { }
			} else
			{
				a.b = true;
				try
				{
					if (e != null)
						e.cancel(false);
				}
				catch (Exception exception2) { }
			}
		}
		catch (Throwable throwable) { }
	}

	public int getAdWidth()
	{
		return k;
	}

	public int getAdHeight()
	{
		return l;
	}

	dm b()
	{
		return f;
	}

	int c()
	{
		return g;
	}

	int d()
	{
		return i;
	}

	public void refreshAd()
	{
		f();
	}

	void e()
	{
		if (getVisibility() == 0 && a.a(this))
			try
			{
				cz cz1 = cp.a();
				if (cz1 != null)
					b.c(cz1);
			}
			catch (Exception exception) { }
	}

	void f()
	{
		(new Thread(new bv(this))).start();
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		if (i1 != 0 || j1 != 0 || k1 != 0 || l1 != 0)
		{
			if (k == 0)
			{
				k = k1 - i1;
				i();
			}
		} else
		{
			i();
		}
		super.onLayout(flag, i1, j1, k1, l1);
	}

	private void i()
	{
		if (b == null)
		{
			try
			{
				l = f.a().a();
			}
			catch (Exception exception)
			{
				gz.a(exception);
			}
			try
			{
				android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
				if (layoutparams != null)
				{
					layoutparams.height = -2;
					if (layoutparams.width == -1)
					{
						if (k == 0)
							k = f.e();
					} else
					if (layoutparams.width == -2)
					{
						k = f.i();
					} else
					{
						layoutparams.width = -2;
						k = f.i();
					}
				} else
				{
					k = f.e();
				}
			}
			catch (Exception exception1)
			{
				gz.a(exception1);
			}
			try
			{
				b = new ib(d, this, f, g, i, h);
				android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(k, l);
				addView(b, layoutparams1);
			}
			catch (Exception exception2)
			{
				gz.a(exception2);
			}
		}
		try
		{
			if (!a.a && !a.b)
				if (e == null)
					e = fp.a(d, b, c);
				else
				if (e.isCancelled())
					e = e.a();
		}
		catch (Exception exception3) { }
	}

	protected void onMeasure(int i1, int j1)
	{
		super.onMeasure(i1, j1);
	}

	void g()
	{
		try
		{
			if (j != null)
				j.onAdViewSwitchedAd(this);
		}
		catch (Exception exception) { }
	}

	void h()
	{
		try
		{
			if (j != null)
				j.onConnectFailed(this);
		}
		catch (Exception exception) { }
	}

	public void addView(View view)
	{
		if (b == view)
			super.addView(view);
	}

	public void addView(View view, int i1)
	{
		if (b == view)
			super.addView(view, i1);
	}

	public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if (view == b)
			super.addView(view, i1, layoutparams);
	}

	public void addView(View view, int i1, int j1)
	{
		if (view == b)
			super.addView(view, i1, j1);
	}

	public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if (view == b)
			super.addView(view, layoutparams);
	}

	protected boolean addViewInLayout(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if (view == b)
			return super.addViewInLayout(view, i1, layoutparams);
		else
			return false;
	}

	protected boolean addViewInLayout(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
	{
		if (view == b)
			return super.addViewInLayout(view, i1, layoutparams, flag);
		else
			return false;
	}

	protected Activity getActivity()
	{
		return d;
	}
}
