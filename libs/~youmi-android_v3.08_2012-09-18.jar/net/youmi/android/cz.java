// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;

// Referenced classes of package net.youmi.android:
//			bf, bh, bp, bx, 
//			da, db, dd, ek, 
//			el, em, gz, ee, 
//			ih

class cz
{

	private long b;
	private long c;
	private long d;
	private long e;
	private boolean f;
	private boolean g;
	private boolean h;
	private boolean i;
	private boolean j;
	private boolean k;
	private boolean l;
	private boolean m;
	private boolean n;
	private boolean o;
	private boolean p;
	private boolean q;
	private boolean r;
	private int s;
	private int t;
	private int u;
	private int v;
	private int w;
	private int x;
	private int y;
	private int z;
	private int A;
	private int B;
	private int C;
	private String D;
	private String E;
	private String F;
	private String G;
	private String H;
	private String I;
	private String J;
	private String K;
	private String L;
	private String M;
	private String N;
	private String O;
	private String P;
	private String Q;
	private String R;
	private String S;
	private String T;
	private String U;
	private String V;
	private String W;
	private String X[];
	private Bitmap Y;
	private Bitmap Z;
	private Bitmap aa;
	private Bitmap ab;
	private bx ac;
	private bx ad;
	private ee ae;
	private ih af;
	static String a = "00000000";

	cz()
	{
		b = 0L;
		c = 0L;
		d = 0L;
		e = 0L;
		f = false;
		g = false;
		h = false;
		i = true;
		j = false;
		k = false;
		l = false;
		m = false;
		n = false;
		o = false;
		s = 11;
		t = 1;
		y = 0;
		z = 0;
		A = 0;
		B = 0;
		C = 0;
	}

