package com.aaludra;

public enum EnumExample2 {
	G1("Grade1", 5000, 10000), G2("Grade2", 10001, 20000), G3("Grade3", 20001, 50000);
	String string;
	int salary;
	int salary2;

	EnumExample2(String string, int salary, int salary2) {
		// TODO Auto-generated constructor stub
		this.string = string;
		this.salary = salary;
		this.salary2 = salary2;
	}
	
}