package com.aaludra;
import java.util.*;
public class Set1 {
	static Set<String> set=Set.of("Babu","Hari","Karthi");
	
	public void hashset() {
		Set<String> hashset=new HashSet(set);
		
		hashset.add("Kishore");
		System.out.println(hashset.size());
		System.out.println(hashset);
		Iterator<String> iterator=hashset.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().startsWith("Ka")) {
				iterator.remove();
				System.out.println(hashset);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set1 obj=new Set1();
		obj.hashset();
		
	}

}
