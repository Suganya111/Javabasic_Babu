package com.aaludra;
import java.util.Scanner;
/*
 * io packages is not used
 * class name must be meaningful
 * better to write a method and call the method in main class
 * Instead of if else we can use ternary operator
 */

public class WhileExample {

	public void print() {
		// TODO Auto-generated method stub
		int num;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=in.nextInt();
		int temp=num;
		int rev=0;
		in.close();
		while(num!=0) {
			rev=rev*10+num%10;//4 43 432 4321
			num=num/10;//1234 123 12 1
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("Given number is Palindrome");
		}
		else {
			System.out.println("Given number is Not a Palindrome");
		}
	}

	public static void main(String[] args) {
		WhileExample example = new WhileExample();
		example.print();
	}


}
