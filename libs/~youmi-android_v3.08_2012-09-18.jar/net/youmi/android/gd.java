// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import org.apache.http.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package net.youmi.android:
//			ag, ex, hf, hw

abstract class gd
	implements ex
{

	protected String a;
	protected String b;
	protected long c;
	protected String d;
	protected final String e = "utf-8";
	protected Context f;
	protected DefaultHttpClient g;
	protected InputStream h;
	protected OutputStream i;
	protected List j;
	protected int k;

	public void a(String s)
	{
		b = s;
	}

	gd(Context context, String s)
	{
		k = 4;
		f = context;
		a = s;
		b = s;
	}

	int a(List list)
	{
		j = list;
		return a(1);
	}

	private int a(int l)
	{
		if (!hw.b(f))
		{
			try
			{
				if (i != null)
					i.close();
			}
			catch (Exception exception2) { }
			try
			{
				if (h != null)
					h.close();
			}
			catch (Exception exception3) { }
			try
			{
				if (g != null)
					g.getConnectionManager().shutdown();
			}
			catch (Exception exception4) { }
			return 0;
		}
		if (!hf.c(f))
		{
			try
			{
				if (i != null)
					i.close();
			}
			catch (Exception exception5) { }
			try
			{
				if (h != null)
					h.close();
			}
			catch (Exception exception6) { }
			try
			{
				if (g != null)
					g.getConnectionManager().shutdown();
			}
			catch (Exception exception7) { }
			return 1;
		}
		HttpResponse httpresponse;
		int j1;
		g = hf.a(f, this);
		Object obj = null;
		if (l == 1)
		{
			HttpPost httppost = new HttpPost(a);
			if (j != null && j.size() > 0)
			{
				UrlEncodedFormEntity urlencodedformentity = new UrlEncodedFormEntity(j, "utf-8");
				httppost.setEntity(urlencodedformentity);
			}
			obj = httppost;
		} else
		{
			obj = new HttpGet(a);
		}
		((HttpUriRequest) (obj)).setHeader("Referer", (new StringBuilder("http://sdk.youmi.net/?p=3&app=")).append(ag.a(f)).append("&chn=").append(ag.e(f)).toString());
		httpresponse = g.execute(((HttpUriRequest) (obj)));
		if (httpresponse.getStatusLine().getStatusCode() != 200)
			break MISSING_BLOCK_LABEL_752;
		if (a(httpresponse))
			break MISSING_BLOCK_LABEL_386;
		j1 = k;
		try
		{
			if (i != null)
				i.close();
		}
		catch (Exception exception8) { }
		try
		{
			if (h != null)
				h.close();
		}
		catch (Exception exception9) { }
		try
		{
			if (g != null)
				g.getConnectionManager().shutdown();
		}
		catch (Exception exception10) { }
		return j1;
		HttpEntity httpentity = httpresponse.getEntity();
		if (httpentity == null)
			break MISSING_BLOCK_LABEL_688;
		c = httpentity.getContentLength();
		h = httpentity.getContent();
		if (h == null)
			break MISSING_BLOCK_LABEL_688;
		if (!a())
			break MISSING_BLOCK_LABEL_617;
		byte abyte0[] = new byte[1024];
		for (int i1 = 0; (i1 = h.read(abyte0)) > 0;)
			i.write(abyte0, 0, i1);

		Exception exception1;
		if (b())
		{
			try
			{
				if (i != null)
					i.close();
			}
			catch (Exception exception11) { }
			try
			{
				if (h != null)
					h.close();
			}
			catch (Exception exception12) { }
			try
			{
				if (g != null)
					g.getConnectionManager().shutdown();
			}
			catch (Exception exception13) { }
			return 3;
		}
		int k1;
		Exception exception17;
		try
		{
			k1 = k;
		}
		catch (Exception exception)
		{
			try
			{
				if (i != null)
					i.close();
			}
			catch (Exception exception18) { }
			try
			{
				if (h != null)
					h.close();
			}
			catch (Exception exception19) { }
			try
			{
				if (g != null)
					g.getConnectionManager().shutdown();
			}
			catch (Exception exception20) { }
			return 2;
		}
		finally { }
		try
		{
			if (i != null)
				i.close();
		}
		catch (Exception exception14) { }
		try
		{
			if (h != null)
				h.close();
		}
		catch (Exception exception15) { }
		try
		{
			if (g != null)
				g.getConnectionManager().shutdown();
		}
		catch (Exception exception16) { }
		return k1;
		k1 = k;
		try
		{
			if (i != null)
				i.close();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception17) { }
		try
		{
			if (h != null)
				h.close();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception17) { }
		try
		{
			if (g != null)
				g.getConnectionManager().shutdown();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception17) { }
		return k1;
		try
		{
			if (i != null)
				i.close();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception17) { }
		try
		{
			if (h != null)
				h.close();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception17) { }
		try
		{
			if (g != null)
				g.getConnectionManager().shutdown();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception17) { }
		return 2;
		try
		{
			if (i != null)
				i.close();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception17) { }
		try
		{
			if (h != null)
				h.close();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception17) { }
		try
		{
			if (g != null)
				g.getConnectionManager().shutdown();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception17) { }
		return 2;
		try
		{
			if (i != null)
				i.close();
		}
		catch (Exception exception21) { }
		try
		{
			if (h != null)
				h.close();
		}
		catch (Exception exception22) { }
		try
		{
			if (g != null)
				g.getConnectionManager().shutdown();
		}
		catch (Exception exception23) { }
		throw exception1;
	}

	protected abstract boolean a(HttpResponse httpresponse);

	protected abstract boolean a();

	protected abstract boolean b();
}
