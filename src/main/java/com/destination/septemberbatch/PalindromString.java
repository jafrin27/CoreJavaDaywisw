package com.destination.septemberbatch;
import java.util.*;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String...");
		String str = sc.nextLine();
		String str_tmp ="";
		int flag=0;
		for(int i=str.length()-1;i>=0;i--) {
			str_tmp = str_tmp+str.charAt(i);
		}
		System.out.println("The reversed String is :"+str_tmp);
		System.out.println("=====================");
		//approach-1
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str_tmp.charAt(i)) {
				flag = -1;
				System.out.println("String is not a palindrom");
				break;
			}
		}
		if(flag==0) {
			System.out.println("String is not a palindrome");
			}
		System.out.println("================================");
		//approach-2
		if(str.equals(str_tmp)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
		}
	}
