// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.DialogInterface;

// Referenced classes of package net.youmi.android:
//			ci

class cj
	implements android.content.DialogInterface.OnClickListener
{

	final ci a;

	cj(ci ci)
	{
		a = ci;
		super();
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface.cancel();
	}
}
