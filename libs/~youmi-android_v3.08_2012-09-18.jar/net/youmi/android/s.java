// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import java.io.*;

// Referenced classes of package net.youmi.android:
//			cz, ee, eh, gz, 
//			q, u

class s extends RelativeLayout
	implements u
{

	ee a;
	eh b;
	final q c;

	public s(q q1, Activity activity, int i)
	{
		c = q1;
		super(activity);
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(q.a(q1), q.b(q1));
		b = new eh(activity, q.a(q1), q.b(q1), i);
		addView(b, layoutparams);
	}

	public void a()
	{
		b.a();
		setVisibility(8);
	}

	public boolean a(cz cz1)
	{
label0:
		{
			if (cz1 == null)
				return false;
			try
			{
				a = null;
				if (cz1.m() == null)
					break label0;
				a = (ee)a(cz1.m());
			}
			catch (Exception exception)
			{
				return false;
			}
			return true;
		}
		return false;
	}

	public void b()
	{
		try
		{
			b.a(a);
		}
		catch (Exception exception) { }
	}

	public void c()
	{
		setVisibility(0);
	}

	public void a(Animation animation)
	{
	}

	public void d()
	{
		try
		{
			b.a(a);
		}
		catch (Exception exception) { }
	}

	public Object a(Object obj)
	{
		Object obj1 = null;
		try
		{
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
			objectoutputstream.writeObject(obj);
			ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(bytearrayoutputstream.toByteArray());
			ObjectInputStream objectinputstream = new ObjectInputStream(bytearrayinputstream);
			obj1 = objectinputstream.readObject();
		}
		catch (Throwable throwable)
		{
			gz.a(throwable);
		}
		return obj1;
	}
}
