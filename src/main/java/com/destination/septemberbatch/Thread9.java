package com.destination.septemberbatch;

class Humans extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"has entered the bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" is  using the bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" has left the bathroom");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Thread9 {

	public static void main(String[] args) throws InterruptedException
	{
		Humans h1 = new Humans();
		h1.setName("Boy");
		Humans h2 = new Humans();
		h2.setName("Girl");
		Humans h3 = new Humans();
		h3.setName("Others");
		 h1.start();
		 h1.join();
		 h2.start();
		 h2.join();
		 h3.start();

	}

}
