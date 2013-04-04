// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.graphics.*;
import android.graphics.drawable.*;
import android.graphics.drawable.shapes.ArcShape;

// Referenced classes of package net.youmi.android:
//			g

class m
{

	private Drawable b;
	private Drawable c;
	private Drawable d;
	private Drawable e;
	private Drawable f;
	final g a;

	m(g g1)
	{
		a = g1;
		super();
	}

	Drawable a(String s)
	{
		android.graphics.Bitmap bitmap = BitmapFactory.decodeStream(getClass().getResourceAsStream(s));
		return new BitmapDrawable(bitmap);
		Exception exception;
		exception;
		return null;
	}

	Drawable a()
	{
		if (b == null)
		{
			Drawable drawable = a("last.png");
			Drawable drawable1 = a("last-enable.png");
			b = a(drawable, drawable1);
		}
		return b;
	}

	Drawable b()
	{
		if (c == null)
		{
			Drawable drawable = a("next.png");
			Drawable drawable1 = a("next-enable.png");
			c = a(drawable, drawable1);
		}
		return c;
	}

	Drawable c()
	{
		if (f == null)
		{
			Drawable drawable = a("download.png");
			f = a(drawable, null);
		}
		return f;
	}

	Drawable d()
	{
		if (e == null)
		{
			Drawable drawable = a("quit.png");
			e = a(drawable, null);
		}
		return e;
	}

	Drawable e()
	{
		if (d == null)
		{
			Drawable drawable = a("reflesh.png");
			Drawable drawable1 = a("reflesh.png");
			d = a(drawable, drawable1);
		}
		return d;
	}

	Drawable a(Drawable drawable, Drawable drawable1)
	{
		StateListDrawable statelistdrawable = new StateListDrawable();
		ShapeDrawable shapedrawable = new ShapeDrawable();
		shapedrawable.setShape(new ArcShape(0.0F, 360F));
		shapedrawable.getPaint().setShader(new RadialGradient(35F, 25F, 25F, Color.argb(80, 255, 255, 255), Color.argb(0, 255, 255, 255), android.graphics.Shader.TileMode.CLAMP));
		LayerDrawable layerdrawable = new LayerDrawable(new Drawable[] {
			shapedrawable, drawable
		});
		statelistdrawable.addState(g.a(), layerdrawable);
		if (drawable != null)
			statelistdrawable.addState(g.b(), drawable);
		if (drawable1 != null)
			statelistdrawable.addState(g.c(), drawable1);
		return statelistdrawable;
	}
}
