package com.destination.javafullstack.day10;
class calculator
{
	void add()
	{
		int a=100;
		int b=10;
		int c=a+b;
		System.out.println(c);
		
	}
	void sub()
	{
		int a=40;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	void div()
	{
		int a=40;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
	void mul()
	{
		int a=50;
		int b=25;
		int c=a*b;
		System.out.println(c);
	}
}

public class launch
{
	public static void main(String[] args) 
	{
		calculator c = new calculator();
		c.add();
		c.sub();
		c.div();
		c.mul();
	}
}
