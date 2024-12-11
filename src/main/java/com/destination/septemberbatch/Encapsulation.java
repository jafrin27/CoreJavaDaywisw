package com.destination.septemberbatch;
class Tiger{
	String name;
	String color;
	String country;
	int age;
	void SetStaticName() {
		name ="ramu";
	}
	void SetStaticColour() {
		color="Orange";
	}
	void SetStaticCountry() {
		country = "Africa";
	}
	void SetStaticAge() {
		age = 7;
	}
	void SetDynamicName(String s1) {
		name = s1;
	}
	void SetDynamicColour(String s2) {
		color = s2;
	}
	void SetDynamiccountry(String s3) {
		country = s3;
	}
	void SetDynamicAge(int i1)
	{
		age = i1;
	}
	String getName() {
		return name;
	}
	String getcolor() {
		return color;
	}
	String getcountry() {
		return country;
	}
	int getAge() {
		return age;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.getName());
		System.out.println(t1.getcolor());
		System.out.println(t1.getcountry());
		System.out.println(t1.getAge());
		System.out.println("----------------");
		t1.SetStaticName();
		t1.SetStaticColour();
		t1.SetStaticCountry();;
		t1.SetStaticAge();
		System.out.println(t1.getName());
		System.out.println(t1.getcolor());
		System.out.println(t1.getcountry());
		System.out.println(t1.getAge());
		System.out.println("----------------");
		Tiger t2 = new Tiger();
		System.out.println(t2.getName());
		System.out.println(t2.getcolor());
		System.out.println(t2.getcountry());
		System.out.println(t2.getAge());
		System.out.println("----------------");
		t2.SetDynamicName("Sham");
		t2.SetDynamicColour("White");
		t2.SetDynamiccountry("india");
		t2.SetDynamicAge(8);
		System.out.println(t2.getName());
		System.out.println(t2.getcolor());
		System.out.println(t2.getcountry());
		System.out.println(t2.getAge());
		
		
	}

}
