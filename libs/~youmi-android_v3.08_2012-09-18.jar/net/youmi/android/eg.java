// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.graphics.Bitmap;
import android.os.AsyncTask;

// Referenced classes of package net.youmi.android:
//			ee, eh

class eg extends AsyncTask
{

	private boolean a;
	private eh b;

	void a()
	{
		a = false;
	}

	eg(eh eh1)
	{
		a = false;
		b = eh1;
	}

	protected transient Integer a(ee aee[])
	{
		if (b == null)
			return Integer.valueOf(2);
		if (aee == null)
			return Integer.valueOf(0);
		if (aee.length == 0)
			return Integer.valueOf(0);
		ee ee1 = aee[0];
		if (ee1 == null)
			return Integer.valueOf(0);
		a = true;
		  goto _L1
_L3:
		if (b == null)
			return Integer.valueOf(2);
		try
		{
			Bitmap bitmap = ee1.e();
			publishProgress(new Bitmap[] {
				bitmap
			});
		}
		catch (Exception exception1) { }
		try
		{
			int i = ee1.f();
			if (i < 150)
				Thread.sleep(150L);
			else
				Thread.sleep(i);
		}
		catch (Exception exception2) { }
_L1:
		if (a) goto _L3; else goto _L2
_L2:
		return Integer.valueOf(1);
		Exception exception;
		exception;
		return Integer.valueOf(3);
	}

	protected void a(Integer integer)
	{
		super.onPostExecute(integer);
	}

	protected transient void a(Bitmap abitmap[])
	{
		super.onProgressUpdate(abitmap);
		try
		{
			if (b != null && abitmap != null && abitmap.length > 0)
				b.a(abitmap[0]);
		}
		catch (Exception exception) { }
	}

	protected void onPostExecute(Object obj)
	{
		a((Integer)obj);
	}

	protected transient Object doInBackground(Object aobj[])
	{
		return a((ee[])aobj);
	}

	protected transient void onProgressUpdate(Object aobj[])
	{
		a((Bitmap[])aobj);
	}
}
