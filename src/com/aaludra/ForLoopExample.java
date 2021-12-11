package com.aaludra;
import java.util.Scanner;


public class ForLoopExample {
	Scanner in = new Scanner(System.in);
	public void print() {

		// TODO Auto-generated method stub
		int n;

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
		in.close();
	}
	public static void main(String[] args) {
		ForLoopExample example = new ForLoopExample();
		example.print();
	}

}
