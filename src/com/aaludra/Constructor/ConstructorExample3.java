package com.aaludra.Constructor;
class Student{
	int id;
	String name;
	int age;
	Student(int i,String n){
		id=i;
		name=n;
	}
	Student(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void show() {
		System.out.println(id+" "+name);
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
}

public class ConstructorExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Babu");
		s1.show();
		Student s2=new Student(102,"Hari",23);
		s2.display();

	}

}
