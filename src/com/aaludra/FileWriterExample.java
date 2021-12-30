package com.aaludra;
import java.io.*;
public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Writer w=new FileWriter("C:\\eclipse\\java IO\\writer.txt");
			w.write("My Name is Babu");
			w.close();
			System.out.println("Written..........");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
