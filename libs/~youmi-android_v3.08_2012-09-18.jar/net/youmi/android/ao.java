// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package net.youmi.android:
//			ag, ah, ai, aj, 
//			ap, aq, as, av, 
//			aw, az, bj, bs, 
//			cg, cl, cp, cz, 
//			dg, dj, dm, em, 
//			ft, gf, gz, hb, 
//			hc

class ao
{

	static cz a(Context context, String s, long l, long l1)
	{
		int i;
		cz cz1;
		JSONObject jsonobject = new JSONObject(s);
		if (jsonobject == null)
			break MISSING_BLOCK_LABEL_1014;
		try
		{
			String s1 = hb.a(jsonobject, "ping", null);
			if (s1 != null && !"".equals(s1))
				a((Activity)context, s1);
		}
		catch (Exception exception1) { }
		i = hb.a(jsonobject, "c", -999);
		if (i < 0)
			break MISSING_BLOCK_LABEL_970;
		String s2 = hb.a(jsonobject, "rsd", null);
		if (s2 == null)
			break MISSING_BLOCK_LABEL_1006;
		int j = hb.a(jsonobject, "rt", 30);
		aj.a(j);
		String s3 = hb.a(jsonobject, "cc", null);
		JSONObject jsonobject1 = hb.a(jsonobject, "d", null);
		if (jsonobject1 == null)
			break MISSING_BLOCK_LABEL_1006;
		String s4 = hb.a(jsonobject1, "id", null);
		if (s4 == null)
			break MISSING_BLOCK_LABEL_964;
		int k = hb.a(jsonobject1, "t", -1);
		if (k <= -1)
			break MISSING_BLOCK_LABEL_964;
		int i1 = hb.a(jsonobject1, "ot", -1);
		boolean flag = hb.a(jsonobject1, "bo", 0) == 1;
		if (i1 <= -1)
			break MISSING_BLOCK_LABEL_964;
		String s5 = hb.a(jsonobject1, "e", null);
		if (s5 == null)
			break MISSING_BLOCK_LABEL_964;
		JSONObject jsonobject2 = hb.a(jsonobject1, "src", null);
		if (jsonobject2 == null)
			break MISSING_BLOCK_LABEL_964;
		String s6 = hb.a(jsonobject2, "iu", null);
		String s7 = hb.a(jsonobject2, "mu", null);
		String s8 = hb.a(jsonobject2, "cu", null);
		String s9 = hb.a(jsonobject2, "st", null);
		String s10 = hb.a(jsonobject2, "su", null);
		String s11 = null;
		String s12 = null;
		JSONObject jsonobject3 = hb.a(jsonobject2, "text", null);
		if (jsonobject3 != null)
		{
			s11 = hb.a(jsonobject3, "tt", null);
			s12 = hb.a(jsonobject3, "st", null);
		}
		JSONObject jsonobject4 = hb.a(jsonobject1, "dest", null);
		if (jsonobject4 == null)
			break MISSING_BLOCK_LABEL_961;
		String s13 = hb.a(jsonobject4, "js", null);
		if (s13 != null)
		{
			s13 = s13.trim();
			if (s13.length() > 0)
				cp.a(s13);
		}
		String s14 = hb.a(jsonobject4, "tu", null);
		if (s14 == null)
			break MISSING_BLOCK_LABEL_958;
		JSONArray jsonarray = hb.a(jsonobject4, "imgs", null);
		ArrayList arraylist = null;
		if (jsonarray != null)
		{
			if (jsonarray.length() > 0)
				try
				{
					for (int j1 = 0; j1 < jsonarray.length(); j1++)
					{
						if (arraylist == null)
							arraylist = new ArrayList(jsonarray.length());
						arraylist.add(jsonarray.getString(j1));
					}

				}
				catch (Exception exception2) { }
			jsonarray = null;
		}
		int k1 = hb.a(jsonobject4, "ic", 0);
		boolean flag1 = k1 > 0;
		int i2 = hb.a(jsonobject2, "il", 1);
		boolean flag2 = i2 != 0;
		String s15 = "";
		int j2 = 0;
		boolean flag3 = false;
		boolean flag4 = false;
		String s16 = "";
		int k2 = 0;
		String s17 = "";
		String s18 = "";
		long l2 = 0L;
		JSONObject jsonobject5 = hb.a(jsonobject4, "oa", null);
		if (jsonobject5 != null)
		{
			s15 = hb.a(jsonobject5, "pn", "");
			j2 = hb.a(jsonobject5, "vc", 0);
			flag3 = hb.a(jsonobject5, "upd", 0) == 1;
			flag4 = hb.a(jsonobject5, "st", 0) == 1;
			s16 = hb.a(jsonobject5, "uri", "");
			k2 = hb.a(jsonobject5, "flag", 0);
			s17 = hb.a(jsonobject5, "an", "");
			s18 = hb.a(jsonobject5, "md5", "");
			l2 = hb.a(jsonobject5, "size", 0L);
		}
		int i3 = 0;
		boolean flag5 = false;
		boolean flag6 = true;
		String s19 = "";
		String s20 = "";
		String s21 = "";
		String s22 = "";
		JSONObject jsonobject6 = hb.a(jsonobject4, "sc", null);
		if (jsonobject6 != null)
		{
			flag5 = hb.a(jsonobject6, "ig", 0) == 1;
			i3 = hb.a(jsonobject6, "io", 0);
			s19 = hb.a(jsonobject6, "it", "");
			s20 = hb.a(jsonobject6, "ir", "");
			s21 = hb.a(jsonobject6, "in", "");
			s22 = hb.a(jsonobject6, "iu", "");
			flag6 = hb.a(jsonobject6, "df", 0) == 0;
		}
		int j3 = 0;
		String s23 = "";
		String s24 = "";
		JSONObject jsonobject7 = hb.a(jsonobject4, "detail", null);
		if (jsonobject7 != null)
		{
			j3 = hb.a(jsonobject7, "type", 0);
			s23 = hb.a(jsonobject7, "dhl", "");
			s24 = hb.a(jsonobject7, "djs", "");
		}
		boolean flag7 = cp.a() != null;
		cz1 = cz.a(context, flag7, s4, s2, s5, k, i1, s3, s11, s12, s6, s7, s8, s9, s10, s14, arraylist, flag1, flag2, s13, l, l1, s15, j2, flag3, flag4, s16, k2, flag, flag5, i3, s19, s20, s21, s22, flag6, s17, s18, l2, j3, s23, s24);
		return cz1;
		Object obj3 = null;
		Object obj2 = null;
		Object obj1 = null;
		break MISSING_BLOCK_LABEL_1006;
		if (i == -999)
			gz.b("Unable to connect to the server, please check your network configuration!");
		else
			gz.b((new StringBuilder("Request Ad Error Code : ")).append(i).toString());
		Object obj = null;
		break MISSING_BLOCK_LABEL_1014;
		Exception exception;
		exception;
		return null;
	}

