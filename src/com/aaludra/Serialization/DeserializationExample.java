package com.aaludra.Serialization;
import java.io.*;
public class DeserializationExample {

	//DeserializationExample(int id, String name) {
		//super();
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("C:\\eclipse\\java IO\\Serialize.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			SerializationExample s=(SerializationExample)in.readObject();
			System.out.println(s.id+" "+s.name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
