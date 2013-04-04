// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.io.File;

// Referenced classes of package net.youmi.android:
//			ag, be, bm, bp, 
//			bu, ch, cl, gz, 
//			hx

class bd
{

	static boolean a(Activity activity, Handler handler)
	{
		try
		{
			if (ag.e() && hx.a(activity) && handler != null)
				handler.post(new be(activity));
		}
		catch (Exception exception) { }
		return false;
	}

	static void a(Context context, cl cl1)
	{
		try
		{
			ch ch1 = new ch(context, cl1);
			ch1.execute(new String[] {
				cl1.d
			});
		}
		catch (Exception exception) { }
	}

	static boolean a(Context context, File file, cl cl1)
	{
		PackageInfo packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
		PackageInfo packageinfo1 = bp.a(context, file.getPath());
		if (packageinfo1 == null)
			break MISSING_BLOCK_LABEL_53;
		if (!packageinfo1.packageName.equals(context.getPackageName()))
			break MISSING_BLOCK_LABEL_67;
		bm.b(context, file.getPath());
		return true;
		try
		{
			bu.b(context, "安装过程出现错误,请稍后重试");
		}
		catch (Exception exception)
		{
			gz.a(exception);
		}
		return false;
	}
}
