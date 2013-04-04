// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import java.io.ByteArrayOutputStream;

// Referenced classes of package net.youmi.android:
//			cz, dm, gz

class br
{

	static boolean a(Context context, String s, String s1, Bitmap bitmap)
	{
		try
		{
			gz.c((new StringBuilder("---------------------------------iconName:")).append(s).append(" uri:").append(s1).toString());
			Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
			intent.putExtra("android.intent.extra.shortcut.NAME", s);
			if (bitmap == null)
			{
				android.content.Intent.ShortcutIconResource shortcuticonresource = android.content.Intent.ShortcutIconResource.fromContext(context, 0x108000c);
				intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", shortcuticonresource);
			} else
			{
				dm dm1 = dm.a((Activity)context);
				int i = (int)(64F * dm1.h());
				bitmap = Bitmap.createScaledBitmap(bitmap, i, i, true);
				byte abyte0[] = a(bitmap);
				intent.putExtra("android.intent.extra.shortcut.ICON", BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length));
			}
			intent.putExtra("duplicate", false);
			Intent intent1 = Intent.parseUri(s1, 0);
			intent.putExtra("android.intent.extra.shortcut.INTENT", intent1);
			context.sendBroadcast(intent);
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
		return true;
	}

	static boolean a(Context context, String s, String s1, Bitmap bitmap, cz cz1)
	{
		try
		{
			gz.c((new StringBuilder("---------------------------------iconName:")).append(s).append(" uri:").append(s1).toString());
			Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
			intent.putExtra("android.intent.extra.shortcut.NAME", s);
			if (bitmap == null)
			{
				android.content.pm.ApplicationInfo applicationinfo = context.getPackageManager().getApplicationInfo(cz1.A(), 128);
				bitmap = ((BitmapDrawable)context.getPackageManager().getApplicationIcon(applicationinfo)).getBitmap();
				intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
			} else
			{
				gz.c("icon is originIcon");
				byte abyte0[] = a(bitmap);
				intent.putExtra("android.intent.extra.shortcut.ICON", BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length));
			}
			intent.putExtra("duplicate", false);
			Intent intent1 = null;
			if (cz1.T())
				intent1 = context.getPackageManager().getLaunchIntentForPackage(cz1.A());
			else
				intent1 = Intent.parseUri(s1, 0);
			intent.putExtra("android.intent.extra.shortcut.INTENT", intent1);
			context.sendBroadcast(intent);
		}
		catch (Throwable throwable)
		{
			throwable.printStackTrace();
			return false;
		}
		return true;
	}

	private static byte[] a(Bitmap bitmap)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
		bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
		return bytearrayoutputstream.toByteArray();
	}
}
