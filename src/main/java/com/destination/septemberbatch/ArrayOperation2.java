package com.destination.septemberbatch;
import java.util.Scanner;
class Array2
{
	int arr[][];
	int cls;
	int stu;
	void creatArray(int n,int m)
	{
		cls = n;
		stu = m;
		arr=new int[n][m];
		System.out.println("Array is created successfully:");
		System.out.println("=================================");
		}
	void adddata() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("collecting array data:");
		for(int i=0;i<cls;i++) 
		{
			System.out.println("Inside class no: : "+(i+1));
			for(int j=0;j<stu;j++)
			{
				System.out.println("Enter the marks of student no: "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Marks Scuccessfully collected ");
		System.out.println("==============================");
		sc.close();
		
	}
	void display()
	{
		System.out.println("Display array data: ");
		for(int i=0;i<cls;i++)
		{
			System.out.println("Inside class no:"+(i+1));
			for(int j=0;j<stu;j++)
			{
				System.out.println("The marks of student no: "+(j+1)+" is ="
			+arr[i][j]);
			}
		}
	}
	
}

public class ArrayOperation2 
{

	public static void main(Strings[] args) 
	{
		Array2 a2= new Array2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class count: ");
		int cls = sc.nextInt();
		System.out.println("Enter the student count: ");
		int stu = sc.nextInt();
		a2.creatArray(cls, stu);
		a2.adddata();
		a2.display();
		sc.close();


	}

}
