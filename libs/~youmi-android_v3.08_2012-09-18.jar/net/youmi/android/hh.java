// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.net.URI;
import org.apache.http.*;
import org.apache.http.client.RedirectHandler;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package net.youmi.android:
//			ex

class hh
	implements RedirectHandler
{

	private final ex a;

	hh(ex ex1)
	{
		a = ex1;
		super();
	}

	public boolean isRedirectRequested(HttpResponse httpresponse, HttpContext httpcontext)
	{
		int i = httpresponse.getStatusLine().getStatusCode();
		return i == 301 || i == 302 || i == 303 || i == 307;
	}

	public URI getLocationURI(HttpResponse httpresponse, HttpContext httpcontext)
	{
		Header header = null;
		if (httpresponse.containsHeader("location"))
			header = httpresponse.getFirstHeader("location");
		else
		if (httpresponse.containsHeader("Location"))
			header = httpresponse.getFirstHeader("Location");
		else
		if (httpresponse.containsHeader("LOCATION"))
			header = httpresponse.getFirstHeader("LOCATION");
		if (header == null)
			return null;
		String s = header.getValue();
		if (s == null)
			return null;
		if (a != null)
			a.a(s);
		return URI.create(s);
	}
}
