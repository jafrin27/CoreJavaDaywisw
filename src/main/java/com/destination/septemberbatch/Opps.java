package com.destination.septemberbatch;
import java.util.Scanner;
abstract class Shapes{
	abstract void collectdata();
	abstract void calculate();
	public void display() {
		System.out.println("Shapes...");
	}
}
class Cirlce extends Shapes{
	private double r;
	private double res;
	final private double pi=3.14;
	Scanner sc=new Scanner(System.in);
	void collectdata() {
		System.out.println("Enter the circle radius-:");
		r=sc.nextDouble();
	}
	void calculate() {
		res=pi*r*r;
	}
	public void display() {
		System.out.println("Area of circle is -:"+res);
	}
	
}
class Square extends Shapes{
	private double side;
	private double res;
	Scanner sc=new Scanner(System.in);
	void collectdata() {
		System.out.println("enter the side of square-: ");
		side=sc.nextDouble();
	}
	void calculate() {
		res=side*side;
	}
	public void display() {
		System.out.println("area of square is -:"+res);
	}
	
}
class Rectangle extends Shapes{
	private double l,b;
	private double res;
	Scanner sc=new Scanner(System.in);
	void collectdata() {
		System.out.println("enter the lengh of reactangle-: ");
		l=sc.nextDouble();
		System.out.println("enter the width of reactangle -: ");
		b=sc.nextDouble();
	}
	void calculate() {
		res=l*b;
	}
	public void display() {
		System.out.println("area of reactangle is -:"+res);
	}
	
}
class Geometry{
	public void useShape(Shapes s) {
		s.collectdata();
		s.calculate();
		s.display();
	}
}
public class Opps {

	public static void main(String[] args) {
		Cirlce c=new Cirlce();
		Square s=new Square();
		Rectangle r=new Rectangle();
		Geometry g=new Geometry();
		
//		c.collectdata();
//		c.calculate();
//		c.display();
//		
//		s.collectdata();
//		s.calculate();           we can do like this are using following approch
//		s.display();
//		
//		r.collectdata();
//		r.calculate();
//		r.display();
		
		System.out.println("for circle...............");
		g.useShape(c);
		
		System.out.println("\n\n for square..............");
		g.useShape(s);
		
		System.out.println("\n\n for ractangle.............");
		g.useShape(r);
	}

}
