package com.aaludra.CollectionClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<String>();
		li.add("C");
		li.add("C++");
		System.out.println(li);
		Collections.addAll(li, "Python","Java");
		System.out.println(li);
		String str[]= {"Html","Css"};
		Collections.addAll(li, str);
		System.out.println(li);
				
		
		

	}

}
