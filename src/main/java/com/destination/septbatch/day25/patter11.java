package com.destination.septbatch.day25;
/*
 * 1
 * 2	3
 * 4	5	6
 * 7	8	9	10
 * 11	12	13	14	15
 * 
 */
import java.util.Scanner;
public class patter11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n = sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)//row
			{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(k );
				System.out.print("	");
				k++;
				}
			System.out.println();
			}
		}
	}
