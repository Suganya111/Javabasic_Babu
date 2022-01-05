package com.aaludra.CollectionInterface;
import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Mansur");
		queue.add("Vicky");
		queue.add("Karthi");
		queue.add("Mani");
		queue.remove();
		queue.poll();
		Iterator<String> iter=queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
