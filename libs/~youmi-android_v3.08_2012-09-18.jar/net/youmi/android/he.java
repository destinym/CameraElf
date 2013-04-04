// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.util.List;
import org.apache.http.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

// Referenced classes of package net.youmi.android:
//			ha, hf

class he
{

	public static String a(Context context, String s)
	{
		return a(context, s, null);
	}

	public static String a(Context context, String s, List list)
	{
		if (list != null)
			return b(context, s, list);
		return b(context, s);
		Throwable throwable;
		throwable;
		return null;
	}

	private static String b(Context context, String s)
	{
label0:
		{
			DefaultHttpClient defaulthttpclient;
			HttpGet httpget;
label1:
			{
				if (s == null)
					return null;
				defaulthttpclient = null;
				httpget = null;
				long l = 0L;
				long l2 = 0L;
				long l4 = 0L;
				String s2;
				try
				{
					defaulthttpclient = hf.b(context);
					httpget = new HttpGet(s);
					long l1 = System.currentTimeMillis();
					HttpResponse httpresponse = defaulthttpclient.execute(httpget);
					if (httpresponse == null)
						break label1;
					int i = httpresponse.getStatusLine().getStatusCode();
					long l3 = System.currentTimeMillis();
					if (i < 200 || i >= 300)
						break label1;
					HttpEntity httpentity = httpresponse.getEntity();
					String s1 = EntityUtils.toString(httpentity, "UTF-8");
					long l5 = System.currentTimeMillis();
					try
					{
						StringBuilder stringbuilder = new StringBuilder(1024);
						stringbuilder.append("--\n加载:").append(s).append("\n响应时间:").append(ha.b(l3 - l1)).append("\n数据传输时间:").append(ha.b(l5 - l3)).append("\n总时间:").append(ha.b(l5 - l1)).append("加载数据大小:").append(ha.a(httpentity.getContentLength())).append("\t").append(s1.getBytes().length);
						ha.b(stringbuilder.toString());
					}
					catch (Throwable throwable1) { }
					s2 = s1;
				}
				catch (Throwable throwable)
				{
					try
					{
						if (httpget != null)
							httpget.abort();
					}
					catch (Throwable throwable4) { }
					try
					{
						if (defaulthttpclient != null)
							defaulthttpclient.getConnectionManager().shutdown();
					}
					catch (Throwable throwable5) { }
					break label0;
				}
				finally
				{
					try
					{
						if (httpget != null)
							httpget.abort();
					}
					catch (Throwable throwable6) { }
					try
					{
						if (defaulthttpclient != null)
							defaulthttpclient.getConnectionManager().shutdown();
					}
					catch (Throwable throwable7) { }
					throw exception;
				}
				try
				{
					if (httpget != null)
						httpget.abort();
				}
				catch (Throwable throwable2) { }
				try
				{
					if (defaulthttpclient != null)
						defaulthttpclient.getConnectionManager().shutdown();
				}
				catch (Throwable throwable3) { }
				return s2;
			}
			try
			{
				if (httpget != null)
					httpget.abort();
			}
			catch (Throwable throwable8) { }
			try
			{
				if (defaulthttpclient != null)
					defaulthttpclient.getConnectionManager().shutdown();
			}
			catch (Throwable throwable9) { }
		}
		return null;
	}

	private static String b(Context context, String s, List list)
	{
label0:
		{
			DefaultHttpClient defaulthttpclient;
			HttpPost httppost;
label1:
			{
				if (s == null)
					return null;
				defaulthttpclient = null;
				httppost = null;
				String s2;
				try
				{
					defaulthttpclient = hf.b(context);
					httppost = new HttpPost(s);
					if (list != null && list.size() > 0)
					{
						UrlEncodedFormEntity urlencodedformentity = new UrlEncodedFormEntity(list, "UTF-8");
						httppost.setEntity(urlencodedformentity);
					}
					HttpResponse httpresponse = defaulthttpclient.execute(httppost);
					if (httpresponse == null)
						break label1;
					int i = httpresponse.getStatusLine().getStatusCode();
					if (i < 200 || i >= 300)
						break label1;
					HttpEntity httpentity = httpresponse.getEntity();
					String s1 = EntityUtils.toString(httpentity, "UTF-8");
					s2 = s1;
				}
				catch (Throwable throwable)
				{
					try
					{
						if (httppost != null)
							httppost.abort();
					}
					catch (Throwable throwable3) { }
					try
					{
						if (defaulthttpclient != null)
							defaulthttpclient.getConnectionManager().shutdown();
					}
					catch (Throwable throwable4) { }
					break label0;
				}
				finally
				{
					try
					{
						if (httppost != null)
							httppost.abort();
					}
					catch (Throwable throwable5) { }
					try
					{
						if (defaulthttpclient != null)
							defaulthttpclient.getConnectionManager().shutdown();
					}
					catch (Throwable throwable6) { }
					throw exception;
				}
				try
				{
					if (httppost != null)
						httppost.abort();
				}
				catch (Throwable throwable1) { }
				try
				{
					if (defaulthttpclient != null)
						defaulthttpclient.getConnectionManager().shutdown();
				}
				catch (Throwable throwable2) { }
				return s2;
			}
			try
			{
				if (httppost != null)
					httppost.abort();
			}
			catch (Throwable throwable7) { }
			try
			{
				if (defaulthttpclient != null)
					defaulthttpclient.getConnectionManager().shutdown();
			}
			catch (Throwable throwable8) { }
		}
		return null;
	}
}
