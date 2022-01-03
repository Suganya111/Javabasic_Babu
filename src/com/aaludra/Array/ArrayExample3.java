package com.aaludra.Array;
import java.util.*;
public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[100][100];
		int[][] b=new int[100][100];
		int[][] c=new int[100][100];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of Rows and Columns");
		int m=in.nextInt();
		int n=in.nextInt();
		System.out.println("Enter the values of A Matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("a["+i+"]["+j+"]");
				a[i][j]=in.nextInt();
			}
		}
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
		}
		

	}

}
