package com.aaludra.Inheritance;
class Employee{
	int id=101;
	String name="Babu";
}
public class InheritanceExample1 extends Employee{
	int salary=10000;
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceExample1 ie=new InheritanceExample1();
		ie.display();

	}

}
