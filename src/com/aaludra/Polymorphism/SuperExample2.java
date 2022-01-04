package com.aaludra.Polymorphism;
class Super4{
	int id;
	String name;
	Super4(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Super5 extends Super4{
	float salary;
	Super5(int id, String name,float salary) {
		super(id, name);
		// TODO Auto-generated constructor stub
		this.salary=salary;
	}
	void show() {
		System.out.println(id+" "+name+" "+salary);
	}
	
}
public class SuperExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super5 s=new Super5(101,"Babu",30000f);
		s.show();
		

	}

}
