package com.aaludra.CollectionInterface;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(100, "Babu");
		ht.put(101, "Karthi");
		ht.put(102, "Kishore");
		ht.remove(102);
		for(Map.Entry<Integer, String> me:ht.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}

	}

}
