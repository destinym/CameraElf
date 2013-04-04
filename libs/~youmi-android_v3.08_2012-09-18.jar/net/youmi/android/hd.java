// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.io.*;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package net.youmi.android:
//			fb, gv, hf, hi

class hd
{

	public static int a(Context context, String s, gv gv1, String s1, fb fb1, int i)
	{
		HttpClient httpclient = null;
		if (gv1 != null) goto _L2; else goto _L1
_L1:
		try
		{
			if (httpclient != null)
			{
				httpclient.getConnectionManager().shutdown();
				httpclient = null;
			}
		}
		catch (Throwable throwable3) { }
		return 7;
_L2:
		if (hi.a(context) && (httpclient = hf.b(context)) != null) goto _L3; else goto _L1
_L3:
		byte byte0;
		int j;
		byte0 = -1;
		if (i <= 0)
			i = 5;
		j = 0;
		  goto _L4
_L7:
		if (!hi.a(context))
			Thread.sleep(10000L);
		if (!hi.a(context))
		{
			byte0 = 5;
			continue; /* Loop/switch isn't completed */
		}
		  goto _L5
		Throwable throwable1;
		throwable1;
_L5:
		int k = a(context, s, httpclient, s1, gv1, fb1);
		if (k == 0)
		{
			try
			{
				if (httpclient != null)
				{
					httpclient.getConnectionManager().shutdown();
					httpclient = null;
				}
			}
			catch (Throwable throwable4) { }
			return 0;
		}
		byte0 = 6;
		if (k == 1)
			break; /* Loop/switch isn't completed */
		try
		{
			if (k == 3)
				break; /* Loop/switch isn't completed */
		}
		catch (Throwable throwable2) { }
		j++;
_L4:
		if (j < i) goto _L7; else goto _L6
_L6:
		byte byte1 = byte0;
		try
		{
			if (httpclient != null)
			{
				httpclient.getConnectionManager().shutdown();
				httpclient = null;
			}
		}
		catch (Throwable throwable5) { }
		return byte1;
		Throwable throwable;
		throwable;
		try
		{
			if (httpclient != null)
			{
				httpclient.getConnectionManager().shutdown();
				httpclient = null;
			}
		}
		catch (Throwable throwable6) { }
		break MISSING_BLOCK_LABEL_265;
		Exception exception;
		exception;
		try
		{
			if (httpclient != null)
			{
				httpclient.getConnectionManager().shutdown();
				httpclient = null;
			}
		}
		catch (Throwable throwable7) { }
		throw exception;
		return 7;
	}

