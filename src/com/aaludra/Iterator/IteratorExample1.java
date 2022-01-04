package com.aaludra.Iterator;
import java.io.*;
import java.util.*;
public class IteratorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cityNames=new ArrayList<String>();
		cityNames.add("Chennai");
		cityNames.add("Mumbai");
		cityNames.add("KolKata");
		cityNames.add("Noida");
		Iterator iter=cityNames.iterator();
		while(iter.hasNext()) {
			if(((String) iter.next()).startsWith("C")) {
				iter.remove();
				System.out.println(cityNames);
				
			}
		
		}

	}

}
