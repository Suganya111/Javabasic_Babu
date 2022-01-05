package com.aaludra.CollectionInterface;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Rajesh");
		ll.add("Ravi");
		ll.add("prince");
		ll.addFirst("Navin");
		ll.addLast("Karthi");
		ll.push("Selva");
		ll.pop();
		ll.set(2, "Vasanth");
		ll.pollFirst();
		ll.pollLast();
		ll.peekFirst();
		Iterator<String> iter=ll.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("---------------------");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println("----------------------");
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Ravi");
		ll2.add("Rajesh");
		ll2.add("Babu");
		Collections.sort(ll2);
		for(String s:ll2) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		Iterator iter2=ll2.descendingIterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}

	}

}
