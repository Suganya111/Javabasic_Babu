package com.aaludra.Polymorphism;
class A{
	void show() {
		System.out.println("This is Covariant");
	}
}
class B extends A{

	@Override
	void show() {
		// TODO Auto-generated method stub
		{
			System.out.println("Extends Covariant");
			
		}
	}
	
}
class C extends B{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Again Extends");
	}
	
}
public class CovariantExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.show();

	}

}
