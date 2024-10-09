package com.destination.septbatch.day25;
import java.util.Scanner;
/*
 * ########
 * ########
 * ########
 * ########
 * ########
 */
public class pattern4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)//row
		{
			for(int j=1;j<=n;j++) 
			{
			System.out.print("# ");
			}
			System.out.println();
		}
		
	}
}
