package com.aaludra.Switch;

public class SwitchExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char branch='C';
		int year=4;
		switch(year) {
		case 3:
			System.out.println("Arts & Science");
			break;
		case 4:
			switch(branch) {
			case 'C':
				System.out.println("Computer Science");
				break;
			case 'E':
				System.out.println("Electricals & Electronics");
				break;
			case 'M':
				System.out.println("Mechanical");
				break;
				
			}
			break;
		case 5:
			System.out.println("MBBS");
			break;
		default:
			System.out.println("Invalid");
		}


	}

}
