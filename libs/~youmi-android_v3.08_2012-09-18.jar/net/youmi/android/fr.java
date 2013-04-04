// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import java.io.*;
import java.util.ArrayList;
import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package net.youmi.android:
//			ag, bg, bh, bl, 
//			bp, bx, dh, di, 
//			ex, fs, gy, gz, 
//			hf, hw, hx

class fr extends AsyncTask
	implements ex
{

	protected Context a;
	protected String b;
	protected String c;
	protected fs d;
	protected long e;
	private String h;
	protected String f;
	protected File g;
	private String i;
	private long j;
	private long k;
	private int l;

	fr(Context context, fs fs1)
	{
		j = 0L;
		k = 0L;
		l = -1;
		a = context;
		d = fs1;
	}

	fr(Context context, fs fs1, String s)
	{
		j = 0L;
		k = 0L;
		l = -1;
		a = context;
		d = fs1;
		i = s;
	}

	String a()
	{
		return b;
	}

	String b()
	{
		return c;
	}

	String c()
	{
		return i;
	}

	protected transient Integer a(String as[])
	{
		DefaultHttpClient defaulthttpclient;
		j = System.currentTimeMillis();
		if (d == null)
			return Integer.valueOf(0);
		if (a == null)
			return Integer.valueOf(0);
		if (as == null)
			return Integer.valueOf(0);
		if (as.length <= 0)
			break MISSING_BLOCK_LABEL_810;
		b = as[0];
		c = b;
		if (!hw.b(a))
			return Integer.valueOf(0);
		if (!hf.c(a))
			return Integer.valueOf(0);
		defaulthttpclient = null;
		HttpGet httpget;
		HttpResponse httpresponse;
		HttpEntity httpentity;
		Header header;
		Integer integer;
		defaulthttpclient = hf.a(a, this);
		httpget = null;
		httpget = new HttpGet(b);
		httpget.setHeader("Referer", (new StringBuilder("http://sdk.youmi.net/?p=3&app=")).append(ag.a(a)).append("&chn=").append(ag.e(a)).toString());
		publishProgress(new Integer[] {
			Integer.valueOf(gy.a(35))
		});
		httpresponse = defaulthttpclient.execute(httpget);
		publishProgress(new Integer[] {
			Integer.valueOf(35)
		});
		if (httpresponse.getStatusLine().getStatusCode() != 200)
			break MISSING_BLOCK_LABEL_787;
		publishProgress(new Integer[] {
			Integer.valueOf(38)
		});
		httpentity = httpresponse.getEntity();
		if (httpentity == null)
			break MISSING_BLOCK_LABEL_787;
		e = httpentity.getContentLength();
		header = httpentity.getContentType();
		if (header != null)
			break MISSING_BLOCK_LABEL_307;
		integer = Integer.valueOf(0);
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception2)
		{
			gz.a(exception2);
		}
		return integer;
		String s;
		s = header.getValue();
		if (s != null)
			break MISSING_BLOCK_LABEL_353;
		integer = Integer.valueOf(0);
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception3)
		{
			gz.a(exception3);
		}
		return integer;
		s = s.trim().toLowerCase();
		if (s.indexOf("application/vnd.android.package-archive") <= -1)
			break MISSING_BLOCK_LABEL_418;
		l = 1;
		integer = Integer.valueOf(a(httpresponse, httpentity));
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception4)
		{
			gz.a(exception4);
		}
		return integer;
		if (s.indexOf("application/octet-stream") <= -1)
			break MISSING_BLOCK_LABEL_473;
		l = 1;
		integer = Integer.valueOf(a(httpresponse, httpentity));
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception5)
		{
			gz.a(exception5);
		}
		return integer;
		if (s.indexOf("text/html") <= -1)
			break MISSING_BLOCK_LABEL_526;
		l = 0;
		integer = Integer.valueOf(a(httpentity));
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception6)
		{
			gz.a(exception6);
		}
		return integer;
		if (s.indexOf("xhtml") <= -1)
			break MISSING_BLOCK_LABEL_579;
		l = 0;
		integer = Integer.valueOf(a(httpentity));
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception7)
		{
			gz.a(exception7);
		}
		return integer;
		if (s.indexOf("xml") <= -1)
			break MISSING_BLOCK_LABEL_632;
		l = 0;
		integer = Integer.valueOf(a(httpentity));
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception8)
		{
			gz.a(exception8);
		}
		return integer;
		if (s.indexOf("wml") <= -1)
			break MISSING_BLOCK_LABEL_685;
		l = 0;
		integer = Integer.valueOf(a(httpentity));
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception9)
		{
			gz.a(exception9);
		}
		return integer;
		l = -1;
		httpget.abort();
		integer = Integer.valueOf(0);
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception10)
		{
			gz.a(exception10);
		}
		return integer;
		Exception exception;
		exception;
		gz.a(exception);
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception11)
		{
			gz.a(exception11);
		}
		break MISSING_BLOCK_LABEL_810;
		Exception exception1;
		exception1;
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception12)
		{
			gz.a(exception12);
		}
		throw exception1;
		try
		{
			if (defaulthttpclient != null)
				defaulthttpclient.getConnectionManager().shutdown();
		}
		catch (Exception exception13)
		{
			gz.a(exception13);
		}
		return Integer.valueOf(0);
	}

	private int a(HttpResponse httpresponse, HttpEntity httpentity)
	{
		InputStream inputstream;
		FileOutputStream fileoutputstream;
		inputstream = null;
		fileoutputstream = null;
		if (!hx.a(a))
			return 4;
		if (!a(httpresponse))
			return 0;
		if (f())
			return 3;
		Object obj;
		int i1;
		obj = bg.a();
		if (obj == null)
			break MISSING_BLOCK_LABEL_152;
		i1 = 0;
		  goto _L1
_L3:
		di di1 = (di)((ArrayList) (obj)).get(i1);
		if (!di1.a.equals(f) || di1.c == null)
			continue; /* Loop/switch isn't completed */
		if (System.currentTimeMillis() - di1.c.lastModified() > 0x493e0L)
		{
			try
			{
				di1.c.deleteOnExit();
			}
			catch (Exception exception2)
			{
				gz.a(exception2);
			}
			continue; /* Loop/switch isn't completed */
		}
		return 2;
		i1++;
_L1:
		if (i1 < ((ArrayList) (obj)).size()) goto _L3; else goto _L2
_L2:
		break MISSING_BLOCK_LABEL_152;
		Exception exception;
		exception;
		gz.a(exception);
		publishProgress(new Integer[] {
			Integer.valueOf(-999)
		});
		exception = bg.a(f, e);
		if (exception == null)
			break MISSING_BLOCK_LABEL_514;
		inputstream = httpentity.getContent();
		if (inputstream == null)
			break MISSING_BLOCK_LABEL_514;
		byte abyte0[] = new byte[1024];
		fileoutputstream = new FileOutputStream(((di) (exception)).c);
		int j1 = 0;
		int k1 = 0;
		while ((j1 = inputstream.read(abyte0)) > 0) 
		{
			fileoutputstream.write(abyte0, 0, j1);
			try
			{
				if (++k1 % 20 == 0)
					Thread.sleep(100L);
			}
			catch (Exception exception3) { }
		}
		try
		{
			fileoutputstream.close();
			fileoutputstream = null;
		}
		catch (Exception exception4)
		{
			gz.a(exception4);
		}
		dh dh1 = bg.b(exception);
		if (dh1 == null || dh1.c == null || !dh1.c.exists())
			break MISSING_BLOCK_LABEL_514;
		g = dh1.c;
		try
		{
			if (exception != null && ((di) (exception)).c != null && ((di) (exception)).c.exists())
				((di) (exception)).c.delete();
		}
		catch (Exception exception6)
		{
			gz.a(exception6);
		}
		if (inputstream != null)
			try
			{
				inputstream.close();
			}
			catch (Exception exception11)
			{
				gz.a(exception11);
			}
		if (fileoutputstream != null)
			try
			{
				fileoutputstream.close();
			}
			catch (Exception exception12)
			{
				gz.a(exception12);
			}
		return 1;
		Exception exception1;
		exception1;
		gz.a(exception1);
		try
		{
			if (exception != null && ((di) (exception)).c != null && ((di) (exception)).c.exists())
				((di) (exception)).c.delete();
		}
		catch (Exception exception7)
		{
			gz.a(exception7);
		}
		break MISSING_BLOCK_LABEL_651;
		Exception exception5;
		exception5;
		try
		{
			if (exception != null && ((di) (exception)).c != null && ((di) (exception)).c.exists())
				((di) (exception)).c.delete();
		}
		catch (Exception exception8)
		{
			gz.a(exception8);
		}
		throw exception5;
		try
		{
			if (exception != null && ((di) (exception)).c != null && ((di) (exception)).c.exists())
				((di) (exception)).c.delete();
		}
		catch (Exception exception9)
		{
			gz.a(exception9);
		}
		break MISSING_BLOCK_LABEL_651;
		exception;
		gz.a(exception);
		if (inputstream != null)
			try
			{
				inputstream.close();
			}
			catch (Exception exception13)
			{
				gz.a(exception13);
			}
		if (fileoutputstream != null)
			try
			{
				fileoutputstream.close();
			}
			catch (Exception exception14)
			{
				gz.a(exception14);
			}
		break MISSING_BLOCK_LABEL_689;
		Exception exception10;
		exception10;
		if (inputstream != null)
			try
			{
				inputstream.close();
			}
			catch (Exception exception15)
			{
				gz.a(exception15);
			}
		if (fileoutputstream != null)
			try
			{
				fileoutputstream.close();
			}
			catch (Exception exception16)
			{
				gz.a(exception16);
			}
		throw exception10;
		if (inputstream != null)
			try
			{
				inputstream.close();
			}
			catch (Exception exception17)
			{
				gz.a(exception17);
			}
		if (fileoutputstream != null)
			try
			{
				fileoutputstream.close();
			}
			catch (Exception exception18)
			{
				gz.a(exception18);
			}
		return 5;
	}

	private boolean f()
	{
		ArrayList arraylist;
		int i1;
		arraylist = bg.b();
		if (arraylist == null)
			break MISSING_BLOCK_LABEL_140;
		i1 = 0;
		  goto _L1
_L7:
		dh dh1;
		dh1 = (dh)arraylist.get(i1);
		if (!dh1.d.equals(f))
			continue; /* Loop/switch isn't completed */
		if (!bg.a(dh1)) goto _L3; else goto _L2
_L2:
		PackageInfo packageinfo = bp.a(a, dh1.c.getPath());
		if (packageinfo == null) goto _L5; else goto _L4
_L4:
		g = dh1.c;
		return true;
_L5:
		try
		{
			dh1.c.delete();
		}
		catch (Exception exception3)
		{
			gz.a(exception3);
		}
		continue; /* Loop/switch isn't completed */
_L3:
		try
		{
			dh1.c.delete();
		}
		catch (Exception exception2)
		{
			gz.a(exception2);
		}
		continue; /* Loop/switch isn't completed */
		Exception exception1;
		exception1;
		gz.a(exception1);
		i1++;
_L1:
		if (i1 < arraylist.size()) goto _L7; else goto _L6
_L6:
		break MISSING_BLOCK_LABEL_140;
		Exception exception;
		exception;
		gz.a(exception);
		return false;
	}

	private boolean a(HttpResponse httpresponse)
	{
		Header aheader[] = httpresponse.getHeaders("Content-Disposition");
		if (aheader != null && aheader.length > 0)
		{
			for (int i1 = 0; i1 < aheader.length; i1++)
			{
				Header header = aheader[i1];
				if (header == null)
					continue;
				f = bl.a(header.getValue());
				if (f == null)
					continue;
				f = f.trim();
				if (f.length() > 0)
					break;
				f = null;
			}

		}
		if (f == null)
			f = bl.b(c);
		if (f != null)
			return true;
		break MISSING_BLOCK_LABEL_124;
		Exception exception;
		exception;
		gz.a(exception);
		return false;
	}

	private int a(HttpEntity httpentity)
	{
		InputStream inputstream;
		ByteArrayOutputStream bytearrayoutputstream;
		inputstream = null;
		bytearrayoutputstream = null;
		Object obj = null;
		publishProgress(new Integer[] {
			Integer.valueOf(60)
		});
		inputstream = httpentity.getContent();
		int i1 = e <= 0L ? 2048 : (int)e;
		bytearrayoutputstream = new ByteArrayOutputStream(i1);
		byte abyte0[] = new byte[1024];
		for (int j1 = 0; (j1 = inputstream.read(abyte0)) > 0;)
			bytearrayoutputstream.write(abyte0, 0, j1);

		byte abyte1[] = bytearrayoutputstream.toByteArray();
		h = new String(abyte1, "utf-8");
		if (h != null)
			try
			{
				String s = bl.c(h);
				if (s != null)
				{
					s = s.trim().toLowerCase();
					if (!s.equals("utf-8"))
						h = new String(abyte1, s);
				}
			}
			catch (Exception exception1)
			{
				gz.a(exception1);
			}
		if (h == null)
			break MISSING_BLOCK_LABEL_369;
		publishProgress(new Integer[] {
			Integer.valueOf(95)
		});
		h = bh.a(c, h);
		publishProgress(new Integer[] {
			Integer.valueOf(100)
		});
		if (h != null)
		{
			try
			{
				if (inputstream != null)
					inputstream.close();
			}
			catch (Exception exception3)
			{
				gz.a(exception3);
			}
			try
			{
				if (bytearrayoutputstream != null)
					bytearrayoutputstream.close();
			}
			catch (Exception exception4)
			{
				gz.a(exception4);
			}
			return 1;
		}
		break MISSING_BLOCK_LABEL_369;
		Exception exception;
		exception;
		gz.a(exception);
		try
		{
			if (inputstream != null)
				inputstream.close();
		}
		catch (Exception exception5)
		{
			gz.a(exception5);
		}
		try
		{
			if (bytearrayoutputstream != null)
				bytearrayoutputstream.close();
		}
		catch (Exception exception6)
		{
			gz.a(exception6);
		}
		break MISSING_BLOCK_LABEL_405;
		Exception exception2;
		exception2;
		try
		{
			if (inputstream != null)
				inputstream.close();
		}
		catch (Exception exception7)
		{
			gz.a(exception7);
		}
		try
		{
			if (bytearrayoutputstream != null)
				bytearrayoutputstream.close();
		}
		catch (Exception exception8)
		{
			gz.a(exception8);
		}
		throw exception2;
		try
		{
			if (inputstream != null)
				inputstream.close();
		}
		catch (Exception exception9)
		{
			gz.a(exception9);
		}
		try
		{
			if (bytearrayoutputstream != null)
				bytearrayoutputstream.close();
		}
		catch (Exception exception10)
		{
			gz.a(exception10);
		}
		return 0;
	}

	protected void a(Integer integer)
	{
		super.onPostExecute(integer);
		k = System.currentTimeMillis();
		if (d == null)
			break MISSING_BLOCK_LABEL_345;
		l;
		JVM INSTR tableswitch 0 1: default 304
	//	               0 44
	//	               1 105;
		   goto _L1 _L2 _L3
_L2:
		if (h != null)
		{
			bx bx1 = new bx(c, h);
			try
			{
				d.a(this, bx1);
			}
			catch (Exception exception3)
			{
				gz.a(exception3);
			}
			return;
		}
		Exception exception1;
		try
		{
			try
			{
				d.e();
			}
			catch (Exception exception)
			{
				gz.a(exception);
			}
			return;
		}
		catch (Exception exception2)
		{
			gz.a(exception2);
		}
		break MISSING_BLOCK_LABEL_345;
_L3:
		integer.intValue();
		JVM INSTR tableswitch 1 5: default 286
	//	               1 144
	//	               2 188
	//	               3 206
	//	               4 250
	//	               5 268;
		   goto _L4 _L5 _L6 _L7 _L8 _L9
_L5:
		if (g != null && g.exists())
		{
			try
			{
				d.a(this, g, f);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception1)
			{
				gz.a(exception1);
			}
			return;
		}
		break MISSING_BLOCK_LABEL_322;
_L6:
		try
		{
			d.f();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception1)
		{
			gz.a(exception1);
		}
		return;
_L7:
		if (g != null && g.exists())
		{
			try
			{
				d.b(this, g, f);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception1)
			{
				gz.a(exception1);
			}
			return;
		}
		break MISSING_BLOCK_LABEL_322;
_L8:
		try
		{
			d.g();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception1)
		{
			gz.a(exception1);
		}
		return;
_L9:
		try
		{
			d.h();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception1)
		{
			gz.a(exception1);
		}
		return;
_L4:
		try
		{
			d.e();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception1)
		{
			gz.a(exception1);
		}
		return;
_L1:
		try
		{
			d.e();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception1)
		{
			gz.a(exception1);
		}
		return;
		try
		{
			d.e();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception1)
		{
			gz.a(exception1);
		}
		return;
	}

	protected transient void a(Integer ainteger[])
	{
		super.onProgressUpdate(ainteger);
		try
		{
			if (d != null && ainteger.length > 0)
			{
				int i1 = ainteger[0].intValue();
				if (i1 >= 0)
					d.a(i1);
				else
				if (l == 1)
					d.a(this);
			}
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	long d()
	{
		return k - j;
	}

	long e()
	{
		return j;
	}

	public void a(String s)
	{
		c = s;
	}

	protected void onPostExecute(Object obj)
	{
		a((Integer)obj);
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
