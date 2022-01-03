package com.aaludra.Modifiers;

public class PrivateExample {
	int a=10;
	private void msg() {
		System.out.println("Hello"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateExample pe=new PrivateExample();
		pe.msg();

	}

}