	static cz a(Activity activity, dm dm1)
	{
		long l;
		long l1;
		String s;
		l = System.currentTimeMillis();
		l1 = l / 1000L;
		s = aq.a(activity, dm1, l1);
		if (s == null)
			return null;
		cz cz1;
		String s1 = (new ft(activity)).b(s);
		if (s1 == null)
			break MISSING_BLOCK_LABEL_87;
		long l2 = 0L;
		try
		{
			long l3 = System.currentTimeMillis();
			l2 = l / 1000L;
		}
		catch (Exception exception1) { }
		cz1 = a(((Context) (activity)), s1, l1, l2);
		return cz1;
		Exception exception;
		exception;
		gz.a(exception);
		gz.b("Unable to connect to the server, please check your network configuration!");
		return null;
	}

	static void a(Context context, long l)
	{
		if (!ag.b(context))
			return;
		try
		{
			String s = aq.a(context, l);
			ft ft1 = new ft(context);
			String s1 = ft1.b(s);
			if (s1 != null)
				try
				{
					JSONObject jsonobject = hb.a(s1);
					if (jsonobject != null)
					{
						String s2 = hb.a(jsonobject, "ping", null);
						if (s2 != null && !"".equals(s2))
							a((Activity)context, s2);
					}
				}
				catch (Throwable throwable1)
				{
					gz.c("解析结果出错");
				}
		}
		catch (Throwable throwable) { }
		return;
	}

