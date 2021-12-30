package com.aaludra.JavaIO;
import java.io.*;
public class CharArrayWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw1=new FileWriter("C:\\eclipse\\java IO\\CAWriter1.txt");
		FileWriter fw2=new FileWriter("C:\\eclipse\\java IO\\CAWriter2.txt");
		CharArrayWriter caw=new CharArrayWriter();
		caw.write("This is CharArray Writer");
		caw.writeTo(fw1);
		caw.writeTo(fw2);
		fw1.close();
		fw2.close();
		System.out.println("Created............");

	}

}
