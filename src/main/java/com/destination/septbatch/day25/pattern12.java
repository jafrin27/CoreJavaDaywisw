package com.destination.septbatch.day25;
/*
 * 1
 * 1	2
 * 1	2	3
 * 1	2	3	4
 * 1	2	3	4	5
 */
import java.util.Scanner;
public class pattern12 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)//row
			{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j );
				System.out.print("	");
				}
			System.out.println();
			}

	}

}
