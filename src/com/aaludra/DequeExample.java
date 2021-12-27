package com.aaludra;
import java.util.*;
public class DequeExample {
	/*
	 * add push
	 * poll,pop,remove
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deq=new ArrayDeque<String>();
		deq.add("Babu");
		deq.add("Hari");
		deq.add("Ganesh");
		deq.addFirst("Karthi");
		deq.addLast("Kannan");
		deq.push("Bala");
		Iterator iter=deq.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("---------------------------");
		boolean b=deq.contains("Ganesh");
		if(b==true) {
			System.out.println("Contains the Element");
		}
		System.out.println(deq.size());
		deq.removeLast();
		System.out.println(deq.getLast());
		for(String s: deq) {
			System.out.println(s);
		}
		deq.pop();
		System.out.println("After Pop");
		for(String i:deq) {
			System.out.println(i);
		}

	}

}
