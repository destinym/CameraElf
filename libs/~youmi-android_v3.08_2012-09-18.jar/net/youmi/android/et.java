// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.os.Environment;
import android.view.View;
import java.io.File;

// Referenced classes of package net.youmi.android:
//			bk, bu, ed, eo, 
//			hx

class et
	implements android.view.View.OnClickListener
{

	final eo a;

	et(eo eo1)
	{
		a = eo1;
		super();
	}

	public void onClick(View view)
	{
		if (eo.b(a) == null)
			return;
		if (!hx.a(a.a))
		{
			bu.a(a.a, "存储卡不可用,无法保存图片");
			return;
		}
		try
		{
			File file = new File(eo.b(a).a);
			if (file != null && file.exists())
			{
				String s = file.getName();
				try
				{
					if (eo.b(a).d != null)
					{
						String s1 = eo.b(a).d.toLowerCase();
						if (s1.equals("image/jpeg"))
							s = (new StringBuilder(String.valueOf(s))).append(".jpg").toString();
						else
						if (s1.equals("image/png"))
							s = (new StringBuilder(String.valueOf(s))).append(".png").toString();
						else
						if (s1.equals("image/gif"))
							s = (new StringBuilder(String.valueOf(s))).append(".gif").toString();
						else
							s = (new StringBuilder(String.valueOf(s))).append(".jpg").toString();
					}
				}
				catch (Exception exception1) { }
				String s2 = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/Pictures/").toString();
				File file1 = new File(s2);
				if (!file1.exists())
					file1.mkdirs();
				String s3 = (new StringBuilder(String.valueOf(s2))).append(s).toString();
				File file2 = new File(s3);
				if (file2 != null && bk.a(file, file2))
				{
					bu.b(a.a, (new StringBuilder("图片已经保存到")).append(s3).toString());
					return;
				}
			}
		}
		catch (Exception exception) { }
		return;
	}
}
