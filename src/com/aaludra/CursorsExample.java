package com.aaludra;

import java.util.*;

public class CursorsExample {
	/*
	 * hasNext() next() remove() foreachRemaining
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cityNames = new ArrayList<String>();

		cityNames.add("Delhi");
		cityNames.add("Mumbai");
		cityNames.add("Kolkata");
		cityNames.add("Chandigarh");
		cityNames.add("Noida");
		Iterator it = cityNames.iterator();
		// next(), hasnext()
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// remove
		System.out.println("---------------------------------");
		Iterator it2 = cityNames.iterator();
		while (it2.hasNext()) {
			if (((String) it2.next()).endsWith("hi")) {
				it2.remove();
				System.out.println(cityNames);

			}
		}
		System.out.println("-------------------------");
		// BiDirectional Cursor(Read/Remove/Replace)
		ListIterator li = cityNames.listIterator();
		System.out.println("Forward ");
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("-------------------------");
		System.out.println("Backward ");
		while (li.hasPrevious()) {

			System.out.println(li.previous());
		}

	}

}
