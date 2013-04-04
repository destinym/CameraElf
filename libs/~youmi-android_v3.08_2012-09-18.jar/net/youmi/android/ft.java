// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.util.List;
import org.apache.http.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

// Referenced classes of package net.youmi.android:
//			ag, ex, hf

class ft
	implements ex
{

	Context a;
	String b;

	ft(Context context)
	{
		b = null;
		a = context;
	}

	protected String a(String s, List list)
	{
		DefaultHttpClient defaulthttpclient;
		Object obj;
		defaulthttpclient = null;
		obj = null;
label0:
		{
label1:
			{
				if (s == null)
				{
					try
					{
						if (obj != null)
							((HttpRequestBase) (obj)).abort();
					}
					catch (Exception exception2) { }
					try
					{
						if (defaulthttpclient != null)
							defaulthttpclient.getConnectionManager().shutdown();
					}
					catch (Exception exception3) { }
					return null;
				}
				String s1;
				try
				{
					defaulthttpclient = hf.a(a, this);
					HttpResponse httpresponse = null;
					boolean flag = false;
					if (list != null && list.size() > 0)
						flag = true;
					if (flag)
					{
						HttpPost httppost = new HttpPost(s);
						obj = httppost;
						httppost.setEntity(new UrlEncodedFormEntity(list));
					} else
					{
						obj = new HttpGet(s);
					}
					((HttpRequestBase) (obj)).setHeader("Referer", (new StringBuilder("http://sdk.youmi.net/?p=3&app=")).append(ag.a(a)).append("&chn=").append(ag.e(a)).toString());
					httpresponse = defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
					if (httpresponse == null)
						break label1;
					StatusLine statusline = httpresponse.getStatusLine();
					if (statusline == null)
						break label1;
					int i = statusline.getStatusCode();
					if (i < 200 || i >= 300)
						break label1;
					HttpEntity httpentity = httpresponse.getEntity();
					if (httpentity == null)
						break label1;
					s1 = EntityUtils.toString(httpentity, "UTF-8");
				}
				catch (Exception exception)
				{
					try
					{
						if (obj != null)
							((HttpRequestBase) (obj)).abort();
					}
					catch (Exception exception6) { }
					try
					{
						if (defaulthttpclient != null)
							defaulthttpclient.getConnectionManager().shutdown();
					}
					catch (Exception exception7) { }
					break label0;
				}
				finally
				{
					try
					{
						if (obj != null)
							((HttpRequestBase) (obj)).abort();
					}
					catch (Exception exception8) { }
					try
					{
						if (defaulthttpclient != null)
							defaulthttpclient.getConnectionManager().shutdown();
					}
					catch (Exception exception9) { }
					throw exception1;
				}
				try
				{
					if (obj != null)
						((HttpRequestBase) (obj)).abort();
				}
				catch (Exception exception4) { }
				try
				{
					if (defaulthttpclient != null)
						defaulthttpclient.getConnectionManager().shutdown();
				}
				catch (Exception exception5) { }
				return s1;
			}
			try
			{
				if (obj != null)
					((HttpRequestBase) (obj)).abort();
			}
			catch (Exception exception10) { }
			try
			{
				if (defaulthttpclient != null)
					defaulthttpclient.getConnectionManager().shutdown();
			}
			catch (Exception exception11) { }
		}
		return null;
	}

	String b(String s)
	{
		return a(s, null);
	}

	public void a(String s)
	{
		b = s;
	}
}