	private static int a(Context context, String s, HttpClient httpclient, String s1, gv gv1, fb fb1)
	{
		InputStream inputstream;
		HttpGet httpget;
		FileOutputStream fileoutputstream;
		RandomAccessFile randomaccessfile;
		inputstream = null;
		httpget = null;
		fileoutputstream = null;
		randomaccessfile = null;
		long l;
		HttpResponse httpresponse;
		int i;
		long l1;
		long l2;
		l = gv1.d();
		httpget = new HttpGet(s1);
		if (l > 0L)
			httpget.setHeader("RANGE", String.format("bytes=%d-", new Object[] {
				Long.valueOf(l)
			}));
		httpresponse = httpclient.execute(httpget);
		i = httpresponse.getStatusLine().getStatusCode();
		l1 = httpresponse.getEntity().getContentLength();
		l2 = l1;
		if (l <= 0L) goto _L2; else goto _L1
_L1:
		if (i == 200)
		{
			try
			{
				if (fileoutputstream != null)
				{
					fileoutputstream.close();
					fileoutputstream = null;
				}
			}
			catch (Throwable throwable9) { }
			try
			{
				if (randomaccessfile != null)
				{
					randomaccessfile.close();
					randomaccessfile = null;
				}
			}
			catch (Throwable throwable10) { }
			try
			{
				if (inputstream != null)
				{
					inputstream.close();
					inputstream.close();
				}
			}
			catch (Throwable throwable11) { }
			try
			{
				if (httpget != null)
				{
					httpget.abort();
					httpget = null;
				}
			}
			catch (Throwable throwable12) { }
			return 0;
		}
		if (i != 206) goto _L4; else goto _L3
_L3:
		l2 = l1 + l;
		  goto _L5
_L4:
		if (i >= 200 && i < 300) goto _L5; else goto _L6
_L6:
		if (i < 400 || i >= 600) goto _L8; else goto _L7
_L7:
		try
		{
			if (fileoutputstream != null)
			{
				fileoutputstream.close();
				fileoutputstream = null;
			}
		}
		catch (Throwable throwable13) { }
		try
		{
			if (randomaccessfile != null)
			{
				randomaccessfile.close();
				randomaccessfile = null;
			}
		}
		catch (Throwable throwable14) { }
		try
		{
			if (inputstream != null)
			{
				inputstream.close();
				inputstream.close();
			}
		}
		catch (Throwable throwable15) { }
		try
		{
			if (httpget != null)
			{
				httpget.abort();
				httpget = null;
			}
		}
		catch (Throwable throwable16) { }
		return 1;
_L8:
		try
		{
			if (fileoutputstream != null)
			{
				fileoutputstream.close();
				fileoutputstream = null;
			}
		}
		catch (Throwable throwable17) { }
		try
		{
			if (randomaccessfile != null)
			{
				randomaccessfile.close();
				randomaccessfile = null;
			}
		}
		catch (Throwable throwable18) { }
		try
		{
			if (inputstream != null)
			{
				inputstream.close();
				inputstream.close();
			}
		}
		catch (Throwable throwable19) { }
		try
		{
			if (httpget != null)
			{
				httpget.abort();
				httpget = null;
			}
		}
		catch (Throwable throwable20) { }
		return 2;
_L2:
		if (i >= 200 && i < 300) goto _L5; else goto _L9
_L9:
		if (i < 400 || i >= 600) goto _L8; else goto _L7
_L5:
		byte abyte0[];
		long l3;
		int i1;
		long l10;
		long l14;
		int j1;
		abyte0 = new byte[1024];
		int j = 0;
		inputstream = httpresponse.getEntity().getContent();
		l3 = System.currentTimeMillis();
		long l4 = 0L;
		long l7 = 0L;
		i1 = 0;
		l10 = 0L;
		long l11 = 0L;
		l14 = l <= 0L ? 0L : l;
		j1 = 0;
		boolean flag = false;
		if (l <= 0L)
			break MISSING_BLOCK_LABEL_957;
		randomaccessfile = new RandomAccessFile(gv1.c(), "rw");
		randomaccessfile.seek(l);
		while ((j = inputstream.read(abyte0)) > 0) 
		{
			randomaccessfile.write(abyte0, 0, j);
			if (fb1 != null)
			{
				l14 += j;
				j1++;
				try
				{
					if (j1 % 50 == 0)
					{
						try
						{
							if (l2 > 0L)
							{
								long l5 = System.currentTimeMillis();
								long l8 = l5 - l3;
								l3 = l5;
								long l12 = l14 - l10;
								l10 = l14;
								int k1 = (int)((l14 * 100L) / l2);
								if (l8 > 0L)
									try
									{
										i1 = (int)((l12 * 1000L) / l8);
									}
									catch (Throwable throwable1) { }
								else
									i1 = 0;
								fb1.a(s, k1, i1);
							} else
							{
								fb1.a(s, 50, 0);
							}
						}
						catch (Throwable throwable2) { }
						try
						{
							Thread.sleep(2000L);
						}
						catch (Throwable throwable3) { }
					}
				}
				catch (Throwable throwable4) { }
			}
		}
		if (gv1.d() <= l2)
			break MISSING_BLOCK_LABEL_794;
		gv1.b();
		try
		{
			if (fileoutputstream != null)
			{
				fileoutputstream.close();
				fileoutputstream = null;
			}
		}
		catch (Throwable throwable21) { }
		try
		{
			if (randomaccessfile != null)
			{
				randomaccessfile.close();
				randomaccessfile = null;
			}
		}
		catch (Throwable throwable22) { }
		try
		{
			if (inputstream != null)
			{
				inputstream.close();
				inputstream.close();
			}
		}
		catch (Throwable throwable23) { }
		try
		{
			if (httpget != null)
			{
				httpget.abort();
				httpget = null;
			}
		}
		catch (Throwable throwable24) { }
		return 2;
		if (l2 == gv1.d())
		{
			try
			{
				if (fileoutputstream != null)
				{
					fileoutputstream.close();
					fileoutputstream = null;
				}
			}
			catch (Throwable throwable25) { }
			try
			{
				if (randomaccessfile != null)
				{
					randomaccessfile.close();
					randomaccessfile = null;
				}
			}
			catch (Throwable throwable26) { }
			try
			{
				if (inputstream != null)
				{
					inputstream.close();
					inputstream.close();
				}
			}
			catch (Throwable throwable27) { }
			try
			{
				if (httpget != null)
				{
					httpget.abort();
					httpget = null;
				}
			}
			catch (Throwable throwable28) { }
			return 0;
		}
		try
		{
			if (fileoutputstream != null)
			{
				fileoutputstream.close();
				fileoutputstream = null;
			}
		}
		catch (Throwable throwable29) { }
		try
		{
			if (randomaccessfile != null)
			{
				randomaccessfile.close();
				randomaccessfile = null;
			}
		}
		catch (Throwable throwable30) { }
		try
		{
			if (inputstream != null)
			{
				inputstream.close();
				inputstream.close();
			}
		}
		catch (Throwable throwable31) { }
		try
		{
			if (httpget != null)
			{
				httpget.abort();
				httpget = null;
			}
		}
		catch (Throwable throwable32) { }
		return 2;
label0:
		{
			Throwable throwable37;
			try
			{
				fileoutputstream = gv1.f();
				int k;
				while ((k = inputstream.read(abyte0)) > 0) 
				{
					fileoutputstream.write(abyte0, 0, k);
					if (fb1 != null)
					{
						l14 += k;
						j1++;
						try
						{
							if (j1 % 50 == 0)
							{
								try
								{
									if (l2 > 0L)
									{
										long l6 = System.currentTimeMillis();
										long l9 = l6 - l3;
										l3 = l6;
										long l13 = l14 - l10;
										l10 = l14;
										int i2 = (int)((l14 * 100L) / l2);
										if (l9 > 0L)
											try
											{
												i1 = (int)((l13 * 1000L) / l9);
											}
											catch (Throwable throwable5) { }
										else
											i1 = 0;
										fb1.a(s, i2, i1);
									} else
									{
										fb1.a(s, 50, 0);
									}
								}
								catch (Throwable throwable6) { }
								try
								{
									Thread.sleep(2000L);
								}
								catch (Throwable throwable7) { }
							}
						}
						catch (Throwable throwable8) { }
					}
				}
				if (gv1.d() <= l2)
					break label0;
				gv1.b();
			}
			catch (IllegalArgumentException illegalargumentexception)
			{
				try
				{
					if (fileoutputstream != null)
					{
						fileoutputstream.close();
						fileoutputstream = null;
					}
				}
				catch (Throwable throwable38) { }
				try
				{
					if (randomaccessfile != null)
					{
						randomaccessfile.close();
						randomaccessfile = null;
					}
				}
				catch (Throwable throwable39) { }
				try
				{
					if (inputstream != null)
					{
						inputstream.close();
						inputstream.close();
					}
				}
				catch (Throwable throwable40) { }
				try
				{
					if (httpget != null)
					{
						httpget.abort();
						httpget = null;
					}
				}
				catch (Throwable throwable41) { }
				return 3;
			}
			catch (IllegalStateException illegalstateexception)
			{
				try
				{
					if (fileoutputstream != null)
					{
						fileoutputstream.close();
						fileoutputstream = null;
					}
				}
				catch (Throwable throwable42) { }
				try
				{
					if (randomaccessfile != null)
					{
						randomaccessfile.close();
						randomaccessfile = null;
					}
				}
				catch (Throwable throwable43) { }
				try
				{
					if (inputstream != null)
					{
						inputstream.close();
						inputstream.close();
					}
				}
				catch (Throwable throwable44) { }
				try
				{
					if (httpget != null)
					{
						httpget.abort();
						httpget = null;
					}
				}
				catch (Throwable throwable45) { }
				return 3;
			}
			catch (Throwable throwable)
			{
				try
				{
					if (fileoutputstream != null)
					{
						fileoutputstream.close();
						fileoutputstream = null;
					}
				}
				catch (Throwable throwable46) { }
				try
				{
					if (randomaccessfile != null)
					{
						randomaccessfile.close();
						randomaccessfile = null;
					}
				}
				catch (Throwable throwable47) { }
				try
				{
					if (inputstream != null)
					{
						inputstream.close();
						inputstream.close();
					}
				}
				catch (Throwable throwable48) { }
				try
				{
					if (httpget != null)
					{
						httpget.abort();
						httpget = null;
					}
				}
				catch (Throwable throwable49) { }
				break MISSING_BLOCK_LABEL_1710;
			}
			finally
			{
				try
				{
					if (fileoutputstream != null)
					{
						fileoutputstream.close();
						fileoutputstream = null;
					}
				}
				catch (Throwable throwable50) { }
				try
				{
					if (randomaccessfile != null)
					{
						randomaccessfile.close();
						randomaccessfile = null;
					}
				}
				catch (Throwable throwable51) { }
				try
				{
					if (inputstream != null)
					{
						inputstream.close();
						inputstream.close();
					}
				}
				catch (Throwable throwable52) { }
				try
				{
					if (httpget != null)
					{
						httpget.abort();
						httpget = null;
					}
				}
				catch (Throwable throwable53) { }
				throw exception;
			}
			try
			{
				if (fileoutputstream != null)
				{
					fileoutputstream.close();
					fileoutputstream = null;
				}
			}
			catch (Throwable throwable33) { }
			try
			{
				if (randomaccessfile != null)
				{
					randomaccessfile.close();
					randomaccessfile = null;
				}
			}
			catch (Throwable throwable34) { }
			try
			{
				if (inputstream != null)
				{
					inputstream.close();
					inputstream.close();
				}
			}
			catch (Throwable throwable35) { }
			try
			{
				if (httpget != null)
				{
					httpget.abort();
					httpget = null;
				}
			}
			catch (Throwable throwable36) { }
			return 2;
		}
		if (l2 == gv1.d())
		{
			try
			{
				if (fileoutputstream != null)
				{
					fileoutputstream.close();
					fileoutputstream = null;
				}
			}
			// Misplaced declaration of an exception variable
			catch (Throwable throwable37) { }
			try
			{
				if (randomaccessfile != null)
				{
					randomaccessfile.close();
					randomaccessfile = null;
				}
			}
			// Misplaced declaration of an exception variable
			catch (Throwable throwable37) { }
			try
			{
				if (inputstream != null)
				{
					inputstream.close();
					inputstream.close();
				}
			}
			// Misplaced declaration of an exception variable
			catch (Throwable throwable37) { }
			try
			{
				if (httpget != null)
				{
					httpget.abort();
					httpget = null;
				}
			}
			// Misplaced declaration of an exception variable
			catch (Throwable throwable37) { }
			return 0;
		}
		try
		{
			if (fileoutputstream != null)
			{
				fileoutputstream.close();
				fileoutputstream = null;
			}
		}
		// Misplaced declaration of an exception variable
		catch (Throwable throwable37) { }
		try
		{
			if (randomaccessfile != null)
			{
				randomaccessfile.close();
				randomaccessfile = null;
			}
		}
		// Misplaced declaration of an exception variable
		catch (Throwable throwable37) { }
		try
		{
			if (inputstream != null)
			{
				inputstream.close();
				inputstream.close();
			}
		}
		// Misplaced declaration of an exception variable
		catch (Throwable throwable37) { }
		try
		{
			if (httpget != null)
			{
				httpget.abort();
				httpget = null;
			}
		}
		// Misplaced declaration of an exception variable
		catch (Throwable throwable37) { }
		return 2;
		return 2;
	}
}
