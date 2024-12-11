package com.destination.septemberbatch;
import java.util.*;
public class Strings4 
{

	public static void main(Strings[] args) 
	{
		String s1 ="Rama";
		String s2 = "rama";
		if(s1.length()==s2.length()) {
			if(s1.compareTo(s2)==0)
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

