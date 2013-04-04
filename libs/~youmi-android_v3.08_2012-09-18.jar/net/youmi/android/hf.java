// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import org.apache.http.HttpHost;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.*;

// Referenced classes of package net.youmi.android:
//			ej, hc, hg, hh, 
//			hw, ex

class hf
{

	private static String a;

	public static String a()
	{
		if (a == null)
			try
			{
				StringBuilder stringbuilder = new StringBuilder(256);
				stringbuilder.append("Mozilla/5.0 (Linux; U; Android ");
				stringbuilder.append(android.os.Build.VERSION.RELEASE);
				stringbuilder.append("; ");
				stringbuilder.append(ej.a().toLowerCase());
				stringbuilder.append("; ");
				stringbuilder.append(ej.b());
				stringbuilder.append(" Build/");
				stringbuilder.append(Build.ID);
				stringbuilder.append(") AppleWebkit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
				a = stringbuilder.toString();
			}
			catch (Throwable throwable)
			{
				return "";
			}
		return a;
	}

	public static HttpParams a(Context context)
	{
		BasicHttpParams basichttpparams = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(basichttpparams, 30000);
		HttpConnectionParams.setSoTimeout(basichttpparams, 15000);
		HttpClientParams.setRedirecting(basichttpparams, true);
		HttpProtocolParams.setUserAgent(basichttpparams, a());
		String s = hc.a(context);
		if (s.equals("cmwap"))
		{
			HttpHost httphost = new HttpHost("10.0.0.172", 80, null);
			basichttpparams.setParameter("http.route.default-proxy", httphost);
		}
		return basichttpparams;
	}

	public static DefaultHttpClient b(Context context)
	{
		return a(context, new hg());
	}

	public static DefaultHttpClient a(Context context, ex ex)
	{
		DefaultHttpClient defaulthttpclient = new DefaultHttpClient(a(context));
		defaulthttpclient.setRedirectHandler(new hh(ex));
		return defaulthttpclient;
	}

	static boolean c(Context context)
	{
		if (!hw.d(context))
			return true;
		NetworkInfo networkinfo;
		ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
		networkinfo = connectivitymanager.getActiveNetworkInfo();
label0:
		{
			if (networkinfo != null && networkinfo.isAvailable())
				return true;
			break label0;
		}
		Exception exception;
		exception;
		return false;
	}
}
