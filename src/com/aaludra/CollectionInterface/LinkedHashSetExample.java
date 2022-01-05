package com.aaludra.CollectionInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {//Maintain Insertion Order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Two");
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
