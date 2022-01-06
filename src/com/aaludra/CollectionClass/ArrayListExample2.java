package com.aaludra.CollectionClass;
import java.util.*;
import java.util.Collections;
public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(25);
		li.add(5);
		li.add(06);
		li.add(40);
		System.out.println(Collections.max(li));
		System.out.println(Collections.min(li));

	}

}
