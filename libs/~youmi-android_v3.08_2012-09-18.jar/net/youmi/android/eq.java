// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.view.*;

// Referenced classes of package net.youmi.android:
//			eo

class eq
	implements android.view.View.OnTouchListener
{

	final eo a;

	eq(eo eo1)
	{
		a = eo1;
		super();
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		return a.b.onTouchEvent(motionevent);
	}
}
