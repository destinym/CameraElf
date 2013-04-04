// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import org.json.JSONObject;

// Referenced classes of package net.youmi.android:
//			gc, a, ce, cn, 
//			fv, fw, fx, ga, 
//			gg, gj, gw, gz, 
//			hv

class gb extends gc
{

	private String b;
	private boolean c;
	private Notification d;
	private int e;
	private int f;
	private int g;
	private PendingIntent h;
	private String i;
	private String j;
	private String k;
	private boolean l;
	private String m;
	private int n;
	private String o;
	public final long a = System.currentTimeMillis();
	private fv p;
	private ce q;

	public gb(fv fv1, boolean flag, int i1)
	{
		super(fv1.d().a(), fv1.d().b(), fv1.d().c());
		l = false;
		b = fv1.c().a();
		c = flag;
		e = fv1.a();
		g = gj.a(e, 1);
		p = fv1;
		f = i1;
	}

	public fv a()
	{
		return p;
	}

	public void a(String s, int i1, String s1)
	{
		s = gw.a(s);
		if (s == null)
			return;
		s1 = gw.a(s1);
		if (s1 == null)
		{
			return;
		} else
		{
			m = s;
			n = i1;
			o = s1;
			l = true;
			return;
		}
	}

	public String b()
	{
		return b;
	}

	public boolean c()
	{
		return c;
	}

	public boolean d()
	{
		return l;
	}

	public Notification a(Context context, boolean flag)
	{
		if (d == null)
		{
			d = new Notification();
			d.flags = 16;
		}
		if (flag)
			d.icon = 0x1080081;
		else
			d.icon = 0x1080082;
		d.when = System.currentTimeMillis();
		return d;
		Throwable throwable;
		throwable;
		return null;
	}

	public PendingIntent a(Context context)
	{
		if (h == null)
			h = PendingIntent.getActivity(context, g, new Intent(), 0);
		return h;
		Throwable throwable;
		throwable;
		return null;
	}

	public String e()
	{
		if (i == null)
			try
			{
				i = (new StringBuilder("下载")).append(b).toString();
			}
			catch (Throwable throwable) { }
		return i;
	}

	public String f()
	{
		if (j == null)
			try
			{
				j = (new StringBuilder("正在下载")).append(b).toString();
			}
			catch (Throwable throwable) { }
		return j;
	}

	public String g()
	{
		if (k == null)
			try
			{
				k = (new StringBuilder("下载")).append(b).append("失败").toString();
			}
			catch (Throwable throwable) { }
		return k;
	}

	public boolean a(Context context, String s)
	{
		try
		{
			Notification notification = a(context, false);
			notification.setLatestEventInfo(context, g(), s, a(context));
			gj.a(context, g, notification);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean b(Context context)
	{
		try
		{
			Notification notification = a(context, true);
			notification.setLatestEventInfo(context, e(), "正在连接", a(context));
			gj.a(context, g, notification);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean c(Context context)
	{
		try
		{
			gj.a(context, g);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean a(Context context, File file)
	{
label0:
		{
			try
			{
				if (context == null || file == null || !file.exists())
					break label0;
				if (p != null)
				{
					try
					{
						boolean flag = false;
						if (file.getPath().contains(context.getFilesDir().getPath()))
							flag = true;
						String s = null;
						if (p.c() != null && p.c().b() != null)
							s = p.c().b();
						String s1 = "";
						String s2 = null;
						if (flag)
							s2 = file.getName();
						cn.a(context, s, s2, s1, q);
					}
					catch (Throwable throwable) { }
					hv.d(context, file.getPath());
				} else
				{
					hv.d(context, file.getPath());
				}
			}
			catch (Throwable throwable1)
			{
				return false;
			}
			return true;
		}
		return false;
	}

	public boolean a(Context context, int i1, long l1)
	{
		try
		{
			StringBuilder stringbuilder = new StringBuilder(100);
			String s = stringbuilder.append("已完成: ").append(i1).append("%   ").append("下载速度: ").append(l1 / 1024L).append("KB/S").toString();
			Notification notification = a(context, true);
			notification.setLatestEventInfo(context, f(), s, a(context));
			gj.a(context, g, notification);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean d(Context context)
	{
		if (!l)
			return true;
		try
		{
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("a", e);
			jsonobject.put("b", 5);
			String s = String.format("javascript:%s(%d,%s)", new Object[] {
				m, Integer.valueOf(n), jsonobject.toString()
			});
			gg.a().a(o, s);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean a(Context context, int i1, int j1)
	{
		if (!l)
			return true;
		try
		{
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("a", e);
			jsonobject.put("b", 2);
			jsonobject.put("c", i1);
			jsonobject.put("d", j1);
			String s = String.format("javascript:%s(%d,%s)", new Object[] {
				m, Integer.valueOf(n), jsonobject.toString()
			});
			gg.a().a(o, s);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean b(Context context, String s)
	{
		if (!l)
			return true;
		try
		{
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("a", e);
			jsonobject.put("b", 0);
			jsonobject.put("e", s);
			String s1 = String.format("javascript:%s(%d,%s)", new Object[] {
				m, Integer.valueOf(n), jsonobject.toString()
			});
			gg.a().a(o, s1);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean e(Context context)
	{
		if (!l)
			return true;
		try
		{
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("a", e);
			jsonobject.put("b", 1);
			String s = String.format("javascript:%s(%d,%s)", new Object[] {
				m, Integer.valueOf(n), jsonobject.toString()
			});
			gg.a().a(o, s);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean f(Context context)
	{
		try
		{
			q = new ce();
			q.a(String.valueOf(p.b().a()));
			q.b(p.d().a());
			q.c(p.d().a());
			q.d(p.b().b());
			q.b(p.a());
			q.a(p.b().c());
			net.youmi.android.a.a(context, q, 1);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean a(Context context, File file, String s)
	{
		try
		{
			q = net.youmi.android.a.a(context, file.getPath(), s, p.d().a(), p.d().a(), String.valueOf(p.a()));
			q.d(p.b().b());
			q.b(p.a());
			q.a(p.b().c());
			net.youmi.android.a.a(context, q, 3);
		}
		catch (Throwable throwable)
		{
			gz.a(throwable);
			return false;
		}
		return true;
	}
}
