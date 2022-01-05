package com.aaludra.StringHandling;
import java.util.*;
public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
				}

	}

}
