// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Properties;

// Referenced classes of package net.youmi.android:
//			ah, bq, dj, gy, 
//			hw

class dg
{

	private String a;
	private String b;
	private String c;
	private String d;
	private static String e = "yuJtmxbnRzbmWJnK";
	private String f;
	private boolean g;

	dg(Context context)
	{
		a = "";
		b = "";
		c = "";
		d = "";
		g = false;
		try
		{
			TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
			if (telephonymanager != null)
			{
				try
				{
					String s = telephonymanager.getSubscriberId();
					if (s != null)
						b = s.trim();
				}
				catch (Exception exception1) { }
				try
				{
					String s1 = telephonymanager.getDeviceId();
					if (s1 != null)
					{
						a = s1;
						if (a != null)
						{
							a = a.trim();
							if (a.indexOf(" ") > -1)
								a.replace(" ", "");
							if (a.indexOf("-") > -1)
								a = a.replace("-", "");
							if (a.indexOf("\n") > -1)
								a = a.replace("\n", "");
							String s2 = "MEID:";
							int i = a.indexOf(s2);
							if (i > -1)
								a = a.substring(i + s2.length());
							a = a.trim();
						}
					}
				}
				catch (Exception exception2) { }
			}
		}
		catch (Exception exception) { }
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		if (a == null)
		{
			flag = true;
			a = "";
		} else
		if (a.length() == 0)
			flag = true;
		if (b == null)
		{
			flag1 = true;
			b = "";
		} else
		if (b.length() == 0)
			flag1 = true;
		if (flag && flag1)
			try
			{
				c = b(context);
				if (c.length() == 0)
					flag2 = true;
			}
			catch (Exception exception3) { }
		if (flag2)
			try
			{
				d = c(context);
				if (d.length() == 0)
					flag3 = true;
			}
			catch (Exception exception4) { }
		if (flag3)
		{
			String s3 = a(context);
			f = dj.c(s3.substring(7, 25));
		} else
		{
			String s4 = dj.b((new StringBuilder(String.valueOf(a))).append(b).append(c).append(d).append(e).toString());
			f = dj.c(s4.substring(7, 25));
		}
		g = g();
	}

	String a(Context context)
	{
		String s;
		s = null;
		String s1 = "DD5E8CD46CF94B22BAAD68AB06710752";
		Properties properties = bq.a(context, s1);
		String s2 = "46C02DF8DF4C4C18A578C63449C7F64D";
		if (properties.containsKey(s2))
			s = (String)properties.get(s2);
		if (s == null)
		{
			s = dj.b((new StringBuilder(String.valueOf(ah.d()))).append(ah.b()).append(gy.a(0x7fffffff)).append(System.currentTimeMillis()).append(ah.c()).append(e).toString());
			if (s != null)
				try
				{
					properties.put(s2, s);
					bq.a(context, properties, s1);
				}
				catch (Exception exception1) { }
		}
		if (s == null)
			return dj.b(Build.MODEL);
		return s;
		Exception exception;
		exception;
		return "";
	}

	private String b(Context context)
	{
		String s;
		s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
		if (s == null)
			break MISSING_BLOCK_LABEL_22;
		s = s.trim();
		return s;
		Exception exception;
		exception;
		return "";
	}

	private String c(Context context)
	{
		String s;
		if (!hw.g(context))
			break MISSING_BLOCK_LABEL_44;
		WifiManager wifimanager = (WifiManager)context.getSystemService("wifi");
		WifiInfo wifiinfo = wifimanager.getConnectionInfo();
		s = wifiinfo.getMacAddress();
		if (s == null)
			break MISSING_BLOCK_LABEL_44;
		s = s.trim();
		return s;
		Exception exception;
		exception;
		return "";
	}

	private boolean g()
	{
label0:
		{
			if ("unknown".equals(Build.BOARD) && "generic".equals(Build.DEVICE) && "generic".equals(Build.BRAND))
				return true;
			break label0;
		}
		Exception exception;
		exception;
		String s;
		s = Build.MODEL;
		if (s == null)
			break MISSING_BLOCK_LABEL_76;
		s = s.trim();
		s = s.toLowerCase();
		if (s.equals("sdk"))
			return true;
		if (s.equals("google_sdk"))
			return true;
		return false;
		s;
		return true;
	}

	String a()
	{
		return f;
	}

	String b()
	{
		return d;
	}

	String c()
	{
		return c;
	}

	String d()
	{
		return b;
	}

	String e()
	{
		return a;
	}

	boolean f()
	{
		return g;
	}

}
