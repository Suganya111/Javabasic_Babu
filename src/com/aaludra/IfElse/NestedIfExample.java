package com.aaludra.IfElse;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2020;
		if(year%4==0)
		{
			if(year%100!=0 || year%400==0) {
				System.out.println("Leap");
			}
		}
		else {
			System.out.println("Not a Leap");
		}

	}

}
