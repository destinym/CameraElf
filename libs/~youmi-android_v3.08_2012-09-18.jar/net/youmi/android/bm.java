// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.*;
import android.content.pm.*;
import android.net.Uri;
import android.text.Html;
import java.net.URLDecoder;

// Referenced classes of package net.youmi.android:
//			AdActivity, gz

class bm
{

	static boolean a(Activity activity, String s)
	{
		ResolveInfo resolveinfo;
		Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
		resolveinfo = activity.getPackageManager().resolveActivity(intent, 0);
		if (!resolveinfo.activityInfo.packageName.equals("android") && !resolveinfo.activityInfo.name.equals("com.android.internal.app.ResolverActivity"))
			break MISSING_BLOCK_LABEL_111;
		Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
		intent1.addFlags(0x10000000);
		ComponentName componentname = new ComponentName("com.android.browser", "com.android.browser.BrowserActivity");
		intent1.setComponent(componentname);
		activity.startActivity(intent1);
		gz.c("browserActivity");
		return true;
		try
		{
			Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(s));
			intent2.addFlags(0x10000000);
			ComponentName componentname1 = new ComponentName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name);
			intent2.setComponent(componentname1);
			gz.c((new StringBuilder("packageName:")).append(resolveinfo.activityInfo.packageName).append(" name:").append(resolveinfo.activityInfo.name).toString());
			activity.startActivity(intent2);
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
		return true;
	}

	static boolean a(Activity activity, String s, int i)
	{
		if (s == null || "".equals(s))
			return false;
		try
		{
			Intent intent = Intent.parseUri(s, i);
			activity.startActivity(intent);
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
		return true;
	}

	static boolean b(Activity activity, String s)
	{
		try
		{
			PackageManager packagemanager = activity.getPackageManager();
			Intent intent = packagemanager.getLaunchIntentForPackage(s);
			intent.addCategory("android.intent.category.LAUNCHER");
			intent.addFlags(0x10000000);
			activity.startActivity(intent);
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
		return true;
	}

	static void c(Activity activity, String s)
	{
		try
		{
			a(activity, s);
		}
		catch (Exception exception) { }
	}

	static void a(Context context, String s)
	{
		try
		{
			Intent intent = new Intent("android.intent.action.VIEW");
			intent.setDataAndType(Uri.parse(s), "application/vnd.android.package-archive");
			intent.addFlags(0x10000000);
			context.startActivity(intent);
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	static void b(Context context, String s)
	{
		a(context, (new StringBuilder("file://")).append(s).toString());
	}

	static void d(Activity activity, String s)
	{
		if (s == null)
			return;
		s = s.trim();
		if (s.length() == 0)
			return;
		try
		{
			Uri uri = Uri.parse(s);
			Intent intent = new Intent("android.intent.action.VIEW", uri);
			intent.addFlags(0x10000000);
			ComponentName componentname = new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
			intent.setComponent(componentname);
			activity.startActivity(intent);
		}
		catch (Exception exception)
		{
			try
			{
				Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
				intent1.addFlags(0x10000000);
				activity.startActivity(intent1);
			}
			catch (Exception exception1) { }
		}
	}

	static void a(Activity activity)
	{
		try
		{
			AdActivity.b(activity);
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
	}

	static void e(Activity activity, String s)
	{
		if (s == null)
			return;
		s = s.trim();
		if (s.length() == 0)
			return;
		try
		{
			Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
			intent.addFlags(0x10000000);
			activity.startActivity(intent);
		}
		catch (Exception exception) { }
	}

	static void a(Activity activity, String as[], String as1[], String as2[], String s, String s1)
	{
		try
		{
			Intent intent = new Intent("android.intent.action.SEND");
			intent.putExtra("android.intent.extra.EMAIL", as);
			if (as1 != null && as1.length > 0)
				intent.putExtra("android.intent.extra.CC", as1);
			if (as2 != null && as2.length > 0)
				intent.putExtra("android.intent.extra.BCC", as2);
			intent.putExtra("android.intent.extra.SUBJECT", s);
			intent.putExtra("android.intent.extra.TEXT", s1);
			intent.setType("message/rfc822");
			activity.startActivity(intent);
		}
		catch (Exception exception) { }
	}

	static void b(Activity activity, String as[], String as1[], String as2[], String s, String s1)
	{
		try
		{
			Intent intent = new Intent("android.intent.action.SEND");
			intent.putExtra("android.intent.extra.EMAIL", as);
			if (as1 != null && as1.length > 0)
				intent.putExtra("android.intent.extra.CC", as1);
			if (as2 != null && as2.length > 0)
				intent.putExtra("android.intent.extra.BCC", as2);
			intent.putExtra("android.intent.extra.SUBJECT", s);
			intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(s1));
			intent.setType("text/html");
			activity.startActivity(intent);
		}
		catch (Exception exception) { }
	}

	static void a(Activity activity, String s, String s1, String s2, String s3)
	{
		try
		{
			String s4 = (new StringBuilder("http://ditu.google.com/maps?q=")).append(s).append(",").append(s1).append("(").append(s2).append(" ").append(s3).append(")&z=16").toString();
			d(activity, s4);
		}
		catch (Exception exception) { }
	}

	static boolean f(Activity activity, String s)
	{
		if (s == null)
			return false;
		if (s.indexOf("geo:") != 0)
			break MISSING_BLOCK_LABEL_44;
		Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
		intent.addFlags(0x10000000);
		activity.startActivity(intent);
		return true;
		Exception exception;
		exception;
		return false;
	}

	static boolean g(Activity activity, String s)
	{
		if (s == null)
			return false;
		String s1 = "sms:";
		String s2 = "smsto:";
		String s3 = "?body=";
		String s4 = new String(s);
		int i = s4.indexOf(s3);
		String s5 = null;
		if (i > -1)
		{
			s5 = s4.substring(i + s3.length());
			s4 = s4.substring(0, i);
		}
		String s6 = null;
		if (s4.indexOf(s1) == 0)
			s6 = s4.substring(s1.length());
		else
		if (s4.indexOf(s2) == 0)
			s6 = s4.substring(s2.length());
		if (s6 == null)
			break MISSING_BLOCK_LABEL_182;
		Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder("smsto:")).append(s6).toString()));
		if (s5 != null)
		{
			s5 = URLDecoder.decode(s5);
			intent.putExtra("sms_body", s5);
		}
		activity.startActivity(intent);
		return true;
		Exception exception;
		exception;
		return false;
	}

	static boolean a(Activity activity, String s, String s1)
	{
		if (s == null)
			break MISSING_BLOCK_LABEL_53;
		Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder("smsto:")).append(s).toString()));
		if (s1 != null)
			intent.putExtra("sms_body", s1);
		activity.startActivity(intent);
		return true;
		Exception exception;
		exception;
		return false;
	}

	static boolean a(Activity activity, Uri uri)
	{
		if (uri == null)
			break MISSING_BLOCK_LABEL_30;
		Intent intent = new Intent("android.intent.action.DIAL", uri);
		intent.addFlags(0x10000000);
		activity.startActivity(intent);
		return true;
		Exception exception;
		exception;
		return false;
	}

	static boolean h(Activity activity, String s)
	{
		if (s == null)
			return false;
		String s1 = null;
		String s2 = "wtai://wp/mc;";
		String s3 = "tel:";
		if (s.indexOf(s2) == 0)
			s1 = s.substring(s2.length());
		else
		if (s.indexOf(s3) == 0)
			s1 = s.substring(s3.length());
		if (s1 == null)
			break MISSING_BLOCK_LABEL_105;
		Intent intent = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder("tel:")).append(s1).toString()));
		intent.addFlags(0x10000000);
		activity.startActivity(intent);
		return true;
		Exception exception;
		exception;
		return false;
	}
}
