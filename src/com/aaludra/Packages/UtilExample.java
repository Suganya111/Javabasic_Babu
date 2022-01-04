package com.aaludra.Packages;
import java.util.Scanner;
public class UtilExample {
	void scan() {
		int a;
		int b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		a=in.nextInt();
		b=in.nextInt();
		in.close();
		System.out.println(a*b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UtilExample ue=new UtilExample();
		ue.scan();

	}

}
