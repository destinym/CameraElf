// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import java.util.Hashtable;
import org.json.JSONObject;

// Referenced classes of package net.youmi.android:
//			fl, a, cp, cz, 
//			eu, fj, fv, fw, 
//			fx, fz, ga, gb, 
//			gz, hb

class fi extends fl
{

	fi()
	{
	}

	protected JSONObject a(eu eu1, JSONObject jsonobject)
	{
		if (eu1 == null)
			return null;
		Context context = eu1.a();
		if (context == null)
			return null;
		JSONObject jsonobject1 = hb.a(jsonobject, "b", null);
		if (jsonobject1 == null)
			return a(2);
		String s;
		int i;
		String s1;
		s = null;
		i = 0;
		s1 = null;
		JSONObject jsonobject2 = hb.a(jsonobject, "a", null);
		if (jsonobject2 != null)
		{
			s = hb.a(jsonobject2, "a", null);
			i = hb.a(jsonobject2, "b", 0);
			s1 = hb.a(jsonobject2, "c", null);
		}
		if (s != null && s1 == null)
			return a(2);
		int j = hb.a(jsonobject1, "a", -1);
		if (j <= 0)
			return a(2);
		int k;
		String s2;
		k = hb.a(jsonobject1, "b", 0);
		s2 = hb.a(jsonobject1, "c", null);
		if (s2 == null)
			return a(2);
		String s3 = hb.a(jsonobject1, "d", null);
		if (s3 == null)
			return a(2);
		int l;
		boolean flag;
		String s4;
		if (a.b != null)
		{
			cz cz1 = (cz)a.b.get(s3);
			if (cz1 != null)
			{
				cz1.c(2);
				cz1.d(1);
				cz1.e(cz1.Y());
				cz1.a(5);
				cp.a(context, cz1, false);
				gz.c("·¢ËÍµã»÷¼ÇÂ¼£¡");
			}
		}
		l = hb.a(jsonobject1, "e", 0);
		flag = hb.a(jsonobject1, "f", 1) == 1;
		s4 = hb.a(jsonobject1, "g", null);
		if (s4 == null)
			return a(2);
		String s5 = hb.a(jsonobject1, "h", null);
		if (s5 == null)
			return a(2);
		gb gb1;
		String s6 = hb.a(jsonobject1, "i", null);
		int i1 = hb.a(jsonobject1, "j", 0);
		String s7 = hb.a(jsonobject1, "k", "");
		fv fv1 = new fv();
		ga ga1 = new ga();
		ga1.a(s2);
		ga1.b(s3);
		fv1.a(ga1);
		fx fx1 = new fx();
		fx1.a(s4);
		fx1.b(s5);
		fx1.a(i1);
		fx1.a(l);
		fv1.a(fx1);
		fz fz1 = new fz();
		fz1.a(flag);
		fv1.a(fz1);
		fz1.a(context, s3);
		fw fw1 = new fw();
		fw1.a(j);
		fw1.b(k);
		fw1.c(1);
		fw1.b(s7);
		fv1.a(fw1);
		fv1.a(j);
		fv1.b(k);
		if (!fz1.b() && fz1.a())
			fw1.a(s6);
		gb1 = new gb(fv1, true, 0);
		gb1.a(s, i, s1);
		if (eu1.a(new fj(this, context, gb1)))
			return a(0);
		return a(3);
		Throwable throwable;
		throwable;
		return null;
	}
}
