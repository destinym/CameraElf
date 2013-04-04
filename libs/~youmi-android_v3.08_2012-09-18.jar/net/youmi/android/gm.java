// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.io.File;

// Referenced classes of package net.youmi.android:
//			gn, dk, gc, gl, 
//			go, gr, gv, ht, 
//			hu, hx

class gm extends gn
{

	private static gm a;

	gm()
	{
	}

	public static synchronized gm a()
	{
		if (a == null)
			a = new gm();
		return a;
	}

	public boolean a(Context context, File file, gc gc1)
	{
		if (gc1 == null)
			return false;
		String s = gc1.i();
		if (s == null)
			return false;
		if (dk.a(file, s))
			return true;
		break MISSING_BLOCK_LABEL_32;
		Throwable throwable;
		throwable;
		return false;
	}

	public gv a(Context context, String s, long l)
	{
		long l1;
		l1 = 0xa00000L;
		if (l > 0L)
			l1 = l + 0x19000L;
		if (ht.a(l1))
			return new gv(context, s, gl.b());
		if (hx.a(context, l1))
			return new gv(context, s, gr.b());
		break MISSING_BLOCK_LABEL_63;
		Throwable throwable;
		throwable;
		return null;
	}

	public File b(Context context, gc gc1)
	{
		String s;
		File file;
		s = c(gc1);
		if (s == null)
			break MISSING_BLOCK_LABEL_114;
		file = gl.b().b(context, s);
		if (file == null || !file.exists())
			break MISSING_BLOCK_LABEL_59;
		if (dk.a(file, gc1.i()))
			return file;
		try
		{
			file.delete();
		}
		catch (Throwable throwable1) { }
		file = null;
		file = go.a().a(s);
		if (file != null && file.exists())
		{
			if (dk.a(file, gc1.i()))
				return file;
			try
			{
				try
				{
					file.delete();
				}
				catch (Throwable throwable2) { }
			}
			catch (Throwable throwable) { }
		}
		return null;
	}

	public boolean b(gc gc1)
	{
		return gc1 != null && gc1.h() != null && gc1.j();
	}

	public File b(Context context, File file, gc gc1)
	{
		String s;
		File file2;
		s = c(gc1);
		if (!hx.a(context, file.length() + 10240L))
			break MISSING_BLOCK_LABEL_66;
		go go1 = go.a();
		if (go1 == null)
			break MISSING_BLOCK_LABEL_66;
		file2 = go1.a(s);
		if (file2 != null && hu.a(file, file2) && file2.exists())
			return file2;
		File file1;
		file1 = gl.b().b(context, s);
		if (!hu.a(file, file1) || !file1.exists())
			break MISSING_BLOCK_LABEL_107;
		hu.a(file1, "664");
		return file1;
		Throwable throwable;
		throwable;
		return null;
	}
}
