// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;

// Referenced classes of package net.youmi.android:
//			ak, bm, bs, cm

class au
{

	static void a(Activity activity, String s)
	{
		try
		{
			if (s != null)
			{
				s = s.trim();
				if (s.length() > 0)
				{
					int i = s.indexOf("sms:");
					if (i == 0 && s.length() > "sms:".length())
					{
						String s1 = s.substring("sms:".length());
						String as[] = s1.split("&");
						if (as.length > 0)
						{
							String s2 = as[0];
							String s3 = "";
							if (as.length > 1)
								s3 = as[1];
							bm.a(activity, s2, s3);
						}
					}
				}
			}
		}
		catch (Exception exception) { }
	}

	static boolean b(Activity activity, String s)
	{
		if (s == null)
			return false;
		String s2;
		String s3;
		String s4;
		String s5;
		String s6;
		String s7;
		s = s.trim();
		int i = s.indexOf("mailto:");
		if (i != 0 || s.length() <= "mailto:".length())
			break MISSING_BLOCK_LABEL_238;
		String s1 = s.substring("mailto:".length());
		String as[] = s1.split("&");
		cm cm1 = new cm(as);
		s2 = (String)cm1.a(0, null);
		s3 = (String)cm1.a(1, null);
		s4 = (String)cm1.a(2, null);
		s5 = (String)cm1.a(3, null);
		s6 = (String)cm1.a(4, null);
		s7 = (String)cm1.a(5, "0");
		if (s2 == null)
			return false;
		String as1[] = bs.a(s2, ",");
		String as2[] = bs.a(s3, ",");
		String as3[] = bs.a(s4, ",");
		if (s5 != null)
			s5 = ak.a(s5);
		if (s6 != null)
			s6 = ak.a(s6);
		if (s7.equals("0"))
			bm.a(activity, as1, as2, as3, s5, s6);
		else
			bm.b(activity, as1, as2, as3, s5, s6);
		return true;
		Exception exception;
		exception;
		return false;
	}

	static boolean c(Activity activity, String s)
	{
		if (s == null)
			return false;
		String s2;
		String s3;
		String s4;
		String s5;
		s = s.trim();
		int i = s.indexOf("loc:");
		if (i != 0 || s.length() <= "loc:".length())
			break MISSING_BLOCK_LABEL_143;
		String s1 = s.substring("loc:".length());
		String as[] = bs.a(s1, "&");
		cm cm1 = new cm(as);
		s2 = (String)cm1.a(0, null);
		s3 = (String)cm1.a(1, null);
		s4 = (String)cm1.a(2, "A");
		s5 = (String)cm1.a(3, "");
		if (s2 == null)
			return false;
		if (s3 == null)
			return false;
		try
		{
			bm.a(activity, s3, s2, s4, s5);
		}
		catch (Exception exception) { }
		return false;
	}
}
