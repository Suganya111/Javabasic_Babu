package com.aaludra;
import java.util.Scanner;

/*
 * unused io packages
 * no need to specify if condition in switch cases
 * It is better to declare everything in a method rather than typing in a main method
 */
public class SwitchExample {

	public void print() {
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

			System.out.println(a+b);
			break;

		case 2:

			System.out.println(a-b);
			break;

		case 3:

			System.out.println(a*b);
			break;

		case 4:

			System.out.println(a/b);
			break;

		default:
			System.out.println("Invalid Selection");

		}}public static void main(String[] args) {

	SwitchExample example = new SwitchExample();
	example.print();


		}

}
