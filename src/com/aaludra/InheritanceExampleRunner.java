package com.aaludra;

public class InheritanceExampleRunner extends InheritanceExample{

	public InheritanceExampleRunner(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceExampleRunner ier=new InheritanceExampleRunner("Babu");
		System.out.println(ier.getname());
		ier.setemail("babu@gmail.com");
		System.out.println(ier.getemail());
		ier.setmobile(9003712177L);
		System.out.println(ier.getmobile());
	}

}
