package com.destination.septemberbatch;
import java.util.*;
class Strings2 
{
//Object based Representation of Immutable Strings
	public static void main(String args[]) 
	{
		
		String s1 = new String("Ramaa");
		String s2 = new String("raman");
		if(s1.length()==s2.length()) 
		{
			if(s1.compareToIgnoreCase(s2)==0)
			{
				System.out.println(s1.compareToIgnoreCase(s2));
				System.out.println("Strings are Equal");
			}
			else {
				System.out.println(s1.compareToIgnoreCase(s2));
				System.out.println("Strings are not equal");
			}
			System.out.println("-----------------------------------");
			if(s1 == s2)
			{
				System.out.println("References are equal");
			}
			else 
			{
				System.out.println("Referances are not equal");
			}
		}
	}
	
}

