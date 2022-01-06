package com.aaludra.Exceptions;

public class MultipleCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[5]=30/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Rest of code");
		}

	}

}
