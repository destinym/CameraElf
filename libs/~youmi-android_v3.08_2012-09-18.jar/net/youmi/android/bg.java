// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.*;
import android.content.Context;
import java.io.*;
import java.util.ArrayList;

// Referenced classes of package net.youmi.android:
//			AdActivity, bf, dd, dh, 
//			di, dj, gz

class bg
{

	private static Notification a;
	private static int b = 0;

	static Notification a(Context context)
	{
		try
		{
			if (a == null)
			{
				android.content.Intent intent = AdActivity.a(context);
				PendingIntent pendingintent = PendingIntent.getActivity(context, 0x1869f, intent, 0x10000000);
				a = new Notification();
				a.icon = 0x1080081;
				a.tickerText = "正在下载";
				a.flags = 16;
				a.setLatestEventInfo(context.getApplicationContext(), "正在下载", "点击查看下载状态", pendingintent);
			}
		}
		catch (Exception exception) { }
		return a;
	}

	static synchronized void b(Context context)
	{
		try
		{
			NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
			if (notificationmanager != null)
			{
				Notification notification = a(context);
				if (notification != null)
				{
					if (b > 0)
					{
						notification.number = b;
						notification.flags = 16;
						notificationmanager.notify(0x1869f, notification);
					} else
					{
						notification.flags = 16;
						notificationmanager.cancel(0x1869f);
					}
				} else
				{
					notificationmanager.cancel(0x1869f);
				}
			}
		}
		catch (Exception exception) { }
	}

	static synchronized void c(Context context)
	{
		b++;
		b(context);
	}

	static synchronized void d(Context context)
	{
		b--;
		b(context);
	}

	static synchronized void e(Context context)
	{
		try
		{
			b = 0;
			b(context);
		}
		catch (Exception exception) { }
	}

	static ArrayList a()
	{
		ArrayList arraylist;
		arraylist = null;
		String as[] = bf.h().b();
		if (as != null)
		{
			for (int i = 0; i < as.length; i++)
			{
				String s = as[i];
				di di1 = a(s);
				if (di1 != null && a(di1))
				{
					if (arraylist == null)
						arraylist = new ArrayList(10);
					if (di1.c != null)
						if (System.currentTimeMillis() - di1.c.lastModified() > 0x493e0L)
							try
							{
								di1.c.delete();
							}
							catch (Exception exception1) { }
						else
							arraylist.add(di1);
				}
			}

		}
		return arraylist;
		Exception exception;
		exception;
		return null;
	}

	static String a(File file)
	{
		String s;
		FileInputStream fileinputstream = new FileInputStream(file);
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(5120);
		if (fileinputstream.available() > 0)
		{
			bytearrayoutputstream.write(fileinputstream.read());
			fileinputstream.skip(4096L);
		}
		try
		{
			fileinputstream.close();
		}
		catch (Exception exception1) { }
		s = null;
		if (bytearrayoutputstream.size() > 0)
			s = dj.a(bytearrayoutputstream.toByteArray());
		try
		{
			bytearrayoutputstream.close();
		}
		catch (Exception exception2) { }
		if (s != null)
			s = s.substring(0, 8);
		return s;
		Exception exception;
		exception;
		return null;
	}

	static boolean a(dh dh1)
	{
		String s = a(dh1.c);
label0:
		{
			if (s != null && dh1.b.equals(s))
				return true;
			break label0;
		}
		Exception exception;
		exception;
		return false;
	}

	static boolean a(di di1)
	{
		return dj.b((new StringBuilder(String.valueOf(di1.a))).append("sdfkoi897hk5490g89dlsd99").toString()).substring(0, 8).equals(di1.e);
		Exception exception;
		exception;
		return false;
	}

	static boolean b(dh dh1)
	{
		String s;
		StringBuilder stringbuilder = new StringBuilder(128);
		stringbuilder.append(dh1.d);
		stringbuilder.append(dh1.c.length());
		stringbuilder.append("l53d2lj8sdf6jks8lq9efx");
		s = dj.b(stringbuilder.toString());
		return s.substring(0, 8).equals(dh1.a);
		Exception exception;
		exception;
		return false;
	}

