package com.aaludra;

public class EnumExam2 {
	enum Actors{
		VIJAY(60),AJITH(50),SIVA(30);
		int sal;
		Actors(int sal){
			this.sal=sal;
		}
	}
	Actors a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actors[] ac=Actors.values();
		for(int i=0;i<ac.length;i++) {
			System.out.println(ac[i]+" Salary is "+ac[i].sal);
		}

	}

}
