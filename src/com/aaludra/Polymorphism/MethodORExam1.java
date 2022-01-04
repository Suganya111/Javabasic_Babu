package com.aaludra.Polymorphism;
class Car {
	void show() {
		System.out.println("Car is Starting");
	}
}
class Bike extends Car{
	void show() {
		
		System.out.println("Bike is Starting");
	}
}

public class MethodORExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.show();

	}

}
