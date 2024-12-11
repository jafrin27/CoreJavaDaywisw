package com.destination.septemberbatch;
import java.util.*;
//Multithreading using Thread classes approach-1
class Additions extends Thread{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition Operation Started");
		System.out.println("Enter the number-1: ");
		int n = sc.nextInt();
		System.out.println("Enter the number-2");
		int m = sc.nextInt();
		int res = n+m;
		System.out.println(res);
		System.out.println("Addition Operation completed");
		}
}
class Printing extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Printing operation started");
			for(int i=1;i<5;i++) {
				System.out.println("Hi Good Noon");
				Thread.sleep(3000);
			}
			System.out.println("printing Operation completed");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Banking extends Thread{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
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
	}
public class Thread3 {

public static void main(String[] args) {
	Additions a = new Additions();
	Printing p = new Printing();
	Banking b = new Banking();
	System.out.println(a);
	System.out.println(p);
	System.out.println(b);
	a.start();
	p.start();
	b.start();
}
}
