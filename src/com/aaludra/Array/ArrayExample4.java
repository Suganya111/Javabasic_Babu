package com.aaludra.Array;
import java.util.*;
public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		System.out.println("Before"+Arrays.toString(a));
		int index=3;
		int value=60;
		for(int i=a.length-1;i>=index;i--) {
			a[i]=a[i-1];
		}
		a[index]=value;
		System.out.println("After: "+Arrays.toString(a));

	}

}
