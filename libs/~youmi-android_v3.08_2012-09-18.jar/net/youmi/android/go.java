// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.os.Environment;
import java.io.File;

// Referenced classes of package net.youmi.android:
//			gp

final class go
{

	private String a;
	private String b;
	private long c;
	private long d;
	private static go e;

	go(String s, long l, long l1)
	{
		a = "";
		b = "";
		c = -1L;
		d = -1L;
		a = s;
		b = (new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getPath()))).append("/").append(s).append("/").toString();
		c = l;
		d = l1;
		b();
		c();
	}

	private void b()
	{
		try
		{
			File file = new File(b);
			if (!file.exists())
				file.mkdirs();
		}
		catch (Throwable throwable) { }
	}

	public File a(String s)
	{
		String s1 = (new StringBuilder(String.valueOf(b))).append(s).toString();
		return new File(s1);
		Throwable throwable;
		throwable;
		return null;
	}

	private boolean a(File file)
	{
		if (file == null)
			return false;
		if (d == -1L)
			return false;
		return d > 0L && System.currentTimeMillis() - file.lastModified() > d;
	}

	private void c()
	{
		if (c == -1L && d == -1L)
			return;
		if (c <= 0L && d <= 0L)
			return;
		try
		{
			(new Thread(new gp(this))).start();
		}
		catch (Throwable throwable) { }
		return;
	}

	static go a()
	{
		if (e == null)
			e = new go("youmicache/CCFFFA1D25C44B08BC24C3C6D8D6666F", 0x12c00000L, 0x19bfcc00L);
		return e;
	}

	static String a(go go1)
	{
		return go1.b;
	}

	static boolean a(go go1, File file)
	{
		return go1.a(file);
	}

	static long b(go go1)
	{
		return go1.c;
	}
}
