package com.aaludra.CollectionClass;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		v.add("Babu");
		v.add("Hari");
		v.add("Karthi");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}
