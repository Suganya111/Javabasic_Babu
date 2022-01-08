package com.aaludra.RegEx;
import java.util.*;
import java.util.regex.Pattern;
public class RegEXample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("\\d+", "123"));//only digit
		System.out.println(Pattern.matches("\\D+","abcd1"));//non-digit
		System.out.println(Pattern.matches("\\s+","BAbu Prasath"));
		System.out.println(Pattern.matches("\\S+","BabuPrasath"));//Non-WhiteSpace
		System.out.println(Pattern.matches("\\w+","BAbu"));
		System.out.println(Pattern.matches("\\W+","#$"));

	}

}
