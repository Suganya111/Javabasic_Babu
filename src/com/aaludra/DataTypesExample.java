package com.aaludra;

/*
 * It is better to use single sysout statement or else give the detailed answer
 * no need to specify new int[] if we supposed to give the value in a array
 */
public class DataTypesExample {


	// TODO Auto-generated method stub
	//Primitive Data types
	public void primitiveMethods() {
		boolean a=true;
		char b='A';
		byte c=-10;
		short d=2000;
		int e=300000;
		float f=3.5f;
		long g=3004030030L;
		double h=40.5;
		//Non-Primitive Data types
		String i="Babu Prasath";
		int[] j = { 50 };
		System.out.println("Boolean value: " + a);
		System.out.println("Character value: " + b);
		System.out.println("Byte value: " + c);
		System.out.println("Short Value: " + d);
		System.out.println("Integer Value: " + e);
		System.out.println("Float value: " + f);
		System.out.println("Long value: " + g);
		System.out.println("Double value: " + h);
		System.out.println("String value: " + i);
		for(int k=0;k<j.length;k++) {
			System.out.print("Array Value: " + j[k]);

		}

	}

	public static void main(String[] args) {

		DataTypesExample example = new DataTypesExample();
		example.primitiveMethods();

	}

}
