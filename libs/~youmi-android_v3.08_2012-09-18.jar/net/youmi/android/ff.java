// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import org.json.JSONObject;

// Referenced classes of package net.youmi.android:
//			ev

abstract class ff
	implements ev
{

	ff()
	{
	}

	static String a(JSONObject jsonobject)
	{
		String s;
		if (jsonobject == null)
			break MISSING_BLOCK_LABEL_12;
		s = jsonobject.toString();
		return s;
		Throwable throwable;
		throwable;
		return b(3);
	}

	public static JSONObject a(int i)
	{
		JSONObject jsonobject;
		jsonobject = new JSONObject();
		jsonobject.put("c", i);
		return jsonobject;
		Throwable throwable;
		throwable;
		return null;
	}

	public static String b(int i)
	{
		String s;
		JSONObject jsonobject = a(i);
		if (jsonobject == null)
			break MISSING_BLOCK_LABEL_17;
		s = jsonobject.toString();
		return s;
		Throwable throwable;
		throwable;
		return "";
	}
}
