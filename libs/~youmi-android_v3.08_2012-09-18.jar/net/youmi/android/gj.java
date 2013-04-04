// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;

class gj
{

	static boolean a(Context context, int i, Notification notification)
	{
		try
		{
			NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
			notificationmanager.notify(i, notification);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	static int a(int i, int j)
	{
		int k = i;
		try
		{
			switch (j)
			{
			case 0: // '\0'
				k += 0;
				break;

			case 1: // '\001'
				k += 0x186a0;
				break;

			case 2: // '\002'
				k += 0x30d40;
				break;

			default:
				k += 0;
				break;
			}
		}
		catch (Throwable throwable) { }
		return k;
	}

	static boolean a(Context context, int i)
	{
		try
		{
			NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
			notificationmanager.cancel(i);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}
}
