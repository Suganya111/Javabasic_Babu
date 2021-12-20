package com.aaludra;

public class ObjectCloningExample2 implements Cloneable{
	int roll;
	String name;
    ObjectCloningExample1 deptid;
	ObjectCloningExample2(int r,String n,ObjectCloningExample1 d){
		roll=r;
		name=n;
		deptid=d;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	void display2() {
		System.out.println("RollNO: "+roll);
		System.out.println("Student Name: "+name);
		deptid.display1();
	}

}
