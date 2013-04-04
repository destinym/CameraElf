// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			cy, dm, do, dp

class dn
{

	private dm b;
	private cy c;
	private dp d;
	private do e;
	final dm a;

	public dn(dm dm1, dm dm2)
	{
		a = dm1;
		super();
		b = dm2;
		if (dm2.d())
			c = cy.b;
		else
			switch (dm2.g())
			{
			case 120: // 'x'
				c = cy.a;
				break;

			case 160: 
				c = cy.b;
				break;

			case 240: 
				c = cy.c;
				break;

			case 320: 
				c = cy.d;
				break;

			default:
				c = cy.b;
				break;
			}
	}

	public int a()
	{
		return c.b();
	}

	public cy b()
	{
		return c;
	}

	dp c()
	{
		if (d == null)
			d = new dp(this, b, this);
		return d;
	}

	do d()
	{
		if (e == null)
			e = new do(this, b, this);
		return e;
	}
}
