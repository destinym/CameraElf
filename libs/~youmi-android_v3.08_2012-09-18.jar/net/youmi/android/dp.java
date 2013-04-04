// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			dm, dn

class dp
{

	private int b;
	private int c;
	final dn a;

	dp(dn dn1, dm dm1, dn dn2)
	{
		a = dn1;
		super();
		b = 0;
		c = 0;
		if (dm1.d())
			c = 36;
		else
			switch (dm1.g())
			{
			case 120: // 'x'
				c = 27;
				break;

			case 160: 
				c = 36;
				break;

			case 240: 
				c = 54;
				break;

			case 320: 
				c = 72;
				break;

			default:
				c = 36;
				break;
			}
		b = (dn2.a() - c) / 2;
		if (b < 0)
			b = 0;
	}

	int a()
	{
		return b;
	}

	int b()
	{
		return c;
	}
}
