package com.aaludra.CollectionInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> queue=new ArrayDeque<String>();
		queue.add("Babu");
		queue.offer("Karthi");
		queue.add("Kishore");
		queue.offer("Navin");
		queue.add("Nain");
		queue.pollLast();
		for(String s:queue) {
			System.out.println(s);
		}
		}

}
