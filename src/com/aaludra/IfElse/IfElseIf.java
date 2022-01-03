package com.aaludra.IfElse;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=70;
		if(mark>80) {
			System.out.println("Grade A");
			
		}
		else if(mark<80 && mark>60) {
			System.out.println("Grade B");
		}
		else if(mark>40) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
	}

}
