// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.webkit.WebView;
import java.io.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package net.youmi.android:
//			ag, bf, bk, dd, 
//			gz, hx

class bh
{

	static final Pattern a[] = {
		Pattern.compile("background:url\\((.+?)\\)", 2), Pattern.compile("<img.*?src.*?=['\"](.+?)['\"]", 2), Pattern.compile("<input.*?type=['\"]image['\"].*?src.*?=['\"](.+?)['\"]")
	};
	static final String b[] = {
		"image/gif", "image/png", "image/jpeg"
	};
	static final String c[] = {
		"url", "filepath"
	};

	static ArrayList a(String s)
	{
		int i = 0;
		ArrayList arraylist = null;
		for (int j = 0; j < a.length; j++)
			try
			{
				Pattern pattern = a[j];
				Matcher matcher = pattern.matcher(s);
				if (matcher != null)
					while (matcher.find()) 
					{
						if (arraylist == null)
							arraylist = new ArrayList(50);
						try
						{
							String s1 = matcher.group(matcher.groupCount());
							arraylist.add(s1);
						}
						catch (Exception exception1)
						{
							gz.a(exception1);
						}
						if (++i > 300)
							break;
					}
			}
			catch (Exception exception)
			{
				gz.a(exception);
			}

		return arraylist;
	}

