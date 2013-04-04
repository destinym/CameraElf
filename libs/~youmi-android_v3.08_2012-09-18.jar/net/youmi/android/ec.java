// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package net.youmi.android:
//			ed

class ec extends BaseAdapter
{

	Context a;
	private ArrayList b;
	private int c;

	static ec a(Context context, String as[], int i)
	{
		if (as == null)
			return null;
		if (as.length < 1)
			return null;
		ec ec1;
		ec1 = new ec(context);
		if (i <= 0)
			i = 100;
		ec1.c = i;
		for (int j = 0; j < as.length; j++)
		{
			String s = as[j];
			File file = new File(s);
			if (file.exists())
			{
				int k = 2;
				try
				{
					android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
					options.inJustDecodeBounds = true;
					BitmapFactory.decodeFile(s, options);
					int l = options.outWidth;
					int i1 = options.outHeight;
					if (l > 0 && i1 > 0)
						if (l >= i1)
							k = l / i;
						else
							k = i1 / i;
					options.inJustDecodeBounds = false;
					options.inSampleSize = k;
					Bitmap bitmap = BitmapFactory.decodeFile(s, options);
					if (bitmap != null)
					{
						ed ed1 = new ed();
						ed1.a = s;
						ed1.b = Uri.parse((new StringBuilder("file://")).append(s).toString());
						ed1.d = options.outMimeType;
						ed1.c = bitmap;
						ec1.a(ed1);
					}
				}
				catch (Exception exception1) { }
			}
		}

label0:
		{
			if (ec1.getCount() > 0)
				return ec1;
			break label0;
		}
		Exception exception;
		exception;
		return null;
	}

	private void a(ed ed1)
	{
		if (b == null)
			b = new ArrayList(10);
		b.add(ed1);
	}

	private ec(Context context)
	{
		a = context;
	}

	public int getCount()
	{
		if (b != null)
			return b.size();
		else
			return 0;
	}

	public Object getItem(int i)
	{
		return a(i);
	}

	ed a(int i)
	{
label0:
		{
			if (b != null && i > -1 && i < b.size())
				return (ed)b.get(i);
			break label0;
		}
		Exception exception;
		exception;
		return null;
	}

	public long getItemId(int i)
	{
		return (long)i;
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		ed ed1 = a(i);
		if (ed1 == null)
			return null;
		try
		{
			Bitmap bitmap = ed1.c;
			if (view != null)
			{
				ImageView imageview = (ImageView)view;
				if (bitmap != null)
					imageview.setImageBitmap(bitmap);
			} else
			{
				ImageView imageview1 = new ImageView(a);
				if (bitmap != null)
					imageview1.setImageBitmap(bitmap);
				android.widget.Gallery.LayoutParams layoutparams = new android.widget.Gallery.LayoutParams(c, c);
				imageview1.setLayoutParams(layoutparams);
				imageview1.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
				imageview1.setPadding(10, 0, 10, 0);
				imageview1.setBackgroundResource(0x1080066);
				view = imageview1;
			}
		}
		catch (Exception exception) { }
		return view;
	}
}
