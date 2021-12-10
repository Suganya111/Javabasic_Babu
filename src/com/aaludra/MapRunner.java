package com.aaludra;
import java.util.*;
public class MapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=Map.of("Z",9,"A",8,"B",5,"C",6);
		System.out.println(map);
		Map<String, Integer> hashmap=new HashMap<>(map);
		System.out.println(hashmap);
		Map<String, Integer> linkedhashmap=new LinkedHashMap(map);
		System.out.println(linkedhashmap);
		Map<String, Integer> treemap=new TreeMap(map);
		System.out.println(treemap);
		System.out.println("-------------------------------------------");
		String str="TodayisFridayHaveaniceday";
		Map<String, Integer> occurance=new HashMap<>();
		String[] words=str.split("");
		
		for(String word:words) {
			//get character
			Integer integer=occurance.get(word);
			//if it is there increment 1
			//if it is not there initialize 1
			if(integer==null) {
				occurance.put(word,1);
				
			}
			else {
				occurance.put(word, integer+1);
			}
		}
		System.out.println(occurance);
	}

}
