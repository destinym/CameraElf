// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package net.youmi.android:
//			ee, eg

class eh extends ImageView
{

	private ee a;
	private eg b;
	private Bitmap c;
	private boolean d;

	public eh(Context context, int i, int j, int k)
	{
		super(context);
		d = false;
		setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
	}

	void a(Bitmap bitmap)
	{
		try
		{
			if (bitmap != null && !bitmap.isRecycled())
			{
				Bitmap bitmap1 = c;
				c = bitmap;
				setImageBitmap(bitmap);
				if (bitmap1 != c && bitmap1 != null)
					bitmap1.recycle();
			}
		}
		catch (Throwable throwable) { }
	}

	void a()
	{
		d = false;
		c();
	}

	void a(ee ee1)
	{
		if (ee1 == null)
			return;
		if (ee1.c() <= 0)
			return;
		try
		{
			a = ee1;
			d = true;
			b();
		}
		catch (Exception exception) { }
		return;
	}

	private void b()
	{
		try
		{
			if (b != null)
				c();
			if (a != null)
			{
				b = new eg(this);
				b.execute(new ee[] {
					a
				});
			}
		}
		catch (Exception exception) { }
	}

	private void c()
	{
		try
		{
			if (b != null)
			{
				b.a();
				b.cancel(true);
			}
			b = null;
		}
		catch (Throwable throwable) { }
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
		try
		{
			if (flag)
			{
				if (d)
					b();
			} else
			{
				c();
			}
		}
		catch (Exception exception) { }
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
		try
		{
			c();
		}
		catch (Exception exception) { }
	}
}
