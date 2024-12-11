package com.destination.septemberbatch;
class Msoffices extends Thread
{
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
	//primary
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
	//secondary
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
	//secondary
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
public class Thread7 {

	public static void main(String[] args) {
		Msoffices ms1 = new Msoffices();
		ms1.setName("typing");
		Msoffices ms2 = new Msoffices();
		ms2.setName("spellcheck");
		ms2.setDaemon(true);
		ms2.setPriority(8);
		Msoffices ms3 = new Msoffices();
		ms3.setName("saving");
		ms3.setDaemon(true);
		ms3.setPriority(9);
		
		ms1.start();
		ms2.start();
		ms3.start();
	}

}
