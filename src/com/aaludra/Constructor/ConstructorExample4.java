package com.aaludra.Constructor;
class Student2{
	int id;
	String name;
	int age;
	String address;
	Student2(int i,String n,int a,String ad){
		id=i;
		name=n;
		age=a;
		address=ad;
	}
	Student2(Student2 s){
		id=s.id;
		name=s.name;
		age=s.age;
		address=s.address;
	}
	void display() {
		System.out.println(id+" "+name+" "+age+" "+address);
	}
}
public class ConstructorExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2(101,"Babu",23,"Trichy");
		s1.display();
		Student2 s2=new Student2(s1);
		s2.display();

	}

}
