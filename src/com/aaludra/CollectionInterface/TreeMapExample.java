package com.aaludra.CollectionInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(4, "Karthi");
		tm.put(2, "Babu");
		tm.put(5, "Hari");
		tm.put(3, "Kishore");
		for(Map.Entry<Integer, String> me:tm.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}

	}

}
