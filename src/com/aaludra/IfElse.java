package com.aaludra;
import java.util.Scanner;


public class IfElse {

	public void print() {
		// TODO Auto-generated method stub
		int m1,m2,m3,total;
		float avg;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Mark 1:");
		m1=in.nextInt();
		System.out.print("Enter Mark 2:");
		m2=in.nextInt();
		System.out.print("Enter Mark 3:");
		m3=in.nextInt();
		in.close();
		total=m1+m2+m3;
		avg=total/3;
		if (m1 > 40 && m2 > 40 && m3 > 40) {
			if(avg>80) {

				System.out.println("Grade A");

			}

			else if(avg>60) {

				System.out.println("Grade B");
			}

			else if (avg > 40) {
				System.out.println("Grade C");
			}

			else {
				if(avg<40) {
					System.out.println("No Grade");
				}
			}
		} else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
		IfElse example = new IfElse();
		example.print();
	}

}
