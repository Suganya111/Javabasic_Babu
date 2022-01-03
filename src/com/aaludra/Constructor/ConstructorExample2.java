package com.aaludra.Constructor;

public class ConstructorExample2 {
	int id;
	String name;
	ConstructorExample2(int i,String n){
		name=n;
		id=i;
	}
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample2 ce=new ConstructorExample2(101,"Babu");
		ce.display();

	}

}
