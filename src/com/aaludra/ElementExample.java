package com.aaludra;

public class ElementExample {
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intarr = { 10, 20, 30, 40, 50 };
		printArray(intarr);
		System.out.println("--------------------");
		String[] Stringarr = { "E", "L", "E", "M", "E", "N", "T" };
		printArray(Stringarr);
	}

}
