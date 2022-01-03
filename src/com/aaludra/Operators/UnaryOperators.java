package com.aaludra.Operators;

public class UnaryOperators {
/*
 * Incremant/Decrement the Value
 * Negating an Expression
 * Inverting the Value of Boolean
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		int c=-10;
		boolean bool1=true;
		boolean bool2=false;
		System.out.println("Pre-Increment: "+ ++a);
		System.out.println("Post_Increment: "+ a++);
		System.out.println("Pre-Decrement:"+--a);
		System.out.println("Post-Decrement:"+a--);
		System.out.println("Negating an Expression:"+~a);
		System.out.println("Negating an Expression:"+~c);
		System.out.println("Negating an Expression:"+!bool1);
		System.out.println("Negating an Expression:"+!bool2);

	}

}
