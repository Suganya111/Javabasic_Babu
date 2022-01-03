package com.aaludra.Constructor;
class Student3{
	int id;
	String name;
	int age;
	static String College="BDU";
	Student3(int i,String n,int a){
		id=i;
		name=n;
		age=a;
		
	}
	void display() {
		System.out.println(id+" "+name+" "+age+" "+College);
	}
}
public class ConstructorExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3.College="Bhc";
		Student3 s1=new Student3(101,"Babu",23);
		s1.display();
		Student3 s2=new Student3(102,"Hari",22);
		s2.display();
		Student3.College="Bhc";
		

	}

}
