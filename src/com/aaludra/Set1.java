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
	public void treeset() {
		Set<Integer> set=new TreeSet<>();
		set.add(10)	;
		set.add(9);
		set.add(8);
		set.add(7);
		System.out.println(set);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set1 obj=new Set1();
		obj.hashset();
		obj.treeset();
		
	}

}
