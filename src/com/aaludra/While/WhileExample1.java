package com.aaludra.While;

public class WhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1234;
		int rev=0;
		while(i!=0) {
			rev=rev*10+i%10;
			i=i/10;
		}
		System.out.println("Reverse order is:"+rev);

	}

}
