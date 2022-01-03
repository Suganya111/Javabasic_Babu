package com.aaludra.Constructor;
class Student6{
	int roll;
	String name;
	int age;
	String dept;
	float fee;
	Student6(int roll,String name,int age){
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	Student6(int roll,String name,int age,String dept,float fee){
		this(roll,name,age);
		this.dept=dept;
		this.fee=fee;
	}
	void display() {
		System.out.println(roll+" "+name+" "+age+" "+dept+" "+fee);
	}
	void show() {
		this.display();
	}
}

public class ConstructorExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student6 s=new Student6(101,"Babu",23,"CS",30000f);
		s.show();

	}

}
