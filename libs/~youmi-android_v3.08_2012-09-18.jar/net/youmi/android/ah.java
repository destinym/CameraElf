// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.content.pm.*;
import android.os.Build;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

// Referenced classes of package net.youmi.android:
//			ag, ai, aj, dg, 
//			gz, hw

class ah
{

	private static int d = -1;
	private static int e = -1;
	private static int f = -1;
	private static int g = -1;
	private static int h = -1;
	private static String i;
	private static String j;
	private static int k = -1;
	private static String l;
	private static String m;
	private static String n = "";
	private static dg o = null;
	private static String p = null;
	private static String q;
	private static int r = 0;
	static long a = 0L;
	static long b = 0L;
	static boolean c = false;

	static dg a(Context context)
	{
		if (o == null)
			o = new dg(context);
		return o;
	}

	static String b(Context context)
	{
		if (p != null)
			break MISSING_BLOCK_LABEL_53;
		PackageManager packagemanager = context.getPackageManager();
		PackageInfo packageinfo = packagemanager.getPackageInfo(context.getPackageName(), 0);
		ApplicationInfo applicationinfo = packageinfo.applicationInfo;
		if (applicationinfo != null)
			p = applicationinfo.loadLabel(packagemanager).toString();
		if (p == null)
			return "";
		break MISSING_BLOCK_LABEL_53;
		Exception exception;
		exception;
		return p;
	}

	static String a()
	{
		if (j == null)
		{
			Locale locale = Locale.getDefault();
			j = String.format("%s-%s", new Object[] {
				locale.getLanguage(), locale.getCountry()
			});
		}
		return j;
	}

	static String b()
	{
		return Build.MODEL;
	}

	static String c()
	{
		return (new StringBuilder("android ")).append(android.os.Build.VERSION.RELEASE).toString();
	}

	static void c(Context context)
	{
		try
		{
			TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
			if (telephonymanager != null)
			{
				try
				{
					String s = telephonymanager.getNetworkOperatorName();
					if (s == null)
						l = "";
					else
						l = s;
				}
				catch (Exception exception1) { }
				try
				{
					String s1 = telephonymanager.getLine1Number();
					if (s1 == null)
					{
						m = "";
					} else
					{
						s1 = s1.trim();
						if (s1.length() > 11)
						{
							int i1 = s1.length() - 11;
							m = s1.substring(i1, i1 + 7);
						} else
						if (s1.length() == 11)
							m = s1.substring(0, 7);
						else
							m = "";
					}
				}
				catch (Exception exception2) { }
			}
		}
		catch (Exception exception) { }
	}

	static String d(Context context)
	{
		if (m == null)
			c(context);
		if (m == null)
			return "";
		else
			return m;
	}

	static String e(Context context)
	{
		if (l == null)
			c(context);
		if (l == null)
			return "";
		else
			return l;
	}

	static String d()
	{
		try
		{
			if (q == null)
			{
				Field field = android/os/Build.getField("MANUFACTURER");
				if (field != null)
					q = field.get(android/os/Build).toString().trim();
			}
		}
		catch (Exception exception) { }
		if (q == null)
			return Build.BRAND;
		else
			return q;
	}

	static boolean f(Context context)
	{
		if (ag.a())
			return true;
		return a(context).f();
	}

	static boolean a(int i1)
	{
		return k >= i1;
	}

	static void b(int i1)
	{
		k = i1;
		r = 0;
	}

	static void e()
	{
		r++;
	}

	static int f()
	{
		return r;
	}

	static boolean a(long l1)
	{
		long l2 = g();
		if (l1 - b > l2)
		{
			if (c)
			{
				if (l1 - a > 35000L)
				{
					c = false;
					return true;
				} else
				{
					return false;
				}
			} else
			{
				return true;
			}
		} else
		{
			return false;
		}
	}

	static long g()
	{
		long l1 = ai.g();
		if (l1 < ag.d())
			l1 = ag.d();
		if (l1 < aj.a())
			l1 = aj.a();
		return l1;
	}

	static synchronized String g(Context context)
	{
		if (i != null && i.length() > 0)
			return i;
		if (!hw.f(context) && !hw.e(context))
			return "";
		TelephonyManager telephonymanager;
		String s;
		String s1;
		int i1;
		telephonymanager = (TelephonyManager)context.getSystemService("phone");
		if (telephonymanager == null)
			break MISSING_BLOCK_LABEL_686;
		s = "";
		s1 = "";
		try
		{
			String s2 = telephonymanager.getNetworkOperator();
			s2 = s2.trim();
			if (s2.length() > 3)
			{
				s = s2.substring(0, 3);
				s1 = s2.substring(3);
			}
		}
		catch (Exception exception1) { }
		if (s.length() == 0 || s1.length() == 0)
			try
			{
				String s3 = telephonymanager.getSubscriberId();
				if (s3 != null)
				{
					s3 = s3.trim();
					if (s3.length() > 5)
					{
						s = s3.substring(0, 3);
						s1 = s3.substring(3, 5);
					}
				}
			}
			catch (Exception exception2)
			{
				gz.a(exception2);
			}
		i1 = telephonymanager.getPhoneType();
		if (i1 != 1)
			break MISSING_BLOCK_LABEL_343;
		if (d <= -1 || e <= -1)
			break MISSING_BLOCK_LABEL_245;
		i = (new StringBuilder("0|")).append(s).append("|").append(s1).append("|").append(d).append("|").append(e).toString();
		return i;
		GsmCellLocation gsmcelllocation = (GsmCellLocation)telephonymanager.getCellLocation();
		if (gsmcelllocation != null)
		{
			d = gsmcelllocation.getCid();
			e = gsmcelllocation.getLac();
		}
		if (d <= -1 || e <= -1)
			break MISSING_BLOCK_LABEL_686;
		i = (new StringBuilder("0|")).append(s).append("|").append(s1).append("|").append(d).append("|").append(e).toString();
		return i;
		if (i1 != 2)
			break MISSING_BLOCK_LABEL_676;
		if (f <= -1 || h <= -1 || g <= -1)
			break MISSING_BLOCK_LABEL_435;
		i = (new StringBuilder("1|")).append(s).append("|").append(s1).append("|").append(f).append("|").append(h).append("|").append(g).toString();
		return i;
		CellLocation celllocation = telephonymanager.getCellLocation();
		Method amethod[] = celllocation.getClass().getMethods();
		if (amethod != null)
		{
			for (int j1 = 0; j1 < amethod.length; j1++)
			{
				Method method = amethod[j1];
				if (method != null)
					if (method.getName().equals("getBaseStationId"))
						f = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
					else
					if (method.getName().equals("getNetworkId"))
						h = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
					else
					if (method.getName().equals("getSystemId"))
						g = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
			}

		}
		if (f <= -1 || h <= -1 || g <= -1)
			break MISSING_BLOCK_LABEL_686;
		i = (new StringBuilder("1|")).append(s).append("|").append(s1).append("|").append(f).append("|").append(h).append("|").append(g).toString();
		return i;
		i = "";
		return i;
		Exception exception;
		exception;
		return "";
	}

	static String h()
	{
		return Locale.getDefault().getCountry();
		Exception exception;
		exception;
		return "";
	}

	static String i()
	{
		return Locale.getDefault().getLanguage();
		Exception exception;
		exception;
		return "";
	}

}
