// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import org.json.JSONObject;

// Referenced classes of package net.youmi.android:
//			fk, eu, gz

class fg extends fk
{

	fg()
	{
	}

	protected JSONObject a(eu eu1)
	{
		if (eu1 != null)
			break MISSING_BLOCK_LABEL_14;
		gz.c("metas = null");
		return a(3);
		byte byte0;
		byte0 = 3;
		if (eu1.b())
		{
			gz.c("reloadPage");
			byte0 = 0;
		}
		gz.c((new StringBuilder("code:")).append(byte0).toString());
		return a(byte0);
		Throwable throwable;
		throwable;
		return null;
	}
}
