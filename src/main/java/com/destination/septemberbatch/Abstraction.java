package com.destination.septemberbatch;


abstract class Plane{
	abstract void takeoff();
	abstract void fly();//abstract method
	abstract void land();
}
class CargoPlane extends Plane{
	@Override
	void takeoff() {
		System.out.println("CargoPlane tookoff");
	}
	void fly() {
		System.out.println("CargoPlane is flying at lowest height");
	}
	void land() {
		System.out.println("CargoPlane is landing");
	}
	void CarryGoods() {
		System.out.println("Cargo Plane carry goods");
	}	
}
class PassengerPlane extends Plane{
	@Override
	void takeoff() {
		System.out.println("PassengerPlane tookoff");
	}
	void fly() {
		System.out.println("PassengerPlane is flying at medium height");
	}
	void land() {
		System.out.println("Passenger Plane is landing");
	}
	void CarryPassenger() {
		System.out.println("PassengerPlane carry Passengers");
	}
}
class FighterPlane extends Plane{
	@Override
	void takeoff() {
		System.out.println("FighterPlane tookoff");
	}
	void fly() {
		System.out.println("FighterPlane is flying at Heihest height");
	}
	void land() {
		System.out.println("FighterPlane is landing");
	}
	void Carryweapons() {
		System.out.println("FighterPlane  carry weapons");
	}
}
public class Abstraction {

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