	static cz a(Context context, boolean flag, String s1, String s2, String s3, int i1, int j1, String s4, 
			String s5, String s6, String s7, String s8, String s9, String s10, String s11, 
			String s12, ArrayList arraylist, boolean flag1, boolean flag2, String s13, long l1, 
			long l2, String s14, int k1, boolean flag3, boolean flag4, String s15, 
			int i2, boolean flag5, boolean flag6, int j2, String s16, String s17, String s18, 
			String s19, boolean flag7, String s20, String s21, long l3, int k2, 
			String s22, String s23)
	{
		flag = true;
		if (s1 == null)
			return null;
		s1 = s1.trim();
		if (s1.length() == 0)
			return null;
		if (s2 == null)
			return null;
		s2 = s2.trim();
		if (s2.length() == 0)
			return null;
		if (s3 == null)
			return null;
		s3 = s3.trim();
		if (s3.length() == 0)
			return null;
		if (!db.a(i1))
			return null;
		if (!da.a(j1))
			return null;
		cz cz1;
		cz1 = new cz();
		cz1.c = l1;
		cz1.d = l2;
		cz1.b = System.currentTimeMillis();
		cz1.G = s1;
		cz1.D = s2;
		cz1.F = s3;
		cz1.t = i1;
		cz1.s = j1;
		cz1.p = flag5;
		if (s13 != null)
		{
			s13 = s13.trim();
			if (s13.length() > 0)
				cz1.M = s13;
		}
		if (s4 == null)
			s4 = "00000000";
		s4 = s4.trim();
		if (s4.length() > 0)
		{
			if (s4.length() > 8)
				s4 = s4.substring(s4.length() - 8);
			else
			if (s4.length() < 8)
				try
				{
					StringBuilder stringbuilder = new StringBuilder();
					for (int j3 = 0; j3 < 8 - s4.length(); j3++)
						stringbuilder.append('0');

					stringbuilder.append(s4);
					s4 = stringbuilder.toString();
				}
				catch (Exception exception1) { }
		} else
		{
			s4 = "00000000";
		}
		cz1.E = s4;
		cz1.h = flag1;
		cz1.o = flag4;
		if (k1 <= 0)
			k1 = 0;
		cz1.u = k1;
		if (s14 == null)
		{
			s14 = "";
		} else
		{
			s14 = s14.trim();
			if (bp.b(context, s14))
			{
				cz1.h = false;
				cz1.n = true;
				if (flag3 && bp.b(context, s14, k1))
				{
					cz1.h = true;
					cz1.m = true;
				}
			}
		}
		cz1.N = s14;
		cz1.l = flag3;
		cz1.T = s20;
		cz1.e = l3;
		cz1.U = s21;
		if (s15 == null || "".equals(s15))
			s15 = "";
		else
			s15 = s15.trim();
		cz1.O = s15;
		if (i2 == 0)
			i2 = 0x10000000;
		cz1.v = i2;
		cz1.i = flag2;
		if (s5 != null)
		{
			s5 = s5.trim();
			if (s5.length() > 0)
				cz1.H = s5;
		}
		if (s6 != null)
		{
			s6 = s6.trim();
			if (s6.length() > 0)
				cz1.I = s6;
		}
		if (cz1.H == null && cz1.I != null)
		{
			cz1.H = cz1.I;
			cz1.I = null;
		}
		if (s10 != null)
			s10 = s10.trim();
		else
			s10 = "";
		if (s11 != null)
			s11 = s11.trim();
		else
			s11 = "";
		cz1.K = s10;
		cz1.L = s11;
		if (s10.length() > 0 || s11.length() > 0)
			cz1.k = true;
		else
			cz1.k = false;
		if (s12 == null && j1 != 31)
			return null;
		s12 = s12.trim();
		if (s12.length() == 0 && j1 != 31)
			return null;
		cz1.J = s12;
		if (arraylist != null && arraylist.size() > 0)
		{
			cz1.X = new String[arraylist.size()];
			for (int i3 = 0; i3 < arraylist.size(); i3++)
				cz1.X[i3] = (String)arraylist.get(i3);

		}
		if (cz1.b() == 1)
			if (s7 == null)
			{
				cz1.t = 0;
			} else
			{
				s7 = s7.trim();
				if (s7.length() > 0)
					try
					{
						try
						{
							if (bf.a().e(s7))
								cz1.Y = bf.a().g(s7);
						}
						catch (Exception exception2) { }
						if (cz1.Y == null)
							if (flag)
							{
								ek ek1 = new ek(bf.a());
								if (ek1.a(context, s7) == 6)
								{
									cz1.Y = ek1.i();
									if (cz1.Y == null)
										cz1.t = 0;
								} else
								{
									cz1.t = 0;
								}
							} else
							{
								cz1.t = 0;
							}
					}
					catch (Exception exception3)
					{
						cz1.t = 0;
					}
				else
					cz1.t = 0;
			}
		if (s8 != null)
		{
			s8 = s8.trim();
			if (s8.length() > 0)
				try
				{
					if (bf.a().e(s8))
						cz1.Z = bf.a().g(s8);
					else
					if (flag)
					{
						ek ek2 = new ek(bf.a());
						if (ek2.a(context, s8) == 6)
							cz1.Z = ek2.i();
					}
				}
				catch (Exception exception4)
				{
					gz.a(exception4);
				}
		}
		if (s9 == null)
			s9 = "";
		else
			s9 = s9.trim();
		if (s18 != null)
		{
			cz1.q = flag6;
			cz1.x = j2;
			cz1.P = s18;
			cz1.Q = s16;
			cz1.R = s17;
			cz1.S = s19;
			cz1.r = flag7;
			if (s17.length() > 0)
				try
				{
					if (bf.a().e(s17))
						cz1.ab = bf.a().g(s17);
					else
					if (flag)
					{
						ek ek3 = new ek(bf.a());
						if (ek3.a(context, s17) == 6)
							cz1.ab = ek3.i();
					}
				}
				catch (Exception exception5)
				{
					gz.a(exception5);
				}
		}
		cz1.z = k2;
		cz1.V = s22;
		cz1.W = s23;
		cz1.t;
		JVM INSTR tableswitch 2 4: default 1461
	//	               2 1260
	//	               3 1315
	//	               4 1370;
		   goto _L1 _L2 _L3 _L4
_L1:
		break MISSING_BLOCK_LABEL_1461;
_L2:
		if (s9.length() == 0)
			return null;
		ek ek4 = new ek(bf.b());
		if (ek4.a(context, s9) == 6)
			cz1.aa = ek4.i();
		if (cz1.aa == null)
			return null;
		break MISSING_BLOCK_LABEL_1461;
_L3:
		if (s9.length() == 0)
			return null;
		el el1 = new el(bf.c());
		if (el1.a(context, s9) == 6)
			cz1.ae = el1.i();
		if (cz1.ae == null)
			return null;
		break MISSING_BLOCK_LABEL_1461;
_L4:
		bx bx1;
		bx1 = null;
		em em1 = new em();
		int k3 = em1.a(context, s9);
		if (k3 == 6)
		{
			String s24 = em1.i();
			if (s24 != null)
			{
				String s25 = bh.a(em1.e(), s24);
				if (s25 != null)
					bx1 = new bx(em1.e(), s25);
			}
		}
		if (bx1 == null)
			return null;
		cz1.ad = bx1;
		return cz1;
		Exception exception;
		exception;
		gz.a(exception);
		return null;
	}

