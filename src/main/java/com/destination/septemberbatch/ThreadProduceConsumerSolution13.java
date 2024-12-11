package com.destination.septemberbatch;

class producers extends Thread{
	Queues a;
	public producers(Queues q) {
		a=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			a.put(i++);
		}
	}
}
class consumers extends Thread{
	Queues b ;
	public consumers(Queues q) {
		b =q;
	}
	@Override
	public void run() {
		while(true) {
			b.get();
		}
	}
}

class Queues{
	boolean value_of_x=false;
	int x;
	synchronized public void put(int val) {
		try {
			if(value_of_x==false) {
				x=val;
				System.out.println("The Value "+val+"is put into x");
				value_of_x= true;
				notify();
			}
			else {
				wait();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void get() {
		try {
			if(value_of_x==true) {
				System.out.println("The Value "+x+"has be consumed");
				value_of_x=false;
				notify();
				
			}
			else {
				wait();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadProduceConsumerSolution13 {

	public static void main(String[] args) {
		Queues q = new Queues();
		producers p = new producers(q);
		consumers c = new consumers(q);
		p.start();
		c.start();

	}

}
