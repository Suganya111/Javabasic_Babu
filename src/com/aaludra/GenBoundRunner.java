package com.aaludra;
import java.util.*;
public class GenBoundRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenBound gb=new GenBound();
		Set<String> hash=new HashSet<>();
		hash.add("Kishore");
		hash.add("Navin");
		gb.show(hash);
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		gb.show(list);
		Map<String,Integer> map2=new HashMap<>();
		map2.put("arun", 101);
		map2.put("Babu", 102);
		map2.put("Karthi", 103);
		gb.show(map2);
		
		

	}

}
