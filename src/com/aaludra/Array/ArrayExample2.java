package com.aaludra.Array;
import java.util.*;
public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,9,6,11,4};
		System.out.println("Before Sorting"+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("After Sorting:"+Arrays.toString(a));
	}

}
