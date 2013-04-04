// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.webkit.WebSettings;
import java.io.File;

class hp
{

	static void a(Context context, WebSettings websettings)
	{
		try
		{
			websettings.setDatabaseEnabled(true);
			websettings.setDatabasePath(context.getDatabasePath("webviewDatabase").getAbsolutePath());
			websettings.setGeolocationEnabled(true);
			websettings.setGeolocationDatabasePath(context.getDatabasePath("webviewGEODatabase").getAbsolutePath());
		}
		catch (Throwable throwable) { }
	}
}
