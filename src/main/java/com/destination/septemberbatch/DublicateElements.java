package com.destination.septemberbatch;
//5. WAP prgm to print the duplicate elements from the given array
import java.util.*;
class DuplicateFinder { 
    int arr[];
    Scanner sc = new Scanner(System.in);
    void createArray(int n) {
        arr = new int[n];
    }
    void collectData() {
        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void findDuplicates() {
        boolean foundDuplicates = false;
        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    foundDuplicates = true;
                    break;  // break to avoid printing the same duplicate multiple times
                }
            }
        }
        
        if (!foundDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
}

public class DublicateElements {

	public static void main(String[] args) {
		DuplicateFinder df = new DuplicateFinder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();

        df.createArray(n);  
        df.collectData();   
        df.findDuplicates();  
        sc.close(); 
	}

}
