// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.File;
import java.io.FileInputStream;

// Referenced classes of package net.youmi.android:
//			gu, ee, dd

class el extends gu
{

	private ee i;

	el(dd dd)
	{
		super(dd);
	}

	ee i()
	{
		return i;
	}

	protected boolean a(byte abyte0[])
	{
		try
		{
			i = new ee(abyte0);
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
			i = new ee(new FileInputStream(file));
		}
		catch (Exception exception)
		{
			return false;
		}
		return true;
	}
}
