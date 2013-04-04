// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			dm, dn

class do
{

	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private float g;
	final dn a;

	do(dn dn1, dm dm1, dn dn2)
	{
		a = dn1;
		super();
		b = 0;
		c = 0;
		d = 5;
		e = 0;
		f = 0;
		g = 0.0F;
		if (dm1.d())
		{
			b = 24;
			c = 28;
			e = 36;
			g = 16F;
		} else
		{
			switch (dm1.g())
			{
			case 120: // 'x'
				b = 18;
				c = 21;
				e = 27;
				g = 14F;
				break;

			case 160: 
				b = 24;
				c = 28;
				e = 36;
				g = 16F;
				break;

			case 240: 
				b = 36;
				c = 42;
				e = 54;
				g = 23F;
				break;

			case 320: 
				b = 48;
				c = 56;
				e = 72;
				g = 28F;
				break;

			default:
				b = 24;
				c = 28;
				e = 36;
				g = 16F;
				break;
			}
		}
		d = dm1.a(5);
		f = (e - c) / 2;
	}

	int a()
	{
		return d;
	}

	int b()
	{
		return b;
	}

	int c()
	{
		return c;
	}

	int d()
	{
		return f;
	}

	int e()
	{
		return e;
	}

	float f()
	{
		return g;
	}
}
