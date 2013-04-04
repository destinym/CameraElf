// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import org.json.JSONObject;

// Referenced classes of package net.youmi.android:
//			ff, ei, eu, hb

abstract class fl extends ff
{

	fl()
	{
	}

	public String a(eu eu1, String s)
	{
		if (s == null)
			return b(2);
		JSONObject jsonobject = hb.a(s);
		if (jsonobject == null)
			return b(2);
		String s1 = hb.a(jsonobject, "b", null);
		if (s1 == null)
			return b(1);
		if (!s1.equals(ei.a()))
			return b(1);
		JSONObject jsonobject1 = hb.a(jsonobject, "a", null);
		if (jsonobject1 == null)
			return b(2);
		return a(a(eu1, jsonobject1));
		Throwable throwable;
		throwable;
		return ff.b(3);
	}

	protected abstract JSONObject a(eu eu1, JSONObject jsonobject);
}
