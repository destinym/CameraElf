// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.*;

// Referenced classes of package net.youmi.android:
//			al, am, bx, cz, 
//			dj, gy, hw

class ba
{

	private static int a = -1;
	private static int b = -1;
	private static int c = -1;
	private static int d = -1;
	private static int e = -1;
	private static int f = 1;
	private static int g = -1;

	static String a(Context context)
	{
		String s = a(context, "F1B19978F3D74302BA126760F96262CD", "CBD2998A3D5A4744BF128B91E1410DEA", context.getPackageName());
		if (s == null)
			return null;
		s = s.trim();
		if (s.length() > 0)
			return s;
		return s;
		Exception exception;
		exception;
		return null;
	}

	static String b(Context context)
	{
		String s = a(context, "A33E523A1CEF496dB37ABD886CBCB005", "C97CE45F9A5A447c98BBB83D88790503", context.getPackageName());
		if (s == null)
			return null;
		s = s.trim();
		if (s.length() > 0)
			return s;
		return s;
		Exception exception;
		exception;
		return null;
	}

	static boolean a(Context context, String s)
	{
		if (s == null)
			return false;
		s = s.trim();
label0:
		{
			if (s.length() > 0 && a(context, "F1B19978F3D74302BA126760F96262CD", s, "CBD2998A3D5A4744BF128B91E1410DEA", context.getPackageName().trim()))
				return true;
			break label0;
		}
		Exception exception;
		exception;
		return false;
	}

	static boolean b(Context context, String s)
	{
		if (s == null)
			return false;
		s = s.trim();
label0:
		{
			if (s.length() > 0 && a(context, "A33E523A1CEF496dB37ABD886CBCB005", s, "C97CE45F9A5A447c98BBB83D88790503", context.getPackageName().trim()))
				return true;
			break label0;
		}
		Exception exception;
		exception;
		return false;
	}

	private static boolean a(Context context, String s, String s1, String s2, String s3)
	{
		boolean flag = false;
		try
		{
			byte abyte0[] = am.a();
			String s4 = dj.b(abyte0);
			String s5 = am.a(s1, s3, abyte0);
			if (s5 != null && s4 != null)
			{
				android.content.SharedPreferences.Editor editor = context.getSharedPreferences("CE94557724F842149D690D0E8CBB1CBD", 0).edit();
				editor.putString(s2, s4);
				editor.putString(s, s5);
				flag = editor.commit();
			}
		}
		catch (Exception exception) { }
		return flag;
	}

	private static String a(Context context, String s, String s1, String s2)
	{
		SharedPreferences sharedpreferences;
		String s3;
		sharedpreferences = context.getSharedPreferences("CE94557724F842149D690D0E8CBB1CBD", 0);
		if (sharedpreferences == null)
			break MISSING_BLOCK_LABEL_85;
		s3 = sharedpreferences.getString(s, null);
		if (s3 == null)
			return null;
		String s4 = sharedpreferences.getString(s1, null);
		if (s4 == null)
			return null;
		String s5;
		byte abyte0[] = al.a(s4.getBytes());
		if (abyte0 == null)
			break MISSING_BLOCK_LABEL_85;
		s5 = am.b(s3, s2, abyte0);
		if (s5 != null)
			return s5;
		break MISSING_BLOCK_LABEL_85;
		Exception exception;
		exception;
		return null;
	}

