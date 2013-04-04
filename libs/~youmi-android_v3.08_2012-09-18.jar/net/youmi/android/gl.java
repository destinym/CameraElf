// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package net.youmi.android:
//			fc

class gl
	implements fc
{

	private static gl a;

	gl()
	{
	}

	public FileOutputStream a(Context context, String s)
	{
label0:
		{
			if (s != null)
				return new FileOutputStream(new File((new StringBuilder(String.valueOf(context.getCacheDir().getAbsolutePath()))).append("/").append(s).toString()));
			break label0;
		}
		Throwable throwable;
		throwable;
		return null;
	}

	public static gl b()
	{
		try
		{
			if (a == null)
				a = new gl();
		}
		catch (Throwable throwable) { }
		return a;
	}

	public int a()
	{
		return 0;
	}

	public File b(Context context, String s)
	{
		return new File((new StringBuilder(String.valueOf(context.getCacheDir().getAbsolutePath()))).append("/").append(s).toString());
		Throwable throwable;
		throwable;
		return null;
	}
}
