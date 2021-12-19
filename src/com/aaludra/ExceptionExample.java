package com.aaludra;

import java.util.Scanner;

public class ExceptionExample {
	public void div() {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter the num1");
			int n1 = in.nextInt();
			System.out.println("Enter the num2");
			int n2 = in.nextInt();
			in.close();
			int result = n1 / n2;
			System.out.println(result);
		} catch (Exception ae) {
			System.out.println(ae);
		} finally {
			System.out.println("Bye");
		}
	}

	public void nullpoint() {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void numberformat() {
		String b = "Babu";

		try {
			int i = Integer.parseInt(b);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void outofbound() {
		int[]a=new int[5];
		try {
			a[10]=50;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ExceptionExample obj = new ExceptionExample();
		//obj.div();
		// obj.nullpoint();
		//obj.numberformat();
		obj.outofbound();

	}

}
