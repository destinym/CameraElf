// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import java.util.ArrayList;

class bs
{

	static String[] a(String s, String s1)
	{
		if (s == null)
			return null;
		if (s1 == null)
			return null;
		else
			return s.split(s1);
	}

	static String a(StringBuilder stringbuilder, int i)
	{
		if (stringbuilder == null)
			return "";
		StringBuilder stringbuilder1;
		int j = i * 4;
		if (stringbuilder.length() > 0)
		{
			if (stringbuilder.length() > j)
				stringbuilder.delete(0, stringbuilder.length() - j);
			else
			if (stringbuilder.length() < j)
			{
				int k = j - stringbuilder.length();
				for (int i1 = 0; i1 < k; i1++)
					stringbuilder.insert(0, '0');

			}
		} else
		{
			for (int l = 0; l < j; l++)
				stringbuilder.append('0');

		}
		stringbuilder1 = new StringBuilder(i);
		String s = stringbuilder.toString();
		for (int j1 = 0; j1 < j; j1 += 4)
			if (stringbuilder.length() >= j1 + 4)
				stringbuilder1.append(a(s.substring(j1, j1 + 4)));

		return stringbuilder1.toString();
		Exception exception;
		exception;
		return "";
	}

	static char a(String s)
	{
		if (s.equals("0000"))
			return '0';
		if (s.equals("0001"))
			return '1';
		if (s.equals("0010"))
			return '2';
		if (s.equals("0011"))
			return '3';
		if (s.equals("0100"))
			return '4';
		if (s.equals("0101"))
			return '5';
		if (s.equals("0110"))
			return '6';
		if (s.equals("0111"))
			return '7';
		if (s.equals("1000"))
			return '8';
		if (s.equals("1001"))
			return '9';
		if (s.equals("1010"))
			return 'a';
		if (s.equals("1011"))
			return 'b';
		if (s.equals("1100"))
			return 'c';
		if (s.equals("1101"))
			return 'd';
		if (s.equals("1110"))
			return 'e';
		return !s.equals("1111") ? '0' : 'f';
	}

	static StringBuilder a(String s, int i)
	{
		StringBuilder stringbuilder = new StringBuilder(32);
		if (s != null)
		{
			s = s.trim();
			if (s.length() > 0)
			{
				s = s.toLowerCase();
				int j = s.length();
				ArrayList arraylist = new ArrayList(j);
				for (int j1 = j - 1; j1 >= 0; j1--)
				{
					char c = s.charAt(j1);
					arraylist.add(a(c));
				}

				for (int k1 = arraylist.size() - 1; k1 >= 0; k1--)
					stringbuilder.append((String)arraylist.get(k1));

			}
		}
		if (stringbuilder.length() > 0)
		{
			if (stringbuilder.length() > i)
				stringbuilder.delete(0, stringbuilder.length() - i);
			else
			if (stringbuilder.length() < i)
			{
				int k = i - stringbuilder.length();
				for (int i1 = 0; i1 < k; i1++)
					stringbuilder.insert(0, '0');

			}
		} else
		{
			for (int l = 0; l < i; l++)
				stringbuilder.append('0');

		}
		return stringbuilder;
	}

	static String a(char c)
	{
		switch (c)
		{
		case 48: // '0'
			return "0000";

		case 49: // '1'
			return "0001";

		case 50: // '2'
			return "0010";

		case 51: // '3'
			return "0011";

		case 52: // '4'
			return "0100";

		case 53: // '5'
			return "0101";

		case 54: // '6'
			return "0110";

		case 55: // '7'
			return "0111";

		case 56: // '8'
			return "1000";

		case 57: // '9'
			return "1001";

		case 97: // 'a'
			return "1010";

		case 98: // 'b'
			return "1011";

		case 99: // 'c'
			return "1100";

		case 100: // 'd'
			return "1101";

		case 101: // 'e'
			return "1110";

		case 102: // 'f'
			return "1111";
		}
		return "0000";
	}
}
