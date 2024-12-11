package com.destination.septemberbatch;
//WAP prgm to find the sum off all the elements in the given array
import java.util.*;
class SumOps{
	int sum=0;
	int arr[];
	Scanner sc = new Scanner(System.in);
	void collectData(int n) {
		arr = new int[n];
		System.out.println("Enter the Elements in the Array..");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}		
		}
	void SumOperation() {
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}		
	}
	void Display() {
			System.out.println("The Sum of all Elements in the array is.."+ sum);
			}
	
}

public class ArraySum {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of arrays..");
		int n = sc.nextInt();
		SumOps so = new SumOps();
		so.collectData(n);
		so.SumOperation();
		so.Display();
		sc.close();
	}

}
