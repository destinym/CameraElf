// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			gw

final class ga
{

	private String a;
	private String b;

	ga()
	{
	}

	public String a()
	{
		return a;
	}

	public void a(String s)
	{
		a = s;
	}

	public String b()
	{
		return b;
	}

	public void b(String s)
	{
		try
		{
			s = gw.a(s);
			if (s != null)
				b = s;
		}
		catch (Throwable throwable) { }
	}
}
