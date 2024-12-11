package com.destination.septemberbatch;
import java.util.*;
class Dog{
	String name;
	String colour;
	String breed;
	int Cost;
	int age;
	void SetDataStatic() {
		name = "Tommy";
		colour = "Red";
		breed = "Pug";
		Cost = 9000;
		age = 2;
	}
	void GetData() {
		System.out.println(name);
		System.out.println(colour);
		System.out.println(breed);
		System.out.println(Cost);
		System.out.println(age);
	}
	public void SetDataDynamic(String s1,String s2,String s3,int i1 ,int i2)
	{
		name = s1;
		colour = s2;
		breed = s3;
		Cost = i1;
		age =i2;
	}
}
public class LaunchDog {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Dog d = new Dog();
	d.GetData();
	d.SetDataStatic();
	System.out.println("==============================");
	d.GetData();
	System.out.println("======================================");
	Dog d1 = new Dog();
	System.out.println("Enter Dog Name..");
	String name = sc.next();
	System.out.println("Enter Color of Dog");
	String colour= sc.next();
	System.out.println("Enter Breed of Dog");
	String  breed= sc.next();
	System.out.println("Enter Cost of dog");
	int Cost= sc.nextInt();
	System.out.println("Enter age of dog");
	int age= sc.nextInt();
	d1.SetDataDynamic(name, colour, breed, Cost, age);
	d1.GetData();
	
	
	}

}
