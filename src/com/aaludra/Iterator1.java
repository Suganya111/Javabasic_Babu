package com.aaludra;
import java.util.*;
public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> name=List.of("Babu","Hari","Kishore");
		System.out.println(name);
		List<String> nameArrayList=new ArrayList<String>(name);
		for(String al:nameArrayList) {
			if(al.endsWith("i")) {
				System.out.println(al);
			}
		}
		Iterator<String> iterator=nameArrayList.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("ore")) {
				iterator.remove();
				System.out.println(nameArrayList);
			}
		}
		
		
	}
		
		
	}


