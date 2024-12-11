package com.destination.septemberbatch;

class Msoffice extends Thread{
	@Override
	public void run(){
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("spellcheck")) {
			spellcheck();
		}
		else {
			saving();
		}
	}
	void typing() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Typing in progress.....");
				Thread.sleep(3000);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	void spellcheck() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Spell Checking Progress......");
				Thread.sleep(3000);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	void saving() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Saving Checking Progress......");
				Thread.sleep(3000);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
public class Thread6 {

	public static void main(String[] args) {
		Msoffice ms1 = new Msoffice();
		ms1.setName("typing");
		Msoffice ms2 = new Msoffice();
		ms2.setName("spellcheck");
		Msoffice ms3 = new Msoffice();
		ms3.setName("saving");
		
		ms1.start();
		ms2.start();
		ms3.start();
		


	}

}
