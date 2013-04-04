// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.graphics.*;
import android.widget.LinearLayout;

// Referenced classes of package net.youmi.android:
//			ih

class ij extends LinearLayout
{

	Shader a;
	Paint b;
	RectF c;
	private int e;
	private int f;
	final ih d;

	public ij(ih ih, Context context)
	{
		d = ih;
		super(context);
		b = new Paint();
		c = new RectF();
		a = new LinearGradient(0.0F, 0.0F, 100F, 100F, Color.argb(255, 80, 80, 80), Color.argb(255, 80, 80, 80), android.graphics.Shader.TileMode.CLAMP);
		setWillNotDraw(false);
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
		e = k - i;
		f = l - j;
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		b.reset();
		c.set(0.0F, 0.0F, e, f);
		b.setAntiAlias(true);
		b.setShader(a);
		b.setShadowLayer(5F, 0.0F, 0.0F, 0);
		canvas.drawRoundRect(c, 5F, 5F, b);
		b.reset();
	}
}
