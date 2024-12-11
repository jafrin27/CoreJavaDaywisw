package com.destination.septemberbatch;
import java.util.*;
class dog1{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	void setData(String name,String color,String breed,int cost,int age)
	{
		name = name;
		color = color;
		breed = breed;
		cost = cost;
		age = age;
	}
	void setName(String name) {
		name = name;
	}
	void setColor(String color) {
		color = color;
	}
	void setBreed(String breed) {
		breed = breed;
	}
	void setCost(int cost) {
		cost = cost;
	}
	void setAge(int age) {
		age = age;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
}
public class ShadowingProblem1 {

	public static void main(String[] args) {
		dog1 d1 = new dog1();
		d1.setData("Tommy","Brown","Pug", 5000 , 2);
		d1.getData();
		System.out.println("--------------------");
		dog1 d2= new dog1();
		d2.setName("Jimmy");
		d2.setColor("White");
		d2.setBreed("GR");
		d2.setCost(8000);
		d2.setAge(6);
		d2.getData();

	}

}
