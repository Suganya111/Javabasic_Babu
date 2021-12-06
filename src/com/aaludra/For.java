package com.aaludra;
import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		n=in.nextInt();
		boolean isprime=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isprime=false;
				break;
			}
			else {
				isprime=true;
			}
		}
		if(isprime) {
			System.out.println("Given number is Prime");
		}
		else {
			System.out.println("Given number is Not Prime");
		}

	}

}
