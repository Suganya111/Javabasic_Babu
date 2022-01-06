package com.aaludra.Exceptions;

public class ThrowExample {
	public static void valid(int age) {
		if(age>18) {
			throw new ArithmeticException("Eligible");
			
		}
		else {
			System.out.println("Not Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valid(9);

	}

}
