package com.aaludra.CollectionInterface;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
	public enum Day{
		Monday,Tuesday,Thursday
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<Day,Integer> em=new EnumMap<Day,Integer>(Day.class);
		em.put(Day.Monday, 2);
		em.put(Day.Tuesday, 3);
		em.put(Day.Thursday, 5);
		for(Map.Entry<Day, Integer> m:em.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
