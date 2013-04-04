// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.DialogInterface;

// Referenced classes of package net.youmi.android:
//			br, cp, cz, AdActivity

class c
	implements android.content.DialogInterface.OnClickListener
{

	final AdActivity a;
	private final cz b;

	c(AdActivity adactivity, cz cz1)
	{
		a = adactivity;
		b = cz1;
		super();
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		br.a(a, b.c(), b.B(), b.R());
		b.b(1);
		cp.a(a, b);
	}
}
