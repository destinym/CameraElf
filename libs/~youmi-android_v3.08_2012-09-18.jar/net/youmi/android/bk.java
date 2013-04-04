// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.*;

class bk
{

	static boolean a(File file, File file1)
	{
		FileOutputStream fileoutputstream;
		Object obj = null;
		fileoutputstream = null;
		FileInputStream fileinputstream;
		if (!file.exists())
			break MISSING_BLOCK_LABEL_166;
		fileinputstream = new FileInputStream(file);
		try
		{
			fileoutputstream = new FileOutputStream(file1);
			int i = 0;
			byte abyte0[] = new byte[1024];
			try
			{
				while ((i = fileinputstream.read(abyte0)) > 0) 
					fileoutputstream.write(abyte0, 0, i);
			}
			catch (Exception exception2) { }
		}
		catch (Exception exception)
		{
			try
			{
				if (fileoutputstream != null)
					fileoutputstream.close();
			}
			catch (Exception exception4) { }
			try
			{
				if (fileinputstream != null)
					fileinputstream.close();
			}
			catch (Exception exception5) { }
			break MISSING_BLOCK_LABEL_159;
		}
		break MISSING_BLOCK_LABEL_133;
		Exception exception3;
		exception3;
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Exception exception6) { }
		try
		{
			if (fileinputstream != null)
				fileinputstream.close();
		}
		catch (Exception exception7) { }
		throw exception3;
		try
		{
			if (fileoutputstream != null)
				fileoutputstream.close();
		}
		catch (Exception exception8) { }
		try
		{
			if (fileinputstream != null)
				fileinputstream.close();
		}
		catch (Exception exception9) { }
		return file1.exists();
		Exception exception1;
		exception1;
		return false;
	}
}