	int a()
	{
		return s;
	}

	int b()
	{
		return t;
	}

	String c()
	{
		return H;
	}

	String d()
	{
		return I;
	}

	Bitmap e()
	{
		if (t == 1)
			return Y;
		if (t == 2)
			return aa;
		else
			return null;
	}

	String f()
	{
		return G;
	}

	String g()
	{
		return K;
	}

	String h()
	{
		return L;
	}

	bx i()
	{
		return ac;
	}

	bx j()
	{
		return ad;
	}

	String k()
	{
		return F;
	}

	String l()
	{
		return E;
	}

	ee m()
	{
		return ae;
	}

	Bitmap n()
	{
		return Z;
	}

	String o()
	{
		return D;
	}

	String p()
	{
		return J;
	}

	boolean q()
	{
		return j;
	}

	void r()
	{
		j = true;
	}

	boolean s()
	{
		return f;
	}

	boolean t()
	{
		return g;
	}

	boolean u()
	{
		return i;
	}

	void v()
	{
		f = true;
	}

	void w()
	{
		g = true;
	}

	boolean x()
	{
		return m;
	}

	boolean y()
	{
		return n;
	}

	boolean z()
	{
		return l;
	}

	String A()
	{
		return N;
	}

	String B()
	{
		return O;
	}

	int C()
	{
		return v;
	}

	public void a(int i1)
	{
		w = i1;
	}

	int D()
	{
		return w;
	}

	public boolean E()
	{
		return o;
	}

	String[] F()
	{
		return X;
	}

	void a(bx bx1)
	{
		ac = bx1;
	}

	boolean G()
	{
		return h;
	}

	String H()
	{
		return M;
	}

	long I()
	{
		return b;
	}

	long J()
	{
		return c;
	}

	long K()
	{
		return d;
	}

	boolean L()
	{
		return p;
	}

	boolean M()
	{
		return q;
	}

	int N()
	{
		return x;
	}

	String O()
	{
		return P;
	}

	String P()
	{
		return Q;
	}

	String Q()
	{
		return S;
	}

	Bitmap R()
	{
		return ab;
	}

	void b(int i1)
	{
		y = i1;
	}

	int S()
	{
		return y;
	}

	boolean T()
	{
		return r;
	}

	String U()
	{
		return T;
	}

	String V()
	{
		return U;
	}

	String W()
	{
		return V;
	}

	String X()
	{
		return W;
	}

	public int Y()
	{
		return z;
	}

	long Z()
	{
		return e;
	}

	int aa()
	{
		return u;
	}

	void a(ih ih)
	{
		af = ih;
	}

	ih ab()
	{
		return af;
	}

	public void c(int i1)
	{
		A = i1;
	}

	int ac()
	{
		return A;
	}

	public void d(int i1)
	{
		B = i1;
	}

	int ad()
	{
		return B;
	}

	public void e(int i1)
	{
		C = i1;
	}

	int ae()
	{
		return C;
	}

}
