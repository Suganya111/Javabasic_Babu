package com.aaludra;

/* give proper class name
 * 
 */
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokenExmple {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("Babu Prasath");
		System.out.println("Count:" + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("-------------------------");
		// delimiter
		StringTokenizer st2 = new StringTokenizer("www.w3schools.com", ".");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println("-------------------------");
		// boolean
		StringTokenizer st3 = new StringTokenizer("16-12-2021", "-", true);
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		System.out.println("-------------------------");
		// array type
		String sentence = "https:\\www.w3schools.com";
		String[] str = sentence.split("\\:|\\\\|\\.");
		for (String s : str) {
			System.out.println(s);
		}
		System.out.println("---------------------------");
		// pattern type
		String words = "Babu Prasath";
		Pattern p = Pattern.compile("a");
		String[] word = p.split(words);
		for (String w : word) {
			System.out.println(w);

		}
		// Matcher
		String mobile = "6003712222";
		Pattern a = Pattern.compile("[0-9]{10}");
		Matcher m = a.matcher(mobile);
		if (m.find()) {
			System.out.println(m.group() + "is valid");
		} else {
			System.out.println("Invalid Mobile Number");
		}

	}

}
