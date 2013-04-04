// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import org.json.JSONArray;
import org.json.JSONObject;

class hb
{

	protected static JSONObject a(String s)
	{
		if (s == null)
			return null;
		return new JSONObject(s);
		Throwable throwable;
		throwable;
		return null;
	}

	protected static String a(JSONObject jsonobject, String s, String s1)
	{
		String s2;
		if (jsonobject == null || jsonobject.isNull(s))
			break MISSING_BLOCK_LABEL_37;
		s2 = jsonobject.getString(s);
		if (s2 == null)
			break MISSING_BLOCK_LABEL_37;
		s2 = s2.trim();
		if (s2.length() > 0)
			return s2;
		break MISSING_BLOCK_LABEL_37;
		Throwable throwable;
		throwable;
		return s1;
	}

	protected static int a(JSONObject jsonobject, String s, int i)
	{
label0:
		{
			if (jsonobject != null && !jsonobject.isNull(s))
				return jsonobject.getInt(s);
			break label0;
		}
		Throwable throwable;
		throwable;
		return i;
	}

	protected static long a(JSONObject jsonobject, String s, long l)
	{
		if (jsonobject != null && !jsonobject.isNull(s))
			return jsonobject.getLong(s);
		break MISSING_BLOCK_LABEL_20;
		Throwable throwable;
		throwable;
		return l;
	}

	protected static JSONObject a(JSONObject jsonobject, String s, JSONObject jsonobject1)
	{
label0:
		{
			if (jsonobject != null && !jsonobject.isNull(s))
				return jsonobject.getJSONObject(s);
			break label0;
		}
		Throwable throwable;
		throwable;
		return jsonobject1;
	}

	protected static JSONObject a(JSONArray jsonarray, int i, JSONObject jsonobject)
	{
label0:
		{
			if (jsonarray != null && jsonarray.length() > i && i > -1)
				return jsonarray.getJSONObject(i);
			break label0;
		}
		Throwable throwable;
		throwable;
		return jsonobject;
	}

	protected static JSONArray a(JSONObject jsonobject, String s, JSONArray jsonarray)
	{
label0:
		{
			if (jsonobject != null && !jsonobject.isNull(s))
				return jsonobject.getJSONArray(s);
			break label0;
		}
		Throwable throwable;
		throwable;
		return jsonarray;
	}
}
