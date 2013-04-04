// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.view.View;

// Referenced classes of package net.youmi.android:
//			g, n

class l
	implements android.view.View.OnClickListener
{

	final g a;

	l(g g1)
	{
		a = g1;
		super();
	}

	public void onClick(View view)
	{
		if (a.g != null)
			a.g.h();
	}
}
