// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package net.youmi.android:
//			bj, ee

final class ef
	implements Serializable
{

	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int g;
	int h;
	int i;
	int j;
	int k;
	byte l;
	int m;
	int n[];
	final ee o;

	ef(ee ee1)
	{
		o = ee1;
		super();
	}

	private final void b()
	{
		a = bj.a(ee.a(o), ee.b(o), 2);
		b = bj.a(ee.a(o), ee.b(o) + 2, 2);
		c = bj.a(ee.a(o), ee.b(o) + 4, 2);
		d = bj.a(ee.a(o), ee.b(o) + 6, 2);
		e = bj.a(ee.a(o)[ee.b(o) + 8], 7, 1);
		f = bj.a(ee.a(o)[ee.b(o) + 8], 6, 1);
		if (f != 0)
			throw new IOException("unsupport interf flag now");
		g = bj.a(ee.a(o)[ee.b(o) + 8], 5, 1);
		h = bj.a(ee.a(o)[ee.b(o) + 8], 3, 2);
		i = bj.a(ee.a(o)[ee.b(o) + 8], 0, 3);
		ee.a(o, ee.b(o) + 9);
		if (e == 1)
		{
			k = ee.b(o);
			j = 1 << i + 1;
			ee.a(o, ee.b(o) + j * 3);
		} else
		if (ee.c(o) == 0)
			throw new IOException("gct and lct is all null");
		this;
		ee.a(o);
		o;
		ee.b(o);
		JVM INSTR dup_x1 ;
		1;
		JVM INSTR iadd ;
		ee.a();
		JVM INSTR baload ;
		l;
		m = ee.b(o);
		a(m);
		return;
	}

	final void a()
	{
		a(m, l);
	}

	private final void a(int i1)
	{
		for (int j1 = ee.a(o)[i1++] & 0xff; j1 > 0; j1 = ee.a(o)[i1++] & 0xff)
			i1 += j1;

		ee.a(o, i1);
	}

	private final void a(int i1, int j1)
	{
		byte byte0 = -1;
		int k1 = c * d;
		if (ee.d(o) == null || ee.d(o).length < k1)
			ee.a(o, new byte[k1]);
		int l1 = 1 << j1;
		int i2 = l1 + 1;
		int j2 = l1 + 2;
		int k2 = j1 + 1;
		int l2 = (1 << k2) - 1;
		boolean flag = false;
		int k3 = byte0;
		boolean flag1 = false;
		int i4 = 0;
		int j4 = 0;
		int k4 = 0;
		int l4 = 0;
		int i5 = 0;
		int k5 = 0;
		int l5 = 0;
		int i6 = 0;
		for (int i3 = 0; i3 < l1; i3++)
		{
			ee.e(o)[i3] = 0;
			ee.f(o)[i3] = (byte)i3;
		}

		i5 = 0;
		while (i5 < k1) 
		{
			if (l5 == 0)
			{
				if (i4 < k2)
				{
					if (j4 == 0)
					{
						j4 = ee.a(o)[i1++] & 0xff;
						if (j4 <= 0)
							break;
						System.arraycopy(ee.a(o), i1, ee.g(o), 0, j4);
						i1 += j4;
						l4 = 0;
					}
					k4 += (ee.g(o)[l4] & 0xff) << i4;
					i4 += 8;
					l4++;
					j4--;
					continue;
				}
				int j3 = k4 & l2;
				k4 >>= k2;
				i4 -= k2;
				if (j3 > j2 || j3 == i2)
					break;
				if (j3 == l1)
				{
					k2 = j1 + 1;
					l2 = (1 << k2) - 1;
					j2 = l1 + 2;
					k3 = byte0;
					continue;
				}
				if (k3 == byte0)
				{
					ee.h(o)[l5++] = ee.f(o)[j3];
					k3 = j3;
					k5 = j3;
					continue;
				}
				int l3 = j3;
				if (j3 == j2)
				{
					ee.h(o)[l5++] = (byte)k5;
					j3 = k3;
				}
				for (; j3 > l1; j3 = ee.e(o)[j3])
					ee.h(o)[l5++] = ee.f(o)[j3];

				k5 = ee.f(o)[j3] & 0xff;
				if (j2 >= 4096)
					break;
				ee.h(o)[l5++] = (byte)k5;
				ee.e(o)[j2] = (short)k3;
				ee.f(o)[j2] = (byte)k5;
				if ((++j2 & l2) == 0 && j2 < 4096)
				{
					k2++;
					l2 += j2;
				}
				k3 = l3;
			}
			l5--;
			ee.d(o)[i6++] = ee.h(o)[l5];
			i5++;
		}
		for (int j5 = i6; j5 < k1; j5++)
			ee.d(o)[j5] = 0;

	}

	static void a(ef ef1)
	{
		ef1.b();
	}
}
