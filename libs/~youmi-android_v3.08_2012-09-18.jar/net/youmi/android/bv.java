// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			AdView

class bv
	implements Runnable
{

	final AdView a;

	bv(AdView adview)
	{
		a = adview;
		super();
	}

	public void run()
	{
		try
		{
			a.e();
		}
		catch (Exception exception) { }
	}
}
