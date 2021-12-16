package com.aaludra;

import java.util.Scanner;

public class GradeExample {
	Grade g;

	public void g1(int m) {
		Grade[] gr = Grade.values();
		for (int i = 0; i < gr.length; i++) {
			if (m >= gr[0].sal1 && m <= gr[0].sal2) {
				System.out.println("Valid Salary for " + gr[0].name);
				break;

			} else {
				System.out.println("invalid salary for Grade1");
				break;

			}

		}
	}

	public void g2(int m) {
		Grade[] gr = Grade.values();
		for (int i = 0; i < gr.length; i++) {
			if (m >= gr[1].sal1 && m <= gr[1].sal2) {
				System.out.println("Valid Salary for " + gr[1].name);
				break;

			} else {
				System.out.println("invalid salary for Grade2");
				break;

			}
		}
	}

	public void g3(int m) {
		Grade[] gr = Grade.values();
		for (int i = 0; i < gr.length; i++) {
			if (m >= gr[2].sal1 && m <= gr[2].sal2) {
				System.out.println("Valid Salary for " + gr[2].name);
				break;

			} else {
				System.out.println("invalid salary for Grade3");
				break;

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Salary");
		int m = in.nextInt();
		in.close();
		GradeExample grd = new GradeExample();
		grd.g1(m);
		grd.g2(m);
		grd.g3(m);

	}

}
