package com.aaludra;


import java.util.*;
import java.util.Collections;

public class WrapperExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Wrapper> ar = new ArrayList<>();
		ar.add(new Wrapper(1, "Babu", 98));
		ar.add(new Wrapper(2, "Karthis", 92));
		ar.add(new Wrapper(3, "Kishore", 90));
		ar.add(new Wrapper(4, "Harish", 88));
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("\nAfter Sorting");
		Collections.sort(ar);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}

}
