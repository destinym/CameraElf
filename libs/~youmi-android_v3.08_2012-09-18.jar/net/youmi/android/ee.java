// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.graphics.Bitmap;
import java.io.*;
import java.util.Vector;

// Referenced classes of package net.youmi.android:
//			bj, ef, gz

class ee
	implements Serializable
{

	private byte a[];
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
	private int l;
	private int m;
	private int n;
	private int o;
	private final Vector p;
	private int q;
	private final int r[];
	private int s;
	private int t[];
	private byte u[];
	private final int v[];
	private final byte w[];
	private final short x[];
	private final byte y[];
	private final byte z[];

	ee(InputStream inputstream)
	{
		p = new Vector();
		q = 0;
		r = new int[4];
		v = new int[256];
		w = new byte[256];
		x = new short[4096];
		y = new byte[4096];
		z = new byte[4097];
		a(inputstream);
	}

	ee(byte abyte0[])
	{
		this(abyte0, 0, abyte0.length);
	}

	ee(byte abyte0[], int i1, int j1)
	{
		p = new Vector();
		q = 0;
		r = new int[4];
		v = new int[256];
		w = new byte[256];
		x = new short[4096];
		y = new byte[4096];
		z = new byte[4097];
		a = abyte0;
		b = i1;
		g();
	}

	private final void a(InputStream inputstream)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(inputstream.available());
		byte abyte0[] = new byte[1024];
		for (int i1 = 0; (i1 = inputstream.read(abyte0)) != -1;)
			bytearrayoutputstream.write(abyte0, 0, i1);

		a = bytearrayoutputstream.toByteArray();
		b = 0;
		try
		{
			inputstream.close();
			bytearrayoutputstream.close();
		}
		catch (Exception exception) { }
		g();
	}

	private final void g()
	{
		String s1 = "";
		s1 = (new StringBuilder(String.valueOf(s1))).append((char)a[b]).toString();
		s1 = (new StringBuilder(String.valueOf(s1))).append((char)a[b + 1]).toString();
		s1 = (new StringBuilder(String.valueOf(s1))).append((char)a[b + 2]).toString();
		if (!s1.equalsIgnoreCase("GIF"))
			throw new IOException("this is not a gif image");
		String s2 = "";
		s2 = (new StringBuilder(String.valueOf(s2))).append((char)a[b + 3]).toString();
		s2 = (new StringBuilder(String.valueOf(s2))).append((char)a[b + 4]).toString();
		s2 = (new StringBuilder(String.valueOf(s2))).append((char)a[b + 5]).toString();
		if (!s2.equalsIgnoreCase("87a") && !s2.equalsIgnoreCase("89a"))
			throw new IOException("this is not a gif image");
		b += 6;
		c = bj.a(a, b, 2);
		d = bj.a(a, b + 2, 2);
		e = bj.a(a[b + 4], 7, 1);
		f = bj.a(a[b + 4], 4, 3);
		g = bj.a(a[b + 4], 3, 1);
		h = bj.a(a[b + 4], 0, 3);
		i = a[b + 5] & 0xff;
		k = a[b + 6] & 0xff;
		b += 7;
		if (e == 1)
		{
			m = b;
			l = 1 << h + 1;
			b += l * 3;
			a(m, l);
			j = v[i];
		}
		Object obj = null;
		int ai[] = (int[])null;
		n = 0;
		boolean flag = false;
		for (boolean flag1 = false; !flag1;)
		{
			int i1 = a[b++] & 0xff;
			if (i1 == -1)
				break;
			switch (i1)
			{
			default:
				break;

			case 44: // ','
				ef ef1 = new ef(this);
				ef.a(ef1);
				ef1.n = ai;
				p.addElement(ef1);
				n++;
				break;

			case 33: // '!'
				int j1 = a[b++] & 0xff;
				switch (j1)
				{
				case 249: 
					ai = i();
					break;

				default:
					h();
					break;
				}
				break;

			case 59: // ';'
				flag1 = true;
				break;
			}
		}

	}

	private final void a(int i1, int j1)
	{
		boolean flag = false;
		for (int l1 = 0; l1 < j1; l1++)
		{
			int k1 = a[i1++] & 0xff;
			k1 = (k1 << 8) + (a[i1++] & 0xff);
			k1 = (k1 << 8) + (a[i1++] & 0xff);
			v[l1] = k1 | 0xff000000;
		}

	}

	private final void h()
	{
		for (int i1 = a[b++] & 0xff; i1 > 0; i1 = a[b++] & 0xff)
			b += i1;

	}

	private final int[] i()
	{
		int i1 = a[b++] & 0xff;
		if (i1 != 4)
		{
			throw new IOException("parse graphics extend block error");
		} else
		{
			int ai[] = new int[6];
			ai[0] = bj.a(a[b], 5, 3);
			ai[1] = bj.a(a[b], 2, 3);
			ai[2] = bj.a(a[b], 1, 1);
			ai[3] = bj.a(a[b], 0, 1);
			ai[4] = bj.a(a, b + 1, 2) * 10;
			ai[5] = bj.a(a, b + 3, 1);
			b += i1;
			return ai;
		}
	}

	final int a()
	{
		return c;
	}

	final int b()
	{
		return d;
	}

	final int c()
	{
		return n;
	}

	final int[] d()
	{
		b(o++);
		if (o >= n)
			o = 0;
		return t;
	}

	final synchronized Bitmap e()
	{
		int ai[] = d();
		if (ai != null)
			return Bitmap.createBitmap(ai, a(), b(), android.graphics.Bitmap.Config.ARGB_8888);
		else
			return null;
		Exception exception;
		exception;
		return null;
	}

	private final void b(int i1)
	{
		if (t == null)
			t = new int[c * d];
		ef ef1 = (ef)p.elementAt(i1);
		int ai[] = ef1.n;
		if (q > 0 && q == 2)
			if (ai != null && ai[3] == 1)
			{
				for (int j1 = r[1]; j1 < r[3]; j1++)
				{
					for (int l1 = r[0]; l1 < r[2]; l1++)
						t[j1 * c + l1] = 0;

				}

			} else
			{
				for (int k1 = r[1]; k1 < r[3]; k1++)
				{
					for (int i2 = r[0]; i2 < r[2]; i2++)
						t[k1 * c + i2] = s;

				}

			}
		a(ef1, t);
		s = j;
		q = 0;
		if (ai != null)
		{
			q = ai[1];
			if (ef1.e == 0 && i == ai[5])
				s = 0;
		}
		r[0] = ef1.a;
		r[1] = ef1.b;
		r[2] = ef1.a + ef1.c;
		r[3] = ef1.b + ef1.d;
	}

	private final void a(ef ef1, int ai[])
	{
		ef1.a();
		if (ef1.e == 1)
			a(ef1.k, ef1.j);
		else
			a(m, l);
		int ai1[] = ef1.n;
		boolean flag = false;
		int i1 = 0;
		int j1 = 0;
		if (ai1 != null && ai1[3] == 1)
		{
			flag = true;
			i1 = ai1[5];
			j1 = v[i1];
			v[i1] = 0;
		}
		boolean flag1 = ef1.f == 1;
		int k1 = ef1.c;
		int l1 = ef1.d;
		int i2 = ef1.a;
		int j2 = ef1.b;
		int k2 = 0;
		for (int i4 = 0; i4 < l1; i4++)
		{
			if (!flag1)
				k2 = j2 + i4;
			if (k2 < d)
			{
				int j3 = k2 * c;
				int l2 = j3 + i2;
				int i3 = l2 + k1;
				if (j3 + c < i3)
					i3 = j3 + c;
				int k3 = i4 * k1;
				for (; l2 < i3; l2++)
				{
					int j4 = u[k3++] & 0xff;
					int l3 = v[j4];
					if (l3 != 0)
						ai[l2] = l3;
				}

			}
		}

		if (flag)
			v[i1] = j1;
	}

	final int f()
	{
		gz.c((new StringBuilder("{{{{{{{{{{{{{{{{{{{{{{{{{  curFrame:")).append(o).append(" frameNums:").append(n).toString());
		int i1 = o - 1;
		if (i1 < 0)
			i1 = n - 1;
		return a(i1);
	}

	final int a(int i1)
	{
		if (i1 < 0 || i1 >= n)
			throw new IllegalArgumentException((new StringBuilder("the frame[ ")).append(i1).append(" ]is invalid").toString());
		int j1 = 0;
		ef ef1 = (ef)p.elementAt(i1);
		int ai[] = ef1.n;
		if (ai != null)
			j1 = ai[4];
		return j1;
	}

	static byte[] a(ee ee1)
	{
		return ee1.a;
	}

	static int b(ee ee1)
	{
		return ee1.b;
	}

	static void a(ee ee1, int i1)
	{
		ee1.b = i1;
	}

	static int c(ee ee1)
	{
		return ee1.e;
	}

	static byte[] d(ee ee1)
	{
		return ee1.u;
	}

	static void a(ee ee1, byte abyte0[])
	{
		ee1.u = abyte0;
	}

	static short[] e(ee ee1)
	{
		return ee1.x;
	}

	static byte[] f(ee ee1)
	{
		return ee1.y;
	}

	static byte[] g(ee ee1)
	{
		return ee1.w;
	}

	static byte[] h(ee ee1)
	{
		return ee1.z;
	}
}
