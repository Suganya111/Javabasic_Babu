package com.aaludra.Modifiers;

public class PrivateExample {
	private int a=10;
	void msg() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateExample pe=new PrivateExample();
		System.out.println(pe.a);
		pe.msg();

	}

}
