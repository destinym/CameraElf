// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;


class da
{

	static boolean a(int i)
	{
		switch (i)
		{
		case -1: 
		case 11: // '\013'
		case 21: // '\025'
		case 22: // '\026'
		case 31: // '\037'
		case 41: // ')'
		case 42: // '*'
		case 43: // '+'
		case 44: // ','
			return true;
		}
		return false;
	}
}
