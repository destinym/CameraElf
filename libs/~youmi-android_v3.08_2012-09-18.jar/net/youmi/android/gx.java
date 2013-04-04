// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


class gx
{

	public static final char a[] = "0123456789abcdef".toCharArray();
	private static final char b[] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-".toCharArray();

	public static byte a(char c)
	{
		try
		{
			c = Character.toLowerCase(c);
		}
		catch (Throwable throwable) { }
		return (byte)"0123456789abcdef".indexOf(c);
	}

	public static String a(byte abyte0[])
	{
		StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
		for (int i = 0; i < abyte0.length; i++)
		{
			stringbuilder.append(a[(abyte0[i] & 0xf0) >>> 4]);
			stringbuilder.append(a[abyte0[i] & 0xf]);
		}

		return stringbuilder.toString();
	}

}
