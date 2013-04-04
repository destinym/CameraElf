// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.graphics.*;
import android.graphics.drawable.Drawable;

// Referenced classes of package net.youmi.android:
//			dm, ds

class dc extends Drawable
{

	int a;
	int b;
	float c;
	float d;
	float e;
	private String f;
	private float g;
	private float h;
	private float i;
	private float j;
	private float k;
	private float l;
	private float m;
	private float n;
	private Rect o;
	private float p;
	private float q;
	private RectF r;
	private RectF s;
	private RectF t;
	private int u;
	private int v;
	private int w;
	private int x;
	private int y;
	private int z;
	private int A;
	private int B;
	private float C;
	private float D;
	private Path E;
	private Path F;
	private Path G;
	private Path H;
	private Paint I;
	private Paint J;
	private Shader K;
	private Shader L;
	private int M;
	private int N;
	private dm O;

	dc(int i1, int j1, dm dm1)
	{
		c = 3F;
		d = 1.2F;
		e = 4F;
		f = "ÓÐÃ×";
		g = 9F;
		h = 0.8F;
		i = 0.0F;
		j = 0.0F;
		k = 0.0F;
		l = 0.0F;
		m = 0.0F;
		n = 0.0F;
		o = new Rect();
		p = 5F;
		q = 5F;
		r = new RectF(0.0F, 0.0F, 320F, 50F);
		s = new RectF(r);
		t = new RectF(r);
		u = Color.argb(230, 250, 250, 250);
		v = Color.argb(230, 234, 234, 234);
		w = Color.rgb(217, 217, 217);
		x = Color.rgb(115, 115, 115);
		y = 255;
		B = Color.argb(80, 0, 0, 0);
		C = 3F;
		D = 1.0F;
		E = new Path();
		F = new Path();
		G = new Path();
		H = new Path();
		I = new Paint();
		J = new Paint();
		M = 0;
		N = 2;
		a = i1;
		b = j1;
		O = dm1;
		b();
		r.set(0.0F, 0.0F, a, b);
		s.set(0.0F, 0.0F, a, b);
		t.set(0.0F, 0.0F, a, b);
		t.inset(d, d);
		K = new LinearGradient(0.0F, 0.0F, 1.0F, 1.0F, u, v, android.graphics.Shader.TileMode.CLAMP);
		L = new LinearGradient(0.0F, 0.0F, 0 + O.a(5), b, Color.argb(8, 255, 255, 255), Color.argb(50, 255, 255, 255), android.graphics.Shader.TileMode.CLAMP);
		E.addRect(s, android.graphics.Path.Direction.CW);
		E.close();
		I.reset();
		I.setTextSize(g);
		o.set(0, 0, a, b);
		I.getTextBounds(f, 0, f.length(), o);
		i = (float)o.width() * 1.5F + p * 2.0F + q * 2.0F;
		j = ((float)o.height() + h * 2.0F) - d;
		float f1 = t.left;
		float f2 = t.right;
		float f3 = t.top;
		float f4 = t.bottom;
		RectF rectf = new RectF();
		if (M == 0)
		{
			if (N == 2)
			{
				i = (float)o.width() * 1.1F;
				j = (float)o.height() + h * 2.0F;
				z = Math.round((float)a - i - d);
				A = Math.round(f3 + j);
				float f5 = j * 0.5F;
				k = f2 - (i + d) * 0.5F;
				l = (f3 * 0.5F + j) - h;
				m = k;
				n = l;
				n -= O.a(1.0F);
				F.moveTo(f2 - e, f4);
				RectF rectf1 = new RectF();
				rectf1.set(f2 - e * 2.0F, f4 - e * 2.0F, f2, f4);
				F.arcTo(rectf1, 90F, -90F);
				float f7 = f2;
				float f8 = f3 + j + f5;
				F.lineTo(f7, f8);
				rectf.set(f2 - (float)o.width() - (i - (float)o.width()) * 0.4F, (f3 - d) + h, (float)o.width() + 2.0F, o.height());
				float f9 = f2 - i * 0.5F;
				float f10 = f3 + j;
				rectf1.set(f2 - j, f3 + j, f2, f3 + j * 2.0F);
				F.arcTo(rectf1, 360F, -90F);
				F.lineTo(f2 - i, f3 + j);
				f8 = f3 + j * 0.5F;
				f7 = f2 - i;
				rectf1.set(f2 - i - f5, f3, (f2 - i) + f5, f3 + j);
				F.arcTo(rectf1, 90F, 90F);
				f9 = f2 - i - p;
				f10 = f3;
				rectf1.set(f2 - i - j * 1.5F, f3, f2 - i - f5, f3 + j);
				F.arcTo(rectf1, 360F, -90F);
				F.lineTo(f1 + e, f3);
				rectf1.set(f1, f3, f1 + e * 2.0F, f3 + e * 2.0F);
				F.arcTo(rectf1, 270F, -90F);
				F.lineTo(f1, f4 - e);
				rectf1.set(f1, f4 - e * 2.0F, f1 + e * 2.0F, f4);
				F.arcTo(rectf1, 180F, -90F);
				f7 = f2 - e;
				f8 = f4;
				F.lineTo(f7, f8);
			}
		} else
		if (M != 1);
		F.close();
		F.setFillType(android.graphics.Path.FillType.INVERSE_EVEN_ODD);
		float f6 = 10F;
		RectF rectf2 = new RectF(t);
		rectf2.inset(-f6, -f6);
		G.addRect(rectf2, android.graphics.Path.Direction.CW);
		G.addPath(F);
		G.close();
		H.moveTo(0.0F, 0.0F);
		H.lineTo(a, 0.0F);
		H.cubicTo((float)a * 0.5F, (float)b * 0.25F, (float)a * 0.25F, (float)b * 0.5F, 0.0F, b);
		H.lineTo(0.0F, 0.0F);
		H.close();
	}

	int a()
	{
		return z;
	}

	protected void b()
	{
		g = O.l().a();
		c = O.a(c);
		d = O.a(d);
		e = O.a(e);
		h = O.a(h);
		p = O.a(p);
		q = O.a(q);
		C = O.a(C);
		D = O.a(D);
	}

	public void draw(Canvas canvas)
	{
		I.reset();
		I.setShadowLayer(C, D, D, B);
		G.setFillType(android.graphics.Path.FillType.WINDING);
		canvas.drawPath(G, I);
		I.reset();
		I.setShader(K);
		I.setAntiAlias(true);
		canvas.drawPath(F, I);
		I.reset();
		I.setStrokeWidth(1.0F);
		I.setStyle(android.graphics.Paint.Style.STROKE);
		I.setColor(-1);
		I.setAntiAlias(true);
		canvas.drawPath(F, I);
		I.setStrokeWidth(0.5F);
		I.setColor(0xff888888);
		canvas.drawRect(s, I);
		J.setTextAlign(android.graphics.Paint.Align.CENTER);
		J.setTextSize(g);
		J.setColor(-1);
		J.setAntiAlias(true);
		canvas.drawText(f, k, l, J);
		J.setColor(x);
		canvas.drawText(f, m, n, J);
		I.reset();
		I.setShader(L);
		I.setAntiAlias(true);
		canvas.drawPath(H, I);
	}

	public int getOpacity()
	{
		return 255 - y;
	}

	public void setAlpha(int i1)
	{
		y = i1;
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
	}
}
