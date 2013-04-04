// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;

// Referenced classes of package net.youmi.android:
//			ar, br, c, cp, 
//			cz, d, dm, e, 
//			eo, hw, z

public final class AdActivity extends Activity
{

	cz a;
	private d b;
	private dm c;

	public AdActivity()
	{
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
		c = dm.a(this);
		b();
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if (i != 4 || b == null)
			break MISSING_BLOCK_LABEL_24;
		b.a();
		return true;
		Exception exception;
		exception;
		return super.onKeyDown(i, keyevent);
	}

	void a()
	{
		try
		{
			finish();
		}
		catch (Exception exception) { }
	}

	private void b()
	{
		Intent intent = getIntent();
		String s = intent.getStringExtra("D780FBF4215247bcBB1AC0AD33C474FE");
		if (s.equals("A821718FB7F248b590F3721F6576D289"))
		{
			b = new e(this, c);
			requestWindowFeature(2);
			setProgressBarIndeterminate(false);
			setContentView(b.b());
			return;
		}
		if (s.equals("FD7C4B12A60F415dBE8C580A137F5F1C"))
		{
			cz cz1 = ar.a;
			if (cz1 != null)
			{
				a = cz1;
				switch (cz1.a())
				{
				default:
					break;

				case 11: // '\013'
					if (cz1.i() == null)
					{
						a();
						break;
					}
					e e1 = new e(this, c);
					requestWindowFeature(2);
					setProgressBarIndeterminate(false);
					b = e1;
					setContentView(b.b());
					e1.a(cz1.i());
					try
					{
						if (hw.h(this) && cz1.Q() != null && !cz1.Q().equals(""))
							if (!cz1.M())
							{
								boolean flag = br.a(this, cz1.O(), cz1.Q(), cz1.R());
								cz1.b(0);
								if (flag)
									cp.a(this, cz1);
							} else
							if (cz1.N() == 0)
							{
								boolean flag1 = br.a(this, cz1.O(), cz1.Q(), cz1.R());
								cz1.b(0);
								if (flag1)
									cp.a(this, cz1);
							} else
							{
								a(cz1);
							}
					}
					catch (Throwable throwable) { }
					return;
				}
			}
		}
		if (s.equals("FEDC335110C04414AF100EA25C26A70D"))
		{
			setTitle("下载管理");
			z z1 = new z(this, c);
			b = z1;
			setContentView(b.b());
			return;
		}
		if (s.equals("DB9C288EF60A40d4897665843327626E"))
		{
			String as[] = intent.getStringArrayExtra("EB80F3291A8E469c962CA133BDC549D7");
			if (as != null && as.length > 0)
			{
				requestWindowFeature(1);
				getWindow().setFlags(1024, 1024);
				String s1 = intent.getStringExtra("172C94EDC717477aBF600D7898A64A8E");
				String s2 = intent.getStringExtra("D50EF1926ADD471892E72BCE6D7E032C");
				b = new eo(this, c, as, s1, s2);
				setContentView(b.b());
				return;
			}
		}
		a();
	}

	static void a(Activity activity)
	{
		Intent intent = new Intent(activity, net/youmi/android/AdActivity);
		intent.putExtra("D780FBF4215247bcBB1AC0AD33C474FE", "FD7C4B12A60F415dBE8C580A137F5F1C");
		activity.startActivity(intent);
	}

	static void a(Activity activity, String as[], String s, String s1)
	{
		if (as == null)
			return;
		if (as.length == 0)
			return;
		try
		{
			Intent intent = new Intent(activity, net/youmi/android/AdActivity);
			intent.putExtra("D780FBF4215247bcBB1AC0AD33C474FE", "DB9C288EF60A40d4897665843327626E");
			intent.putExtra("EB80F3291A8E469c962CA133BDC549D7", as);
			intent.putExtra("172C94EDC717477aBF600D7898A64A8E", s);
			intent.putExtra("D50EF1926ADD471892E72BCE6D7E032C", s1);
			activity.startActivity(intent);
		}
		catch (Exception exception) { }
		return;
	}

	static void b(Activity activity)
	{
		Intent intent = new Intent(activity, net/youmi/android/AdActivity);
		intent.putExtra("D780FBF4215247bcBB1AC0AD33C474FE", "FEDC335110C04414AF100EA25C26A70D");
		activity.startActivity(intent);
	}

	static Intent a(Context context)
	{
		Intent intent = new Intent();
		intent.setClassName(context.getPackageName(), net/youmi/android/AdActivity.getName());
		intent.putExtra("D780FBF4215247bcBB1AC0AD33C474FE", "FEDC335110C04414AF100EA25C26A70D");
		return intent;
	}

	private void a(cz cz1)
	{
		AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).setIcon(0x108000c).setTitle(cz1.O()).setMessage(cz1.P()).setPositiveButton("确定", new c(this, cz1)).setNegativeButton("取消", null).create();
		alertdialog.show();
	}
}
