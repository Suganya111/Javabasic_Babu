package com.aaludra;

public class ObjectCloningExample1 {
	int dept;
	String name;
	ObjectCloningExample1(int i,String s){
		dept=i;
		name=s;
	}
	void display1() {
		System.out.println("Departmentid: "+dept);
		System.out.println("DepartmentName: "+name);
	}

}
