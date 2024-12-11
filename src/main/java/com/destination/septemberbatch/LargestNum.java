package com.destination.septemberbatch;
//3.WAP prgm to find the Largest value of the given array.
import java.util.*;
class Main{
	int arr[];
	int max = Integer.MIN_VALUE;
	Scanner sc= new Scanner(System.in);
	void ColletData(int n) {
		System.out.println("Enter Elements in the Array...");
		arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	void Checking() {
		System.out.println("Checking....");
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
	}
	void display() {
		System.out.println("The Largest Value is ..."+ max);
	}
	
}
public class LargestNum {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of the Array..");
	int n = sc.nextInt();
	Main m1 = new Main();
	m1.ColletData(n);
	m1.Checking();
	m1.display();

	}

}
