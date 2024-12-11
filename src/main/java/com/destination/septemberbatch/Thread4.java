package com.destination.septemberbatch;

import java.util.Scanner;

//multithreading using thread class(all in one class)

class Operations extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("add")) {
			addition();
		}else if(Thread.currentThread().getName().equals("print")){
			printing();
		}
		else {
			banking();
		}
	}
	public void addition() {
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
	public void printing() {
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
	public void banking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Operation started");
		System.out.println("Enter the account number");
		int accno =
				sc.nextInt();
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
public class Thread4 {

	public static void main(String[] args) {
		
		Operations op1 = new Operations();
		op1.setName("add");
		Operations op2 = new Operations();
		op2.setName("print");
		Operations op3 = new Operations();
		op3.setName("bank");
		op1.start();
		op2.start();
		op3.start();

	}

}
