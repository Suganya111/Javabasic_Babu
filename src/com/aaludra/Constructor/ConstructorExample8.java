package com.aaludra.Constructor;
class A{
	void m(A obj) {
		System.out.println("To pass an argument in the method");
	}
	void n() {
		m(this);
	}
}
public class ConstructorExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.n();

	}

}
