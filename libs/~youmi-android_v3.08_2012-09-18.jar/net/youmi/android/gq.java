// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.io.File;
import java.util.Hashtable;

// Referenced classes of package net.youmi.android:
//			co, ey, fa, gc, 
//			gw

class gq
{

	private static gq a;
	private Hashtable b;

	public static gq a()
	{
		if (a == null)
			a = new gq();
		return a;
	}

	public gq()
	{
		b = new Hashtable();
	}

	public File a(Context context, ey ey1, gc gc1, fa fa1)
	{
		if (ey1 == null)
			return null;
		if (gc1 == null)
			return null;
		String s = gc1.h();
		if (s == null)
			return null;
		String s1;
		s1 = ey1.a(gc1);
		s1 = gw.a(s1);
		if (s1 == null)
			return null;
		File file = ey1.b(context, gc1);
		if (file != null && file.exists())
			return file;
		co co1;
		if (!b.containsKey(s1))
			break MISSING_BLOCK_LABEL_125;
		co1 = (co)b.get(s1);
		if (co1 != null && co1.a())
			return null;
		b.remove(s1);
		co co2 = new co(context, gc1, ey1, fa1);
		co2.execute(new Void[0]);
		b.put(s1, co2);
		return null;
		Throwable throwable;
		throwable;
		return null;
	}
}
