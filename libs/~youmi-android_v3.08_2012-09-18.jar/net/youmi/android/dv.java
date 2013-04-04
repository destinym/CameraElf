// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.view.View;

// Referenced classes of package net.youmi.android:
//			a, bf, bm, dd, 
//			du, gz

class dv
	implements android.view.View.OnClickListener
{

	final du a;

	dv(du du1)
	{
		a = du1;
		super();
	}

	public void onClick(View view)
	{
		try
		{
			String s = bf.g().a(a.c);
			try
			{
				ce ce = net.youmi.android.a.a(a.b, s, null, null, null, null);
				net.youmi.android.a.a(a.b, ce, 3);
			}
			catch (Exception exception1) { }
			String s1 = (new StringBuilder("file://")).append(s).toString();
			bm.c(a.b, s1);
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}
}
