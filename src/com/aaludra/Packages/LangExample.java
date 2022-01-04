package com.aaludra.Packages;
import java.lang.Math;
import java.util.Scanner;
public class LangExample {
	void math() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		System.out.println(Math.sqrt(n));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LangExample le=new LangExample();
		le.math();

	}

}
