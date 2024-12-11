package com.destination.septemberbatch;
import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		al.add("Jafrin");
		al.add(true);
		al.add(345.567);
		al.add('s');
		System.out.println(al);
		al.add(3,555);
		System.out.println(al);
		al.addFirst(2000);
		System.out.println(al);
		al.addLast(3000);
		System.out.println(al);
		
		ArrayList al1= new ArrayList();
		al1.add("salman");
		al1.add("katrina");
		al1.add("samantha");
		al1.add("sachin");
		System.out.println(al1);
		
		al.addAll(al1);
		System.out.println(al1);
		al.addAll(3,al1);
		System.out.println(al);
		
		//11-12-2024
		//al.clear();
		System.out.println(al);
		ArrayList al2 = (ArrayList)al.clone();
		System.out.println(al2);
		boolean res = al.contains(100);
		System.out.println(res);
		res = al.contains(1020);
		System.out.println(res);
		res = al.contains("sachin");
		System.out.println(res);
		res = al.contains("Virat");
		System.out.println(res);
		res = al.containsAll(al2);
		System.out.println(res);
		
		ArrayList al3 = new ArrayList();
		al3.add(500);
		 
		res = al.containsAll(al3);
		System.out.println(res);
		
		al.ensureCapacity(20);
		
		Object o = al.get(5);
		System.out.println(o);
		//o = al.get(560);
		//System.out.println(o);
		
		Class cls = al.getClass();
		System.out.println(cls);
		
		o = al.getFirst();
		System.out.println(o);
		
		o = al.getLast();
		System.out.println(o);
		
		int hashCode = al.hashCode();
		System.out.println(hashCode);
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
