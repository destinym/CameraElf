// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

// Referenced classes of package net.youmi.android:
//			gz, hy

class hz
	implements DownloadListener
{

	final hy a;

	hz(hy hy1)
	{
		a = hy1;
		super();
	}

	public void onDownloadStart(String s, String s1, String s2, String s3, long l)
	{
		try
		{
			Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
			intent.addFlags(0x10000000);
			a.getContext().startActivity(intent);
		}
		catch (Throwable throwable)
		{
			try
			{
				gz.a("", throwable);
			}
			catch (Throwable throwable1) { }
		}
	}
}
