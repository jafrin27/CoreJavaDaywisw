package com.destination.septemberbatch.sep20;
import java.util.Scanner;
public class Scan 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter byte value :");
		byte b = sc.nextByte();
		System.out.println("byte value :"+b);
		System.out.println("Enter short value:");
		short s =sc.nextShort();
		System.out.println("short value is:"+s);
		System.out.println("Enter integer value : ");
		int i = sc.nextInt();
		System.out.println("integer value is :"+i);
		System.out.println("Enter long value :");
		long l = sc.nextLong();
		System.out.println("Long value is"+l);
		System.out.println("Enter double value :");
		double d = sc.nextDouble();
		System.out.println("Double value is"+d);
		System.out.println("Enter float value :");
		float f = sc.nextFloat();
		System.out.println("Float value is "+f);
		System.out.println("Enter String value :");
		String str = sc.next();
		System.out.println("String is :  "+str);
		}
	}