	static void a(Context context, cz cz1)
	{
		if (!ag.b(context))
			return;
		if (cz1 == null)
			return;
		if (cz1.t())
			return;
		String s;
		s = aq.a(context, cz1);
		if (s == null)
			return;
		try
		{
			ft ft1 = new ft(context);
			String s1 = ft1.b(s);
			if (s1 != null)
				try
				{
					JSONObject jsonobject = hb.a(s1);
					if (jsonobject != null)
					{
						String s2 = hb.a(jsonobject, "ping", null);
						if (s2 != null && !"".equals(s2))
							a((Activity)context, s2);
					}
				}
				catch (Exception exception1)
				{
					gz.c("解析结果出错");
				}
		}
		catch (Exception exception) { }
		cz1.w();
		return;
	}

	static void a(Context context, long l, String s, String s1, long l1, long l2, long l3, int i, int j, int k, int i1)
	{
		if (!ag.b(context))
			return;
		String s2;
		s2 = aq.a(context, l, s, s1, l1, l2, l3, i, j, k, i1);
		if (s2 == null)
			return;
		try
		{
			em em1 = new em();
			if (em1.a(context, s2) == 6)
			{
				String s3 = em1.i();
				try
				{
					JSONObject jsonobject = hb.a(s3);
					if (jsonobject != null)
					{
						String s4 = hb.a(jsonobject, "ping", null);
						if (s4 != null && !"".equals(s4))
							a((Activity)context, s4);
					}
				}
				catch (Exception exception)
				{
					gz.c("解析ping出错");
				}
			}
		}
		catch (Throwable throwable) { }
		return;
	}

	static void a(Context context, String s, String s1, int i)
	{
		if (!ag.b(context))
			return;
		String s2;
		s2 = aq.a(context, s, s1, i);
		if (s2 == null)
			return;
		try
		{
			em em1 = new em();
			if (em1.a(context, s2) == 6)
			{
				String s3 = em1.i();
				try
				{
					JSONObject jsonobject = hb.a(s3);
					if (jsonobject != null)
					{
						String s4 = hb.a(jsonobject, "ping", null);
						if (s4 != null && !"".equals(s4))
							a((Activity)context, s4);
					}
				}
				catch (Exception exception1)
				{
					gz.c("解析ping出错");
				}
			}
		}
		catch (Exception exception) { }
		return;
	}

