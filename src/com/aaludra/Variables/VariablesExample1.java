package com.aaludra.Variables;

public class VariablesExample1 {
	static int a=10;//static
	public void variable() {
		int b=20;//local
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=30;//instance
		System.out.println(a);
		VariablesExample1 v=new VariablesExample1();
		v.variable();
		System.out.println(c);
		

	}

}
