package com.aaludra.Constructor;
class Employee{
	int id;
	String name;
	float salary;
	Employee(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	void show() {
		this.display();
	}
}

public class ConstructorExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(101,"Babu",40000f);
		e.show();

	}

}
