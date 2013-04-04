// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package net.youmi.android:
//			dd

class de
	implements Runnable
{

	final dd a;

	de(dd dd1)
	{
		a = dd1;
		super();
	}

	public void run()
	{
		File file;
		file = new File(dd.a(a));
		if (!file.exists() && !file.mkdirs())
			return;
		try
		{
			File afile[] = file.listFiles();
			if (afile != null)
			{
				LinkedList linkedlist = new LinkedList();
				long l = 0L;
				for (int i = 0; i < afile.length; i++)
				{
					File file2 = afile[i];
					if (dd.a(a, file2))
						try
						{
							if (file2.delete())
								continue;
						}
						catch (Exception exception2) { }
					if (dd.b(a) != -1L && dd.b(a) > 0L)
					{
						l += file2.length();
						if (linkedlist.size() > 0)
						{
							for (int j = 0; j < linkedlist.size(); j++)
							{
								File file3 = (File)linkedlist.get(j);
								if (file2.lastModified() > file3.lastModified())
									continue;
								linkedlist.add(j, file2);
								break;
							}

						} else
						{
							linkedlist.add(file2);
						}
					}
					try
					{
						Thread.sleep(100L);
					}
					catch (Exception exception3) { }
				}

				while (l > dd.b(a)) 
				{
					if (linkedlist.size() <= 0)
						break;
					File file1 = (File)linkedlist.get(0);
					l -= file1.length();
					linkedlist.remove(0);
					try
					{
						file1.delete();
					}
					catch (Exception exception1) { }
				}
			}
		}
		catch (Exception exception) { }
		return;
	}
}
