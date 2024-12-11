package com.destination.septemberbatch;

class Warriors extends Thread{
	String res1 = " Ak-47";
	String res2 = "Snipper";
	String res3 = "Pistol";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("sachin")) {
			sachinAcquired();
		}
		else {
			avinashAcquired();
		}
	}
	public void sachinAcquired() {
		try {
			synchronized (res1) {
				System.out.println("Sachin has aquired weapon :"+res1);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("Sachin has aquired weapon :"+res2);
					Thread.sleep(3000);
					synchronized (res3) {
						System.out.println("Sachin has aquired weapon :"+res3);
						Thread.sleep(3000);
				
			}
		}
	}
}catch (Exception e) {
				e.printStackTrace();}
	}
		public void avinashAcquired() {
			try {
				synchronized (res3) {
					System.out.println("Avinash has aquired weapon :"+res3);
					Thread.sleep(3000);
					synchronized (res2) {
						System.out.println("Avinash has aquired weapon :"+res2);
						Thread.sleep(3000);
						synchronized (res1) {
							System.out.println("Avinash has aquired weapon :"+res1);
							Thread.sleep(3000);
					
				}
			}
		}
			}catch (Exception e) {
					e.printStackTrace();
				}
}
	}
public class Thread11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warriors w1 = new Warriors();
		w1.setName("sachin");
		Warriors w2 = new Warriors();
		w2.setName("avinash");
		
		w1.start();
		w2.start();

	}

}
