package com.aaludra;
import java.util.Scanner;

/*
 * specify valid class name
 * To specify a line, don't need "" inside Sysout
 *
 */
public class MethodsExample {
	Scanner in = new Scanner(System.in);

	public void pattern() {
		System.out.println("Enter the Limit");
		int n = in.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsExample example = new MethodsExample();
		example.pattern();


	}

}