	static void a(Context context, dm dm1, cz cz1)
	{
		if (!ag.b(context))
			return;
		if (cz1 == null)
			return;
		if (cz1.q())
			return;
		if (ah.f(context))
			return;
		if (cz1.l() == null)
			return;
		cg cg1 = az.a;
		if (cg1.b() && cz1.l().equals("00000000"))
		{
			try
			{
				cz1.r();
			}
			catch (Exception exception4) { }
			return;
		}
		try
		{
			String s = cz1.l();
			StringBuilder stringbuilder = bs.a(s, 32);
			if (stringbuilder != null)
			{
				long l = System.currentTimeMillis() / 1000L;
				StringBuffer stringbuffer = new StringBuffer(512);
				String s1 = dj.a(4);
				stringbuffer.append(av.e());
				stringbuffer.append("00000");
				stringbuffer.append(ai.b());
				stringbuffer.append(ag.a(context));
				stringbuffer.append(s1);
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
				if (stringbuilder.charAt(31) == '1')
					bj.a(ag.d(context), 2, bytearrayoutputstream);
				if (stringbuilder.charAt(30) == '1')
					bj.a(ag.e(context), 1, bytearrayoutputstream);
				int i = 0;
				int j = 0;
				if (cg1 != null)
				{
					if (!cg1.b())
					{
						if (stringbuilder.charAt(29) == '0')
							stringbuilder = stringbuilder.replace(29, 30, "1");
						if (stringbuilder.charAt(28) == '0')
							stringbuilder = stringbuilder.replace(28, 29, "1");
						cg1.a();
					}
					i = cg1.a;
					j = cg1.b;
				}
				if (stringbuilder.charAt(29) == '1')
					bj.a(i, 4, bytearrayoutputstream);
				if (stringbuilder.charAt(28) == '1')
					bj.a(j - i, 2, bytearrayoutputstream);
				if (stringbuilder.charAt(27) == '1')
					bj.a(l, 4, bytearrayoutputstream);
				if (stringbuilder.charAt(26) == '1')
					bj.a(dm1.k(), 2, bytearrayoutputstream);
				if (stringbuilder.charAt(25) == '1')
					bj.a(ai.e(), 2, bytearrayoutputstream);
				if (stringbuilder.charAt(24) == '1')
					bj.a(dm1.j(), 2, bytearrayoutputstream);
				if (stringbuilder.charAt(23) == '1')
					bj.a(ai.c(), 1, bytearrayoutputstream);
				boolean flag = false;
				if (stringbuilder.charAt(22) == '1')
				{
					flag = true;
					bj.a(hc.a(context), bytearrayoutputstream);
				}
				dg dg1 = ah.a(context);
				if (stringbuilder.charAt(21) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					bj.a(dg1.c(), bytearrayoutputstream);
				}
				if (stringbuilder.charAt(20) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					bj.a(dg1.a(), bytearrayoutputstream);
				}
				if (stringbuilder.charAt(19) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					bj.a(ah.e(context), bytearrayoutputstream);
				}
				if (stringbuilder.charAt(18) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					bj.a(ah.b(), bytearrayoutputstream);
				}
				if (stringbuilder.charAt(17) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					bj.a(ah.d(), bytearrayoutputstream);
				}
				if (stringbuilder.charAt(16) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					bj.a(dg1.e(), bytearrayoutputstream);
				}
				Location location = as.a(context);
				if (stringbuilder.charAt(15) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					if (location != null)
						bj.a((new StringBuilder(String.valueOf(location.getLatitude()))).toString(), bytearrayoutputstream);
				}
				if (stringbuilder.charAt(14) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					if (location != null)
						bj.a((new StringBuilder(String.valueOf(location.getLongitude()))).toString(), bytearrayoutputstream);
				}
				if (stringbuilder.charAt(13) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					bj.a(ah.c(), bytearrayoutputstream);
				}
				if (stringbuilder.charAt(12) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				if (stringbuilder.charAt(11) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					bj.a(dg1.d(), bytearrayoutputstream);
				}
				if (stringbuilder.charAt(10) == '1')
				{
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
					bj.a((new StringBuilder(String.valueOf(ah.h()))).append("|").append(ah.i()).toString(), bytearrayoutputstream);
				}
				if (stringbuilder.charAt(9) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				if (stringbuilder.charAt(8) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				if (stringbuilder.charAt(7) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				if (stringbuilder.charAt(6) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				if (stringbuilder.charAt(5) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				if (stringbuilder.charAt(4) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				if (stringbuilder.charAt(3) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				if (stringbuilder.charAt(2) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				if (stringbuilder.charAt(1) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				if (stringbuilder.charAt(0) == '1')
					if (flag)
						bytearrayoutputstream.write(38);
					else
						flag = true;
				String s2 = dj.b((new StringBuilder(String.valueOf(ai.d()))).append(ag.c(context)).append(s1).toString());
				try
				{
					String s3 = dj.a(bytearrayoutputstream.toByteArray(), s2);
					stringbuffer.append(s3);
				}
				catch (Exception exception1) { }
				stringbuffer.append(',');
				stringbuffer.append(bs.a(stringbuilder, 8).toUpperCase());
				String s4 = stringbuffer.toString();
				em em1 = new em();
				char c = '\uFC19';
				if (em1.a(context, s4) == 6)
				{
					String s5 = em1.i();
					JSONObject jsonobject = hb.a(s5);
					int k;
					if (jsonobject != null)
						k = hb.a(jsonobject, "c", -999);
					try
					{
						if (jsonobject != null)
						{
							String s6 = hb.a(jsonobject, "ping", null);
							if (s6 != null && !"".equals(s6))
								a((Activity)context, s6);
						}
					}
					catch (Exception exception2)
					{
						gz.c("解析ping出错");
					}
				}
			}
		}
		catch (Exception exception)
		{
			try
			{
				cz1.r();
			}
			catch (Exception exception5) { }
			break MISSING_BLOCK_LABEL_1538;
		}
		break MISSING_BLOCK_LABEL_1529;
		Exception exception3;
		exception3;
		try
		{
			cz1.r();
		}
		catch (Exception exception6) { }
		throw exception3;
		try
		{
			cz1.r();
		}
		catch (Exception exception7) { }
	}

	static String a(Context context, int i, int j, int k, int l, int i1, String s, String s1, 
			String s2, String s3, String s4, String s5, String s6, String s7, int j1, 
			String s8, String s9, int k1)
	{
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder(512);
		String s10 = dj.a(4);
		stringbuilder.append("00000");
		stringbuilder.append(ai.b());
		stringbuilder.append(ag.a(context));
		stringbuilder.append(s10);
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
		bj.a(i, 1, bytearrayoutputstream);
		bj.a(j, 1, bytearrayoutputstream);
		bj.a(k, 4, bytearrayoutputstream);
		bj.a(l, 4, bytearrayoutputstream);
		bj.a(i1, 4, bytearrayoutputstream);
		dg dg1 = ah.a(context);
		bj.a(dg1.a(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(s == null ? "" : s, bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(s1 == null ? "" : s1, bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(s2 == null ? "" : s2, bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(s3 == null ? "" : s3, bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(s4 == null ? "" : s4, bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(s5 == null ? "" : dj.a(s5), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(s5 == null ? "" : dj.a(s6), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(s7 == null ? "" : s7, bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		try
		{
			bj.a((new StringBuilder(String.valueOf(ai.h()))).append("|").append(ag.e(context)).toString(), bytearrayoutputstream);
		}
		catch (Exception exception1) { }
		bytearrayoutputstream.write(38);
		try
		{
			bj.a((new StringBuilder(String.valueOf(ah.h()))).append("|").append(ah.i()).toString(), bytearrayoutputstream);
		}
		catch (Exception exception2) { }
		bytearrayoutputstream.write(38);
		try
		{
			bj.a(String.valueOf(s), bytearrayoutputstream);
		}
		catch (Throwable throwable) { }
		bytearrayoutputstream.write(38);
		bj.a(String.valueOf(j1), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bj.a(s8, bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bj.a(String.valueOf(k1), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		String s11 = dj.b((new StringBuilder(String.valueOf(ai.d()))).append(ag.c(context)).append(s10).toString());
		try
		{
			String s12 = dj.a(bytearrayoutputstream.toByteArray(), s11);
			stringbuilder.append(s12);
		}
		catch (Exception exception3) { }
		return stringbuilder.toString();
		Exception exception;
		exception;
		return null;
	}

	static void a(Activity activity, String s)
	{
		if (s == null || "".equals(s))
			return;
		try
		{
			Thread thread = new Thread(new ap(activity, s));
			thread.start();
		}
		catch (Exception exception) { }
	}

	static void b(Context context, int i, int j, int k, int l, int i1, String s, String s1, 
			String s2, String s3, String s4, String s5, String s6, String s7, int j1, 
			String s8, String s9, int k1)
	{
		if (ah.f(context))
			return;
		String s10;
		String s11;
		s10 = av.g();
		s11 = a(context, i, j, k, l, i1, s, s1, s2, s3, s4, s5, s6, s7, j1, s8, s9, k1);
		if (s11 == null)
			return;
		try
		{
			ArrayList arraylist = new ArrayList(2);
			arraylist.add(new BasicNameValuePair("s", s11));
			gf gf1 = new gf(context, s10);
			int l1 = gf1.a(arraylist);
			if (l1 == 3)
				try
				{
					JSONObject jsonobject = new JSONObject(gf1.c());
					if (jsonobject != null)
					{
						String s12 = hb.a(jsonobject, "ping", null);
						if (s12 != null && !"".equals(s12))
							a((Activity)context, s12);
					}
				}
				catch (Exception exception1)
				{
					gz.c("解析ping出错");
				}
		}
		catch (Exception exception) { }
		return;
	}

	static cl a(Context context)
	{
		if (!ag.b(context))
			return null;
		cl cl1;
		StringBuilder stringbuilder = new StringBuilder(512);
		String s = dj.a(4);
		stringbuilder.append(av.f());
		stringbuilder.append("00000");
		stringbuilder.append(ai.b());
		stringbuilder.append(ag.a(context));
		stringbuilder.append(s);
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
		bj.a(ah.a(context).a(), bytearrayoutputstream);
		bytearrayoutputstream.write(38);
		try
		{
			bj.a((new StringBuilder(String.valueOf(ai.h()))).append("|").append(ag.e(context)).toString(), bytearrayoutputstream);
		}
		catch (Exception exception1) { }
		bytearrayoutputstream.write(38);
		try
		{
			bj.a((new StringBuilder(String.valueOf(ah.h()))).append("|").append(ah.i()).toString(), bytearrayoutputstream);
		}
		catch (Exception exception2) { }
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		bytearrayoutputstream.write(38);
		String s1 = dj.b((new StringBuilder(String.valueOf(ai.d()))).append(ag.c(context)).append(s).toString());
		try
		{
			String s2 = dj.a(bytearrayoutputstream.toByteArray(), s1);
			stringbuilder.append(s2);
		}
		catch (Exception exception3) { }
		String s3 = stringbuilder.toString();
		em em1 = new em();
		if (em1.a(context, s3) != 6)
			break MISSING_BLOCK_LABEL_575;
		String s4 = em1.i();
		JSONObject jsonobject = hb.a(s4);
		if (jsonobject == null)
			break MISSING_BLOCK_LABEL_575;
		try
		{
			String s5 = hb.a(jsonobject, "ping", null);
			if (s5 != null && !"".equals(s5))
				a((Activity)context, s5);
		}
		catch (Exception exception4) { }
		int i = hb.a(jsonobject, "c", -999);
		if (i != 0)
			break MISSING_BLOCK_LABEL_575;
		int j = hb.a(jsonobject, "n", 0);
		if (j != 1)
			break MISSING_BLOCK_LABEL_575;
		int k = hb.a(jsonobject, "v", -1);
		if (k <= 0)
			break MISSING_BLOCK_LABEL_575;
		String s6 = hb.a(jsonobject, "pn", null);
		if (s6 == null)
			break MISSING_BLOCK_LABEL_575;
		s6 = s6.trim();
		if (s6.length() <= 0)
			break MISSING_BLOCK_LABEL_575;
		String s7 = context.getPackageName();
		if (!s6.equals(s7))
			break MISSING_BLOCK_LABEL_575;
		int l = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
		if (k <= l)
			break MISSING_BLOCK_LABEL_575;
		String s8 = hb.a(jsonobject, "u", null);
		if (s8 == null)
			break MISSING_BLOCK_LABEL_575;
		s8 = s8.trim();
		if (s8.length() <= 0)
			break MISSING_BLOCK_LABEL_575;
		String s9 = hb.a(jsonobject, "vn", null);
		String s10 = hb.a(jsonobject, "m", null);
		cl1 = new cl();
		cl1.d = s8;
		cl1.c = s6;
		cl1.a = k;
		cl1.b = s9;
		cl1.e = s10;
		return cl1;
		Exception exception;
		exception;
		return null;
	}

	static boolean b(Context context)
	{
		if (!ag.b(context))
			return false;
		String s = aq.a(context);
		if (s == null)
			return false;
		em em1 = new em();
		if (em1.a(context, s) != 6)
			break MISSING_BLOCK_LABEL_391;
		String s1 = em1.i();
		JSONObject jsonobject = hb.a(s1);
		if (jsonobject == null)
			break MISSING_BLOCK_LABEL_391;
		try
		{
			if (jsonobject != null)
			{
				String s2 = hb.a(jsonobject, "ping", null);
				if (s2 != null && !"".equals(s2))
					a((Activity)context, s2);
			}
		}
		catch (Exception exception1) { }
		int i = hb.a(jsonobject, "c", -999);
		if (i != 0)
			break MISSING_BLOCK_LABEL_391;
		ArrayList arraylist = new ArrayList(10);
		JSONArray jsonarray = hb.a(jsonobject, "d", null);
		if (jsonarray != null && jsonarray.length() > 0)
		{
			for (int j = 0; j < jsonarray.length(); j++)
			{
				JSONObject jsonobject1 = hb.a(jsonarray, j, null);
				if (jsonobject1 != null)
				{
					int k = hb.a(jsonobject1, "id", -1);
					if (k > 0)
					{
						String s4 = hb.a(jsonobject1, "v", null);
						String s6 = hb.a(jsonobject1, "s", null);
						if (s4 != null)
						{
							s4 = s4.trim();
							if (s4.length() > 0 && s6 != null && s6.length() > 0 && aw.a(s4, s6) && !arraylist.contains(Integer.valueOf(k)))
								arraylist.add(Integer.valueOf(k));
						}
					}
				}
			}

		}
		em em2 = new em();
		String s3 = aq.a(context, arraylist);
		if (s3 == null)
			break MISSING_BLOCK_LABEL_391;
		em2.a(context, s3);
		if (em2.d() == 6)
			try
			{
				JSONObject jsonobject2 = new JSONObject(em2.i());
				if (jsonobject2 != null)
				{
					String s5 = hb.a(jsonobject2, "ping", null);
					if (s5 != null && !"".equals(s5))
						a((Activity)context, s5);
				}
			}
			catch (Exception exception2) { }
		return true;
		Exception exception;
		exception;
		return false;
	}
}
