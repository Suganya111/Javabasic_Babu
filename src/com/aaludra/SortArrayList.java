package com.aaludra;
import java.util.*;
public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=List.of(3,-1,7,-2,5,-7,-10,-5);
		List<Integer> numAl=new ArrayList<>(num);
		Collections.sort(numAl);
		for(int i:numAl){
		        if(i>0){
		           System.out.println(i);
		        }
		   }
		Collections.reverse(numAl);

		 for(int j:numAl){
		        if(j<0){
		            System.out.println(j);
		        }
		    }

	}

}
