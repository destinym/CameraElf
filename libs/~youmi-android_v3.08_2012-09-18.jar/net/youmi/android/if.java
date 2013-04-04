// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package net.youmi.android:
//			AdView, bw, cz, dm, 
//			dn, do, gz, ib, 
//			ig, ih

class if extends View
{

	Shader a;
	int b;
	int c;
	dm d;
	ib e;
	Drawable f;
	AdView g;
	private cz x;
	Paint h;
	Paint i;
	Rect j;
	RectF k;
	RectF l;
	RectF m;
	Rect n;
	float o;
	float p;
	float q;
	float r;
	int s;
	int t;
	boolean u;
	String v;
	Runnable w;

	public if(Context context, AdView adview, ib ib1, int i1, int j1, dm dm1, Drawable drawable)
	{
		super(context);
		h = new Paint();
		i = new Paint();
		j = new Rect();
		k = new RectF();
		l = new RectF();
		m = new RectF();
		n = new Rect();
		o = 0.0F;
		p = 0.0F;
		q = 5F;
		r = 5F;
		s = Color.argb(185, 0, 0, 0);
		t = Color.argb(255, 10, 10, 10);
		u = false;
		v = "点击查看详情";
		w = new ig(this);
		d = dm1;
		b = i1;
		g = adview;
		c = j1;
		e = ib1;
		f = drawable;
		int k1 = dm1.a().d().a();
		int l1 = dm1.a().d().b();
		int i2 = dm1.a().d().c();
		int j2 = dm1.a().d().e();
		int k2 = dm1.a().d().d();
		int l2 = (j1 - j2) / 2;
		k.set(i1 - l1 - k1, j1 - l1 - k1, i1 - k1, j1 - k1);
		h.setTextSize(dm1.a().d().f());
		String s1 = "点击查看详情";
		h.getTextBounds(s1, 0, s1.length(), n);
		l.set(i1 - n.width() - i2 - k2 * 4 - l2, l2, i1 - l2, l2 + j2);
		m.set(l.left + (float)k2, l.top + (float)k2, l.left + (float)i2 + (float)k2, l.top + (float)k2 + (float)i2);
		o = m.right + (float)k2;
		p = j1 / 2 + dm1.a(5);
		a = new LinearGradient(0.0F, 0.0F, 0.0F, j1, Color.argb(255, 255, 255, 255), Color.argb(255, 80, 80, 80), android.graphics.Shader.TileMode.CLAMP);
		q = dm1.a(q);
		r = dm1.a(r);
		setClickable(true);
		i.setTextSize(d.a().d().f());
		i.setTextAlign(android.graphics.Paint.Align.LEFT);
		i.setColor(t);
		i.setAntiAlias(true);
	}

	void a(cz cz1)
	{
		if (cz1 == null)
			return;
		if (x != null && x.f().equals(cz1.f()))
			return;
		x = cz1;
		switch (x.a())
		{
		case 11: // '\013'
			v = "点击浏览网页";
			break;

		case 21: // '\025'
			v = "点击查看详情";
			break;

		case 22: // '\026'
			if (x.x())
				v = "点击升级程序";
			else
				v = "点击直接下载";
			break;

		case 41: // ')'
			v = "点击拨打电话";
			break;

		case 44: // ','
			v = "点击发送邮件";
			break;

		case 43: // '+'
			v = "点击查看地图";
			break;

		case 31: // '\037'
			v = "点击查看详情";
			break;

		case 42: // '*'
			v = "点击发送短信";
			break;

		case 32: // ' '
			v = "点击播放视频";
			break;

		default:
			v = "点击查看详情";
			break;
		}
		g.a().c();
		try
		{
			Handler handler = getHandler();
			if (handler != null)
				handler.post(w);
		}
		catch (Exception exception) { }
		postInvalidate();
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		switch (motionevent.getAction())
		{
		case 0: // '\0'
			u = true;
			break;

		case 1: // '\001'
			u = false;
			a(motionevent);
			break;

		case 2: // '\002'
			u = true;
			break;

		case 3: // '\003'
			u = false;
			break;

		case 4: // '\004'
			u = false;
			break;

		default:
			u = false;
			break;
		}
		postInvalidate();
		return super.onTouchEvent(motionevent);
	}

	private void a(MotionEvent motionevent)
	{
		if (g.a().c)
		{
			g.a().c();
			return;
		}
		if (!x.G())
			break MISSING_BLOCK_LABEL_184;
		if (!g.a().a())
			break MISSING_BLOCK_LABEL_98;
		float f1 = motionevent.getX();
		float f2 = motionevent.getY();
		if (l.contains(f1, f2))
		{
			g.a().c();
			e.i();
			return;
		}
		ih ih1;
		try
		{
			g.a().c();
			return;
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
		break MISSING_BLOCK_LABEL_207;
		g.a().b();
		if (x.Y() != 0)
		{
			ih1 = null;
			if (x.ab() == null)
			{
				ih1 = new ih(g.getContext(), g.getActivity(), x);
				x.a(ih1);
				ih1.c();
			} else
			{
				ih1 = x.ab();
				ih1.c();
			}
		}
		return;
		g.a().c();
		e.i();
		return;
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		if (x == null)
			return;
		Bitmap bitmap;
		boolean flag;
		bitmap = x.n();
		if (bitmap != null)
			if (bitmap.isRecycled())
				bitmap = null;
			else
				j.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
		flag = false;
		int i1 = x.b();
		if ((i1 == 1 || i1 == 0) && bitmap != null)
			flag = true;
		h.reset();
		if (g.a().c)
		{
			if (flag && bitmap != null)
				canvas.drawBitmap(bitmap, j, k, h);
			return;
		}
		if (g.a().a())
		{
			canvas.drawColor(s);
			h.reset();
			h.setAntiAlias(true);
			h.setShader(a);
			h.setShadowLayer(r, 0.0F, 0.0F, 0xff444444);
			canvas.drawRoundRect(l, q, q, h);
			h.reset();
			if (bitmap != null)
				canvas.drawBitmap(bitmap, j, m, h);
			canvas.drawText(v, o, p, i);
			return;
		}
		try
		{
			if (flag && bitmap != null)
				canvas.drawBitmap(bitmap, j, k, h);
			if (u)
				canvas.drawColor(s);
			else
				return;
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
		return;
	}

	static cz a(if if1)
	{
		return if1.x;
	}
}
