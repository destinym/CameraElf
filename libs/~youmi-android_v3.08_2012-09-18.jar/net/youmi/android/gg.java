// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.util.LinkedList;

// Referenced classes of package net.youmi.android:
//			ew

class gg
	implements ew
{

	private static gg a;
	private LinkedList b;

	gg()
	{
	}

	public static gg a()
	{
		if (a == null)
			a = new gg();
		return a;
	}

	private synchronized LinkedList b()
	{
		if (b == null)
			b = new LinkedList();
		return b;
	}

	public void a(ew ew1)
	{
		try
		{
			if (ew1 != null)
			{
				LinkedList linkedlist = b();
				if (linkedlist != null)
					linkedlist.add(ew1);
			}
		}
		catch (Throwable throwable) { }
	}

	public void b(ew ew1)
	{
		try
		{
			if (ew1 != null)
			{
				LinkedList linkedlist = b();
				if (linkedlist != null)
					linkedlist.remove(ew1);
			}
		}
		catch (Throwable throwable) { }
	}

	public void a(String s, String s1)
	{
		try
		{
			LinkedList linkedlist = b();
			for (int i = 0; i < linkedlist.size(); i++)
				try
				{
					ew ew1 = (ew)linkedlist.get(i);
					if (ew1 != null)
						ew1.a(s, s1);
				}
				catch (Throwable throwable1) { }

		}
		catch (Throwable throwable) { }
	}
}
