package com.destination.septemberbatch;
//4.WAP prgm to sort the given array in ascending and descending
import java.util.*;
class SortArrays{
	int arr[];
	int temp;
	Scanner sc = new Scanner(System.in);
	void createArray(int n) {
		arr = new int[n];
	}
	void collectdata() {
		System.out.println("Enter the Array Elements..");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Ascending Order Checking...");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted in Ascending...");
		for(int i=0;i<arr.length;i++) {
			System.out.print("["+arr[i]+"]");}
		System.out.println();
		System.out.println("===================================");
		}
	
	void Descending() {
		System.out.println("Descending Order Checking...");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted in Descending...");
		for(int i=0;i<arr.length;i++) {
			System.out.print("["+arr[i]+"]");}
	}
}
public class Sorting {

	public static void main(String[] args) {
		SortArrays sa = new SortArrays();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		sa.createArray(n);
		sa.collectdata();
		sa.Descending();
		sc.close();
	}

}
