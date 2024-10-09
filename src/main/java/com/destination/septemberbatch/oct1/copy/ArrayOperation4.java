package com.destination.septemberbatch.oct1.copy;
import java.util.Scanner;
class Array4
{
	String arr[][][];
	String clg;
	String cls;
	String stu;
	Scanner sc = new Scanner(System.in);
	
	void createArray(int m,int n,int o)
	{
		arr = new String[m][n][o];
		System.out.println("Array is Created Sucessfully ");
		System.out.println("======================");
	}
	void addData()
	{
		System.out.println("Collecting array Data: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside College no: "+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Inside class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter the name of student no:"+(k+1));
					arr[i][j][k]=sc.next();
				}
		}
		System.out.println("Names Scuccessfully collected: ");
		System.out.println("==============");
	}
}
	void display()
	{
		System.out.println("Display array Data: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside College no: "+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Inside class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter the name of student no:"+(k+1)+"is "+arr[i][j][k]);
					arr[i][j][k]=sc.next();
				}
		}
		
	}
}
}

public class ArrayOperation4 
{
	public static void main(String[] args) 
	{
		Array4 a4 = new Array4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the college count : ");
		int m = sc.nextInt();
		System.out.println("Enter the class count : ");
		int n = sc.nextInt();
		System.out.println("Enter the student count : ");
		int o = sc.nextInt();
		a4.createArray(m,n,o);
		a4.addData();
		a4.display();
		}

}

