// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import org.apache.http.HttpResponse;

// Referenced classes of package net.youmi.android:
//			gd, bl

class gf extends gd
{

	protected String l;
	protected ByteArrayOutputStream m;

	public gf(Context context, String s)
	{
		super(context, s);
	}

	String c()
	{
		return l;
	}

	protected boolean a(HttpResponse httpresponse)
	{
		return true;
	}

	protected boolean a()
	{
		m = new ByteArrayOutputStream(4096);
		i = m;
		return true;
	}

	protected boolean b()
	{
		if (m == null)
			break MISSING_BLOCK_LABEL_130;
		if (d == null)
		{
			byte abyte0[] = m.toByteArray();
			l = new String(abyte0, "utf-8");
			if (l != null)
				d = bl.c(l);
			if (d != null)
			{
				d = d.trim().toLowerCase();
				if (!d.equals("utf-8"))
					l = new String(abyte0, d);
			}
		} else
		{
			l = new String(m.toByteArray(), d);
		}
		return true;
		try
		{
			k = 2;
		}
		catch (Exception exception)
		{
			k = 2;
		}
		return false;
	}
}
