// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.webkit.DownloadListener;

// Referenced classes of package net.youmi.android:
//			by, cz, fr, gz

class cb
	implements DownloadListener
{

	final by a;

	cb(by by1)
	{
		a = by1;
		super();
	}

	public void onDownloadStart(String s, String s1, String s2, String s3, long l)
	{
		try
		{
			fr fr1 = new fr(a.b, a, a.c == null ? null : a.c.f());
			fr1.execute(new String[] {
				s
			});
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}
}
