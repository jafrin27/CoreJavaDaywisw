package com.destination.septemberbatch;
import java.util.*;
public class Strings1 
{
	public static void main(Strings[] args) 
	{
		String s1 ="Rama";
		String s2 ="Rama";
		if(s1.length()==s2.length()) {
			if(s1.equals(s2)==true)
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
