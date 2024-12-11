package com.destination.septemberbatch;
import java.util.*;
public class Strings5 
{

	public static void main(String[] args) 
	{
		String str ="Sachin Ramesh Tendulkar";
		//convert String to UpperCase
		System.out.println(str.toUpperCase());
		// convert String to LowerCase
		System.out.println(str.toLowerCase());
		// Find the total length of the String
		System.out.println(str.length());
		//Find the character at the specefied Index
		System.out.println(str.charAt(5));
// system.out.println(str.charAt(50); it will show StringIndexOutofBoundException;
		// checking for the given string in main string
		System.out.println(str.contains("Ramesh"));
		System.out.println(str.contains("Umesh"));
		// concatenating new string
		System.out.println(str.concat("India"));
		System.out.println(str);

	}

}
