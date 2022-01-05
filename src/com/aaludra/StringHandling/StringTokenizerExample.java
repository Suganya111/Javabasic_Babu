package com.aaludra.StringHandling;
import java.util.StringTokenizer;
public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("My-Name-is-Babu","-");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextElement());
		}
		StringTokenizer st2=new StringTokenizer("www.w3schools.com",".");
		System.out.println(st2.countTokens());
		while(st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}
		

	}

}
