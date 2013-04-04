// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.File;

// Referenced classes of package net.youmi.android:
//			AdActivity, ed, eo

class es
	implements android.view.View.OnClickListener
{

	final eo a;

	es(eo eo1)
	{
		a = eo1;
		super();
	}

	public void onClick(View view)
	{
		if (eo.b(a) == null)
			return;
		File file;
		file = new File(eo.b(a).a);
		if (!file.exists())
			return;
		try
		{
			try
			{
				Intent intent = new Intent("android.intent.action.SEND");
				intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
				if (eo.b(a).d != null)
					intent.setType(eo.b(a).d);
				else
					intent.setType("image/jpeg");
				if (eo.f(a) != null)
				{
					intent.putExtra("android.intent.extra.SUBJECT", eo.f(a));
					if (eo.g(a) != null)
						intent.putExtra("android.intent.extra.TEXT", (new StringBuilder(String.valueOf(eo.f(a)))).append(" ").append(eo.g(a)).toString());
					else
						intent.putExtra("android.intent.extra.TEXT", eo.f(a));
				}
				a.a.startActivity(Intent.createChooser(intent, "∑÷œÌÕº∆¨"));
			}
			catch (Exception exception) { }
		}
		catch (Exception exception1) { }
		return;
	}
}
