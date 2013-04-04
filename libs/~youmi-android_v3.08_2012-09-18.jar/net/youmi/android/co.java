// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;

// Referenced classes of package net.youmi.android:
//			ey, fa, fb, gc, 
//			gv, hd, hi

class co extends AsyncTask
	implements fb
{

	private Context a;
	private gc b;
	private ey c;
	private File d;
	private boolean e;
	private fa f;
	private String g;
	private int h;
	private int i;
	private long j;
	private int k;

	co(Context context, gc gc1, ey ey1, fa fa1)
	{
		e = false;
		h = 0;
		i = 0;
		j = 0L;
		k = -1;
		a = context;
		b = gc1;
		c = ey1;
		f = fa1;
		g = c.a(b);
	}

	protected transient Void a(Void avoid[])
	{
		e = true;
		if (a != null)
			break MISSING_BLOCK_LABEL_25;
		k = 7;
_L1:
		e = false;
		return null;
		if (!hi.a(a))
			k = 5;
		else
		if (b == null)
		{
			k = 7;
		} else
		{
			if (c.b(b))
				break MISSING_BLOCK_LABEL_84;
			k = 7;
		}
		  goto _L1
		File file = c.b(a, b);
		if (file == null)
			break MISSING_BLOCK_LABEL_123;
		k = 3;
		d = file;
		e = false;
		return null;
		gv gv1;
		gv1 = c.a(a, b);
		if (gv1 != null)
			break MISSING_BLOCK_LABEL_157;
		k = 4;
		e = false;
		return null;
		if (gv1.a())
		{
			if (a(gv1.c()))
			{
				e = false;
				return null;
			}
			int i1;
			try
			{
				k = 1;
				publishProgress(new Void[0]);
				int l = hd.a(a, g, gv1, b.h(), this, 5);
				a(l, gv1.c());
			}
			catch (Throwable throwable)
			{
				e = false;
				break MISSING_BLOCK_LABEL_309;
			}
			finally
			{
				e = false;
				throw exception;
			}
			e = false;
			return null;
		}
		k = 1;
		publishProgress(new Void[0]);
		i1 = hd.a(a, g, gv1, b.h(), this, 5);
		a(i1, gv1.c());
		e = false;
		return null;
		k = 7;
		return null;
	}

	protected transient void b(Void avoid[])
	{
		super.onProgressUpdate(avoid);
		b();
	}

	protected void a(Void void1)
	{
		super.onPostExecute(void1);
		b();
	}

	private boolean a(int l, File file)
	{
		k = l;
		if (l != 0)
			break MISSING_BLOCK_LABEL_28;
		if (a(file))
			return true;
		k = 7;
		return false;
		Throwable throwable;
		throwable;
		return false;
	}

	private boolean a(File file)
	{
		if (!c.a(a, file, b))
			break MISSING_BLOCK_LABEL_70;
		File file1 = c.b(a, file, b);
		if (file1 == null || !file1.exists())
			break MISSING_BLOCK_LABEL_63;
		d = file1;
		k = 0;
		return true;
		try
		{
			k = 4;
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
		return false;
	}

	private void b()
	{
		k;
		JVM INSTR tableswitch 0 3: default 56
	//	               0 36
	//	               1 41
	//	               2 46
	//	               3 51;
		   goto _L1 _L2 _L3 _L4 _L5
_L2:
		f();
		return;
_L3:
		try
		{
			d();
			return;
		}
		catch (Throwable throwable)
		{
			return;
		}
_L4:
		c();
		return;
_L5:
		e();
		return;
_L1:
		a(k);
		return;
	}

	private void c()
	{
		if (f == null)
			return;
		try
		{
			f.a(g, h, i);
		}
		catch (Throwable throwable) { }
		return;
	}

	private void d()
	{
		if (f == null)
			return;
		try
		{
			j = System.currentTimeMillis();
			f.a(g);
		}
		catch (Throwable throwable) { }
		return;
	}

	private void e()
	{
		if (f == null)
			return;
		try
		{
			f.a(g, d);
		}
		catch (Throwable throwable) { }
		return;
	}

	private void f()
	{
		if (f == null)
			return;
		try
		{
			f.a(g, d, j);
		}
		catch (Throwable throwable) { }
		return;
	}

	private void a(int l)
	{
		if (f == null)
			return;
		try
		{
			f.a(g, l, j);
		}
		catch (Throwable throwable) { }
		return;
	}

	public boolean a()
	{
		return e;
	}

	public void a(String s, int l, int i1)
	{
		try
		{
			h = l;
			i = i1;
			k = 2;
			publishProgress(new Void[0]);
		}
		catch (Throwable throwable) { }
	}

	protected void onPostExecute(Object obj)
	{
		a((Void)obj);
	}

	protected transient Object doInBackground(Object aobj[])
	{
		return a((Void[])aobj);
	}

	protected transient void onProgressUpdate(Object aobj[])
	{
		b((Void[])aobj);
	}
}
