package com.aaludra.Polymorphism;
class B1{
	B1(){
		System.out.println("Parent Class");
	}
}
class B2 extends B1{
	B2(){
		super();
		System.out.println("ChildClass");
	}
	{
		System.out.println("Instance INitializer");
	}
	
}

public class InstanceInitializerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b=new B2();
		

	}

}
