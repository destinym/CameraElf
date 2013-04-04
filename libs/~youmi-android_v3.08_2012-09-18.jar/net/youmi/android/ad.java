// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import java.util.ArrayList;

// Referenced classes of package net.youmi.android:
//			ac, dh, di, dm, 
//			dt

class ad extends BaseExpandableListAdapter
{

	Activity a;
	dm b;
	int c;
	int d;
	ac e;
	ExpandableListView f;
	final ac g;

	void a()
	{
		notifyDataSetChanged();
	}

	ad(ac ac1, Activity activity, ac ac2, dm dm1, ExpandableListView expandablelistview, ArrayList arraylist, ArrayList arraylist1)
	{
		g = ac1;
		super();
		c = 36;
		d = 50;
		a = activity;
		f = expandablelistview;
		e = ac2;
		b = dm1;
		c = b.a(c);
		d = b.a(d);
	}

	public Object getChild(int i, int j)
	{
		switch (i)
		{
		case 0: // '\0'
		case 1: // '\001'
		default:
			return null;
		}
	}

	public long getChildId(int i, int j)
	{
		return (long)j;
	}

	public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
	{
		dt dt1;
		if (view == null)
		{
			dt1 = new dt(a, e, b);
			view = dt1;
			view.setPadding(10, 10, 10, 10);
		} else
		{
			dt1 = (dt)view;
		}
		if (dt1 != null)
		{
			dt1.a(j);
			if (i == 0)
			{
				if (e.f != null && e.f.size() > j && j > -1)
				{
					di di1 = (di)e.f.get(j);
					dt1.a(di1);
				}
			} else
			if (i == 1 && e.g != null && e.g.size() > j && j > -1)
			{
				dh dh1 = (dh)e.g.get(j);
				dt1.a(dh1);
			}
		}
		return view;
	}

	public int getChildrenCount(int i)
	{
		if (i == 0)
			if (e.f == null)
				return 0;
			else
				return e.f.size();
		if (i == 1)
		{
			if (e.g == null)
				return 0;
			else
				return e.g.size();
		} else
		{
			return 0;
		}
	}

	public Object getGroup(int i)
	{
		return null;
	}

	public int getGroupCount()
	{
		return 2;
	}

	public long getGroupId(int i)
	{
		return (long)i;
	}

	public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
	{
		TextView textview;
		if (view != null)
		{
			textview = (TextView)view;
		} else
		{
			android.widget.AbsListView.LayoutParams layoutparams = new android.widget.AbsListView.LayoutParams(-1, d);
			textview = new TextView(a);
			textview.setTextColor(-1);
			textview.setPadding(b.a(40), 0, 0, 0);
			textview.setLayoutParams(layoutparams);
			textview.setGravity(19);
			view = textview;
		}
		if (textview != null)
		{
			if (i == 0)
				if (e.f == null)
					textview.setText("正在下载(0)");
				else
					textview.setText((new StringBuilder("正在下载(")).append(e.f.size()).append(")").toString());
			if (i == 1)
				if (e.g == null)
					textview.setText("已下载(0)");
				else
					textview.setText((new StringBuilder("已下载(")).append(e.g.size()).append(")").toString());
		}
		return view;
	}

	public boolean hasStableIds()
	{
		return false;
	}

	public boolean isChildSelectable(int i, int j)
	{
		return false;
	}
}
