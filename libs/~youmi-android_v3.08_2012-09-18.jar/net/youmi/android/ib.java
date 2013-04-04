// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.io.File;
import java.util.Hashtable;

// Referenced classes of package net.youmi.android:
//			AdActivity, AdView, a, ar, 
//			au, bg, bh, bm, 
//			br, bu, bw, bx, 
//			ce, cp, cz, dc, 
//			dm, dn, do, dp, 
//			ea, eb, fq, fr, 
//			fs, fv, fw, fx, 
//			fz, ga, gb, gk, 
//			gz, hw, ic, id, 
//			ie, if, o, q

class ib extends FrameLayout
	implements eb, fq, fs
{

	q a;
	if b;
	boolean c;
	ie d;
	AdView e;
	private cz k;
	int f;
	Activity g;
	o h;
	Animation i;
	Animation j;

	ib(Activity activity, AdView adview, dm dm1, int l, int i1, int j1)
	{
		super(activity);
		c = false;
		f = 255;
		i = new AlphaAnimation(0.0F, 1.0F);
		j = new AlphaAnimation(1.0F, 0.0F);
		g = activity;
		e = adview;
		f = j1;
		int k1 = e.getAdWidth();
		int l1 = e.getAdHeight();
		c(l);
		dc dc1 = new dc(k1, l1, dm1);
		b = new if(activity, adview, this, adview.getAdWidth(), adview.getAdHeight(), dm1, dc1);
		int i2 = e.getAdWidth() - dc1.a();
		int j2 = dm1.a().d().b() + dm1.a().d().a() * 2;
		if (i2 < j2)
			i2 = j2;
		int k2 = e.getAdWidth() - i2 - dm1.a().c().b() - dm1.a().c().a() * 2;
		a = new q(activity, adview, this, dm1, i1, k2);
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k1, l1);
		addView(a, layoutparams);
		android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(e.getAdWidth(), e.getAdHeight());
		addView(b, layoutparams1);
		b.bringToFront();
		d = new ie(activity, k1, l1, dm1);
		android.widget.FrameLayout.LayoutParams layoutparams2 = new android.widget.FrameLayout.LayoutParams(k1, l1);
		addView(d, layoutparams2);
		d.bringToFront();
		d.setVisibility(8);
		android.widget.FrameLayout.LayoutParams layoutparams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
		layoutparams3.gravity = 85;
		layoutparams3.rightMargin = dm1.a(dm1.a().d().a());
		layoutparams3.bottomMargin = dm1.a(dm1.a().d().a());
		i.setDuration(800L);
		j.setDuration(800L);
		setFocusable(true);
		setClickable(true);
		setVisibility(8);
		d();
	}

	void c(int l)
	{
		int i1 = f;
		int j1 = Color.red(l);
		int k1 = Color.green(l);
		int l1 = Color.blue(l);
		byte byte0 = 60;
		int i2 = j1 + byte0 >= 255 ? 255 : j1 + byte0;
		int j2 = k1 + byte0 >= 255 ? 255 : k1 + byte0;
		int k2 = l1 + byte0 >= 255 ? 255 : l1 + byte0;
		int l2 = j1 - byte0 <= 0 ? 0 : j1 - byte0;
		int i3 = k1 - byte0 <= 0 ? 0 : k1 - byte0;
		int j3 = l1 - byte0 <= 0 ? 0 : l1 - byte0;
		GradientDrawable gradientdrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
			Color.argb(i1, i2, j2, k2), Color.argb(i1, l2, i3, j3)
		});
		setBackgroundDrawable(gradientdrawable);
	}

	void d()
	{
	}

	void i()
	{
		cz cz1;
		Toast.makeText(g, "正在加载", 0).show();
		cz1 = j();
		if (cz1 == null) goto _L2; else goto _L1
_L1:
		cz1.a();
		JVM INSTR lookupswitch 10: default 1632
	//	               -1: 116
	//	               11: 189
	//	               21: 397
	//	               22: 440
	//	               31: 1395
	//	               32: 1451
	//	               41: 1454
	//	               42: 1501
	//	               43: 1544
	//	               44: 1588;
		   goto _L3 _L4 _L5 _L6 _L7 _L8 _L3 _L9 _L10 _L11 _L12
_L3:
		break; /* Loop/switch isn't completed */
_L4:
		if (cz1.i() == null)
			break; /* Loop/switch isn't completed */
		try
		{
			WebView webview = new WebView(g);
			webview.loadDataWithBaseURL(null, cz1.i().b(), "text/html", "utf-8", null);
			(new android.app.AlertDialog.Builder(g)).setTitle("有米广告SDK配置简易教程").setView(webview).create().show();
		}
		catch (Exception exception1)
		{
			gz.a(exception1);
		}
		break; /* Loop/switch isn't completed */
_L5:
		if (cz1.L())
		{
			bm.a(g, cz1.p());
			if (!cz1.s())
				cp.a(g, cz1, true);
			if (!hw.h(g) || cz1.Q() == null || cz1.Q().equals(""))
				break; /* Loop/switch isn't completed */
			if (!cz1.M())
			{
				br.a(g, cz1.O(), cz1.Q(), cz1.R());
				cz1.b(0);
				cp.a(g, cz1);
				break; /* Loop/switch isn't completed */
			}
			if (cz1.N() == 0)
			{
				br.a(g, cz1.O(), cz1.Q(), cz1.R());
				cz1.b(0);
				cp.a(g, cz1);
			}
			break; /* Loop/switch isn't completed */
		}
		if (cz1.i() != null)
		{
			b(cz1);
		} else
		{
			e.a().c = true;
			fr fr1 = new fr(g, this);
			fr1.execute(new String[] {
				cz1.p()
			});
		}
		break; /* Loop/switch isn't completed */
_L6:
		try
		{
			h = new o(g, cz1, System.currentTimeMillis() - cz1.I(), 0L);
			bm.e(g, cz1.p());
		}
		catch (Exception exception2) { }
		break; /* Loop/switch isn't completed */
_L7:
		boolean flag = false;
		if (k.z() && k.x())
		{
			e.a().c = true;
			cz1.a(3);
			if (!cz1.E())
			{
				cz1.e(0);
				cz1.c(2);
				cp.a(g, cz1, false);
			}
			fv fv1 = new fv();
			ga ga1 = new ga();
			ga1.a(cz1.U());
			ga1.b(cz1.A());
			fv1.a(ga1);
			fx fx1 = new fx();
			fx1.a(cz1.p());
			fx1.b(cz1.V());
			fx1.a(cz1.Z());
			fx1.a(cz1.aa());
			fv1.a(fx1);
			fz fz1 = new fz();
			fz1.a(false);
			fv1.a(fz1);
			fz1.a(g, cz1.A());
			fw fw1 = new fw();
			fw1.a(Integer.valueOf(cz1.f()).intValue());
			fw1.b(0);
			fw1.c(0);
			fw1.b(cz1.o());
			fv1.a(fw1);
			gb gb1 = new gb(fv1, true, 0);
			gk.a().a(g, gb1);
			try
			{
				ce ce1 = new ce();
				ce1.a = cz1.f();
				ce1.c = cz1.p();
				ce1.d = cz1.p();
				net.youmi.android.a.a(g, ce1, 1);
			}
			catch (Throwable throwable) { }
			e.a().c = false;
			break; /* Loop/switch isn't completed */
		}
		try
		{
			if (k.y())
			{
				cz1.a(1);
				boolean flag1;
				if (k.B() == null || "".equals(k.B()))
				{
					flag1 = bm.b(g, k.A());
				} else
				{
					flag1 = bm.a(g, k.B(), k.C());
					if (!flag1)
						flag1 = bm.b(g, k.A());
				}
				if (!flag1)
					break; /* Loop/switch isn't completed */
				cz1.c(0);
				cz1.d(0);
				cz1.e(0);
				cp.a(g, cz1, true);
				if (!hw.h(g) || cz1.O() == null || cz1.O().equals(""))
					break; /* Loop/switch isn't completed */
				if (!cz1.M())
				{
					br.a(g, cz1.O(), cz1.Q(), null, cz1);
					cz1.b(0);
					cp.a(g, cz1);
					break; /* Loop/switch isn't completed */
				}
				if (cz1.N() == 0)
				{
					br.a(g, cz1.O(), cz1.Q(), null, cz1);
					cz1.b(0);
					cp.a(g, cz1);
				}
				break; /* Loop/switch isn't completed */
			}
			e.a().c = true;
			if (a.d == null)
				a.d = new Hashtable();
			cz cz2 = cz1;
			if (cz2 != null && hw.h(g) && cz1.O() != null && !cz1.O().equals(""))
				a.d.put(cz1.A(), cz2);
			cz1.a(5);
			if (!cz1.E())
			{
				cz1.d(0);
				cz1.c(2);
				cp.a(g, cz1, false);
			}
			fv fv2 = new fv();
			fv2.a(Integer.valueOf(cz1.f()).intValue());
			ga ga2 = new ga();
			ga2.a(cz1.U());
			ga2.b(cz1.A());
			fv2.a(ga2);
			fx fx2 = new fx();
			fx2.a(cz1.p());
			fx2.b(cz1.V());
			fx2.a(cz1.Z());
			fx2.a(cz1.aa());
			fv2.a(fx2);
			fz fz2 = new fz();
			fz2.a(false);
			fv2.a(fz2);
			fz2.a(g, cz1.A());
			fw fw2 = new fw();
			fw2.a(Integer.valueOf(cz1.f()).intValue());
			fw2.b(0);
			fv2.a(fw2);
			gb gb2 = new gb(fv2, true, 0);
			gk.a().a(g, gb2);
			try
			{
				ce ce2 = new ce();
				ce2.a = cz1.f();
				ce2.c = cz1.p();
				ce2.d = cz1.p();
				net.youmi.android.a.a(g, ce2, 1);
			}
			catch (Throwable throwable1) { }
			e.a().c = false;
		}
		catch (Exception exception3)
		{
			exception3.printStackTrace();
		}
		break; /* Loop/switch isn't completed */
_L8:
		try
		{
			String as[] = cz1.F();
			if (as != null)
			{
				e.a().c = true;
				ea ea1 = new ea(g, this, cz1);
				ea1.execute(new String[][] {
					as
				});
			}
		}
		catch (Exception exception4) { }
		break; /* Loop/switch isn't completed */
_L9:
		try
		{
			h = new o(g, cz1, System.currentTimeMillis() - cz1.I(), 0L);
			bm.a(g, Uri.parse(cz1.p()));
		}
		catch (Exception exception5) { }
		break; /* Loop/switch isn't completed */
_L10:
		try
		{
			h = new o(g, cz1, System.currentTimeMillis() - cz1.I(), 0L);
			au.a(g, cz1.p());
		}
		catch (Exception exception6) { }
		break; /* Loop/switch isn't completed */
_L11:
		try
		{
			h = new o(g, cz1, System.currentTimeMillis() - cz1.I(), 0L);
			au.c(g, cz1.p());
		}
		catch (Exception exception7) { }
		break; /* Loop/switch isn't completed */
_L12:
		try
		{
			h = new o(g, cz1, System.currentTimeMillis() - cz1.I(), 0L);
			au.b(g, cz1.p());
		}
		catch (Exception exception8) { }
		break; /* Loop/switch isn't completed */
		Exception exception;
		exception;
_L2:
	}

	void b(cz cz1)
	{
		if (cz1 != null && cz1.i() != null)
		{
			ar.a = cz1;
			AdActivity.a(g);
		}
	}

	void c(cz cz1)
	{
		if (cz1 == null)
			return;
		if (k != null && k.f().equals(cz1.f()))
			return;
		try
		{
			k = cz1;
			try
			{
				a.a(cz1);
				b.a(cz1);
				e.g();
			}
			catch (Exception exception) { }
		}
		catch (Exception exception1) { }
		return;
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
		try
		{
			if (h != null)
				h.a();
		}
		catch (Exception exception) { }
	}

	public void a(int l)
	{
		try
		{
			d.a(l);
		}
		catch (Exception exception) { }
	}

	public void a(fr fr1, bx bx1)
	{
		e.a().c = false;
		if (bx1 == null)
		{
			e();
			return;
		}
		cz cz1;
		cz1 = j();
		if (cz1 == null)
		{
			e();
			return;
		}
		try
		{
			try
			{
				bx1.a(bh.a(g, bx1.b(), cz1.H(), cz1.o(), cz1.k()));
				cz1.a(bx1);
				try
				{
					(new Thread(new ic(this, cz1, fr1))).start();
				}
				catch (Exception exception3) { }
				b(cz1);
			}
			catch (Exception exception) { }
			try
			{
				d.setVisibility(8);
				d.a();
			}
			catch (Exception exception1) { }
		}
		catch (Exception exception2) { }
		return;
	}

	public void a(fr fr1, File file, String s)
	{
		bg.d(g);
		if (file != null && file.exists())
		{
			bu.a(g, "下载成功");
			try
			{
				ce ce1 = net.youmi.android.a.a(g, file.getPath(), s, fr1.a(), fr1.b(), fr1.c());
				net.youmi.android.a.a(g, ce1, 2);
				net.youmi.android.a.a(g, ce1, 3);
			}
			catch (Exception exception)
			{
				gz.a(exception);
			}
			bm.b(g, file.getPath());
		}
	}

	public void e()
	{
		e.a().c = false;
		try
		{
			d.setVisibility(8);
			d.a();
		}
		catch (Exception exception) { }
		try
		{
			Toast.makeText(g, "无法连接服务器,请稍后重试!", 0).show();
		}
		catch (Exception exception1) { }
	}

	public void f()
	{
		e.a().c = false;
		bu.a(g, "正在下载");
		try
		{
			d.setVisibility(8);
			d.a();
		}
		catch (Exception exception) { }
	}

	public void b(fr fr1, File file, String s)
	{
		e.a().c = false;
		try
		{
			d.setVisibility(8);
			d.a();
		}
		catch (Exception exception) { }
		if (file != null && file.exists())
		{
			bu.a(g, "下载成功");
			try
			{
				ce ce1 = net.youmi.android.a.a(g, file.getPath(), s, fr1.a(), fr1.b(), fr1.c());
				net.youmi.android.a.a(g, ce1, 3);
			}
			catch (Exception exception1)
			{
				gz.a(exception1);
			}
			bm.b(g, file.getPath());
		}
	}

	public void a(fr fr1)
	{
		e.a().c = false;
		e.a().c = false;
		try
		{
			d.setVisibility(8);
			d.a();
		}
		catch (Exception exception) { }
		bg.c(g);
		bu.a(g, "开始下载");
		try
		{
			ce ce1 = new ce();
			ce1.a = fr1.c();
			ce1.c = fr1.a();
			ce1.d = fr1.b();
			net.youmi.android.a.a(g, ce1, 1);
		}
		catch (Exception exception1) { }
	}

	public void g()
	{
		e.a().c = false;
		bu.a(g, "存储卡不可用,请启用存储卡", 1);
		try
		{
			d.setVisibility(8);
			d.a();
		}
		catch (Exception exception) { }
	}

	public void h()
	{
		bg.d(g);
		bu.a(g, "下载失败");
	}

	public void a()
	{
		e.a().c = false;
		try
		{
			d.setVisibility(8);
			d.a();
		}
		catch (Exception exception) { }
		try
		{
			Toast.makeText(g, "无法连接服务器,请稍后重试!", 0).show();
		}
		catch (Exception exception1) { }
	}

	public void a(ea ea1, String as[])
	{
		e.a().c = false;
		if (as == null)
		{
			e();
			return;
		}
		try
		{
			try
			{
				try
				{
					(new Thread(new id(this, ea1))).start();
				}
				catch (Exception exception) { }
				AdActivity.a(g, as, ea1.e(), ea1.f());
			}
			catch (Exception exception1) { }
			try
			{
				d.setVisibility(8);
				d.a();
			}
			catch (Exception exception2) { }
		}
		catch (Exception exception3) { }
		return;
	}

	public void b(int l)
	{
		try
		{
			d.a(l);
		}
		catch (Exception exception) { }
	}

	public void a(cz cz1)
	{
		if (cz1 == null)
		{
			try
			{
				e.h();
			}
			catch (Exception exception) { }
			return;
		}
		try
		{
			try
			{
				c(cz1);
			}
			catch (Exception exception1) { }
		}
		catch (Exception exception2) { }
		return;
	}

	public dm b()
	{
		return e.b();
	}

	cz j()
	{
		return k;
	}

	public boolean c()
	{
		return e.a().a(e);
		Exception exception;
		exception;
		return false;
	}
}
