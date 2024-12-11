package com.destination.septemberbatch;
abstract class Plane1{
	void takeoff(){
		System.out.println("Plane took off");
	}
	abstract void fly();
	void land() {
		System.out.println("plane has landed");
	}
}
public class Abstractions1 {
	public static void main(String[] args) {
		// Plane p1 = new Plane1();// cannot create the object of abstract class directly
		//Plane1 p2;// reference of the abstract class can be created directly
		Plane1 p3 = new Plane1() {
			@Override
			public void fly() {
				System.out.println("Plane flys");
			}
		};
		System.out.println(p3);
		p3.takeoff();
		p3.fly();
		p3.land();
	}
}