	static String a(String s, String s1)
	{
		if (!hx.a())
			return s1;
		try
		{
			ArrayList arraylist = a(s1);
			if (arraylist != null && arraylist.size() > 0)
			{
				URI uri = new URI(s);
				for (int i = 0; i < arraylist.size(); i++)
					try
					{
						String s2 = (String)arraylist.get(i);
						if (s2 != null)
						{
							URI uri1 = uri.resolve(s2);
							if (uri1 != null)
							{
								String s3 = uri1.toString();
								if (bf.f().e(s3))
								{
									String s4 = (new StringBuilder("file://")).append(bf.f().c(s3)).toString();
									s1 = s1.replace(s2, s4);
								}
							}
						}
					}
					catch (Exception exception1)
					{
						gz.a(exception1);
					}

			}
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
		return s1;
	}

	static String a(Context context, String s, String s1, String s2, String s3)
	{
		if (s1 == null)
			return s;
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder(s.length() + 256);
		stringbuilder.append(s);
		stringbuilder.append("<script type=\"text/javascript\" src=\"");
		stringbuilder.append(s1);
		stringbuilder.append("\"></script>");
		stringbuilder.append("<script type=\"text/javascript\">");
		stringbuilder.append("_youmi_click_.init(\"");
		stringbuilder.append(s2);
		stringbuilder.append("\",3,\"");
		stringbuilder.append(ag.a(context));
		stringbuilder.append("\",\"");
		stringbuilder.append(s3);
		stringbuilder.append("\")");
		stringbuilder.append("</script>");
		return stringbuilder.toString();
		Exception exception;
		exception;
		gz.a(exception);
		return s;
	}

	static void a(Activity activity, WebView webview)
	{
		File file;
		SQLiteDatabase sqlitedatabase;
		Cursor cursor;
		if (!hx.a(activity))
			return;
		file = null;
		sqlitedatabase = null;
		cursor = null;
		String s1;
		File file1 = activity.getDatabasePath("webviewCache.db");
		String s = (new StringBuilder(String.valueOf(System.currentTimeMillis()))).append(".db").toString();
		if (file1.canRead())
		{
			FileInputStream fileinputstream = new FileInputStream(file1);
			FileOutputStream fileoutputstream = activity.openFileOutput(s, 0);
			int j = 0;
			byte abyte0[] = new byte[1024];
			while ((j = fileinputstream.read(abyte0)) > 0) 
				fileoutputstream.write(abyte0, 0, j);
			try
			{
				fileinputstream.close();
			}
			catch (Exception exception2)
			{
				gz.a(exception2);
			}
			try
			{
				fileoutputstream.close();
			}
			catch (Exception exception3)
			{
				gz.a(exception3);
			}
		}
		s1 = (new StringBuilder(String.valueOf(activity.getCacheDir().getPath()))).append("/webviewCache/").toString();
		file = activity.getFileStreamPath(s);
		sqlitedatabase = SQLiteDatabase.openDatabase(file.getPath(), null, 1);
		cursor = sqlitedatabase.query("cache", c, "mimetype in (?,?,?)", b, null, null, null);
		if (cursor == null)
			break MISSING_BLOCK_LABEL_671;
		int i = cursor.getCount();
		if (i > 0)
			break MISSING_BLOCK_LABEL_306;
		try
		{
			cursor.close();
		}
		catch (Exception exception1)
		{
			gz.a(exception1);
		}
		try
		{
			if (file != null && file.exists())
				file.delete();
		}
		catch (Exception exception7)
		{
			gz.a(exception7);
		}
		try
		{
			if (cursor != null)
				cursor.close();
		}
		catch (Exception exception8)
		{
			gz.a(exception8);
		}
		try
		{
			if (sqlitedatabase != null)
				sqlitedatabase.close();
		}
		catch (Exception exception9)
		{
			gz.a(exception9);
		}
		return;
		int k;
		int l;
		k = cursor.getColumnIndex("url");
		l = cursor.getColumnIndex("filepath");
		  goto _L1
_L3:
		String s2 = cursor.getString(k);
		if (s2 == null)
			continue; /* Loop/switch isn't completed */
		s2 = s2.trim();
		if (s2.indexOf("http://") != 0 && s2.indexOf("https://") != 0)
			continue; /* Loop/switch isn't completed */
		File file2 = bf.f().d(s2);
		if (file2.exists())
			continue; /* Loop/switch isn't completed */
		String s3 = cursor.getString(l);
		if (s3 != null)
			try
			{
				s3 = s3.trim();
				String s4 = (new StringBuilder(String.valueOf(s1))).append(s3).toString();
				File file3 = new File(s4);
				if (file3.exists())
					bk.a(file3, file2);
			}
			catch (Exception exception4)
			{
				gz.a(exception4);
			}
_L1:
		if (cursor.moveToNext()) goto _L3; else goto _L2
_L2:
		try
		{
			if (webview != null && ag.h())
				webview.clearCache(true);
		}
		catch (Exception exception5)
		{
			gz.a(exception5);
		}
		break MISSING_BLOCK_LABEL_671;
		Exception exception;
		exception;
		gz.a(exception);
		try
		{
			if (file != null && file.exists())
				file.delete();
		}
		catch (Exception exception10)
		{
			gz.a(exception10);
		}
		try
		{
			if (cursor != null)
				cursor.close();
		}
		catch (Exception exception11)
		{
			gz.a(exception11);
		}
		try
		{
			if (sqlitedatabase != null)
				sqlitedatabase.close();
		}
		catch (Exception exception12)
		{
			gz.a(exception12);
		}
		break MISSING_BLOCK_LABEL_737;
		Exception exception6;
		exception6;
		try
		{
			if (file != null && file.exists())
				file.delete();
		}
		catch (Exception exception13)
		{
			gz.a(exception13);
		}
		try
		{
			if (cursor != null)
				cursor.close();
		}
		catch (Exception exception14)
		{
			gz.a(exception14);
		}
		try
		{
			if (sqlitedatabase != null)
				sqlitedatabase.close();
		}
		catch (Exception exception15)
		{
			gz.a(exception15);
		}
		throw exception6;
		try
		{
			if (file != null && file.exists())
				file.delete();
		}
		catch (Exception exception16)
		{
			gz.a(exception16);
		}
		try
		{
			if (cursor != null)
				cursor.close();
		}
		catch (Exception exception17)
		{
			gz.a(exception17);
		}
		try
		{
			if (sqlitedatabase != null)
				sqlitedatabase.close();
		}
		catch (Exception exception18)
		{
			gz.a(exception18);
		}
	}

}
