package com.aaludra;

public class ThrowExampleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExample te=new ThrowExample();
		try {
			te.verify("P@ssw0rd");
			System.out.println("Valid");
		} catch (ThrowExample e) {
			// TODO Auto-generated catch block
			System.out.println("Password Should be 8 Characters");
		}

	}

}
