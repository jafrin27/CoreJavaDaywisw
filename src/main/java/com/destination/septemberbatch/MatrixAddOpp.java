package com.destination.septemberbatch;
// check wheather the given matrix id identity or not
//WAP prgm to find the sum off all the elements in the given array
//WAP prgm to find the Largest value of the given array.
//WAP prgm to print the duplicate elements from the given array
//6.WAp prgm to create an array from the existing array by removing the duplicates
//WAP prgm to sort the given array in ascending and descending
import java.util.*;
class Addition
{
	int r1,c1,r2,c2;
	int one[][];
	int two[][];
	int sum[][];
	Scanner sc = new Scanner(System.in);
	void createArray(int m, int n)
	{
		r1=m;
		c1=n;
		one = new int[r1][c1];
		for(int i=0;i<one.length;i++)
		{
			for(int j=0;j<one[i].length;j++)
			{
				one[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Array is created");
		System.out.println("-----------------------------------");
		System.out.println("Enter the value of r2");
		r2 = sc.nextInt();
		System.out.println("Enter the value of c2");
		c2= sc.nextInt();
		two = new int[r2][c2];
		for(int i=0;i<two.length;i++)
		{
			for(int j=0;j<two[i].length;j++)
			{
				two[i][j]= sc.nextInt();
			}
		}
		System.out.println("Second Array is created");
	}
	void AddMatrix()
	{
		if(r1==r2||c1==c2)
		{
		/*{
			System.out.println("Invalid dimensions... addition is not possible");
			return;
		}*/
		sum = new int[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				sum[i][j]= sum[i][j]+(one[i][j]+two[i][j]);
			}
		}
		}
		else {
			System.out.println("Invalid dimensions... addition is not possible");
			return;
			
		}
			
	}
	void Display()
	{
	/*           if(sum==null)
		{
			System.out.println("No matrix to display. Perform addition first.");
			return;
		}*/
		
		System.out.println("Addition of Matrix is :");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	

}
public class MatrixAddOpp 
{
	public static void main(Strings[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		
		int m =sc.nextInt();
		System.out.println("Enter the number of column:");
		
		int n=sc.nextInt();
		
		Addition ad1 = new Addition();
		
		ad1.createArray(m,n);
		ad1.AddMatrix();
		ad1.Display();
		}
}
