package com.aaludra.CollectionInterface;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap();
		m.put(1,"Babu");
		m.put(2, "Karthi");
		m.put(1, "Kishore");
		m.put(4, "Babu"); 
		for(Map.Entry map:m.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
		System.out.println("----------------------");
		m.putIfAbsent(3, "Navin");
		m.put(5, null);
		m.put(null, "Hari");
		m.replace(5, "Selva");
		for(Map.Entry map:m.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
		System.out.println("----------------------");
		m.replaceAll((K,V)->"Ajay");
		for(Map.Entry map:m.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}

	}

}
