package com.aaludra;

public class ThrowExampleRunner {

	public static void main(String[] args) {
		ThrowExample te=new ThrowExample();
		try {
			te.verify("P@ssw0de");
			System.out.println("password");
			//missing print statement
		} catch (ThrowExample e) {
			System.out.println("Password Should be 8 Characters");
		}

	}

}
