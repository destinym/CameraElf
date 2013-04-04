// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;

// Referenced classes of package net.youmi.android:
//			ba, bb, cp, cz, 
//			fq, gz

class fp extends AsyncTask
{

	Activity a;
	fq b;
	Handler c;

	public fp(Activity activity, fq fq1, Handler handler)
	{
		gz.c((new StringBuilder("==>>  acitivity is null?")).append(activity == null).append(",AdLoaderListener == null?").append(fq1 == null).append(",Handler ==null?").append(handler == null).toString());
		a = activity;
		b = fq1;
		c = handler;
	}

	protected transient Boolean a(Void avoid[])
	{
_L2:
		if (a == null)
			return Boolean.valueOf(false);
label0:
		{
			if (b == null)
				return Boolean.valueOf(false);
			break label0;
		}
		Exception exception;
		exception;
		boolean flag = b.c();
		boolean flag1 = false;
		try
		{
			if (flag)
			{
				int i = ba.a(a);
				try
				{
					switch (i)
					{
					case 0: // '\0'
						flag1 = false;
						break;

					case 1: // '\001'
						flag1 = true;
						cz cz3 = ba.b(a);
						cp.a(cz3);
						publishProgress(new cz[] {
							cz3
						});
						break;

					case 3: // '\003'
						flag1 = true;
						cz cz4 = ba.f(a);
						cp.a(cz4);
						publishProgress(new cz[] {
							cz4
						});
						break;

					case 2: // '\002'
						flag1 = true;
						cz cz5 = ba.c(a);
						cp.a(cz5);
						publishProgress(new cz[] {
							cz5
						});
						break;

					case 4: // '\004'
						flag1 = true;
						cz cz6 = ba.g(a);
						cp.a(cz6);
						publishProgress(new cz[] {
							cz6
						});
						break;

					case 5: // '\005'
						flag1 = true;
						cz cz7 = ba.h(a);
						cp.a(cz7);
						publishProgress(new cz[] {
							cz7
						});
						break;

					case 6: // '\006'
						flag1 = true;
						cz cz8 = ba.e(a);
						cp.a(cz8);
						publishProgress(new cz[] {
							cz8
						});
						break;

					case 7: // '\007'
						flag1 = true;
						cz cz9 = ba.d(a);
						cp.a(cz9);
						publishProgress(new cz[] {
							cz9
						});
						break;
					}
				}
				catch (Exception exception3) { }
			}
		}
		catch (Exception exception1) { }
		try
		{
			if (!flag1 && flag)
			{
				cz cz1 = cp.a();
				if (cz1 != null)
					publishProgress(new cz[] {
						cz1
					});
			}
		}
		catch (Exception exception2) { }
		try
		{
			if (!flag1 && flag)
			{
				cz cz2 = cp.a(a, b.b());
				publishProgress(new cz[] {
					cz2
				});
			}
		}
		catch (Throwable throwable) { }
		try
		{
			bb.a(a, c);
		}
		catch (Throwable throwable1) { }
		try
		{
			Thread.sleep(10000L);
		}
		catch (Throwable throwable2)
		{
			return Boolean.valueOf(false);
		}
		if (!isCancelled()) goto _L2; else goto _L1
_L1:
		return Boolean.valueOf(true);
	}

	static fp a(Activity activity, fq fq1, Handler handler)
	{
		if (activity == null || fq1 == null || handler == null)
			return null;
		fp fp1;
		fp1 = new fp(activity, fq1, handler);
		fp1.execute(new Void[0]);
		return fp1;
		Exception exception;
		exception;
		return null;
	}

	fp a()
	{
		try
		{
			cancel(false);
		}
		catch (Exception exception) { }
		fp fp1;
		fp1 = new fp(a, b, c);
		try
		{
			fp1.execute(new Void[0]);
		}
		catch (Exception exception2) { }
		return fp1;
		Exception exception1;
		exception1;
		return this;
	}

	protected transient void a(cz acz[])
	{
		super.onProgressUpdate(acz);
		try
		{
			if (b != null)
				if (acz != null)
				{
					if (acz.length > 0)
					{
						cz cz1 = acz[0];
						b.a(cz1);
					} else
					{
						b.a(null);
					}
				} else
				{
					b.a(null);
				}
		}
		catch (Exception exception) { }
	}

	protected void a(Boolean boolean1)
	{
		try
		{
			super.onPostExecute(boolean1);
			if (!boolean1.booleanValue());
		}
		catch (Throwable throwable) { }
	}

	protected void onPostExecute(Object obj)
	{
		a((Boolean)obj);
	}

	protected transient Object doInBackground(Object aobj[])
	{
		return a((Void[])aobj);
	}

	protected transient void onProgressUpdate(Object aobj[])
	{
		a((cz[])aobj);
	}
}
