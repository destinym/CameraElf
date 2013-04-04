// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageSwitcher;

// Referenced classes of package net.youmi.android:
//			ec, ed, eo

class ep
	implements android.widget.AdapterView.OnItemClickListener
{

	final eo a;

	ep(eo eo1)
	{
		a = eo1;
		super();
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		try
		{
			ed ed1 = eo.a(a).a(i);
			if (ed1 != null && eo.b(a) != ed1)
			{
				eo.c(a);
				eo.d(a).setImageURI(ed1.b);
				eo.a(a, ed1);
			}
		}
		catch (Exception exception) { }
	}
}
