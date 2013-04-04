// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;

// Referenced classes of package net.youmi.android:
//			gu, dd

class ek extends gu
{

	private Bitmap i;

	ek(dd dd)
	{
		super(dd);
	}

	Bitmap i()
	{
		return i;
	}

	protected boolean a(byte abyte0[])
	{
		try
		{
			i = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
		}
		catch (Exception exception)
		{
			return false;
		}
		return true;
	}

	protected boolean a(File file)
	{
		try
		{
			i = BitmapFactory.decodeFile(file.getPath());
		}
		catch (Exception exception)
		{
			return false;
		}
		return true;
	}
}
