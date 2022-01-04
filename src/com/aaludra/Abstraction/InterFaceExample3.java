package com.aaludra.Abstraction;
interface Ab{
	void a();
	void b();
	void c();
}
abstract class Bc implements Ab{
	public void b() {
		System.out.println("I am B");
	}
}
class Cd extends Bc{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("I am A");
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("I am C");
		
	}
	
}
public class InterFaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cd cd=new Cd();
		cd.a();
		cd.b();
		cd.c();

	}

}
