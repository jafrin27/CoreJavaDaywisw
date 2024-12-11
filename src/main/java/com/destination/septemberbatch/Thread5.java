package com.destination.septemberbatch;
import java.util.Scanner;
import java.util.*;
class jafrin27 implements Runnable{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("add")) {
			addition();
		}

	else if(Thread.currentThread().getName().equals("print")) 
	{
			printing();
		}
	else{
			banking();
		}
	}
	void addition() {
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
	void printing() {
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
	void banking() {
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
public class Thread5 {

	public static void main(String[] args) {
		jafrin27 opp1 = new jafrin27();
		Thread t1 = new Thread(opp1);
		t1.setName("add");
		
		jafrin27 opp2 = new jafrin27();
		Thread t2 = new Thread(opp2);
		t2.setName("print");
		
		jafrin27 opp3 = new jafrin27();
		Thread t3 = new Thread(opp3);
		t3.setName("banking");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
