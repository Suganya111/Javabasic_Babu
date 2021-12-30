package com.aaludra.JavaIO;

import java.io.*;

public class SerializationExampleRunner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SerializationExample se = new SerializationExample(101, "Babu Prasath");
		FileOutputStream fout = new FileOutputStream("C:\\eclipse\\File.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(se);
		out.flush();
		out.close();
		System.out.println("Success");

	}

}