	static int a(Activity activity)
	{
		if (a == -1)
		{
			boolean flag = false;
			try
			{
				PackageInfo packageinfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 1);
				if (packageinfo != null)
				{
					ActivityInfo aactivityinfo[] = packageinfo.activities;
					if (aactivityinfo != null)
					{
						for (int i = 0; i < aactivityinfo.length; i++)
							if (aactivityinfo[i].name.equals("net.youmi.android.AdActivity"))
								flag = true;

					}
				}
			}
			catch (Exception exception) { }
			if (!flag)
			{
				a = 0;
				return 5;
			}
			a = 1;
		} else
		if (a == 0)
			return 5;
		if (b == -1)
		{
			if (!hw.b(activity))
			{
				b = 0;
				return 1;
			}
			b = 1;
		} else
		if (b == 0)
			return 1;
		if (c == -1)
		{
			if (!hw.c(activity))
			{
				c = 0;
				return 2;
			}
			c = 1;
		} else
		if (c == 0)
			return 2;
		if (d == -1)
		{
			if (!hw.d(activity))
			{
				d = 0;
				return 3;
			}
			d = 1;
		} else
		if (d == 0)
			return 3;
		if (e == -1)
		{
			if (!hw.a(activity))
			{
				e = 0;
				return 4;
			}
			e = 1;
		} else
		if (e == 0)
			return 4;
		if (f == -1)
		{
			if (hw.f(activity) || hw.e(activity))
			{
				f = 1;
			} else
			{
				f = 0;
				return 6;
			}
		} else
		if (f == 0)
			return 6;
		if (g == -1)
		{
			if (hw.i(activity))
			{
				g = 1;
			} else
			{
				g = 0;
				return 7;
			}
		} else
		if (g == 0)
			return 7;
		return 0;
	}

	static cz b(Activity activity)
	{
		return a(activity, "请为您的应用配置相应权限", "缺少INTERNET权限", 1);
	}

	static cz c(Activity activity)
	{
		return a(activity, "请为您的应用配置相应权限", "缺少READ_PHONE_STATE权限", 2);
	}

	static cz d(Activity activity)
	{
		return a(activity, "请为您的应用程序添加YoumiReceiver,否则无法捕获广告效果", "缺少net.youmi.android.YoumiReceiver", 7);
	}

	static cz e(Activity activity)
	{
		return a(activity, "请为您的应用配置相应权限", "缺少ACCESS_COARSE_LOCATION权限", 6);
	}

	static cz f(Activity activity)
	{
		return a(activity, "请为您的应用配置相应权限", "缺少ACCESS_NETWORK_STATE权限", 3);
	}

	static cz g(Activity activity)
	{
		return a(activity, "请为您的应用配置相应权限", "缺少WRITE_EXTERNAL_STORAGE_PERMISSION权限", 4);
	}

	static cz h(Activity activity)
	{
		return a(activity, "请为您的应用程序添加AdActivity,否则无法显示广告详情", "缺少net.youmi.android.AdActivity", 5);
	}

	static cz a(Activity activity, String s, String s1, int i)
	{
		StringBuilder stringbuilder = new StringBuilder(1024);
		stringbuilder.append("<html><head><title>有米广告配置</title></head><body><h2>有米广告Android Banner Ad SDk配置简易教程</h2>");
		stringbuilder.append("<h3>1.请务必为您的应用程序配置正确的AppId和应用密码</h3>");
		stringbuilder.append("<p>");
		stringbuilder.append("<label style='color:green'>//请使用静态的方法调用AdManager.init(),设置AppId、密码、广告请求间隔和测试模式等参数(在任意AdView初始化前调用一次即可)</label><br/>");
		stringbuilder.append("static{<br/>");
		stringbuilder.append("<label style='color:green'>//第一个参数为您的应用AppId</label><br/>");
		stringbuilder.append("<label style='color:green'>//第二个参数为您的应用密码</label><br/>");
		stringbuilder.append("<label style='color:green'>//第三个参数是请求广告的间隔，有效的设置值为30至200，单位为秒</label><br/>");
		stringbuilder.append("<label style='color:green'>//第四个参数是设置测试模式，设置为true时，可以获取测试广告，正式发布请设置此参数为false</label><br/>");
		stringbuilder.append("net.youmi.android.AdManager.init(String appid, String appsec, int intervalSecond,boolean isTestMode);<br/>");
		stringbuilder.append("}<br/>");
		stringbuilder.append("</p>");
		stringbuilder.append("<h3>2.请务必为您的应用程序配置以下权限:</h3>");
		stringbuilder.append("<p style='color:blue'>");
		stringbuilder.append("android.permission.INTERNET");
		stringbuilder.append("</p>");
		stringbuilder.append("<p style='color:blue'>");
		stringbuilder.append("android.permission.READ_PHONE_STATE");
		stringbuilder.append("</p>");
		stringbuilder.append("<p style='color:blue'>");
		stringbuilder.append("android.permission.ACCESS_NETWORK_STATE");
		stringbuilder.append("</p>");
		stringbuilder.append("<p style='color:blue'>");
		stringbuilder.append("android.permission.WRITE_EXTERNAL_STORAGE_PERMISSION");
		stringbuilder.append("</p>");
		stringbuilder.append("<p style='color:blue'>");
		stringbuilder.append("android.permission.ACCESS_COARSE_LOCATION");
		stringbuilder.append("</p>");
		stringbuilder.append("<h3>3.请务必在Androidmanifest.xml中添加以下Activity:</h3>");
		stringbuilder.append("<p style='color:blue'>");
		stringbuilder.append("&#60;activity android:name=\"net.youmi.android.AdActivity\"");
		stringbuilder.append("<br/>");
		stringbuilder.append("android:configChanges=\"keyboard|keyboardHidden|orientation\"/&#62;");
		stringbuilder.append("</p>");
		stringbuilder.append("</body></html>");
		String s2 = stringbuilder.toString();
		byte byte0 = 11;
		if (i == 5)
			byte0 = -1;
		cz cz1 = cz.a(activity, false, (new StringBuilder("sample")).append(gy.a()).toString(), "FABC", "FABC", 0, byte0, "00000000", s, s1, null, null, null, null, null, "#", null, false, true, null, System.currentTimeMillis(), System.currentTimeMillis(), null, 0, false, false, null, 0, false, false, 0, null, null, null, null, true, "", "", 0L, 0, "", "");
		cz1.v();
		cz1.w();
		cz1.a(new bx("#", s2));
		return cz1;
	}

}
