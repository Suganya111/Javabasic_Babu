package com.aaludra.Inheritance;
class GrandPa{
	void house() {
		System.out.println("I have an Own House");
	}
}
class Parent extends GrandPa{
	void car() {
		System.out.println("I have a Car");
	}
}
class Child extends Parent{
	void bike() {
		System.out.println("I have a Bike");
		
	}
}

public class InheritanceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.house();
		c.car();
		c.bike();

	}

}
