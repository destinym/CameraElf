// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.os.AsyncTask;

// Referenced classes of package net.youmi.android:
//			ad

class fo extends AsyncTask
{

	ad a;

	private fo(ad ad1)
	{
		a = ad1;
	}

	protected transient Boolean a(Void avoid[])
	{
_L2:
		try
		{
			publishProgress(new ad[] {
				a
			});
		}
		catch (Exception exception) { }
		try
		{
			Thread.sleep(2000L);
		}
		catch (Exception exception1)
		{
			return Boolean.valueOf(false);
		}
		if (!isCancelled()) goto _L2; else goto _L1
_L1:
		break MISSING_BLOCK_LABEL_48;
		Exception exception2;
		exception2;
		return Boolean.valueOf(true);
	}

	protected void a(Boolean boolean1)
	{
		super.onPostExecute(boolean1);
		try
		{
			if (!boolean1.booleanValue());
		}
		catch (Exception exception) { }
	}

	protected transient void a(ad aad[])
	{
		super.onProgressUpdate(aad);
		try
		{
			if (aad != null && aad.length > 0)
			{
				ad ad1 = aad[0];
				ad1.a();
			}
		}
		catch (Exception exception) { }
	}

	static fo a(ad ad1)
	{
		fo fo1;
		fo1 = new fo(ad1);
		fo1.execute(new Void[0]);
		return fo1;
		Exception exception;
		exception;
		return null;
	}

	fo b(ad ad1)
	{
		try
		{
			cancel(false);
		}
		catch (Exception exception) { }
		fo fo1;
		fo1 = new fo(ad1);
		fo1.execute(new Void[0]);
		return fo1;
		Exception exception1;
		exception1;
		return this;
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
		a((ad[])aobj);
	}
}
