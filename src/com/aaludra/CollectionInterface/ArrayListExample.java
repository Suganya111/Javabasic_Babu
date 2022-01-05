package com.aaludra.CollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("babu");
		list.add("karthi");
		list.add("kishore");
		list.add("babu");
		list.addAll(list);
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		
	}

}