	static ArrayList b()
	{
		ArrayList arraylist;
		String as[] = bf.g().b();
		arraylist = null;
		if (as != null)
		{
			for (int i = 0; i < as.length; i++)
			{
				String s = as[i];
				dh dh1 = b(s);
				if (dh1 != null && b(dh1))
				{
					if (arraylist == null)
						arraylist = new ArrayList(10);
					arraylist.add(dh1);
				}
			}

		}
		return arraylist;
		Exception exception;
		exception;
		gz.a(exception);
		return null;
	}

	static di a(String s, long l)
	{
		di di1 = new di();
		di1.d = l;
		di1.a = s;
		di1.e = dj.b((new StringBuilder(String.valueOf(s))).append("sdfkoi897hk5490g89dlsd99").toString()).substring(0, 8);
		StringBuilder stringbuilder = new StringBuilder(128);
		stringbuilder.append(s);
		stringbuilder.append('_');
		stringbuilder.append(di1.e);
		stringbuilder.append('_');
		stringbuilder.append(l);
		di1.b = stringbuilder.toString();
		di1.c = new File(bf.h().a(di1.b));
		return di1;
	}

	static di a(String s)
	{
		di di1;
		di1 = null;
		String s1 = s;
		int i = s1.lastIndexOf('_');
		if (i <= -1)
			break MISSING_BLOCK_LABEL_127;
		String s2 = s1.substring(i + 1);
		long l = Long.parseLong(s2);
		String s3 = s1.substring(0, i);
		int j = s3.lastIndexOf('_');
		if (j <= -1)
			break MISSING_BLOCK_LABEL_127;
		String s4 = s3.substring(j + 1);
		String s5 = s3.substring(0, j);
		di1 = new di();
		di1.b = s;
		di1.d = l;
		di1.e = s4;
		di1.a = s5;
		di1.c = new File(bf.h().a(s));
		return di1;
		return di1;
		Exception exception;
		exception;
		return null;
	}

	static dh b(di di1)
	{
		dh dh1;
		dh1 = new dh();
		dh1.d = di1.a;
		StringBuilder stringbuilder = new StringBuilder(128);
		stringbuilder.append(di1.a);
		stringbuilder.append(di1.c.length());
		stringbuilder.append("l53d2lj8sdf6jks8lq9efx");
		String s = dj.b(stringbuilder.toString());
		dh1.a = s.substring(0, 8);
		dh1.b = a(di1.c);
		stringbuilder.delete(0, stringbuilder.length());
		int i = dh1.d.lastIndexOf('.');
		String s1 = "";
		if (i > -1)
		{
			stringbuilder.append(dh1.d.substring(0, i));
			s1 = dh1.d.substring(i);
		} else
		{
			stringbuilder.append(dh1.d);
		}
		stringbuilder.append('_');
		stringbuilder.append(dh1.a);
		stringbuilder.append(dh1.b);
		stringbuilder.append(s1);
		dh1.e = stringbuilder.toString();
		dh1.c = new File(bf.g().a(dh1.e));
label0:
		{
			if (di1.c.renameTo(dh1.c) && dh1.c.exists())
				return dh1;
			break label0;
		}
		Exception exception;
		exception;
		return null;
	}

	static dh b(String s)
	{
		dh dh1;
		dh1 = null;
		String s1 = s;
		int i = s1.lastIndexOf('_');
		if (i <= -1 || s1.length() < i + 16)
			break MISSING_BLOCK_LABEL_154;
		dh1 = new dh();
		String s2 = s1.substring(0, i);
		dh1.e = s;
		dh1.a = s1.substring(i + 1, i + 9);
		dh1.b = s1.substring(i + 9, i + 17);
		if (s1.length() > i + 17)
			s2 = (new StringBuilder(String.valueOf(s2))).append(s1.substring(i + 17)).toString();
		dh1.d = s2;
		dh1.c = new File(bf.g().a(s));
		if (dh1.c.exists())
			return dh1;
		return dh1;
		Exception exception;
		exception;
		return null;
	}

}
