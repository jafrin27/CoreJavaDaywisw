package com.destination.septemberbatch;
import java.util.Scanner;
// WAP to Anagram...
import java.util.Arrays;
public class StringAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        if(str1.length()==str2.length()) {
        	char arr1[] = new char[str1.length()];
        	char arr2[] = new char[str2.length()];
        	for(int i=0;i<arr1.length;i++) {
        		arr1[i]= str1.charAt(i);
        		arr2[i]=str2.charAt(i);
        	}
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)) {
        	System.out.println("Given String is an Anagram");
        }
        else {
        	System.out.println("Not Anagram");
        }
        }
      else {
        	System.out.println("Not Anagram");
        }
    
	}

}
