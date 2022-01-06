package com.aaludra.Exceptions;

import java.io.IOException;


class Parent{
	void msg() {
		System.out.println("Parent Class");
	}
}
class Child extends Parent{
	void msg()throws ArithmeticException{
		System.out.println("Child Class");
	}
}
public class ExceptionOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		p.msg();
		

	}

}
