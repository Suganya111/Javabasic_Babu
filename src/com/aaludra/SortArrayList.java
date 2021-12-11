package com.aaludra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<>(9);
		num.add(3);
		num.add(-10);
		num.add(-2);
		num.add(-7);
		num.add(5);
		num.add(7);
		num.add(-1);
		num.add(-5);
		num.add(2);
		List<Integer> numAl=new ArrayList<>(num);
		Collections.sort(numAl);
		System.out.println("Positive numbers");
		for(int i:numAl){
			if(i>0){
				System.out.println(i);
			}
		}
		Collections.sort(numAl);
		System.out.println("Negative numbers");
		for(int j:numAl){
			if(j<0){
				System.out.println(j);
			}
		}

	}

}
