// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.*;
import android.net.Uri;

// Referenced classes of package net.youmi.android:
//			a, cn, gw, gz

public class YoumiReceiver extends BroadcastReceiver
{

	public YoumiReceiver()
	{
	}

	public void onReceive(Context context, Intent intent)
	{
		String s;
		String s2;
		s = intent.getAction();
		if (!"android.intent.action.PACKAGE_ADDED".equals(s))
			break MISSING_BLOCK_LABEL_65;
		String s1 = intent.getData().getSchemeSpecificPart();
		s2 = gw.a(s1);
		if (s2 == null)
			return;
		try
		{
			boolean flag = cn.a(context, s2, 8000L);
			if (!flag)
				a.a(context, s2, s);
			return;
		}
		catch (Throwable throwable)
		{
			gz.a(throwable);
		}
	}
}
