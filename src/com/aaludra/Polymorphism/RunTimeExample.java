package com.aaludra.Polymorphism;
class Benz{
	void show() {
		System.out.println("Car is running");
	}
	
}
class Splendor extends Benz{
	void show() {
		System.out.println("Bike is Running");
	}
}
public class RunTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benz c=new Splendor();
		c.show();

	}

}
