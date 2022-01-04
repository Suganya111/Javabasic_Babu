package com.aaludra.Abstraction;
interface printable{
	void print();
}
class Rectangle1 implements printable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Showable");
		
	}
	
}
class Circle1 extends Rectangle1{

	@Override
	public void print() {
		super.print();
		// TODO Auto-generated method stub
		System.out.println("Draw Circle");
		
	}
	
}
public class InterFaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printable p=new Circle1();
		p.print();
		

	}

}
