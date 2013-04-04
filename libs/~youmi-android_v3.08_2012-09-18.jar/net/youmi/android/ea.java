// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.os.AsyncTask;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package net.youmi.android:
//			ag, bf, cz, dd, 
//			dj, eb, ex, gz, 
//			hf, hx

class ea extends AsyncTask
	implements ex
{

	private Context a;
	private DefaultHttpClient b;
	private eb c;
	private long d;
	private long e;
	private String f;
	private String g;
	private boolean h;
	private String i;
	private String j;
	private long k;
	private long l;

	ea(Context context, eb eb1, cz cz1)
	{
		h = false;
		a = context;
		c = eb1;
		if (cz1 == null)
		{
			h = false;
		} else
		{
			h = cz1.s();
			cz1.v();
			k = cz1.J();
			l = cz1.I();
			f = cz1.g();
			g = cz1.h();
			i = cz1.o();
			j = cz1.k();
		}
	}

	public void a(String s)
	{
	}

	protected String[] a(String as[])
	{
		if (as == null)
		{
			try
			{
				if (b != null)
					b.getConnectionManager().shutdown();
			}
			catch (Exception exception16)
			{
				gz.a(exception16);
			}
			return null;
		}
		ArrayList arraylist;
		int i1;
		if (as.length <= 0)
			break MISSING_BLOCK_LABEL_811;
		arraylist = new ArrayList(as.length);
		i1 = 0;
		  goto _L1
_L13:
		HttpGet httpget = null;
		String s = as[i1];
		if (s == null) goto _L3; else goto _L2
_L2:
		s = s.trim();
		if (s.length() <= 0) goto _L3; else goto _L4
_L4:
		HttpResponse httpresponse;
		boolean flag = s.length() == 1;
		if (b == null)
			b = hf.a(a, this);
		httpget = new HttpGet(s);
		httpget.setHeader("Referer", (new StringBuilder("http://sdk.youmi.net/?p=3&app=")).append(ag.a(a)).append("&chn=").append(ag.e(a)).toString());
		httpresponse = b.execute(httpget);
		if (httpresponse == null) goto _L3; else goto _L5
_L5:
		long l1;
		File file;
		Header header = httpresponse.getLastHeader("Last-Modified");
		l1 = 0L;
		try
		{
			String s1 = header.getValue();
			if (s1 != null)
			{
				s1 = s1.trim();
				if (s1.length() > 0)
				{
					Date date = new Date(s1);
					if (date != null)
						l1 = date.getTime();
				}
			}
		}
		catch (Exception exception2) { }
		file = bf.d().d(s);
		if (l1 > 0L) goto _L7; else goto _L6
_L6:
		if (!file.exists()) goto _L9; else goto _L8
_L8:
		arraylist.add(file.getPath());
_L11:
		try
		{
			if (httpget != null)
			{
				httpget.abort();
				httpget = null;
			}
		}
		catch (Exception exception7) { }
		try
		{
			publishProgress(new Integer[] {
				Integer.valueOf(((i1 + 1) * 100) / as.length)
			});
		}
		catch (Exception exception8) { }
		continue; /* Loop/switch isn't completed */
_L9:
		if (!a(httpresponse, file)) goto _L11; else goto _L10
_L10:
		arraylist.add(file.getPath());
		  goto _L11
_L7:
		if (file.exists())
		{
			if (file.lastModified() == l1)
			{
				arraylist.add(file.getPath());
				httpget.abort();
				httpget = null;
			} else
			{
				try
				{
					file.deleteOnExit();
				}
				catch (Exception exception3)
				{
					gz.a(exception3);
				}
				if (a(httpresponse, file))
				{
					try
					{
						file.setLastModified(l1);
					}
					catch (Exception exception4)
					{
						gz.a(exception4);
					}
					arraylist.add(file.getPath());
				}
			}
		} else
		if (a(httpresponse, file))
		{
			try
			{
				file.setLastModified(l1);
			}
			catch (Exception exception5) { }
			arraylist.add(file.getPath());
		}
		  goto _L11
		Exception exception1;
		exception1;
		try
		{
			if (httpget != null)
			{
				httpget.abort();
				httpget = null;
			}
		}
		catch (Exception exception9) { }
		try
		{
			publishProgress(new Integer[] {
				Integer.valueOf(((i1 + 1) * 100) / as.length)
			});
		}
		catch (Exception exception10) { }
		continue; /* Loop/switch isn't completed */
		Exception exception6;
		exception6;
		try
		{
			if (httpget != null)
			{
				httpget.abort();
				httpget = null;
			}
		}
		catch (Exception exception11) { }
		try
		{
			publishProgress(new Integer[] {
				Integer.valueOf(((i1 + 1) * 100) / as.length)
			});
		}
		catch (Exception exception12) { }
		throw exception6;
_L3:
		try
		{
			if (httpget != null)
			{
				httpget.abort();
				httpget = null;
			}
		}
		catch (Exception exception13) { }
		try
		{
			publishProgress(new Integer[] {
				Integer.valueOf(((i1 + 1) * 100) / as.length)
			});
		}
		catch (Exception exception14) { }
		i1++;
_L1:
		if (i1 < as.length) goto _L13; else goto _L12
_L12:
		String as2[];
		if (arraylist.size() <= 0)
			break MISSING_BLOCK_LABEL_811;
		String as1[] = new String[arraylist.size()];
		for (int j1 = 0; j1 < arraylist.size(); j1++)
			as1[j1] = (String)arraylist.get(j1);

		as2 = as1;
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception17)
		{
			gz.a(exception17);
		}
		return as2;
		Exception exception;
		exception;
		gz.a(exception);
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception18)
		{
			gz.a(exception18);
		}
		break MISSING_BLOCK_LABEL_840;
		Exception exception15;
		exception15;
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception19)
		{
			gz.a(exception19);
		}
		throw exception15;
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception20)
		{
			gz.a(exception20);
		}
		return null;
	}

	protected boolean a(HttpResponse httpresponse, File file)
	{
label0:
		{
			InputStream inputstream;
			FileOutputStream fileoutputstream;
label1:
			{
				inputstream = null;
				fileoutputstream = null;
				boolean flag;
				try
				{
					HttpEntity httpentity = httpresponse.getEntity();
					if (httpentity == null || file == null)
						break label1;
					inputstream = httpentity.getContent();
					if (inputstream == null)
						break label1;
					fileoutputstream = new FileOutputStream(file);
					if (fileoutputstream == null || !a(inputstream, ((OutputStream) (fileoutputstream))))
						break label1;
					try
					{
						fileoutputstream.close();
						fileoutputstream = null;
					}
					catch (Exception exception1) { }
					flag = file.exists();
				}
				catch (Exception exception)
				{
					try
					{
						if (fileoutputstream != null)
							fileoutputstream.close();
					}
					catch (Exception exception5) { }
					try
					{
						if (inputstream != null)
							inputstream.close();
					}
					catch (Exception exception6) { }
					break label0;
				}
				finally
				{
					try
					{
						if (fileoutputstream != null)
							fileoutputstream.close();
					}
					catch (Exception exception7) { }
					try
					{
						if (inputstream != null)
							inputstream.close();
					}
					catch (Exception exception8) { }
					throw exception2;
				}
				try
				{
					if (fileoutputstream != null)
						fileoutputstream.close();
				}
				catch (Exception exception3) { }
				try
				{
					if (inputstream != null)
						inputstream.close();
				}
				catch (Exception exception4) { }
				return flag;
			}
			try
			{
				if (fileoutputstream != null)
					fileoutputstream.close();
			}
			catch (Exception exception9) { }
			try
			{
				if (inputstream != null)
					inputstream.close();
			}
			catch (Exception exception10) { }
		}
		return false;
	}

	protected String a(String s, String s1)
	{
		InputStream inputstream;
		FileOutputStream fileoutputstream;
		d = System.currentTimeMillis();
		inputstream = null;
		fileoutputstream = null;
		HttpEntity httpentity;
		long l1;
		if (b == null)
			b = hf.a(a, this);
		HttpGet httpget = new HttpGet(s);
		httpget.setHeader("Referer", (new StringBuilder("http://sdk.youmi.net/?p=3&app=")).append(ag.a(a)).append("&chn=").append(ag.e(a)).toString());
		HttpResponse httpresponse = b.execute(httpget);
		if (httpresponse == null)
			break MISSING_BLOCK_LABEL_620;
		httpentity = httpresponse.getEntity();
		if (httpentity == null)
			break MISSING_BLOCK_LABEL_620;
		l1 = httpentity.getContentLength();
		fileoutputstream = a.openFileOutput(s1, 1);
		if (fileoutputstream != null)
			break MISSING_BLOCK_LABEL_214;
		httpget.abort();
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Exception exception4)
		{
			gz.a(exception4);
		}
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
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception6)
		{
			gz.a(exception6);
		}
		return null;
		String s2;
		inputstream = httpentity.getContent();
		if (inputstream == null)
			break MISSING_BLOCK_LABEL_620;
		int i1 = 0;
		byte abyte0[] = new byte[1024];
		int j1 = 0;
		long l2 = 0L;
		while ((i1 = inputstream.read(abyte0)) > 0) 
		{
			fileoutputstream.write(abyte0, 0, i1);
			l2 += i1;
			if (++j1 % 10 == 0)
				try
				{
					if (l1 > 0L)
						publishProgress(new Integer[] {
							Integer.valueOf((int)((l2 * 100L) / l1))
						});
					else
						publishProgress(new Integer[] {
							Integer.valueOf(50)
						});
				}
				catch (Exception exception1)
				{
					gz.a(exception1);
				}
		}
		if (l2 <= 0L)
			break MISSING_BLOCK_LABEL_620;
		try
		{
			fileoutputstream.close();
			fileoutputstream = null;
		}
		catch (Exception exception2)
		{
			gz.a(exception2);
		}
		File file = a.getFileStreamPath(s1);
		if (file == null || !file.exists())
			break MISSING_BLOCK_LABEL_620;
		s2 = file.getPath();
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Exception exception7)
		{
			gz.a(exception7);
		}
		try
		{
			if (inputstream != null)
				inputstream.close();
		}
		catch (Exception exception8)
		{
			gz.a(exception8);
		}
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception9)
		{
			gz.a(exception9);
		}
		return s2;
		Exception exception;
		exception;
		gz.a(exception);
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Exception exception10)
		{
			gz.a(exception10);
		}
		try
		{
			if (inputstream != null)
				inputstream.close();
		}
		catch (Exception exception11)
		{
			gz.a(exception11);
		}
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception12)
		{
			gz.a(exception12);
		}
		break MISSING_BLOCK_LABEL_687;
		Exception exception3;
		exception3;
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Exception exception13)
		{
			gz.a(exception13);
		}
		try
		{
			if (inputstream != null)
				inputstream.close();
		}
		catch (Exception exception14)
		{
			gz.a(exception14);
		}
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception15)
		{
			gz.a(exception15);
		}
		throw exception3;
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Exception exception16)
		{
			gz.a(exception16);
		}
		try
		{
			if (inputstream != null)
				inputstream.close();
		}
		catch (Exception exception17)
		{
			gz.a(exception17);
		}
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception18)
		{
			gz.a(exception18);
		}
		return null;
	}

	protected boolean a(InputStream inputstream, OutputStream outputstream)
	{
		if (inputstream == null || outputstream == null)
			break MISSING_BLOCK_LABEL_42;
		int i1 = 0;
		byte abyte0[] = new byte[1024];
		while ((i1 = inputstream.read(abyte0)) > 0) 
			outputstream.write(abyte0, 0, i1);
		return true;
		Exception exception;
		exception;
		return false;
	}

	protected transient String[] a(String as[][])
	{
		String as1[];
		String as2[];
		publishProgress(new Integer[] {
			Integer.valueOf(1)
		});
		if (as == null || as.length <= 0)
			break MISSING_BLOCK_LABEL_318;
		as1 = as[0];
		if (as1 == null || as1.length <= 0)
			break MISSING_BLOCK_LABEL_318;
		if (!hx.a(a))
			break MISSING_BLOCK_LABEL_86;
		as2 = a(as1);
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception3)
		{
			gz.a(exception3);
		}
		return as2;
		String s;
		String s1;
		s = as1[0];
		if (s == null)
			break MISSING_BLOCK_LABEL_318;
		s = s.trim();
		if (s.length() <= 0)
			break MISSING_BLOCK_LABEL_318;
		s1 = dj.b(s);
		File file = null;
		try
		{
			file = a.getFileStreamPath(s1);
		}
		catch (Exception exception1) { }
		if (file == null || !file.exists())
			break MISSING_BLOCK_LABEL_190;
		as2 = (new String[] {
			file.getPath()
		});
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception4)
		{
			gz.a(exception4);
		}
		return as2;
		String s2 = a(s, s1);
		if (s2 == null)
			break MISSING_BLOCK_LABEL_318;
		as2 = (new String[] {
			s2
		});
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception5)
		{
			gz.a(exception5);
		}
		return as2;
		Exception exception;
		exception;
		gz.a(exception);
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception6)
		{
			gz.a(exception6);
		}
		break MISSING_BLOCK_LABEL_347;
		Exception exception2;
		exception2;
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception7)
		{
			gz.a(exception7);
		}
		throw exception2;
		try
		{
			if (b != null)
				b.getConnectionManager().shutdown();
		}
		catch (Exception exception8)
		{
			gz.a(exception8);
		}
		return null;
	}

	protected void b(String as[])
	{
		super.onPostExecute(as);
		e = System.currentTimeMillis();
		if (c == null)
			break MISSING_BLOCK_LABEL_68;
		if (as == null)
		{
			c.a();
			return;
		}
		try
		{
			if (as.length > 0)
			{
				try
				{
					c.a(this, as);
				}
				catch (Exception exception) { }
				return;
			}
		}
		catch (Exception exception1) { }
		try
		{
			c.a();
		}
		catch (Exception exception2) { }
	}

	long a()
	{
		return e - d;
	}

	boolean b()
	{
		return h;
	}

	long c()
	{
		return k;
	}

	long d()
	{
		return d - l;
	}

	String e()
	{
		return f;
	}

	String f()
	{
		return g;
	}

	String g()
	{
		return i;
	}

	String h()
	{
		return j;
	}

	protected transient void a(Integer ainteger[])
	{
		super.onProgressUpdate(ainteger);
		try
		{
			if (c != null && ainteger != null && ainteger.length > 0)
			{
				int i1 = ainteger[0].intValue();
				c.b(i1);
			}
		}
		catch (Exception exception) { }
	}

	protected void onPostExecute(Object obj)
	{
		b((String[])obj);
	}

	protected transient Object doInBackground(Object aobj[])
	{
		return a((String[][])aobj);
	}

	protected transient void onProgressUpdate(Object aobj[])
	{
		a((Integer[])aobj);
	}
}
