// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


class aj
{

	private static long a = 1000L;

	static long a()
	{
		return a;
	}

	static void a(int i)
	{
		i = Math.abs(i);
		a = i * 1000;
	}

}
