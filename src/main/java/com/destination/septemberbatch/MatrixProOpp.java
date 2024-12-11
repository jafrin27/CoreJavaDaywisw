package com.destination.septemberbatch;
import java.util.Scanner;
class Multiplication
{
	int r1,c1,r2,c2;
	int one[][];
	int two[][];
	int pro[][];
	Scanner sc = new Scanner(System.in);
	void createArray(int m,int n)
	{
		 r1=m;
		 c1=n;
		one = new int[r1][c1];
		for(int i=0;i<one.length;i++)
		{
			for(int j=0;j<one[i].length;j++)
			{
				one[i][j]= sc.nextInt();
			}
			
		}
		System.out.println("First Array is Created...");
		System.out.println("Enter the value of r2 :");
		r2 = sc.nextInt();
		System.out.println("Enter the value of c2");
		c2 = sc.nextInt();
		 two = new int[r2][c2];
		for(int i=0;i<two.length;i++)
		{
			for(int j=0;j<two[i].length;j++)
			{
				two[i][j] = sc.nextInt();
			}
		}
		System.out.println("Second Array is Created...");
	}
	void ProMat()
	{
		  if (c1 != r2) 
		  {
	            System.out.println("Matrix multiplication cannot be performed.");
	            return;
	        }
			pro = new int[r1][c2];
			for(int i=0;i<r1;i++)
			{
			for(int j=0;j<c2;j++)
			 {
				for(int k=0;k<c1;k++)
				{
					pro[i][j]+=(one[i][k]*two[k][j]);
				}
			 }
			}
	}
	void Display() 
	{
		if (pro == null) 
		{
            System.out.println("No matrix to display. Perform multiplication first.");
            return;
        }

        System.out.println("Product matrix is:");
		 for (int i = 0; i < r1; i++) 
		 {
	            for (int j = 0; j < c2; j++) 
	            {
	                System.out.print(pro[i][j] + " ");
	            }
	            System.out.println(); 
	        }
		 }
}
class MatrixProOpp 
{
	public static void main(Strings[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of r1");
		int m = sc.nextInt();
		System.out.println("Enter number of c1");
		int n = sc.nextInt();
		Multiplication m1 = new Multiplication();
		m1.createArray(m,n);
		m1.ProMat();
		m1.Display();
		
	}
}
