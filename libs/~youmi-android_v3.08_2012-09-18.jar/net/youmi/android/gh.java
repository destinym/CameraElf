// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.webkit.WebView;
import java.util.Hashtable;

// Referenced classes of package net.youmi.android:
//			dk, gw

class gh
{

	private Hashtable a;
	private static gh b;

	gh()
	{
		a = new Hashtable();
	}

	public void a(Context context, WebView webview, String s)
	{
		if (webview == null)
			return;
		s = gw.a(s);
		if (s == null)
			break MISSING_BLOCK_LABEL_89;
		if (a == null)
		{
			a = new Hashtable();
			return;
		}
		try
		{
			String s1 = a(s);
			String s2 = (String)a.get(s1);
			if (s2 != null)
				webview.loadUrl((new StringBuilder(String.valueOf(gw.a()))).append(s2).toString());
		}
		catch (Throwable throwable) { }
	}

	public void a(String s, String s1)
	{
		try
		{
			s = gw.a(s);
			if (s != null)
			{
				String s2 = a(s);
				s1 = gw.a(s1);
				if (s1 != null)
				{
					if (a == null)
						a = new Hashtable();
					a.put(s2, s1);
				}
			}
		}
		catch (Throwable throwable) { }
	}

	public static gh a()
	{
		if (b == null)
			b = new gh();
		return b;
	}

	public String a(String s)
	{
		return dk.a(s);
	}
}
