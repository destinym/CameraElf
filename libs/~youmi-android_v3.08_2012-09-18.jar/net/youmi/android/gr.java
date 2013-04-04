// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package net.youmi.android:
//			fc, go

class gr
	implements fc
{

	private static gr a;
	private go b;

	private gr(go go1)
	{
		b = go1;
	}

	public FileOutputStream a(Context context, String s)
	{
		File file;
		if (b == null || s == null)
			break MISSING_BLOCK_LABEL_30;
		file = b.a(s);
		return new FileOutputStream(file);
		Throwable throwable;
		throwable;
		return null;
	}

	public static synchronized gr b()
	{
		if (a == null)
			a = new gr(go.a());
		return a;
	}

	public int a()
	{
		return 1;
	}

	public File b(Context context, String s)
	{
		return b.a(s);
		Throwable throwable;
		throwable;
		return null;
	}
}
