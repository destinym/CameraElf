// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.DialogInterface;
import android.widget.Toast;

// Referenced classes of package net.youmi.android:
//			bd, ci, cl

class ck
	implements android.content.DialogInterface.OnClickListener
{

	final ci a;
	private final cl b;

	ck(ci ci1, cl cl)
	{
		a = ci1;
		b = cl;
		super();
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		try
		{
			try
			{
				Toast.makeText(a.a, "开始下载更新.", 0).show();
			}
			catch (Exception exception) { }
			bd.a(a.a, b);
		}
		catch (Exception exception1) { }
	}
}
