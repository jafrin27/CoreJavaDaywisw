package com.destination.septemberbatch;
import java.util.*;
//check wheather the given matrix id identity or not
//WAP prgm to find the sum off all the elements in the given array
//WAP prgm to find the Largest value of the given array.
//WAP prgm to print the duplicate elements from the given array
//WAp prgm to create an array from the existing array by removing the duplicates
//WAP prgm to sort the given array in ascending and descending
class Matrixs{
	int r1,c1;
	int arr[][];
	boolean x=true;
	void createMatrix(int m,int n) {
		r1=m;
		c1=n;
		Scanner sc = new Scanner(System.in);
		arr = new int[r1][c1];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]= sc.nextInt();
				}
			}sc.close();
		System.out.println("Array is created");	
	}
	void Operation() {
		if(r1==c1)
		{
			System.out.println("Started Verifying..");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++){
				if(i==j) {
					if(arr[i][j]==1){
					}
					else{
						x = false;
						}
					}
				else {
					if((arr[i][j]==0)){
						}
					else{
						x = false;
						}
					}
				}
			}
		if(x==false) {
			System.out.println("Not a Identity Matrix... ");
			}
		else {
			System.out.println("It is a Identity Matrix");
			}
		}
		else {
			System.out.println("Invalid Dimensions..");
			}
		}
	
	}
public class Identity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows..");
		int m = sc.nextInt();
		System.out.println("Enter the columns...");
		int n = sc.nextInt();
		Matrixs m1 = new Matrixs();
		m1.createMatrix(m , n);
		m1.Operation();
		sc.close();
		}
	}
