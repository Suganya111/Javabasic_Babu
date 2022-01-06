package com.aaludra.Exceptions;
import java.io.*;
public class ThrowsExample {//checked
	int m,n;
	public static int method(int m,int n) throws ArithmeticException {
		
		int div=m/n;
		return div;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(method(10,0));
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
