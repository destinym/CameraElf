// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.graphics.*;
import android.view.View;

// Referenced classes of package net.youmi.android:
//			dm

class gt extends View
{

	RectF a;
	int b;
	int c;
	RectF d;
	Paint e;
	float f;
	int g;
	dm h;
	float i;

	gt(Context context, dm dm1)
	{
		super(context);
		a = new RectF();
		d = new RectF();
		e = new Paint();
		f = 3F;
		g = 0;
		i = 1.0F;
		h = dm1;
		f = h.a(f);
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
		try
		{
			int j = getLayoutParams().width;
			int k = h.a(10);
			getLayoutParams().height = k;
			if (j <= 0)
				j = h.e();
			if (j > h.e())
				j = h.e();
			b = j;
			c = k;
			a.set(0.0F, 0.0F, j, k);
			i = (float)b / 100F;
		}
		catch (Exception exception) { }
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		e.reset();
		e.setARGB(100, 180, 180, 180);
		e.setStyle(android.graphics.Paint.Style.STROKE);
		e.setStrokeWidth(f);
		canvas.drawRect(a, e);
		d.set(f, f, i * (float)g - f, (float)c - f);
		e.reset();
		e.setARGB(255, 65, 105, 225);
		canvas.drawRect(d, e);
	}

	void a(int j)
	{
		if (j >= 0 && j <= 100)
		{
			g = j;
			postInvalidate();
		}
	}
}
