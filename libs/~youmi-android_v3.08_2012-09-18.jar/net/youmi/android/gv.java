// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package net.youmi.android:
//			fc

class gv
{

	private String a;
	private File b;
	private boolean c;
	private Context d;
	private fc e;

	gv(Context context, String s, fc fc1)
	{
		d = context.getApplicationContext();
		a = s;
		e = fc1;
		b = fc1.b(context, a);
		c = e.a() == 0;
	}

	boolean a()
	{
		if (b != null)
			return b.exists();
		else
			return false;
	}

	boolean b()
	{
label0:
		{
			if (b != null)
				return b.delete();
			break label0;
		}
		Throwable throwable;
		throwable;
		return true;
	}

	File c()
	{
		if (b == null)
			b = e.b(d, a);
		return b;
	}

	long d()
	{
		if (e())
			return 0L;
		else
			return b.length();
	}

	boolean e()
	{
		return b == null;
	}

	FileOutputStream f()
	{
label0:
		{
			if (e != null && a != null)
				return e.a(d, a);
			break label0;
		}
		Throwable throwable;
		throwable;
		return null;
	}
}
