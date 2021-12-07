package com.aaludra;
import java.util.Scanner;
public class Classes {
	static int n;
	public void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial Of Given number is"+fact);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		n=in.nextInt();
		
		Classes obj=new Classes();
		obj.fact(n);
		
		
		
		
	}

}
