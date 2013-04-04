// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.util.Stack;

// Referenced classes of package net.youmi.android:
//			bx, cd, by

class cc
{

	private cd b;
	private Stack c;
	private bx d;
	private Stack e;
	final by a;

	cc(by by, cd cd1)
	{
		a = by;
		super();
		c = new Stack();
		e = new Stack();
		b = cd1;
	}

	bx a()
	{
		return d;
	}

	bx b()
	{
		if (e.size() > 0)
		{
			bx bx1 = (bx)e.pop();
			if (bx1 != null)
			{
				if (d != null)
					c.push(d);
				d = bx1;
				if (b != null)
					b.a(this);
				return d;
			}
		}
		return null;
	}

	bx c()
	{
		if (c.size() > 0)
		{
			bx bx1 = (bx)c.pop();
			if (bx1 != null)
			{
				if (d != null)
					e.push(d);
				d = bx1;
				if (b != null)
					b.a(this);
				return d;
			}
		}
		return null;
	}

	bx a(bx bx1)
	{
		if (d != null && d != bx1)
			c.push(d);
		e.clear();
		d = bx1;
		if (b != null)
			b.a(this);
		return d;
	}

	boolean d()
	{
		return d != null;
	}

	boolean e()
	{
		return e.size() > 0;
	}

	boolean f()
	{
		return c.size() > 0;
	}
}
