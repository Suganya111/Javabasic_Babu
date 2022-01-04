package com.aaludra.Polymorphism;
class Final{
	final void show() {
		System.out.println("HII");
	}
}
class F2 extends Final{
	
}
public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F2 f=new F2();
		f.show();

	}

}
