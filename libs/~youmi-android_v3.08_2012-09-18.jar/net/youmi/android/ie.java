// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.view.View;

// Referenced classes of package net.youmi.android:
//			dm

class ie extends View
{

	float a;
	int b;
	float c;
	int d;
	int e;
	int f;
	int g;
	float h;
	float i;
	int j;
	int k;
	int l;
	int m;
	LinearGradient n;
	LinearGradient o;
	float p;
	float q;
	float r;
	float s;
	ShapeDrawable t;
	Rect u;
	RectF v;
	RectF w;
	int x;
	int y;
	float z;
	float A;
	float B;
	int C;
	private int F;
	Paint D;
	Path E;

	public ie(Context context, int i1, int j1, dm dm1)
	{
		super(context);
		c = 7F;
		d = 0;
		e = 0;
		h = 1.0F;
		i = 12F;
		j = Color.rgb(135, 206, 235);
		k = Color.rgb(240, 248, 255);
		l = Color.rgb(65, 105, 225);
		m = Color.argb(200, 0, 0, 0);
		p = 3.5F;
		q = 3.5F;
		r = 1.5F;
		s = 1.0F;
		u = new Rect();
		v = new RectF();
		w = new RectF();
		x = 0;
		y = 0;
		z = 1.0F;
		A = 1.0F;
		B = 0.0F;
		C = 0;
		F = 0;
		D = new Paint();
		a = i1;
		b = j1;
		if (dm1.d())
			i = 12F;
		else
			switch (dm1.g())
			{
			case 120: // 'x'
				i = 10F;
				break;

			case 160: 
				i = 12F;
				break;

			case 240: 
				i = 17F;
				break;

			case 320: 
				i = 19F;
				break;

			default:
				i = 12F;
				break;
			}
		D.setTextSize(i);
		D.setTextAlign(android.graphics.Paint.Align.CENTER);
		Rect rect = new Rect();
		D.getTextBounds("179%", 0, 3, rect);
		D.setColor(-1);
		D.setAntiAlias(true);
		h = dm1.a(h);
		f = rect.width();
		g = rect.height();
		float f1 = (float)rect.width() * 1.6F;
		float f2 = (float)rect.height() * 2.2F;
		float f3 = f2 * 1.5F;
		x = Math.round(f1);
		y = Math.round(f3);
		c = dm1.a(c);
		s = a / 100F;
		d = (int)((float)b - c - (float)y);
		E = new Path();
		RectF rectf = new RectF(0.0F, 0.0F, f1, f2);
		E.addRoundRect(rectf, p, p, android.graphics.Path.Direction.CCW);
		E.moveTo(0.25F * f1, f2);
		float f4 = 0.28F * f1;
		C = Math.round(f4);
		E.lineTo(f4, f3);
		E.lineTo(0.55F * f1, f2);
		E.close();
		PathShape pathshape = new PathShape(E, x, y);
		t = new ShapeDrawable(pathshape);
		v.set(0.0F, (float)j1 - c, i1, j1);
		z = dm1.a(z);
		A = dm1.a(A);
		q = dm1.a(q);
		r = dm1.a(r);
		Paint paint = t.getPaint();
		paint.reset();
		paint.setColor(m);
		paint.setShadowLayer(dm1.a(2.0F), 0.0F, 0.0F, Color.rgb(245, 245, 245));
		paint.setAntiAlias(true);
	}

	private void a(Canvas canvas)
	{
		t.draw(canvas);
	}

	void a(int i1)
	{
		if (i1 == F)
			return;
		if (i1 >= 0 && i1 <= 100)
		{
			F = i1;
			if (F == 100)
				setVisibility(4);
			else
			if (getVisibility() != 0)
				setVisibility(0);
			else
				invalidate();
		}
	}

	void a()
	{
		F = 0;
	}

	private void b(Canvas canvas)
	{
		D.reset();
		D.setStrokeWidth(z);
		if (n == null)
			n = new LinearGradient(0.0F, v.top, 0.0F, v.bottom, new int[] {
				0xff000000, 0xff888888, 0xff444444, 0xff000000
			}, null, android.graphics.Shader.TileMode.CLAMP);
		D.setShader(n);
		canvas.drawRoundRect(v, q, q, D);
	}

	private void c(Canvas canvas)
	{
		D.reset();
		w.set(z, ((float)b - c) + z, B - z, (float)b - z);
		if (o == null)
			o = new LinearGradient(0.0F, w.top, 0.0F, w.bottom, k, l, android.graphics.Shader.TileMode.CLAMP);
		D.setShader(o);
		D.setAntiAlias(true);
		canvas.drawRoundRect(w, r, r, D);
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		try
		{
			B = s * (float)F;
			e = Math.round(B - (float)C);
			u.set(e, d, x + e, y + d);
			t.setBounds(u);
			a(canvas);
			D.reset();
			D.setTextAlign(android.graphics.Paint.Align.CENTER);
			D.setAntiAlias(true);
			D.setColor(j);
			D.setTextSize(i);
			canvas.drawText((new StringBuilder(String.valueOf(F))).toString(), u.centerX(), u.centerY(), D);
			b(canvas);
			c(canvas);
		}
		catch (Exception exception) { }
	}
}
