package com.destination.septemberbatch.oct1.copy;
import java.util.Scanner;
class Array5
{
	String arr[][][];
	int clg;
	Scanner sc = new Scanner(System.in);
	void createArray(int m)
	{
		arr = new String[m][][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the class count Inside College no: "+(i+1));
			int cls = sc.nextInt();
			arr[i] = new String[cls][];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside the Colllege no:"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the student count inside the class no: "+(j+1));
				int stu = sc.nextInt();
				arr[i][j]= new String[stu];
			}
			
		}
		System.out.println("Array is created Successfully ");
		System.out.println("========================================");
		
	}
	void addData()
	{
		System.out.println("Collecting array Data:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside the college no:"+(i+1));
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.println("Inside the class no:"+(j+1));
					for(int k=0;k<arr[i][j].length;k++)
					{
						System.out.println("Enter the names of the student no:"+(k+1));
						arr[i][j][k] = sc.next();
					}
					
				}
			}
			System.out.println("Names successfully collected");
			System.out.println("==========================");
		}
	}
	void displaydata() 
	{
		System.out.println("Displaying the data :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside the college no:"+(i+1));
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.println("Inside the class no:"+(j+1));
					for(int k=0;k<arr[i][j].length;k++)
					{
						System.out.println("The names of the student no:"+(k+1)+" is ="+arr[i][j][k]);
		
					}
					
				}
			}
			System.out.println("==========================");
		}
	}
}

public class ArrayOperation4s 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the college count: ");
		int m = sc.nextInt();
		Array5 a5 = new Array5();
		a5.createArray(m);
		a5.addData();
		a5.displaydata();
		
		

	}

}
