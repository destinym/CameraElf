// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import org.json.JSONObject;

// Referenced classes of package net.youmi.android:
//			fk, ai, eu

class fh extends fk
{

	fh()
	{
	}

	protected JSONObject a(eu eu1)
	{
		if (eu1 == null)
			return a(3);
		Context context = eu1.a();
		if (context == null)
			return a(3);
		JSONObject jsonobject;
		jsonobject = a(0);
		JSONObject jsonobject1 = new JSONObject();
		jsonobject1.put("a", ai.e());
		jsonobject.put("d", jsonobject1);
		return jsonobject;
		Throwable throwable;
		throwable;
		return null;
	}
}
