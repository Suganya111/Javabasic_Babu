package com.aaludra.RegEx;

import java.util.regex.Pattern;

public class RegExExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[a-zA-z0-9]{8,15}", "Passw0rd"));
		System.out.println(Pattern.matches("[789][0-9]{1,9}", "9953038949"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "6953038949"));

	}

}
