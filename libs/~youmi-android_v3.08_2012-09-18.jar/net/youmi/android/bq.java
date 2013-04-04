// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.io.*;
import java.util.Properties;

class bq
{

	static Properties a(Context context, String s)
	{
		Properties properties = new Properties();
		try
		{
			FileInputStream fileinputstream = context.openFileInput(s);
			if (fileinputstream != null)
				properties.load(fileinputstream);
			try
			{
				fileinputstream.close();
			}
			catch (Exception exception1) { }
		}
		catch (Exception exception) { }
		return properties;
	}

	static boolean a(Context context, Properties properties, String s)
	{
		java.io.FileOutputStream fileoutputstream = context.openFileOutput(s, 0);
		if (fileoutputstream == null)
			break MISSING_BLOCK_LABEL_29;
		properties.store(fileoutputstream, null);
		try
		{
			fileoutputstream.close();
		}
		catch (Exception exception1) { }
		return true;
		Exception exception;
		exception;
		return false;
	}

	static String a(Properties properties, String s, String s1)
	{
		return properties.getProperty(s);
		Exception exception;
		exception;
		return s1;
	}

	static int a(Properties properties, String s, int i)
	{
		String s1 = a(properties, s, ((String) (null)));
		if (s1 == null)
			return i;
		return Integer.parseInt(s1);
		Exception exception;
		exception;
		return i;
	}
}
