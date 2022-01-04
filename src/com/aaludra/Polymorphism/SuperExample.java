package com.aaludra.Polymorphism;
class Super1{//Refer immediate Parentclass
	void show() {
		System.out.println("My name is");
	}
}
class Super2 extends Super1{

	@Override
	void show() {
		// TODO Auto-generated method stub
		
		super.show();
		System.out.println("Babu Prasath");
	}
	
}
class Super3 extends Super2{
	void show() {
	super.show();
	System.out.println("From Trichy");
	}
	
}
public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super3 b=new Super3();
		b.show();

	}

}
