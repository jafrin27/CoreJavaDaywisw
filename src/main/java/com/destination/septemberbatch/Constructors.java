package com.destination.septemberbatch;

class Dogs3{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	// zero parameterized
	public Dogs3() {
		super();//by default
		System.out.println("hi from zero constructor");
	}
	//Single Parameterized Constructor
	public Dogs3(String name) {
		this("Dacchu","Brown");
		System.out.println("Inside single parameterizes constructor");
		this.name= name;
	}
	// 2 Parameterized Constructor
	public Dogs3(String name, String color) {
		this("Faroo","Yellow","Pug");
		System.out.println("Inside 2-Paramterized Constructor");
		this.name = name;
		this.color = color;
	}
	// 3-Parameterized Constructor
	public Dogs3(String name,String color,String breed) {
		this("Hima","Blue","GR",5000);
		System.out.println("Inside 3-Parameterized");
		this.name = name;
		this.color= color;
		this.breed = breed;
	}
	//4-Parameterized Constructor
	public Dogs3(String name,String color, String breed,int cost) {
		this("Rocky","Black","GR-Imported",17000,6);
		System.out.println("Inside 4-Parameterized Constructor");
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.cost = cost;
		}
	//5-Parameterized Constructor
	public Dogs3(String name,String color,String breed,int cost,int age) {
		super();
		System.out.println("5-Parameterized Constructor");
		this.name = name;
		this.color= color;
		this.breed = breed;
		this.cost = cost;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getBreed() {
		return breed;
	}
	public int getCost() {
		return cost;
	}
	public int getAge() {
		return age;
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		Dogs3 d1 = new Dogs3();
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getBreed());
		System.out.println(d1.getCost());
		System.out.println(d1.getAge());
		System.out.println("================================");
		Dogs3 d2 = new Dogs3("a","c","b",4000,3);
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());
		System.out.println(d2.getCost());
		System.out.println(d2.getAge());
		System.out.println("========================================");
		Dogs3 d3 = new Dogs3("Ramu");
		System.out.println(d3.getName());
		System.out.println(d3.getColor());
		System.out.println(d3.getBreed());
		System.out.println(d3.getCost());
		System.out.println(d3.getAge());
		System.out.println("==========================================");
	}

}
