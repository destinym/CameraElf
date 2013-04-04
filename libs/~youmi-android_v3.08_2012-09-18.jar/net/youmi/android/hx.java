// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

// Referenced classes of package net.youmi.android:
//			hw

class hx
{

	static boolean a()
	{
		String s = Environment.getExternalStorageState();
		return s.equals("mounted") || s.equals("mounted_ro");
	}

	static boolean a(Context context)
	{
		String s = Environment.getExternalStorageState();
label0:
		{
			if (s.equals("mounted") && hw.a(context))
				return true;
			break label0;
		}
		Throwable throwable;
		throwable;
		return false;
	}

	static boolean a(Context context, long l)
	{
		long l3;
		if (!a(context))
			break MISSING_BLOCK_LABEL_71;
		String s = Environment.getExternalStorageDirectory().getPath();
		StatFs statfs = new StatFs(s);
		long l1 = statfs.getBlockSize();
		long l2 = statfs.getAvailableBlocks();
		l3 = l2 * l1;
		if (l3 < 0L)
			l3 = Math.abs(l3);
		if (l3 >= l)
			return true;
		break MISSING_BLOCK_LABEL_71;
		Throwable throwable;
		throwable;
		return false;
	}
}
