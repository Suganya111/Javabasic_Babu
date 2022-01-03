package com.aaludra.Modifiers;

public class ProtectedExample2 extends ProtectedExample{
	int age=23;
	protected void age() {
		System.out.println("Your Age is"+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedExample2 pe2=new ProtectedExample2();
		pe2.msg();
		pe2.age();

	}

}
