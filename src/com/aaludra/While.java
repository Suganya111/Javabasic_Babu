package com.aaludra;
import java.io.*;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=in.nextInt();
		int temp=num;
		int rev=0;
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
	
		
}
