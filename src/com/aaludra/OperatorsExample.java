package com.aaludra;

/*
 * Specify valid class name
 * Declare specific methods like unarymethods() and call it in main method
 * Sysout statements are more
 */
public class OperatorsExample {
	int a = 10;
	int b = 5;
	boolean tr = true;
	boolean fl = false;

	// TODO Auto-generated method stub
	public void unaryOperators() {
		//Unary Operators

		System.out.println("a++: "+a++);
		System.out.println("++a: "+ ++a);
		System.out.println("a--: "+a--);
		System.out.println("--a: "+--a);
		System.out.println("!tr: "+!tr);
		System.out.println("!fl: " + !fl);
	}
	//Arithmetic Operators
	public void arithmeticOperators() {
		System.out.println("a+b: " + a + b);
		System.out.println("a-b: " + (a - b));
		System.out.println("a*b: " + a * b);
		System.out.println("a/b: " + a / b);
		System.out.println("a%b: " + a % b);
	}
	//Shift Operators
	public void shiftOperators() {
		System.out.println("a<<2: " + (a << 2));
		System.out.println("b>>2: " + (b >> 2));
	}

	public void comparisonOperators() {
		//Comparision Operators
		System.out.println("a==b: " + (a == b));
		System.out.println("a!=b: " + (a != b));

		System.out.println("a<b: " + (a < b));
		System.out.println("a>b: " + (a > b));
		System.out.println("a<=b: " + (a <= b));
		System.out.println("a>=b: " + (a >= b));

	} // Logical and Bitwise Operators

	public void logialOperators() {
		int c=8;

		System.out.println(a<b&b>c);
		//Ternary Operator
		int min=a<b?a:b;
		int max=a>b?a:b;
		System.out.println("maximum of a or b: " + max);
		System.out.println("maximum of a or b: " + min);
	}

	public void assignmentOperator() {
		//Assignment Operator
		a+=3;
		System.out.println("a=a+3: " + a);
		b-=2;
		System.out.println("b-=2: " + b);
		b*=3;
		System.out.println("b*=3: " + b);
		a/=2;
		System.out.println("a/=2: " + a);
	}

	public static void main(String[] args) {
		OperatorsExample example = new OperatorsExample();
		example.arithmeticOperators();
		example.assignmentOperator();
		example.comparisonOperators();
		example.logialOperators();
		example.shiftOperators();
		example.unaryOperators();


	}

}
