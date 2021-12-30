package com.aaludra.JavaIO;

import java.io.*;

public class Deserialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Creating stream to read the object
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\eclipse\\NewFile.txt"));
		SerializationExample2 se2 = (SerializationExample2) in.readObject();
		// printing the data of the serialized object
		System.out.println(se2.id + " " + se2.name+" "+se2.course+" "+se2.fee);
		// closing the stream
		in.close();

	}

}
