package com.destination.javafullstack.day10;

class ImplicitTypeCasting 
{

	public static void main(String[] args) 
	{
		byte b = 127;
		short s = b;
		int i = s;
		long l = i;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);

	}

}
