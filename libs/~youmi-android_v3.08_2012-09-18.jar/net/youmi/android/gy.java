// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.util.Random;

class gy
{

	private static final Random a = new Random(System.currentTimeMillis());

	public static final int a(int i)
	{
		return a.nextInt(i);
	}

	protected static final int a()
	{
		return a.nextInt();
	}

}
