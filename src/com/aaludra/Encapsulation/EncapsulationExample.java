package com.aaludra.Encapsulation;

public class EncapsulationExample {
	private int id;
	private String name;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationExample ee=new EncapsulationExample();
		ee.setId(101);
		ee.setName("Babu");
		System.out.println(ee.getId());
		System.out.println(ee.getName());

	}

}
