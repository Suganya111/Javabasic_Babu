package com.aaludra;

/*
 * need a valuable class name and variable name
 * better to write everything in a method and call the method in main class
 * can perform more string methods
 */
public class StringsExample {
	public void show() {

		// TODO Auto-generated method stub
		String a="Babu";
		String b="Prasath";
		String c=a+b;
		String e=c.replace('P', 'p');

		System.out.println("String c: " + c);
		System.out.println("String e: " + e);
		String d="Babuprasath";
		System.out.println(e.equals(d));
		System.out.println(String.format("Name is:%s", c));
		System.out.println("Length of c string: " + c.length());
		System.out.println("Substring of c: " + c.substring(3, 9));
		System.out.println("8th Character c String: " + c.charAt(8));
		System.out.println("Index of P in c string: " + c.indexOf('P'));
		System.out.println("C String Uppercase: " + c.toUpperCase());
		System.out.println("C String Uppercase: " + c.toLowerCase());
		String f="    Aaludra Technology     ";
		System.out.println("f String : " + f);
		System.out.println("After trimming: " + f.trim());
	}

	public static void main(String[] args) {


		StringsExample example = new StringsExample();
		example.show();

	}

}
