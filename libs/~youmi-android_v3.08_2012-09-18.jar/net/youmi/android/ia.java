// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			hy

class ia
	implements Runnable
{

	final hy a;
	private final String b;

	ia(hy hy1, String s)
	{
		a = hy1;
		b = s;
		super();
	}

	public void run()
	{
		try
		{
			a.loadUrl(b);
		}
		catch (Throwable throwable) { }
	}
}
