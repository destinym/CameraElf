// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package net.youmi.android:
//			cf, gz, hb

class ce
{

	String a;
	String b;
	String c;
	String d;
	cf e;
	cf f;
	cf g;
	int h;
	int i;
	String j;

	public void a(String s)
	{
		a = s;
	}

	public void b(String s)
	{
		c = s;
	}

	public void c(String s)
	{
		d = s;
	}

	public void d(String s)
	{
		j = s;
	}

	public void a(int k)
	{
		i = k;
	}

	public void b(int k)
	{
		h = k;
	}

	public JSONObject a()
	{
		JSONObject jsonobject = new JSONObject();
		try
		{
			jsonobject.put("adid", a);
			jsonobject.put("srcFileName", b);
			jsonobject.put("srcHttpUrl", c);
			jsonobject.put("destHttpUrl", d);
			if (e != null)
			{
				JSONObject jsonobject1 = new JSONObject();
				jsonobject1.put("packName", e.a);
				jsonobject1.put("versionName", e.b);
				jsonobject1.put("versionCode", e.c);
				jsonobject.put("oldInstall", jsonobject1);
			}
			if (f != null)
			{
				JSONObject jsonobject2 = new JSONObject();
				jsonobject2.put("packName", f.a);
				jsonobject2.put("versionName", f.b);
				jsonobject2.put("versionCode", f.c);
				jsonobject.put("toInstall", jsonobject2);
			}
			if (g != null)
			{
				JSONObject jsonobject3 = new JSONObject();
				jsonobject3.put("packName", g.a);
				jsonobject3.put("versionName", g.b);
				jsonobject3.put("versionCode", g.c);
				jsonobject.put("newInstall", jsonobject3);
			}
			jsonobject.put("clkSrc", i);
			jsonobject.put("srcId", h);
		}
		catch (JSONException jsonexception)
		{
			gz.a(jsonexception);
		}
		return jsonobject;
	}

	public ce()
	{
		h = 0;
		i = 0;
		j = "";
	}

	public ce(JSONObject jsonobject)
	{
		h = 0;
		i = 0;
		j = "";
		a = hb.a(jsonobject, "adid", "");
		b = hb.a(jsonobject, "srcFileName", "");
		c = hb.a(jsonobject, "srcHttpUrl", "");
		d = hb.a(jsonobject, "destHttpUrl", "");
		h = hb.a(jsonobject, "srcId", 0);
		i = hb.a(jsonobject, "clkSrc", 0);
		j = hb.a(jsonobject, "rsd", "");
		JSONObject jsonobject1 = hb.a(jsonobject, "oldInstall", null);
		if (jsonobject1 != null)
		{
			e = new cf();
			e.a = hb.a(jsonobject1, "packName", "");
			e.c = hb.a(jsonobject1, "versionCode", 0);
			e.b = hb.a(jsonobject1, "versionName", "1");
		}
		JSONObject jsonobject2 = hb.a(jsonobject, "toInstall", null);
		if (jsonobject2 != null)
		{
			f = new cf();
			f.a = hb.a(jsonobject2, "packName", "");
			f.c = hb.a(jsonobject2, "versionCode", 0);
			f.b = hb.a(jsonobject2, "versionName", "1");
		}
		JSONObject jsonobject3 = hb.a(jsonobject, "newInstall", null);
		if (jsonobject3 != null)
		{
			g = new cf();
			g.a = hb.a(jsonobject3, "packName", "");
			g.c = hb.a(jsonobject3, "versionCode", 0);
			g.b = hb.a(jsonobject3, "versionName", "1");
		}
	}
}
