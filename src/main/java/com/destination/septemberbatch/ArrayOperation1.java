package com.destination.septemberbatch;
import java.util.Scanner;

class Array
{
	int arr[];
	int size;
	void creatArray(int n) 
	{
		size = n;
		arr=new int[size];
		System.out.println("Array is created");
		System.out.println("=========================");
	}
	void addData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Collecting array data: ");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the marks of student no:"+i);
			arr[i] = sc.nextInt();
			sc.close();
		}
	}
	void display()
	{
		System.out.println("Display array Data:");
		for(int i=0;i<size;i++)
		{
			System.out.println("The marks of student no:"+(i+1)+ " "
					+ "is ="+arr[i]);
		}
		System.out.println("=======================");
	}
}
public class ArrayOperation1 
{

	public static void main(Strings[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of students:  ");
		int n = sc.nextInt();
		Array a1 = new Array();
		a1.creatArray(n);
		a1.addData();
		a1.display();
		sc.close();
		

	}
	

}
