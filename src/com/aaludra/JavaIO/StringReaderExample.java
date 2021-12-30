package com.aaludra.JavaIO;
import java.io.*;
public class StringReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="HELLO!........";
		StringReader sr=new StringReader(s);
		int i;
		while((i=sr.read())!=-1) {
			System.out.print((char)i);
			
		}
		

	}

}
