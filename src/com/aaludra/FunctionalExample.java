package com.aaludra;

import java.util.List;

public class FunctionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = List.of("Babu", "Karthi", "Kishore", "Navin");
		printBasic(name);
		System.out.println("-----------------------------");
		printWithForEach(name);
		System.out.println("-----------------------------");
		printWithFilter(name);
		System.out.println("-----------------------------");
		List<Integer> number = List.of(33, 45, 56, 67, 78);
		printSum(number);
		int sum = number.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println(sum);
	}

	private static int printSum(List<Integer> number) {
		int sum = 0;
		for (int i : number) {
			sum += i;
		}
		return sum;
	}

	private static void printBasic(List<String> name) {
		for (String i : name) {
			System.out.println(i);
		}
	}

	private static void printWithForEach(List<String> name) {
		name.stream().map(element->element.toLowerCase()).forEach(element -> System.out.println(element));
	}

	private static void printWithFilter(List<String> name) {
		name.stream().filter(element -> element.startsWith("K")).forEach(element -> System.out.println(element));
	}

}
