package com.aaludra;
import java.io.*;
public class ConsoleExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Console c=System.console();
		System.out.println("Enter Your name:");
		String s=c.readLine();
		System.out.println("Your name is"+s);
		System.out.println("Enter the number:");
		int a=Integer.parseInt(c.readLine());
		System.out.println(a);
		System.out.println("Enter the password");
		char[] ch=c.readPassword();
		String pass=String.valueOf(ch);
		System.out.println(pass);

	}

}
