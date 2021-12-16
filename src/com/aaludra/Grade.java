package com.aaludra;

public enum Grade {
	G1("Grade1",5000,10000),G2("Grade2",10001,20000),G3("Grade3",20001,50000);
	
	String name;
	int sal1;
	int sal2;

	Grade(String name, int sal1, int sal2) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.sal1=sal1;
		this.sal2=sal2;
		
	}
	
	
}
