// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;

// Referenced classes of package net.youmi.android:
//			gy

class dj
{

	private static final char b[] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-".toCharArray();
	private static int c[] = {
		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
		31
	};
	static final char a[] = "0123456789ABCDEF".toCharArray();
	private static final char d = (char)Integer.parseInt("00000011", 2);
	private static final char e = (char)Integer.parseInt("00001111", 2);
	private static final char f = (char)Integer.parseInt("00111111", 2);
	private static final char g = (char)Integer.parseInt("11111100", 2);
	private static final char h = (char)Integer.parseInt("11110000", 2);
	private static final char i = (char)Integer.parseInt("11000000", 2);
	private static final char j[] = {
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
		'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
		'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 
		'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 
		'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
		'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', 
		'8', '9', '+', '/'
	};

	static String a(String s)
	{
		String s1;
		s1 = URLEncoder.encode(s, "UTF-8");
		if (s1.indexOf("+") > -1)
			s1 = s1.replace("+", "%20");
		return s1;
		Exception exception;
		exception;
		return "";
	}

	static String b(String s)
	{
		String s1;
		s1 = null;
		if (s != null && s.length() > 0)
			try
			{
				MessageDigest messagedigest = MessageDigest.getInstance("MD5");
				messagedigest.update(s.getBytes(), 0, s.length());
				s1 = String.format("%032x", new Object[] {
					new BigInteger(1, messagedigest.digest())
				});
			}
			catch (Exception exception1) { }
		return s1;
		Exception exception;
		exception;
		return "";
	}

	static String a(byte abyte0[])
	{
		String s = null;
		char ac[] = {
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
			'a', 'b', 'c', 'd', 'e', 'f'
		};
		try
		{
			MessageDigest messagedigest = MessageDigest.getInstance("MD5");
			messagedigest.update(abyte0);
			byte abyte1[] = messagedigest.digest();
			char ac1[] = new char[32];
			int k = 0;
			for (int l = 0; l < 16; l++)
			{
				byte byte0 = abyte1[l];
				ac1[k++] = ac[byte0 >>> 4 & 0xf];
				ac1[k++] = ac[byte0 & 0xf];
			}

			s = new String(ac1);
		}
		catch (Exception exception) { }
		return s;
	}

	static final String c(String s)
	{
		int k = s.length();
		StringBuilder stringbuilder = new StringBuilder((k << 1) / 3);
		int l = 0;
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		for (int k1 = 0; k1 < k; k1 += 3)
		{
			int j1 = k1 + 3 >= k ? k : k1 + 3;
			String s1 = s.substring(k1, j1);
			int i1 = Integer.parseInt(s1, 16);
			byte byte0 = (byte)(i1 >= 64 ? i1 >>> 6 : 0);
			stringbuilder.append(b[byte0]);
			l++;
			stringbuilder.append(b[i1 & 0x3f]);
			l++;
		}

		return stringbuilder.toString();
	}

	static final String a(int k)
	{
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder(k);
		for (int l = 0; l < k; l++)
		{
			int i1 = Math.abs(gy.a(b.length)) % b.length;
			stringbuilder.append(b[i1]);
		}

		return stringbuilder.toString();
		Throwable throwable;
		throwable;
		return "abcd";
	}

	static final String d(String s)
	{
		int k = s.length();
		StringBuilder stringbuilder = new StringBuilder((k << 1) / 3);
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		for (int j1 = 0; j1 < k; j1 += 3)
		{
			int i1 = j1 + 3 >= k ? k : j1 + 3;
			String s1 = s.substring(j1, i1);
			int l = Integer.parseInt(s1, 16);
			byte byte0 = (byte)(l >= 64 ? l >>> 6 : 0);
			stringbuilder.append(b[byte0]);
			stringbuilder.append(b[l & 0x3f]);
		}

		return stringbuilder.toString();
	}

