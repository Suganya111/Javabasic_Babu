package com.aaludra.Constructor;
class B{
	C obj;
	B(C obj){
		this.obj=obj;
		
	}
	void disp() {
		System.out.println(obj.data);
	}
	
}
class C{
	String data="To pass an argument in the Constructor Call";
	C(){
		B b=new B(this);
		b.disp();
		
	}
	
}

public class ConstructorExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C a=new C();
		

	}

}
