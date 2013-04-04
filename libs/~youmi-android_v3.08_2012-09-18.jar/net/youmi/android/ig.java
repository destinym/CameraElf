// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			cz, if

class ig
	implements Runnable
{

	final if a;

	ig(if if1)
	{
		a = if1;
		super();
	}

	public void run()
	{
		try
		{
			if (net.youmi.android.if.a(a).u())
			{
				if (a.f != null)
					a.setBackgroundDrawable(a.f);
			} else
			{
				a.setBackgroundColor(0);
			}
		}
		catch (Exception exception) { }
	}
}
