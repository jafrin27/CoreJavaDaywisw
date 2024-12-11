package com.destination.septemberbatch;
import java.util.*;
public class Thread1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t1 = new Thread();
		System.out.println(t1);
		t1.setName("jafrin");
		t1.setPriority(4);
		System.out.println(t1);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());

	}

}
