package com.aaludra.Abstraction;
interface Showable{//Multiple inheritance in interface
	void show();
}
interface Drawable{
	void print();
}
class Triangle implements Showable,Drawable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Draw Triangle");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show Triangle");
		
	}
	
}
public class InterFaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		t.print();
		t.show();

	}

}
