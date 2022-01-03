package com.aaludra.Class;

public class ClassExample2 {
	void student(int r,String n,float f) {
		int rollno=r;
		String name=n;
		float salary=f;
		System.out.println(rollno+" "+name+" "+salary);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassExample2 ce=new ClassExample2();
		ce.student(101, "Babu",45000.00f);
		ClassExample2 ce2=new ClassExample2();
		ce2.student(102, "Hari",43000.00f);

	}

}
