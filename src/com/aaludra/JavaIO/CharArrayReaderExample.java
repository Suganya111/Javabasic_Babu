package com.aaludra.JavaIO;
import java.io.*;
public class CharArrayReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char[] ary= {'a','b','c','d','e'};
		CharArrayReader car=new CharArrayReader(ary);
		int i=car.read();
		while(i!=-1) {
			char ch=(char)i;
			System.out.print(ch);
		}

	}

}
