package com.aaludra;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Babu";
		String b="Prasath";
		String c=a+b;
		String e=c.replace('P', 'p');
		
		System.out.println(c);
		System.out.println(e);
		String d="Babuprasath";
		System.out.println(e.equals(d));
		System.out.println(String.format("Name is:%s", c));
		System.out.println(c.length());
		System.out.println(c.substring(3,9));
		System.out.println(c.charAt(8));
		System.out.println(c.indexOf('P'));
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		String f="    Aaludra Technology     ";
		System.out.println(f);
		System.out.println(f.trim());	
		
		
		
		
		

	}

}
