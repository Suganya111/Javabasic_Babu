package com.aaludra;
import java.util.Scanner;
public class Methods {
	public static void pattern(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Limit");
		int n=in.nextInt();
		pattern(n);
		

	}

}
