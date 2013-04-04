// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import java.io.*;
import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package net.youmi.android:
//			ag, bd, bf, bu, 
//			cl, dd, dj, ex, 
//			gz, hf, hw, hx

class ch extends AsyncTask
	implements ex
{

	private static Notification c;
	PendingIntent a;
	private String d;
	private String e;
	private long f;
	private long g;
	private cl h;
	Context b;

	ch(Context context, cl cl1)
	{
		f = 0L;
		g = 0L;
		b = context;
		h = cl1;
		Intent intent = new Intent();
		a = PendingIntent.getActivity(b, 0x1869e, intent, 0x10000000);
		c = new Notification();
		c.icon = 0x1080081;
		c.setLatestEventInfo(b.getApplicationContext(), "下载更新", "开始下载", a);
	}

	protected transient File a(String as[])
	{
label0:
		{
			DefaultHttpClient defaulthttpclient;
			InputStream inputstream;
label1:
			{
				if (b == null)
				{
					publishProgress(new Integer[] {
						Integer.valueOf(-3)
					});
					return null;
				}
				if (as == null)
				{
					publishProgress(new Integer[] {
						Integer.valueOf(-3)
					});
					return null;
				}
				if (h == null)
				{
					publishProgress(new Integer[] {
						Integer.valueOf(-3)
					});
					return null;
				}
				if (!hw.a(b))
				{
					publishProgress(new Integer[] {
						Integer.valueOf(-3)
					});
					return null;
				}
				if (!hx.a(b))
				{
					publishProgress(new Integer[] {
						Integer.valueOf(-1)
					});
					return null;
				}
				if (!hw.b(b))
				{
					publishProgress(new Integer[] {
						Integer.valueOf(-3)
					});
					return null;
				}
				if (!hf.c(b))
				{
					publishProgress(new Integer[] {
						Integer.valueOf(-2)
					});
					return null;
				}
				if (as.length <= 0)
					break label0;
				d = as[0];
				e = d;
				defaulthttpclient = null;
				inputstream = null;
				File file1;
				try
				{
					publishProgress(new Integer[] {
						Integer.valueOf(-4)
					});
					String s = dj.b(h.c);
					String s1 = bf.e().a(s);
					File file = new File(s1);
					try
					{
						if (!file.exists() || !file.delete());
					}
					catch (Exception exception1)
					{
						gz.a(exception1);
					}
					defaulthttpclient = hf.a(b, this);
					HttpGet httpget = null;
					httpget = new HttpGet(d);
					httpget.setHeader("Referer", (new StringBuilder("http://sdk.youmi.net/?p=3&app=")).append(ag.a(b)).append("&chn=").append(ag.e(b)).toString());
					HttpResponse httpresponse = defaulthttpclient.execute(httpget);
					if (httpresponse.getStatusLine().getStatusCode() != 200)
						break label1;
					HttpEntity httpentity = httpresponse.getEntity();
					if (httpentity == null)
						break label1;
					f = httpentity.getContentLength();
					FileOutputStream fileoutputstream = new FileOutputStream(file);
					inputstream = httpentity.getContent();
					byte abyte0[] = new byte[1024];
					int i = 0;
					for (int j = 0; (j = inputstream.read(abyte0)) > 0;)
					{
						fileoutputstream.write(abyte0, 0, j);
						i++;
						g += j;
						try
						{
							if (i % 30 == 0)
								if (f > 0L)
								{
									if (g < f)
										publishProgress(new Integer[] {
											Integer.valueOf((int)((g * 100L) / f))
										});
									else
										publishProgress(new Integer[] {
											Integer.valueOf(99)
										});
								} else
								{
									publishProgress(new Integer[] {
										Integer.valueOf(80)
									});
								}
						}
						catch (Exception exception2) { }
					}

					try
					{
						fileoutputstream.close();
					}
					catch (Exception exception3) { }
					file1 = file;
				}
				catch (Exception exception)
				{
					try
					{
						if (defaulthttpclient != null)
							defaulthttpclient.getConnectionManager().shutdown();
					}
					catch (Exception exception7) { }
					try
					{
						if (inputstream != null)
							inputstream.close();
					}
					catch (Exception exception8) { }
					break label0;
				}
				finally
				{
					try
					{
						if (defaulthttpclient != null)
							defaulthttpclient.getConnectionManager().shutdown();
					}
					catch (Exception exception9) { }
					try
					{
						if (inputstream != null)
							inputstream.close();
					}
					catch (Exception exception10) { }
					throw exception4;
				}
				try
				{
					if (defaulthttpclient != null)
						defaulthttpclient.getConnectionManager().shutdown();
				}
				catch (Exception exception5) { }
				try
				{
					if (inputstream != null)
						inputstream.close();
				}
				catch (Exception exception6) { }
				return file1;
			}
			try
			{
				if (defaulthttpclient != null)
					defaulthttpclient.getConnectionManager().shutdown();
			}
			catch (Exception exception11) { }
			try
			{
				if (inputstream != null)
					inputstream.close();
			}
			catch (Exception exception12) { }
		}
		return null;
	}

	protected void a(File file)
	{
		super.onPostExecute(file);
		if (file != null && file.exists())
		{
			b(file);
			return;
		} else
		{
			b("更新失败,请稍候重试");
			return;
		}
	}

	protected transient void a(Integer ainteger[])
	{
		super.onProgressUpdate(ainteger);
		try
		{
			if (ainteger != null && ainteger.length > 0)
			{
				int i = ainteger[0].intValue();
				if (i == -1)
					b("存储卡不可用,无法更新下载,请检查存储卡设置!");
				else
				if (i == -2)
					b("网络错误,无法更新下载");
				else
				if (i == -3)
					b("下载过程遇到错误,取消本次下载");
				else
				if (i == -4)
					a(0);
				else
				if (i >= 0 && i <= 100)
					a(i);
			}
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	private void b(File file)
	{
		try
		{
			if (file != null && file.exists())
			{
				try
				{
					NotificationManager notificationmanager = (NotificationManager)b.getSystemService("notification");
					notificationmanager.cancel(0x1869e);
				}
				catch (Exception exception)
				{
					gz.a(exception);
				}
				try
				{
					bu.a(b, "下载成功,正在安装...");
				}
				catch (Exception exception1)
				{
					gz.a(exception1);
				}
				bd.a(b, file, h);
				return;
			}
		}
		catch (Exception exception2)
		{
			gz.a(exception2);
		}
	}

	private void b(String s)
	{
		try
		{
			c.tickerText = "下载更新失败";
			c.icon = 0x1080082;
			c.flags = 16;
			c.setLatestEventInfo(b.getApplicationContext(), "下载更新", s, a);
			a();
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
		bu.b(b, "更新失败,请稍候重试!");
	}

	private void a(int i)
	{
		try
		{
			c.tickerText = (new StringBuilder("下载进度:")).append(i).append("%").toString();
			c.flags = 2;
			c.setLatestEventInfo(b.getApplicationContext(), "下载更新", (new StringBuilder("下载进度:")).append(i).append("%").toString(), a);
			a();
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	private void a()
	{
		try
		{
			NotificationManager notificationmanager = (NotificationManager)b.getSystemService("notification");
			notificationmanager.notify(0x1869e, c);
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	public void a(String s)
	{
		e = s;
	}

	protected void onPostExecute(Object obj)
	{
		a((File)obj);
	}

	protected transient Object doInBackground(Object aobj[])
	{
		return a((String[])aobj);
	}

	protected transient void onProgressUpdate(Object aobj[])
	{
		a((Integer[])aobj);
	}
}
