package com.destination.septemberbatch;
import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add("sachin");
		al.add(true);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		al.add(345.567);
		al.add('s');
		//System.out.println(al);
		//al.clear();
		System.out.println(al);
		
		int pos = al.indexOf("sachin");
		System.out.println(pos);
		
		pos = al.lastIndexOf("sachin tendulkar");
		

	}

}
