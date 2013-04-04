// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;

class dy extends Shape
{

	dy()
	{
	}

	public void draw(Canvas canvas, Paint paint)
	{
		paint.setColor(-1);
		canvas.drawCircle(15F, 15F, 15F, paint);
		paint.setColor(0xff444444);
		canvas.drawCircle(15F, 15F, 13F, paint);
		paint.setColor(-1);
		paint.setStrokeWidth(3F);
		canvas.drawLine(10F, 10F, 20F, 20F, paint);
		canvas.drawLine(20F, 10F, 10F, 20F, paint);
	}
}
