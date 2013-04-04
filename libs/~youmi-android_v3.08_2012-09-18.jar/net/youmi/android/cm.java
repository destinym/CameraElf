// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


class cm
{

	Object a[];

	cm(Object aobj[])
	{
		a = aobj;
	}

	Object a(int i, Object obj)
	{
label0:
		{
			if (a != null && i > -1 && i < a.length)
				return a[i];
			break label0;
		}
		Exception exception;
		exception;
		return obj;
	}
}
