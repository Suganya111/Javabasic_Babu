package com.aaludra;

public class CloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ObjectCloningExample1 oc1=new ObjectCloningExample1(1,"CS");
		ObjectCloningExample2 oc2=new ObjectCloningExample2(101,"Babu",oc1);
		ObjectCloningExample2 oc3=(ObjectCloningExample2)oc2.clone();
		oc3.display2();
	}

}
