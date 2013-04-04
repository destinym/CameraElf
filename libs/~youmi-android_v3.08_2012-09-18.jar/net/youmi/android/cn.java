// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.os.AsyncTask;
import java.io.*;

// Referenced classes of package net.youmi.android:
//			a, ce, dj, dk, 
//			fy, gw, hv

class cn extends AsyncTask
{

	private String a;
	private long b;
	private String c;
	private String d;
	private String e;
	private String f;
	private Context g;
	private int h;
	private ce i;

	public static boolean a(Context context, String s, long l)
	{
		s = gw.a(s);
		if (s == null)
			return false;
		try
		{
			cn cn1 = new cn(context, 1);
			cn1.a = s;
			cn1.b = l;
			cn1.execute(new Void[0]);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public static boolean a(Context context, String s, String s1, String s2, ce ce1)
	{
		s = gw.a(s);
		if (s == null)
			return false;
		try
		{
			cn cn1 = new cn(context, 0);
			cn1.c = s;
			cn1.e = gw.a(s2);
			cn1.d = gw.a(s1);
			cn1.i = ce1;
			cn1.execute(new Void[0]);
		}
		catch (Throwable throwable)
		{
			return false;
		}
		return true;
	}

	public cn(Context context, int j)
	{
		b = 0L;
		g = context.getApplicationContext();
		h = j;
	}

	protected transient fy a(Void avoid[])
	{
		if (h != 1 && h != 0 && h != 2)
			return null;
		fy fy1 = a(this);
		if (fy1 == null)
			return null;
		if (b > 0L)
			Thread.sleep(b);
		return fy1;
		Throwable throwable;
		throwable;
		return null;
	}

	private static synchronized fy a(cn cn1)
	{
		if (cn1 == null)
			return null;
		cn1.h;
		JVM INSTR tableswitch 0 2: default 61
	//	               0 36
	//	               1 46
	//	               2 51;
		   goto _L1 _L2 _L3 _L4
_L1:
		break; /* Loop/switch isn't completed */
_L2:
		if (!b(cn1));
		break; /* Loop/switch isn't completed */
_L3:
		return d(cn1);
_L4:
		try
		{
			if (!c(cn1));
		}
		catch (Throwable throwable) { }
		return null;
	}

	private static boolean b(cn cn1)
	{
		if (cn1 == null)
			return false;
		Context context = cn1.g;
		if (cn1.h != 0)
			return false;
		fy fy1;
		if (hv.a(context, cn1.c))
			cn1.e = null;
		fy1 = fy.a(cn1.c, cn1.e, cn1.d, cn1.i);
		if (!fy1.f())
			return false;
		String s1;
		String s2;
		String s = a(context);
		s1 = fy.a(fy1, s);
		s2 = "mycd4903c3d23c4e0nn71e0a96of108g";
		try
		{
			context.deleteFile(s2);
		}
		catch (Throwable throwable1) { }
		return a(context, s2, s1);
		Throwable throwable;
		throwable;
		return false;
	}

	private static boolean c(cn cn1)
	{
		Context context = cn1.g;
		if (cn1.f == null)
			return false;
		String s1;
		File file;
		String s = "mycd4903c3d23c4e0nn71e0a96of108g";
		s1 = a(context);
		file = context.getFileStreamPath(s);
		if (!file.exists())
			return true;
		String s2;
		s2 = a(file);
		if (s2 != null)
			break MISSING_BLOCK_LABEL_59;
		file.delete();
		return true;
		fy fy1;
		fy1 = fy.a(s2, s1);
		if (fy1 != null)
			break MISSING_BLOCK_LABEL_80;
		file.delete();
		return true;
		if (!fy1.a(0xdbba0L))
			break MISSING_BLOCK_LABEL_99;
		file.delete();
		return true;
		if (fy1.f())
			break MISSING_BLOCK_LABEL_115;
		file.delete();
		return true;
label0:
		{
			try
			{
				if (!fy1.a().equals(cn1.f))
					break label0;
				file.delete();
			}
			catch (Throwable throwable)
			{
				return false;
			}
			return true;
		}
		return true;
	}

	private static fy d(cn cn1)
	{
		if (cn1.a == null)
			return null;
		String s1;
		File file;
		Context context = cn1.g;
		String s = "mycd4903c3d23c4e0nn71e0a96of108g";
		s1 = a(context);
		file = context.getFileStreamPath(s);
		if (!file.exists())
			return null;
		String s2;
		s2 = a(file);
		if (s2 != null)
			break MISSING_BLOCK_LABEL_59;
		file.delete();
		return null;
		fy fy1;
		fy1 = fy.a(s2, s1);
		if (fy1 != null)
			break MISSING_BLOCK_LABEL_80;
		file.delete();
		return null;
		if (!fy1.a(0xdbba0L))
			break MISSING_BLOCK_LABEL_99;
		file.delete();
		return null;
label0:
		{
			Throwable throwable1;
			try
			{
				if (fy1.f())
					break label0;
				file.delete();
			}
			catch (Throwable throwable)
			{
				return null;
			}
			return null;
		}
		if (!fy1.a().equals(cn1.a))
			return null;
		try
		{
			if (!file.delete());
		}
		// Misplaced declaration of an exception variable
		catch (Throwable throwable1) { }
		return fy1;
	}

	private static String a(Context context)
	{
		String s3;
		String s = context.getPackageName();
		if (s == null)
			break MISSING_BLOCK_LABEL_54;
		String s1 = dk.a(s);
		String s2 = (new StringBuilder(String.valueOf(s1))).append("CRAIG5yd6O1K").toString();
		s3 = dk.a(s2);
		return dj.d(s3.substring(6, 24));
		Throwable throwable;
		throwable;
		return "CRAIG5yd6O1K";
	}

	private static String a(File file)
	{
label0:
		{
			FileInputStream fileinputstream;
			ObjectInputStream objectinputstream;
label1:
			{
				fileinputstream = null;
				objectinputstream = null;
				String s4;
				try
				{
					fileinputstream = new FileInputStream(file);
					objectinputstream = new ObjectInputStream(fileinputstream);
					String s = objectinputstream.readUTF();
					String s1 = s.substring(0, 18);
					String s2 = s.substring(18);
					String s3 = dk.a(s2);
					if (!s1.equals(s3.substring(6, 24)))
						break label1;
					s4 = s2;
				}
				catch (Throwable throwable)
				{
					try
					{
						if (objectinputstream != null)
							objectinputstream.close();
					}
					catch (Throwable throwable3) { }
					try
					{
						if (fileinputstream != null)
							fileinputstream.close();
					}
					catch (Throwable throwable4) { }
					break label0;
				}
				finally
				{
					try
					{
						if (objectinputstream != null)
							objectinputstream.close();
					}
					catch (Throwable throwable5) { }
					try
					{
						if (fileinputstream != null)
							fileinputstream.close();
					}
					catch (Throwable throwable6) { }
					throw exception;
				}
				try
				{
					if (objectinputstream != null)
						objectinputstream.close();
				}
				catch (Throwable throwable1) { }
				try
				{
					if (fileinputstream != null)
						fileinputstream.close();
				}
				catch (Throwable throwable2) { }
				return s4;
			}
			try
			{
				if (objectinputstream != null)
					objectinputstream.close();
			}
			catch (Throwable throwable7) { }
			try
			{
				if (fileinputstream != null)
					fileinputstream.close();
			}
			catch (Throwable throwable8) { }
		}
		return null;
	}

	private static boolean a(Context context, String s, String s1)
	{
		java.io.OutputStream outputstream;
		ObjectOutputStream objectoutputstream;
		outputstream = null;
		objectoutputstream = null;
		if (s != null) goto _L2; else goto _L1
_L1:
		try
		{
			if (objectoutputstream != null)
				objectoutputstream.close();
		}
		catch (Throwable throwable1) { }
		try
		{
			if (outputstream != null)
				outputstream.close();
		}
		catch (Throwable throwable2) { }
		return false;
_L2:
		if (s1 != null) goto _L3; else goto _L1
_L3:
		String s2 = dk.a(s1);
		String s3 = (new StringBuilder(String.valueOf(s2.substring(6, 24)))).append(s1).toString();
		outputstream = context.openFileOutput(s, 0);
		objectoutputstream = new ObjectOutputStream(outputstream);
		objectoutputstream.writeUTF(s3);
		try
		{
			if (objectoutputstream != null)
				objectoutputstream.close();
		}
		catch (Throwable throwable3) { }
		try
		{
			if (outputstream != null)
				outputstream.close();
		}
		catch (Throwable throwable4) { }
		return true;
		Throwable throwable;
		throwable;
		try
		{
			if (objectoutputstream != null)
				objectoutputstream.close();
		}
		catch (Throwable throwable5) { }
		try
		{
			if (outputstream != null)
				outputstream.close();
		}
		catch (Throwable throwable6) { }
		break MISSING_BLOCK_LABEL_200;
		Exception exception;
		exception;
		try
		{
			if (objectoutputstream != null)
				objectoutputstream.close();
		}
		catch (Throwable throwable7) { }
		try
		{
			if (outputstream != null)
				outputstream.close();
		}
		catch (Throwable throwable8) { }
		throw exception;
		return false;
	}

	protected void a(fy fy1)
	{
		super.onPostExecute(fy1);
		if (fy1 == null)
			return;
		try
		{
			net.youmi.android.a.a(g, a, fy1.e());
			if (fy1.b() == null || !g.deleteFile(fy1.b()));
		}
		catch (Throwable throwable) { }
		return;
	}

	protected void onPostExecute(Object obj)
	{
		a((fy)obj);
	}

	protected transient Object doInBackground(Object aobj[])
	{
		return a((Void[])aobj);
	}
}
