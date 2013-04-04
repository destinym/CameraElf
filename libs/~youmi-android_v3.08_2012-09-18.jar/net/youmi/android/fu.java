// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package net.youmi.android:
//			ag, hf

class fu
{

	static int a(Context context, String s)
	{
		DefaultHttpClient defaulthttpclient;
		org.apache.http.client.methods.HttpUriRequest httpurirequest;
		defaulthttpclient = null;
		httpurirequest = null;
label0:
		{
			if (s == null)
			{
				try
				{
					if (httpurirequest != null)
						httpurirequest.abort();
				}
				catch (Exception exception2) { }
				try
				{
					if (defaulthttpclient != null)
						defaulthttpclient.getConnectionManager().shutdown();
				}
				catch (Exception exception3) { }
				return -999;
			}
			int i;
			try
			{
				defaulthttpclient = hf.a(context, null);
				httpurirequest = new HttpGet(s);
				httpurirequest.setHeader("Referer", (new StringBuilder("http://sdk.youmi.net/?p=3&app=")).append(ag.a(context)).append("&chn=").append(ag.e(context)).toString());
				HttpResponse httpresponse = defaulthttpclient.execute(httpurirequest);
				i = httpresponse.getStatusLine().getStatusCode();
			}
			catch (Exception exception)
			{
				try
				{
					if (httpurirequest != null)
						httpurirequest.abort();
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
					if (httpurirequest != null)
						httpurirequest.abort();
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
				if (httpurirequest != null)
					httpurirequest.abort();
			}
			catch (Exception exception4) { }
			try
			{
				if (defaulthttpclient != null)
					defaulthttpclient.getConnectionManager().shutdown();
			}
			catch (Exception exception5) { }
			return i;
		}
		return -999;
	}
}
