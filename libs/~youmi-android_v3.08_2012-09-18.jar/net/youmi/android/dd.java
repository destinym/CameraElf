// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package net.youmi.android:
//			de, dj, hx

class dd
{

	private String a;
	private String b;
	private long c;
	private long d;

	dd(String s, long l, long l1)
	{
		a = "";
		b = "";
		c = -1L;
		d = -1L;
		a = s;
		b = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/").append(s).append("/").toString();
		c = l;
		d = l1;
		a();
		c();
	}

	void a()
	{
		try
		{
			File file = new File(b);
			if (!file.exists())
				file.mkdirs();
		}
		catch (Exception exception) { }
	}

	String[] b()
	{
		File file = new File(b);
		return file.list();
	}

	String a(String s)
	{
		return (new StringBuilder(String.valueOf(b))).append(s).toString();
	}

	String b(String s)
	{
		if (s == null)
			return null;
		s = s.trim();
		if (s.length() == 0)
		{
			return null;
		} else
		{
			String s1 = dj.b(s);
			return s1;
		}
	}

	String c(String s)
	{
		String s1 = b(s);
		if (s1 != null)
			return a(s1);
		else
			return null;
	}

	File d(String s)
	{
		String s1 = c(s);
		return new File(s1);
	}

	boolean e(String s)
	{
		String s1 = b(s);
		if (s1 == null)
			return false;
		else
			return f(s1);
	}

	boolean f(String s)
	{
		String s1 = a(s);
		File file = new File(s1);
		if (file.exists())
			return file.canRead();
		else
			return false;
	}

	Bitmap g(String s)
	{
		String s1 = c(s);
		return BitmapFactory.decodeFile(s1);
		Exception exception;
		exception;
		return null;
	}

	boolean a(Context context, String s, byte abyte0[])
	{
		if (!hx.a(context))
			break MISSING_BLOCK_LABEL_40;
		String s1 = c(s);
		FileOutputStream fileoutputstream = new FileOutputStream(s1);
		fileoutputstream.write(abyte0);
		fileoutputstream.flush();
		return true;
		Exception exception;
		exception;
		return false;
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
			(new Thread(new de(this))).start();
		}
		catch (Exception exception) { }
		return;
	}

	static String a(dd dd1)
	{
		return dd1.b;
	}

	static boolean a(dd dd1, File file)
	{
		return dd1.a(file);
	}

	static long b(dd dd1)
	{
		return dd1.c;
	}
}
