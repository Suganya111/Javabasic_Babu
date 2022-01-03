package com.aaludra.Class;

public class ClassExample3 {
	
	void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=i*fact;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassExample3().fact(5);//Annonymous Object

	}

}
