package com.aaludra.While;

public class WhileExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=123456;
		int sum=0;
		do {
			sum=sum+i%10;
			i=i/10;
		}while(i>0);
		System.out.println("Sum of Given Number: "+sum);

	}

}
