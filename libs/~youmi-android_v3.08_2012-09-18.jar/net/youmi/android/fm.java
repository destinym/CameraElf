// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


// Referenced classes of package net.youmi.android:
//			ev, ff, gz, eu

abstract class fm
{

	private eu a;

	public fm(eu eu)
	{
		a = eu;
	}

	public boolean d(String s)
	{
		try
		{
			gz.d(s);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean i(String s)
	{
		try
		{
			gz.a(s);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean e(String s)
	{
		try
		{
			gz.b(s);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean w(String s)
	{
		try
		{
			gz.e(s);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public boolean dd(String s)
	{
		return true;
	}

	public boolean di(String s)
	{
		return true;
	}

	public boolean de(String s)
	{
		return true;
	}

	public boolean dw(String s)
	{
		return true;
	}

	public String a(int j, int k, String s)
	{
		ev ev1 = null;
		j;
		JVM INSTR tableswitch 0 8: default 126
	//	               0 56
	//	               1 66
	//	               2 76
	//	               3 126
	//	               4 86
	//	               5 96
	//	               6 106
	//	               7 126
	//	               8 116;
		   goto _L1 _L2 _L3 _L4 _L1 _L5 _L6 _L7 _L1 _L8
_L2:
		ev1 = a(k);
		break; /* Loop/switch isn't completed */
_L3:
		ev1 = b(k);
		break; /* Loop/switch isn't completed */
_L4:
		ev1 = c(k);
		break; /* Loop/switch isn't completed */
_L5:
		ev1 = d(k);
		break; /* Loop/switch isn't completed */
_L6:
		ev1 = e(k);
		break; /* Loop/switch isn't completed */
_L7:
		ev1 = f(k);
		break; /* Loop/switch isn't completed */
_L8:
		ev1 = g(k);
		break; /* Loop/switch isn't completed */
_L1:
		return ff.b(4);
		if (ev1 != null)
			return ev1.a(a, s);
		return ff.b(4);
		Throwable throwable;
		throwable;
		return ff.b(3);
	}

	abstract ev a(int j);

	abstract ev b(int j);

	abstract ev c(int j);

	abstract ev d(int j);

	abstract ev e(int j);

	abstract ev f(int j);

	abstract ev g(int j);
}
