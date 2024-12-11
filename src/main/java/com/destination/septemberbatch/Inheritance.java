package com.destination.septemberbatch;
class Plane{
	void takeoff(){
		System.out.println("Plane tookoff");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane is landing");
	}
}
class CargoPlane extends Plane{
	void fly() {
		System.out.println("CargoPlane is flying at lowest height");
	}
	void CarryGoods() {
		System.out.println("Cargo Plane carry goods");
	}
}
class PassengerPlane extends Plane{
	void fly() {
		System.out.println("PassengerPlane is flying at medium height");
	}
	void CarryPassenger() {
		System.out.println("PassengerPlane carry Passengers");
	}
}
class FighterPlane extends Plane{
	void fly() {
		System.out.println("FighterPlane is flying at Heihest height");
	}
	void Carryweapons() {
		System.out.println("FighterPlane  carry weapons");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		System.out.println("CargoPlane-------------------------");
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.CarryGoods();
		System.out.println("===============================================");
		PassengerPlane pp = new PassengerPlane();
		System.out.println("PassengerPlane-------------------------");
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.CarryPassenger();
		System.out.println("===============================================");
		FighterPlane fp = new FighterPlane();
		System.out.println("FighterPlane-------------------------");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.Carryweapons();
		System.out.println("===============================================");
		
	}

}
