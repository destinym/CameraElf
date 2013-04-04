// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.*;
import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package net.youmi.android:
//			cw, ag, dd, gz, 
//			hf, hw

abstract class gu extends cw
{

	protected dd h;

	gu(dd dd1)
	{
		h = dd1;
	}

	protected int g()
	{
		if (!hw.b(e))
			return 1;
		return hf.c(e) ? 0 : 2;
	}

	protected abstract boolean a(byte abyte0[]);

	protected abstract boolean a(File file);

	protected int h()
	{
		a(0L);
		if (h == null)
			break MISSING_BLOCK_LABEL_68;
		String s = h.c(a);
		File file = new File(s);
		if (!file.exists() || !a(file))
			break MISSING_BLOCK_LABEL_68;
		f = 6;
		f();
		return f;
		Exception exception;
		exception;
		gz.a(exception);
		InputStream inputstream;
		DefaultHttpClient defaulthttpclient = c();
		HttpGet httpget = new HttpGet(a);
		httpget.setHeader("Referer", (new StringBuilder("http://sdk.youmi.net/?p=3&app=")).append(ag.a(e)).append("&chn=").append(ag.e(e)).toString());
		HttpResponse httpresponse = defaulthttpclient.execute(httpget);
		int i = httpresponse.getStatusLine().getStatusCode();
		if (i != 200)
			break MISSING_BLOCK_LABEL_374;
		HttpEntity httpentity = httpresponse.getEntity();
		c = httpentity.getContentLength();
		inputstream = httpentity.getContent();
		if (inputstream != null)
			break MISSING_BLOCK_LABEL_203;
		f = 7;
		f();
		return f;
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream((int)c);
		int j = 0;
		byte abyte0[] = new byte[1024];
		while ((j = inputstream.read(abyte0)) > 0) 
		{
			f = 5;
			d += j;
			bytearrayoutputstream.write(abyte0, 0, j);
		}
		f = 7;
		if (bytearrayoutputstream.size() > 0)
		{
			byte abyte1[] = bytearrayoutputstream.toByteArray();
			try
			{
				if (h != null)
					h.a(e, a, abyte1);
			}
			catch (Exception exception3) { }
			if (a(abyte1))
				f = 6;
			else
				f = 7;
		}
		try
		{
			inputstream.close();
		}
		catch (Exception exception1) { }
		try
		{
			bytearrayoutputstream.close();
		}
		catch (Exception exception2) { }
		f();
		return f;
		f = 7;
		f();
		return f;
		defaulthttpclient;
		f = 4;
		f();
		return f;
	}
}
