package com.aaludra.Methods;

public class MethodsExample {
	private int id;
	private String name;
	public void setId(int id) {//Accessor Method
		this.id=id;
	}
	public int getId() {//Mutator Method
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsExample me=new MethodsExample();
		me.setId(101);
		System.out.println(me.getId());
		me.setName("Babu");
		System.out.println(me.getName());

	}

}