	static String b(byte abyte0[])
	{
		StringBuffer stringbuffer = new StringBuffer((int)((double)abyte0.length * 1.3400000000000001D) + 3);
		int k = 0;
		char c1 = '\0';
		for (int l = 0; l < abyte0.length; l++)
			for (k %= 8; k < 8; k += 6)
			{
				switch (k)
				{
				case 1: // '\001'
				case 3: // '\003'
				case 5: // '\005'
				default:
					break;

				case 0: // '\0'
					c1 = (char)(abyte0[l] & g);
					c1 >>>= '\002';
					break;

				case 2: // '\002'
					c1 = (char)(abyte0[l] & f);
					break;

				case 4: // '\004'
					c1 = (char)(abyte0[l] & e);
					c1 <<= '\002';
					if (l + 1 < abyte0.length)
						c1 |= (abyte0[l + 1] & i) >>> 6;
					break;

				case 6: // '\006'
					c1 = (char)(abyte0[l] & d);
					c1 <<= '\004';
					if (l + 1 < abyte0.length)
						c1 |= (abyte0[l + 1] & h) >>> 4;
					break;
				}
				stringbuffer.append(j[c1]);
			}


		if (stringbuffer.length() % 4 != 0)
		{
			for (int i1 = 4 - stringbuffer.length() % 4; i1 > 0; i1--)
				stringbuffer.append("=");

		}
		return stringbuffer.toString();
	}

	static final String a(byte abyte0[], String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
		byte abyte1[] = s.getBytes();
		byte abyte2[] = new byte[abyte1.length + abyte0.length];
		System.arraycopy(abyte1, 0, abyte2, 0, abyte1.length);
		System.arraycopy(abyte0, 0, abyte2, abyte1.length, abyte0.length);
		String s1 = a(abyte2);
		s1 = s1.substring(9, 18);
		int k = s1.length();
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		Object obj = null;
		for (int k1 = 0; k1 < 9; k1 += 3)
		{
			int l = k1 + 3;
			if (l > k)
				l = k;
			String s2 = s1.substring(k1, l);
			int i1 = Integer.parseInt(s2, 16);
			int j1 = i1 >= 64 ? i1 >>> 6 : 0;
			stringbuilder.append(b[j1]);
			stringbuilder.append(b[i1 & 0x3f]);
		}

		String s3 = stringbuilder.toString();
		String s4 = b((new StringBuilder(String.valueOf(s3))).append(s).toString());
		int l1 = 0;
		for (int i2 = 0; i2 < 26; i2++)
		{
			l1 <<= 1;
			if (s4.charAt(i2) > '7')
				l1++;
		}

		if (l1 < 67)
			l1 = 67;
		int j2 = (l1 & 1) != 0 ? l1 - 2 : l1 - 1;
		boolean flag3 = true;
		boolean flag5 = false;
		for (; j2 > 0; j2 -= 2)
		{
			boolean flag4 = true;
			for (int l2 = 0; l2 < c.length; l2++)
			{
				int k2 = c[l2];
				if (j2 % k2 != 0)
					continue;
				flag4 = false;
				break;
			}

			if (flag4)
				break;
		}

		int i3 = j2;
		stringbuilder.delete(0, stringbuilder.length());
		byte abyte3[] = s4.getBytes();
		int j3 = abyte3.length;
		int k3 = abyte0.length;
		int l3 = 0;
		boolean flag6 = false;
		boolean flag7 = false;
		for (int j4 = 0; j4 < k3; j4++)
		{
			byte byte0 = (byte)(abyte0[j4] ^ abyte3[l3++]);
			if (l3 >= j3)
				l3 = 0;
			int i4 = (byte0 & 0xf0) >>> 4;
			stringbuilder.append(a[i4]);
			i4 = byte0 & 0xf;
			stringbuilder.append(a[i4]);
		}

		String s5 = stringbuilder.toString();
		stringbuilder.delete(0, stringbuilder.length());
		int k4 = s5.length();
		int l4 = l1;
		boolean flag8 = false;
		boolean flag9 = false;
		boolean flag10 = false;
		stringbuilder.append(b[k4 % 3]);
		for (int k5 = 0; k5 < k4; k5 += 3)
		{
			int j5 = k5 + 3 >= k4 ? k4 : k5 + 3;
			String s6 = s5.substring(k5, j5);
			int i5 = Integer.parseInt(s6, 16);
			byte byte1 = (byte)(i5 >= 64 ? i5 >>> 6 : 0);
			l4 = i3 * l4 + 13859 & 0x3f;
			stringbuilder.append(b[byte1 + l4 & 0x3f]);
			l4 = i3 * l4 + 13859 & 0x3f;
			stringbuilder.append(b[i5 + l4 & 0x3f]);
		}

		return (new StringBuilder(String.valueOf(s3))).append(stringbuilder.toString()).toString();
	}

}
