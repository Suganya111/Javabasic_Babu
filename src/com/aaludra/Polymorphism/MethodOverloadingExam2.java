package com.aaludra.Polymorphism;

public class MethodOverloadingExam2 {//changing data types
	public int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b,double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExam2 obj=new MethodOverloadingExam2();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10.5, 20.6, 30.7));

	}

}
