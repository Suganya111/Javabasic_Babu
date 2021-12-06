package com.aaludra;
import java.io.*;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,ch;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Number A: ");
		a=in.nextInt();
		System.out.print("Enter the Number B: ");
		b=in.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Enter Your Choice: ");
		ch=in.nextInt();
		switch(ch) {
		case 1:
			if(ch==1) {
				System.out.println(a+b);
				break;
			}
		case 2:
			if(ch==2) {
				System.out.println(a-b);
				break;
			}
		case 3:
			if(ch==3) {
				System.out.println(a*b);
				break;
			}
		case 4:
			if(ch==4) {
				System.out.println(a/b);
				break;
			}
			default:
				System.out.println("Invalid Selection");
		
		}
		
	
		

	}

}
