// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class bl
{

	static final Pattern a = Pattern.compile("filename=\"(.*?)\"");
	static final Pattern b = Pattern.compile("filename='(.*?)'");

	static String a(String s)
	{
		if (s == null)
			return null;
		Matcher matcher = a.matcher(s);
		if (matcher.find())
			return matcher.group(matcher.groupCount());
		Matcher matcher1 = b.matcher(s);
label0:
		{
			if (matcher1.find())
				return matcher1.group(matcher1.groupCount());
			break label0;
		}
		Exception exception;
		exception;
		return null;
	}

	static String b(String s)
	{
		if (s == null)
			return null;
		String s1;
		int i;
		Uri uri = Uri.parse(s);
		if (uri == null)
			break MISSING_BLOCK_LABEL_41;
		s1 = uri.getPath();
		i = s1.lastIndexOf('/');
		if (i > -1)
			return s1.substring(i + 1);
		break MISSING_BLOCK_LABEL_41;
		Exception exception;
		exception;
		return null;
	}

	static String c(String s)
	{
		if (s == null)
			return null;
		Matcher matcher;
		Pattern pattern = Pattern.compile("<meta.*content.*text/html;.*charset=(.*?)\"|'.*/>", 2);
		matcher = pattern.matcher(s);
label0:
		{
			if (matcher.find())
				return matcher.group(matcher.groupCount());
			break label0;
		}
		Exception exception;
		exception;
		return null;
	}

}
