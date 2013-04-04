// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

// Referenced classes of package net.youmi.android:
//			al, dj

class am
{

	static byte[] a()
	{
		byte abyte0[] = new byte[8];
		Random random = new Random();
		random.nextBytes(abyte0);
		return abyte0;
	}

	private static Key a(String s)
	{
		PBEKeySpec pbekeyspec = new PBEKeySpec(s.toCharArray());
		SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance("PBEWITHMD5andDES");
		javax.crypto.SecretKey secretkey = secretkeyfactory.generateSecret(pbekeyspec);
		return secretkey;
	}

	static byte[] a(byte abyte0[], String s, byte abyte1[])
	{
		Key key = a(s);
		PBEParameterSpec pbeparameterspec = new PBEParameterSpec(abyte1, 100);
		Cipher cipher = Cipher.getInstance("PBEWITHMD5andDES");
		cipher.init(1, key, pbeparameterspec);
		return cipher.doFinal(abyte0);
	}

	static String a(String s, String s1, byte abyte0[])
	{
		return dj.b(a(s.getBytes(), s1, abyte0));
		Exception exception;
		exception;
		return null;
	}

	static byte[] b(byte abyte0[], String s, byte abyte1[])
	{
		Key key = a(s);
		PBEParameterSpec pbeparameterspec = new PBEParameterSpec(abyte1, 100);
		Cipher cipher = Cipher.getInstance("PBEWITHMD5andDES");
		cipher.init(2, key, pbeparameterspec);
		return cipher.doFinal(abyte0);
	}

	static String b(String s, String s1, byte abyte0[])
	{
		byte abyte2[];
		byte abyte1[] = al.a(s.getBytes());
		abyte2 = b(abyte1, s1, abyte0);
		return new String(abyte2);
		Exception exception;
		exception;
		return null;
	}
}
