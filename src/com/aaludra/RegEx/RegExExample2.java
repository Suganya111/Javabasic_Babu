package com.aaludra.RegEx;
import java.util.*;
import java.util.regex.Pattern;
public class RegExExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[abc]","b"));
		System.out.println(Pattern.matches("[^abc]","j"));
		System.out.println(Pattern.matches("[a-zA-Z]","n"));
		System.out.println(Pattern.matches("[a-dm-p]", "m"));
		System.out.println(Pattern.matches("[a-z&&[def]].", "fe"));
		System.out.println(Pattern.matches(".[a-h[m-p]]", "me"));
		System.out.println(Pattern.matches("[a-z&&[^m-r]]", "p"));
		System.out.println("--------------------------------------------");
		System.out.println(Pattern.matches("[a-z]?", "aa"));
		System.out.println(Pattern.matches("[a-z]+", "aaaa"));
		System.out.println(Pattern.matches("[a-f]*..", "amn"));
		System.out.println(Pattern.matches("[a-z]{2}.", "ama"));
		System.out.println(Pattern.matches("[a-z]{2,}", "amaa"));
		System.out.println(Pattern.matches("[a-z]{2,5}.", "amnka"));

	}
}

