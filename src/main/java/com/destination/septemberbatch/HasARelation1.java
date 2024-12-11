package com.destination.septemberbatch;
class Heart{
	int Heartbeat;
	String Bloodcolor;
	public Heart(int heartbeat, String bloodcolor) {
		super();
		Heartbeat = heartbeat;
		Bloodcolor = bloodcolor;
	}
	public int getHeartbeat() {
		return Heartbeat;
	}
	public String getBloodcolor() {
		return Bloodcolor;
	}
}
class Brain{
	String name;
	int cells;
	public Brain(String name, int cells) {
		super();
		this.name = name;
		this.cells = cells;
	}
	public String getName() {
		return name;
	}
	public int getCells() {
		return cells;
	}
}
class book{
	String name;
	int books;
	public book(String name, int books) {
		super();
		this.name = name;
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public int getBooks() {
		return books;
	}
	
}
class bike{
	String type;
	int parts;
	public bike(String type, int parts) {
		super();
		this.type = type;
		this.parts = parts;
	}
	public String getType() {
		return type;
	}
	public int getParts() {
		return parts;
	}
	
}
class student{
	Heart h = new Heart(80,"Red");
	Brain b = new Brain("HumanBrain",567);
	void hasbook(book bo) {
		System.out.println(bo.getName());
		System.out.println(bo.getBooks());
	}
	void hasbike(bike bi) {
		System.out.println(bi.getType());
		System.out.println(bi.getParts());
	}
}
public class HasARelation1 {

	public static void main(String[] args) {
		book bo = new book("Java",1);
		bike bi = new bike("KTM",88);
		student stu = new student();
		System.out.println(stu.h.getHeartbeat());
		System.out.println(stu.h.getBloodcolor());
		System.out.println(stu.b.getName());
		System.out.println(stu.b.getCells());
		stu.hasbike(bi);
		stu.hasbook(bo);
	}

}
