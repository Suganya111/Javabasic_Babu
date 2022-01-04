package com.aaludra.Abstraction;
abstract class shape{
	abstract void draw();
}
class Rectangle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
		
	}
	
}
class Circle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
		
	}
	
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new Circle();
		s.draw();
		shape s1=new Rectangle();
		s1.draw();

	}

}
