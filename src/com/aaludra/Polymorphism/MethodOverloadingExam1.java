package com.aaludra.Polymorphism;

public class MethodOverloadingExam1 {//Changing number of Arguments
	
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExam1 obj=new MethodOverloadingExam1();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
		

	}

}
