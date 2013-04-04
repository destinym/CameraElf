// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import org.apache.http.HttpHost;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.*;

// Referenced classes of package net.youmi.android:
//			ah, cx, df, en, 
//			hc

abstract class cw
	implements en
{

	protected String a;
	protected String b;
	protected long c;
	protected long d;
	protected Context e;
	protected int f;
	protected df g;
	private static String h;

	cw()
	{
		d = 0L;
		f = -1;
	}

	static String a()
	{
		if (h == null)
		{
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Mozilla/5.0(Linux;U;");
			stringbuilder.append(ah.c());
			stringbuilder.append(";");
			stringbuilder.append(ah.a());
			stringbuilder.append(";");
			stringbuilder.append(ah.b());
			stringbuilder.append(") AppleWebkit/533.1(KHTML,like Gecko) Version/4.0 Mobile Safari/533.1");
			h = stringbuilder.toString();
		}
		return h;
	}

	protected HttpParams b()
	{
		BasicHttpParams basichttpparams = new BasicHttpParams();
		HttpClientParams.setRedirecting(basichttpparams, true);
		HttpProtocolParams.setUserAgent(basichttpparams, a());
		HttpProtocolParams.setContentCharset(basichttpparams, "utf-8");
		HttpProtocolParams.setHttpElementCharset(basichttpparams, "utf-8");
		String s = hc.a(e);
		if (s.equals("cmwap"))
		{
			HttpHost httphost = new HttpHost("10.0.0.172", 80, "http");
			basichttpparams.setParameter("http.route.default-proxy", httphost);
		}
		return basichttpparams;
	}

	protected DefaultHttpClient c()
	{
		DefaultHttpClient defaulthttpclient = new DefaultHttpClient(b());
		defaulthttpclient.setRedirectHandler(new cx(this));
		return defaulthttpclient;
	}

	public int d()
	{
		return f;
	}

	public String e()
	{
		return b;
	}

	protected void a(long l)
	{
		d = l;
		f = 5;
		f();
	}

	protected void f()
	{
		if (g != null)
			g.a(this);
	}

	protected abstract int g();

	protected abstract int h();

	public int a(Context context, String s)
	{
		int i;
		e = context;
		a = s;
		b = s;
		i = g();
		if (i != 0)
			return i;
		return h();
		Exception exception;
		exception;
		return 4;
	}
}
