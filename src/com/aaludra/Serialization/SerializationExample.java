package com.aaludra.Serialization;
import java.io.*;
public class SerializationExample implements Serializable{
	int id;
	String name;
	SerializationExample(int id,String name){
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SerializationExample se=new SerializationExample(101,"Babu Prasath");
		try {
			FileOutputStream fout=new FileOutputStream("C:\\eclipse\\java IO\\Serialize.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(se);
			out.flush();
			out.close();
			fout.close();
			System.out.println("Created..............");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
