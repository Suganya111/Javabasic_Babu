package com.aaludra.Methods;
abstract class demo{
	void display() {
		
	}
}

public class MethodsExample2 extends demo{
	void display() {
		System.out.println("Abstract Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsExample2 me=new MethodsExample2();
		me.display();

	}

}
