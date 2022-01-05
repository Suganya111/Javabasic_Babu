package com.aaludra.CollectionInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Vijay");
		ts.add("Sanjay");
		ts.add("Babu");
		ts.add("Zaheer");
		ts.add("Arun");
		ts.add("Vijay");
		Iterator<String> i=ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-----------------------");
		Iterator<String> i2=ts.descendingIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}

	}

}
