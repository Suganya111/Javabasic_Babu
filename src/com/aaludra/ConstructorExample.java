package com.aaludra;
import java.util.Scanner;


public class ConstructorExample {


	// private static int m,n;
	ConstructorExample(int a, int b, int c) {
		System.out.println(a + b + c);

	}
	public void array() {

		int[][] a=new int[100][100];
		int[][] b=new int[100][100];
		int[][] c=new int[100][100];
		int m,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the values of Rows and Columns");
		m=in.nextInt();
		n=in.nextInt();
		System.out.println("Enter the value of A Matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("a["+i+"]["+j+"]");
				a[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter the value of B Matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("b["+i+"]["+j+"]");
				b[i][j]=in.nextInt();
			}
		}
		System.out.println("Result");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]=a[i][j]*b[i][j];
				System.out.print("\t"+c[i][j]);
			}
			System.out.println("");
		in.close();}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ConstructorExample obj = new ConstructorExample(5, 5, 5);
		obj.array();


	}

}
