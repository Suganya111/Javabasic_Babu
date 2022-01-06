package com.aaludra.Exceptions;

public class NestedTryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Going to Handle Exception");
			try {
				int a=10/0;
				System.out.println(a);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int[] a=new int[5];
				a[4]=10;
				System.out.println(a[4]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Exception Handled");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
