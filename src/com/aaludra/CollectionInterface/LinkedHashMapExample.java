package com.aaludra.CollectionInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> lh=new LinkedHashMap<Integer,String>();
		lh.put(1, "Babu");
		lh.put(2, "Hari");
		lh.put(3, "Karthi");
		System.out.println(lh.keySet());
		System.out.println(lh.values());
		System.out.println(lh.entrySet());
		System.out.println("-------------------------");
		for(Map.Entry<Integer, String> m:lh.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
