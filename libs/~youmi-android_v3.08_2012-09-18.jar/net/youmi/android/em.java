// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.apache.http.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

// Referenced classes of package net.youmi.android:
//			cw, ag, gz, hf, 
//			hw

class em extends cw
{

	private String h;
	private String i;
	private List j;
	private boolean k;

	em()
	{
		k = false;
		k = false;
	}

	protected int g()
	{
		if (!hw.b(e))
			return 1;
		return hf.c(e) ? 0 : 2;
	}

	protected int h()
	{
		DefaultHttpClient defaulthttpclient;
		defaulthttpclient = null;
		try
		{
			defaulthttpclient = c();
		}
		catch (Exception exception) { }
		if (defaulthttpclient == null)
		{
			f = 4;
			f();
			return f;
		}
		a(0L);
		Object obj = null;
		if (k)
		{
			HttpPost httppost = new HttpPost(a);
			UrlEncodedFormEntity urlencodedformentity = new UrlEncodedFormEntity(j, "utf-8");
			httppost.setEntity(urlencodedformentity);
			obj = httppost;
		} else
		{
			HttpGet httpget = new HttpGet(a);
			obj = httpget;
		}
		((HttpUriRequest) (obj)).setHeader("Referer", (new StringBuilder("http://sdk.youmi.net/?p=3&app=")).append(ag.a(e)).append("&chn=").append(ag.e(e)).toString());
		HttpResponse httpresponse = defaulthttpclient.execute(((HttpUriRequest) (obj)));
		int l = httpresponse.getStatusLine().getStatusCode();
		if (l != 200)
			break MISSING_BLOCK_LABEL_363;
		HttpEntity httpentity = httpresponse.getEntity();
		c = httpentity.getContentLength();
		i = EntityUtils.getContentCharSet(httpentity);
		InputStream inputstream = httpentity.getContent();
		byte abyte0[] = new byte[1024];
		int i1 = 0;
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
		while ((i1 = inputstream.read(abyte0)) > 0) 
		{
			bytearrayoutputstream.write(abyte0, 0, i1);
			a(bytearrayoutputstream.size());
		}
		byte abyte1[] = bytearrayoutputstream.toByteArray();
		if (i == null)
		{
			i = "utf-8";
			h = new String(abyte1, "utf-8");
		} else
		{
			h = new String(abyte1, i);
		}
		try
		{
			inputstream.close();
		}
		catch (Exception exception4) { }
		try
		{
			bytearrayoutputstream.close();
		}
		catch (Exception exception5) { }
		try
		{
			defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception6) { }
		f = 6;
		f();
		return f;
		try
		{
			defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception3) { }
		f = 7;
		f();
		return f;
		Exception exception1;
		exception1;
		gz.a(exception1);
		try
		{
			defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception2)
		{
			gz.a(exception2);
		}
		f = 4;
		f();
		return f;
	}

	String i()
	{
		return h;
	}
}
