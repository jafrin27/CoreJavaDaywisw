package com.destination.septemberbatch;
import java.util.*;

//problem with single threaded programming
public class Thread2 {

	public static void main(String[] args) 
	{
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition operation started");
		System.out.println("Enter the number-1:");
		int n = sc.nextInt();
		System.out.println("Enter the number-2");
		int m = sc.nextInt();
		int res = n+m;
		System.out.println("Addition Operation completed");
		System.out.println(res);
		
		System.out.println("Printing operation started");
		for(int i=1;i<5;i++) {
			System.out.println("Hi Good Noon");
			Thread.sleep(3000);
		}
		System.out.println("printing Operation completed");
		System.out.println("Banking Operation started");
		System.out.println("Enter the account number");
		int accno =sc.nextInt();
		System.out.println("Enter the Password pin:");
		int pin = sc.nextInt();
		if(accno==1 && pin==2) {
			System.out.println("Valid user");
		}
		else {
			System.out.println("Invalid user");
		}
		System.out.println("Banking Operation Completed");
	}
		catch (Exception e1) {
			e1.printStackTrace();
		}
	
	

	}

}
