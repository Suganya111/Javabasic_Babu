package com.aaludra;
import java.io.*;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,m3,total;
		float avg;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Mark 1:");
		m1=in.nextInt();
		System.out.print("Enter Mark 2:");
		m2=in.nextInt();
		System.out.print("Enter Mark 3:");
		m3=in.nextInt();
		total=m1+m2+m3;
		avg=total/3;
		if(avg>80) {
			if(m1>40&&m2>40&&m3>40)
			System.out.println("Grade A");
		}
		
		else if(avg>60) {
			if(m1>40&&m2>40&&m3>40)
			System.out.println("Grade B");
		}
		else if(avg>40) {
			if(m1>40&&m2>40&&m3>40)
			System.out.println("Grade C");
		}
		else {
			if(avg<40)
			System.out.println("No Grade");
		}

	}

}
