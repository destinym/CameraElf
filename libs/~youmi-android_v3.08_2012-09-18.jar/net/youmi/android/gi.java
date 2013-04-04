// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.webkit.WebView;
import java.util.Hashtable;

// Referenced classes of package net.youmi.android:
//			dk, gw, hr

class gi
{

	private Hashtable a;
	private static gi b;

	gi()
	{
		a = new Hashtable();
	}

	public void a(Context context, WebView webview, String s)
	{
		if (context == null)
			return;
		if (webview == null)
			return;
		try
		{
			s = gw.a(s);
			if (s != null)
			{
				if (a == null)
					a = new Hashtable();
				String s1 = (String)a.get(a(s));
				if (s1 != null)
					hr.a(context.getApplicationContext(), webview, s1);
			}
		}
		catch (Throwable throwable) { }
		return;
	}

	public static gi a()
	{
		if (b == null)
			b = new gi();
		return b;
	}

	public String a(String s)
	{
		return dk.a(s);
	}
}
