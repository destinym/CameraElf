// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.view.View;
import android.widget.Gallery;

// Referenced classes of package net.youmi.android:
//			eo

class er
	implements android.view.View.OnClickListener
{

	final eo a;

	er(eo eo1)
	{
		a = eo1;
		super();
	}

	public void onClick(View view)
	{
		try
		{
			if (eo.e(a) != null)
				if (eo.e(a).getVisibility() == 0)
					eo.e(a).setVisibility(4);
				else
					eo.e(a).setVisibility(0);
		}
		catch (Exception exception) { }
	}
}
