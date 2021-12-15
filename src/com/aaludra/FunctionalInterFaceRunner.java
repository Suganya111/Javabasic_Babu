package com.aaludra;

public class FunctionalInterFaceRunner implements FunctionalInterFaceExample {
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterFaceRunner fir = new FunctionalInterFaceRunner();
		/*
		 * Dynamic Binding FunctionalInterFaceExample fir =new  FunctionalInterFaceRunner();
		 *
		 */
		fir.test();
		fir.test2();
		FunctionalInterFaceExample.test3();

	}

}
