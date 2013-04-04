// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.io.File;
import java.util.*;

// Referenced classes of package net.youmi.android:
//			bu, ez, fa, fv, 
//			ga, gb, gm, gq

class gk
	implements fa
{

	private Context a;
	private static gk b;
	private Hashtable c;
	private HashSet d;

	public static synchronized gk a()
	{
		if (b == null)
			b = new gk();
		return b;
	}

	private gk()
	{
		c = new Hashtable(10);
		d = new HashSet(10);
	}

	private synchronized void a(String s, gb gb1)
	{
		if (s == null || gb1 == null)
			return;
		try
		{
			if (c == null)
				c = new Hashtable(10);
			c.put(s, gb1);
		}
		catch (Throwable throwable) { }
		return;
	}

	private gb b(String s)
	{
		if (c == null)
			return null;
		return (gb)c.get(s);
		Throwable throwable;
		throwable;
		return null;
	}

	public void a(Context context, gb gb1)
	{
		if (context != null && a == null)
			a = context.getApplicationContext();
		if (a == null)
			throw new NullPointerException("applicationcontext is null");
		if (gb1 == null)
			throw new NullPointerException("req is null");
		String s = gm.a().a(gb1);
		a(s, gb1);
		File file = gq.a().a(context, gm.a(), gb1, this);
		if (file != null && file.exists())
			a(s, file);
	}

	public void a(String s, int i, int j)
	{
		try
		{
			gb gb1 = b(s);
			if (gb1 != null && a != null)
			{
				if (gb1.c())
					gb1.a(a, i, j);
				if (gb1.d())
					gb1.a(a, i, j);
			}
		}
		catch (Throwable throwable) { }
		try
		{
			for (Iterator iterator = d.iterator(); iterator.hasNext();)
				try
				{
					((ez)iterator.next()).a(s, i, j);
				}
				catch (Throwable throwable2) { }

		}
		catch (Throwable throwable1) { }
	}

	public void a(String s)
	{
		try
		{
			gb gb1 = b(s);
			if (gb1 != null && a != null)
			{
				if (gb1.c())
					gb1.b(a);
				if (gb1.d())
					gb1.d(a);
				gb1.f(a);
				String s1 = null;
				try
				{
					if (gb1.a() != null && gb1.a().c() != null && gb1.a().c().b() != null)
						s1 = gb1.a().c().b();
				}
				catch (Throwable throwable3) { }
				bu.b(a, (new StringBuilder("正在下载")).append(gb1.b()).toString());
			}
		}
		catch (Throwable throwable) { }
		try
		{
			for (Iterator iterator = d.iterator(); iterator.hasNext();)
				try
				{
					((ez)iterator.next()).a(s);
				}
				catch (Throwable throwable2) { }

		}
		catch (Throwable throwable1) { }
	}

	public void a(String s, int i, long l)
	{
		try
		{
			gb gb1 = b(s);
			if (gb1 != null && a != null)
			{
				if (gb1.c())
					switch (i)
					{
					case 4: // '\004'
						gb1.a(a, "下载失败,存储空间不足");
						break;

					case 5: // '\005'
						gb1.a(a, "下载失败,网络不可用,请检查网络设置");
						break;

					case 6: // '\006'
						gb1.a(a, "连接服务器失败");
						break;

					case 7: // '\007'
						gb1.a(a, "下载失败.");
						break;

					default:
						gb1.a(a, "下载失败");
						break;
					}
				if (gb1.d())
					gb1.b(a, "");
				String s1 = null;
				try
				{
					if (gb1.a() != null && gb1.a().c() != null && gb1.a().c().b() != null)
						s1 = gb1.a().c().b();
				}
				catch (Throwable throwable3) { }
			}
		}
		catch (Throwable throwable) { }
		try
		{
			for (Iterator iterator = d.iterator(); iterator.hasNext();)
				try
				{
					((ez)iterator.next()).a(s, i);
				}
				catch (Throwable throwable2) { }

		}
		catch (Throwable throwable1) { }
	}

	public void a(String s, File file, long l)
	{
		try
		{
			gb gb1 = b(s);
			if (gb1 != null)
				gb1.a(a, file, file.getName());
		}
		catch (Throwable throwable) { }
		try
		{
			gb gb2 = b(s);
			String s1 = null;
			try
			{
				if (gb2.a() != null && gb2.a().c() != null && gb2.a().c().b() != null)
					s1 = gb2.a().c().b();
			}
			catch (Throwable throwable2) { }
		}
		catch (Throwable throwable1) { }
		b(s, file);
	}

	public void a(String s, File file)
	{
		b(s, file);
	}

	private void b(String s, File file)
	{
		try
		{
			gb gb1 = b(s);
			if (gb1 != null && a != null)
			{
				try
				{
					if (gb1.c())
						gb1.c(a);
					if (gb1.d())
						gb1.e(a);
				}
				catch (Throwable throwable2) { }
				gb1.a(a, file);
			}
		}
		catch (Throwable throwable) { }
		try
		{
			for (Iterator iterator = d.iterator(); iterator.hasNext();)
				try
				{
					((ez)iterator.next()).a(s, file);
				}
				catch (Throwable throwable3) { }

		}
		catch (Throwable throwable1) { }
	}
}
