// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.webkit.WebSettings;
import java.io.File;

class hq
{

	static void a(Context context, WebSettings websettings)
	{
		try
		{
			websettings.setDomStorageEnabled(true);
			websettings.setAppCacheEnabled(true);
			websettings.setAppCacheMaxSize(0x7fffffffffffffffL);
			websettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
		}
		catch (Throwable throwable) { }
	}
}
