package com.aaludra;
import java.util.Scanner;


public class ClassExample {
	Scanner in = new Scanner(System.in);
	static int n;


	public void fact(int n) {
		System.out.println("Enter the number");
		n = in.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;

		}
		System.out.println("Factorial Of Given number is"+fact);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ClassExample obj = new ClassExample();
		obj.fact(n);




	}

}
