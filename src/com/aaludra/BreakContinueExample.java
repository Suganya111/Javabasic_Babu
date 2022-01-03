package com.aaludra;
import java.util.Scanner;

public class BreakContinueExample {
	Scanner in = new Scanner(System.in);

	public void show() {
		System.out.println("Enter the number");
		int a=in.nextInt();
		//break
		for(int i=1;i<a;i++) {
			if(i==5) {

				break;
			}
			System.out.println(i);

		}
		System.out.println("-----------------------------");
		//continue
		for(int j=1;j<=a;j++) {
			if(j==7) {
				continue;
			}
			System.out.println(j);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BreakContinueExample bc = new BreakContinueExample();
		bc.show();
	}

}
