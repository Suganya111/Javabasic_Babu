package com.aaludra.Exceptions;

public class ExceptionPropagation {
	void m() {
		int data=40/0;
		System.out.println(data);
	}
	void n()
	{
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagation obj=new ExceptionPropagation ();
		obj.p();

	}

}
