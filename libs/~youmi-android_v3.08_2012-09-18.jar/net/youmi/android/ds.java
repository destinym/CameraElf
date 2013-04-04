// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			dm

class ds
{

	private float b;
	private float c;
	private float d;
	final dm a;

	ds(dm dm1, dm dm2)
	{
		a = dm1;
		super();
		b = 9F;
		c = 16F;
		d = 11F;
		if (!dm2.d())
			switch (dm2.g())
			{
			case 120: // 'x'
				b = 7F;
				c = 16F;
				d = 11F;
				break;

			case 160: 
				b = 9F;
				c = 16F;
				d = 11F;
				break;

			case 240: 
				b = 14F;
				c = 16F;
				d = 11F;
				break;

			case 320: 
				b = 18F;
				c = 16F;
				d = 11F;
				break;

			default:
				b = 9F;
				c = 16F;
				d = 11F;
				break;
			}
	}

	float a()
	{
		return b;
	}

	float b()
	{
		return c;
	}

	float c()
	{
		return d;
	}
}
