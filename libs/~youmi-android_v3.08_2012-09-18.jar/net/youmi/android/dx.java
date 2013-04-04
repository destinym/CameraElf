// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.graphics.*;
import android.graphics.drawable.*;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.RectShape;

// Referenced classes of package net.youmi.android:
//			dm, dq, dr, dy

class dx
{

	static Drawable a(dm dm1)
	{
		ShapeDrawable shapedrawable;
		shapedrawable = new ShapeDrawable(new RectShape());
		shapedrawable.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, dm1.b().a(), Color.rgb(60, 60, 60), Color.rgb(0, 0, 0), android.graphics.Shader.TileMode.CLAMP));
		return shapedrawable;
		Exception exception;
		exception;
		return new ColorDrawable(Color.argb(160, 0, 0, 0));
	}

	static Drawable a(int ai[], Drawable drawable, int ai1[], Drawable drawable1, int ai2[], Drawable drawable2)
	{
		StateListDrawable statelistdrawable;
		statelistdrawable = new StateListDrawable();
		statelistdrawable.addState(ai2, drawable2);
		statelistdrawable.addState(ai1, drawable1);
		statelistdrawable.addState(ai, drawable);
		return statelistdrawable;
		Exception exception;
		exception;
		return null;
	}

	static Drawable a(int ai[], Drawable drawable, int ai1[], Drawable drawable1)
	{
		StateListDrawable statelistdrawable;
		statelistdrawable = new StateListDrawable();
		statelistdrawable.addState(ai1, drawable1);
		statelistdrawable.addState(ai, drawable);
		return statelistdrawable;
		Exception exception;
		exception;
		return null;
	}

	static Drawable b(dm dm1)
	{
		ShapeDrawable shapedrawable;
		float f = dm1.c().b();
		float f1 = dm1.c().a();
		float f2 = dm1.c().c();
		dy dy1 = new dy();
		shapedrawable = new ShapeDrawable(dy1);
		return shapedrawable;
		Throwable throwable;
		throwable;
		return null;
	}

	static Drawable a(dm dm1, int ai[], int ai1[], int ai2[])
	{
		ShapeDrawable shapedrawable;
		ShapeDrawable shapedrawable1;
		ShapeDrawable shapedrawable2;
		float f = dm1.b().b();
		float f1 = dm1.b().b();
		float f2 = dm1.b().c();
		float f3 = dm1.b().c();
		float f4 = f2 + (float)dm1.b().b();
		float f5 = f3 + (float)dm1.b().b();
		Path path = new Path();
		path.moveTo(f2, f3 + f1 / 2.0F);
		path.lineTo(f4, f3);
		path.lineTo(f4, f5);
		path.lineTo(f2, f3 + f1 / 2.0F);
		path.close();
		PathShape pathshape = new PathShape(path, dm1.b().a(), dm1.b().a());
		shapedrawable = new ShapeDrawable(pathshape);
		shapedrawable.getPaint().setColor(0xff444444);
		shapedrawable1 = new ShapeDrawable(pathshape);
		shapedrawable1.getPaint().setColor(Color.rgb(245, 245, 245));
		shapedrawable2 = new ShapeDrawable(pathshape);
		shapedrawable2.getPaint().setColor(Color.argb(200, 0, 191, 255));
		return a(ai, ((Drawable) (shapedrawable)), ai1, ((Drawable) (shapedrawable1)), ai2, ((Drawable) (shapedrawable2)));
		Exception exception;
		exception;
		return null;
	}

	static Drawable b(dm dm1, int ai[], int ai1[], int ai2[])
	{
		ShapeDrawable shapedrawable;
		ShapeDrawable shapedrawable1;
		ShapeDrawable shapedrawable2;
		int i = dm1.b().b();
		int j = dm1.b().b();
		int k = dm1.b().c();
		int l = dm1.b().c();
		int i1 = k + dm1.b().b();
		int j1 = l + dm1.b().b();
		Path path = new Path();
		path.moveTo(k, l);
		path.lineTo(i1, l + j / 2);
		path.lineTo(k, j1);
		path.lineTo(k, l);
		path.close();
		PathShape pathshape = new PathShape(path, dm1.b().a(), dm1.b().a());
		shapedrawable = new ShapeDrawable(pathshape);
		shapedrawable.getPaint().setColor(0xff444444);
		shapedrawable1 = new ShapeDrawable(pathshape);
		shapedrawable1.getPaint().setColor(Color.rgb(245, 245, 245));
		shapedrawable2 = new ShapeDrawable(pathshape);
		shapedrawable2.getPaint().setColor(Color.argb(200, 0, 191, 255));
		return a(ai, shapedrawable, ai1, shapedrawable1, ai2, shapedrawable2);
		Exception exception;
		exception;
		return null;
	}

	static Drawable a(dm dm1, int ai[], int ai1[])
	{
		ShapeDrawable shapedrawable;
		ShapeDrawable shapedrawable1;
		float f = dm1.b().b();
		float f1 = dm1.b().b();
		float f2 = dm1.b().c();
		float f3 = dm1.b().c();
		float f4 = f2 + (float)dm1.b().b();
		float f5 = f3 + (float)dm1.b().b();
		float f6 = f1 / 6F;
		float f7 = f1 / 5F;
		float f8 = f / 5F;
		float f9 = f / 6F;
		Path path = new Path();
		path.moveTo(f2 + f8, f3);
		path.lineTo(f2 + f, f3);
		path.lineTo(f2 + f, f3 + f1);
		path.lineTo(f2 + f8, f3 + f1);
		path.lineTo(f2 + f8, (f3 + f1) - f6);
		path.lineTo((f2 + f) - f9, (f3 + f1) - f6);
		path.lineTo((f2 + f) - f9, f3 + f6);
		path.lineTo(f2 + f8, f3 + f6);
		path.lineTo(f2 + f8, f3);
		path.close();
		path.moveTo(f2, f3 + f7 * 2.0F);
		path.lineTo(f2, f3 + f7 * 3F);
		path.lineTo(f2 + f9 * 2.0F, f3 + f7 * 3F);
		path.lineTo(f2 + f9 * 2.0F, (f3 + f1) - f6);
		path.lineTo((f2 + f) - f9, f3 + f1 / 2.0F);
		path.lineTo(f2 + f9 * 2.0F, f3 + f6);
		path.lineTo(f2 + f9 * 2.0F, f3 + f7 * 2.0F);
		path.lineTo(f2, f3 + f7 * 2.0F);
		path.close();
		PathShape pathshape = new PathShape(path, dm1.b().a(), dm1.b().a());
		shapedrawable = new ShapeDrawable(pathshape);
		shapedrawable.getPaint().setColor(Color.rgb(245, 245, 245));
		shapedrawable1 = new ShapeDrawable(pathshape);
		Paint paint = shapedrawable1.getPaint();
		paint.setColor(Color.argb(200, 0, 191, 255));
		return a(ai, ((Drawable) (shapedrawable)), ai1, ((Drawable) (shapedrawable1)));
		Exception exception;
		exception;
		return null;
	}

	static Drawable b(dm dm1, int ai[], int ai1[])
	{
		ShapeDrawable shapedrawable;
		ShapeDrawable shapedrawable1;
		float f = dm1.b().b();
		float f1 = dm1.b().b();
		float f2 = dm1.b().c();
		float f3 = dm1.b().c();
		float f4 = f2 + (float)dm1.b().b();
		float f5 = f3 + (float)dm1.b().b();
		Path path = new Path();
		path.moveTo(f2, f5);
		path.lineTo(f4, f5);
		path.lineTo(f4, f3 + f1 * 0.75F);
		path.lineTo(f2, f3 + f1 * 0.75F);
		path.lineTo(f2, f5);
		path.close();
		path.moveTo(f2 + f / 2.0F, f3 + f1 * 0.7F);
		path.lineTo(f2 + f * 0.9F, f3 + f1 * 0.35F);
		path.lineTo(f2 + f * 0.6F, f3 + f1 * 0.35F);
		path.lineTo(f2 + f * 0.6F, f3);
		path.lineTo(f2 + f * 0.4F, f3);
		path.lineTo(f2 + f * 0.4F, f3 + f1 * 0.35F);
		path.lineTo(f2 + f * 0.1F, f3 + f1 * 0.35F);
		path.lineTo(f2 + f / 2.0F, f3 + f1 * 0.7F);
		path.close();
		PathShape pathshape = new PathShape(path, dm1.b().a(), dm1.b().a());
		shapedrawable = new ShapeDrawable(pathshape);
		shapedrawable.getPaint().setColor(Color.rgb(245, 245, 245));
		shapedrawable1 = new ShapeDrawable(pathshape);
		shapedrawable1.getPaint().setColor(Color.argb(200, 0, 191, 255));
		return a(ai, shapedrawable, ai1, shapedrawable1);
		Exception exception;
		exception;
		return null;
	}

	static Drawable c(dm dm1, int ai[], int ai1[], int ai2[])
	{
		ShapeDrawable shapedrawable;
		ShapeDrawable shapedrawable1;
		ShapeDrawable shapedrawable2;
		float f = dm1.b().b();
		float f1 = dm1.b().b();
		float f2 = dm1.b().c();
		float f3 = dm1.b().c();
		float f4 = f2 + (float)dm1.b().b();
		float f5 = f3 + (float)dm1.b().b();
		float f6 = 0.16F * f1;
		Path path = new Path();
		RectF rectf = new RectF(f2, f3, f4, f5);
		RectF rectf1 = new RectF(f2 + f6, f3 + f6, (f2 + f) - f6, (f3 + f1) - f6);
		path.moveTo(f2 + f, f3 + 0.5F * f1);
		path.arcTo(rectf, 0.0F, -150F);
		path.lineTo(f2, f3 + 0.15F * f1);
		path.lineTo(f2, f3 + 0.5F * f1);
		path.lineTo(f2 + 0.4F * f, f3 + 0.5F * f1);
		path.lineTo(f2 + 0.2F * f, f3 + 0.4F * f1);
		path.arcTo(rectf1, 190F, 160F);
		path.lineTo(f2 + f, f3 + 0.5F * f1);
		path.close();
		path.moveTo(f2, f3 + 0.5F * f1);
		path.arcTo(rectf, 180F, -150F);
		path.lineTo(f2 + f, f3 + 0.85F * f1);
		path.lineTo(f2 + f, f3 + 0.5F * f1);
		path.lineTo(f2 + 0.6F * f, f3 + 0.5F * f1);
		path.lineTo(f2 + 0.8F * f, f3 + 0.6F * f1);
		path.arcTo(rectf1, 10F, 160F);
		path.lineTo(f2, f3 + 0.5F * f1);
		path.close();
		PathShape pathshape = new PathShape(path, dm1.b().a(), dm1.b().a());
		shapedrawable = new ShapeDrawable(pathshape);
		shapedrawable.getPaint().setColor(0xff444444);
		shapedrawable1 = new ShapeDrawable(pathshape);
		shapedrawable1.getPaint().setColor(Color.rgb(245, 245, 245));
		shapedrawable1.getPaint().setAntiAlias(true);
		shapedrawable2 = new ShapeDrawable(pathshape);
		shapedrawable2.getPaint().setColor(Color.argb(200, 0, 191, 255));
		return a(ai, shapedrawable, ai1, shapedrawable1, ai2, shapedrawable2);
		Exception exception;
		exception;
		return null;
	}
}
