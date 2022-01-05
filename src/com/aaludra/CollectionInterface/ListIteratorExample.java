package com.aaludra.CollectionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Zaheer");
		list.add("Yusuf");
		list.add("Babu");
		ListIterator iter=list.listIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-------------");
		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}

	}

}
