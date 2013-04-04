// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

class ht
{

	static boolean a(long l)
	{
		long l3;
		StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
		long l1 = statfs.getBlockSize();
		long l2 = statfs.getAvailableBlocks();
		l3 = l2 * l1;
		if (l3 < 0L)
			l3 = Math.abs(l3);
label0:
		{
			if (l3 >= l)
				return true;
			break label0;
		}
		Throwable throwable;
		throwable;
		return false;
	}
}
