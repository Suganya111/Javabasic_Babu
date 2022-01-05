package com.aaludra.CollectionInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("");
		System.out.println(list);
		HashSet<String> set=new HashSet<String>(list);
		set.add("Five");
		set.add("");
		System.out.println(set);
		
		

	}

}
