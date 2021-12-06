package com.aaludra;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Unary Operators
		int a=10;
		int b=5;
		boolean tr=true;
		boolean fl=false;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(!tr);
		System.out.println(!fl);
		//Arithmetic Operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Shift Operators
		System.out.println(a<<2);
		System.out.println(b>>2);
		
		//Comparision Operators
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		//Logical and Bitwise Operators
		int c=8;
		System.out.println(a>b&&a>c);
		System.out.println(a<b&b>c);
		//Ternary Operator
		int min=(a<b)?a:b;
		int max=(a>b)?a:b;
		System.out.println(max);
		System.out.println(min);
		//Assignment Operator
		a+=3;
		System.out.println(a);
		b-=2;
		System.out.println(b);
		b*=3;
		System.out.println(b);
		a/=2;
		System.out.println(a);
		
		
		
		

	}

}
