package com.aaludra;
import java.util.*;
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value2.length(),value1.length());
	}
	
}
public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue=new PriorityQueue<>(new StringLengthComparator());
		
		queue.addAll(List.of("Karthi","Hari","Bab"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}

}
