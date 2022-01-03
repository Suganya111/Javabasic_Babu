package com.aaludra.Operators;

public class LogicalandBitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Logical && and Bitwise &
		int a=10;
		int b=5;
		int c=30;
		System.out.println("Logical AND: "+ (a<b && a<c));
		System.out.println("Bitwise AND: "+ (a<b & a<c));
		//Logical || and Bitwise |
		System.out.println("Logical OR: "+(a<b||a<c));
		System.out.println("Logical OR: "+(a<b|a<c));

	}

}
