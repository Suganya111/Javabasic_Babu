package com.aaludra;

public class StringBuilderExample {
	public void builder(String[] name) {
		StringBuilder sb = new StringBuilder();
		for (String s : name) {
			sb.append(s);
		}
		sb.insert(1, "Vicky");
		sb.replace(5, 9, "Babu");
		System.out.println(sb);

	}

	public static void main(String[] args) {
		StringBuilderExample sbe = new StringBuilderExample();
		String[] name = { "Hari", "Sugnaya", "Saranya" };
		sbe.builder(name);

	}

}
 