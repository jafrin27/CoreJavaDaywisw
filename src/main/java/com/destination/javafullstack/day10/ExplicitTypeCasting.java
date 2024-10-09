package com.destination.javafullstack.day10;

class ExplicitTypeCasting 
{

	public static void main(String[] args) 
	{
		long l =127;
		int i =(int)l;
		short s=(short)i;
		byte b=(byte)s;
		System.out.println(b);
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
	}

}
