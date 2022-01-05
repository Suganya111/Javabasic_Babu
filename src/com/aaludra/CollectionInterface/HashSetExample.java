package com.aaludra.CollectionInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Three");
		set.add("FIve");
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("------------");
		HashSet<String> set2=new HashSet<String>();
		set2.add("Six");
		set2.add("Seven");
		set2.addAll(set);
		System.out.println(set2);
		set2.removeAll(set);
		System.out.println(set2);

	}

}
