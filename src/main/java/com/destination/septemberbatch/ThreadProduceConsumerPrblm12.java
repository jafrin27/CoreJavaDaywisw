package com.destination.septemberbatch;

//PRODUCER CONSUMER PROBLEM

class producer extends Thread{
	Queue a;
	public producer(Queue q) {
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
class consumer extends Thread{
	Queue b ;
	public consumer(Queue q) {
		b =q;
	}
	@Override
	public void run() {
		while(true) {
			b.get();
		}
	}
}
class Queue{
	int x;
	public void put(int val) {
		x=val;
		System.out.println("The Value "+val+"is put into x");
	}
	public void get() {
		System.out.println("The Value "+x+"has be consumed");
	}
}
public class ThreadProduceConsumerPrblm12 {
	public static void main(String[] args) {
		Queue q = new Queue();
		producer p = new producer(q);
		consumer c = new consumer(q);
		p.start();
		c.start();
	}

}
