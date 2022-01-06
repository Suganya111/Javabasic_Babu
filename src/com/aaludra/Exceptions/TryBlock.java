package com.aaludra.Exceptions;

public class TryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
			int a=10/0;
			System.out.println(a);
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		catch(Exception e){
			int b[]=new int[5];
			b[6]=10;
			System.out.println(b);
			System.out.println(e);
		}
		finally {
		System.out.println("Rest of Codes");
		}

	}

}
