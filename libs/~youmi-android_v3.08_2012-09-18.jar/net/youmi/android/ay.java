// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.view.animation.*;

// Referenced classes of package net.youmi.android:
//			dm, dn

class ay
{

	private static Animation a;
	private static Animation b;
	private static Animation c;
	private static Animation d;

	private static Animation e(dm dm1)
	{
		AnimationSet animationset = new AnimationSet(true);
		TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, -dm1.a().a(), 0.0F);
		translateanimation.setDuration(300L);
		animationset.addAnimation(translateanimation);
		AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
		alphaanimation.setDuration(300L);
		animationset.addAnimation(alphaanimation);
		return animationset;
	}

	private static Animation a(int i)
	{
		AnimationSet animationset = new AnimationSet(true);
		TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, i);
		translateanimation.setDuration(300L);
		animationset.addAnimation(translateanimation);
		AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
		alphaanimation.setDuration(300L);
		animationset.addAnimation(alphaanimation);
		return animationset;
	}

	private static Animation f(dm dm1)
	{
		AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
		alphaanimation.setDuration(600L);
		return alphaanimation;
	}

	private static Animation g(dm dm1)
	{
		AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
		alphaanimation.setDuration(600L);
		return alphaanimation;
	}

	static Animation a(dm dm1)
	{
		if (c == null)
			c = e(dm1);
		return c;
	}

	static Animation b(dm dm1)
	{
		if (d == null)
			d = a(dm1.a().a());
		return d;
	}

	static Animation c(dm dm1)
	{
		if (a == null)
			a = f(dm1);
		return a;
	}

	static Animation d(dm dm1)
	{
		if (b == null)
			b = g(dm1);
		return b;
	}
}
