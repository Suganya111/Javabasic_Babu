package com.aaludra.CollectionClass;
import java.util.*;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<String>();
		li.add("Zaheer");
		li.add("Mansur");
		li.add("Arun");
		li.add("Babu");
		System.out.println(li);
		Collections.sort(li);
		Iterator<String> iter=li.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-------------------------------");
		Collections.sort(li,Collections.reverseOrder());
		Iterator<String> iter2=li.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
	}

}
