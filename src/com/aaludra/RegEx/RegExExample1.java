package com.aaludra.RegEx;
import java.util.*;
import java.util.regex.Pattern;
public class RegExExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches(".s", "mst"));
		System.out.println(Pattern.matches(".s.", "mst"));
		System.out.println(Pattern.matches(".s", "amms"));

	}

}
