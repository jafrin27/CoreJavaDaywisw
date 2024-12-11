package com.destination.septemberbatch;
import java.util.*;
public class String3 
{

	public static void main(Strings[] args) 
	{
		Strings s1 ="Rama";
		Strings s2 = "rama";
		if(s1.length()==s2.length()) {
			if(s1.equalsIgnoreCase(s2)==true)
			{
				System.out.println("Strings are Equal");
			}
			else {
				System.out.println("Strings are not equal");
			}
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
