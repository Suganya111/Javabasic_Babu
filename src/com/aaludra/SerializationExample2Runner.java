package com.aaludra;
import java.io.*;
public class SerializationExample2Runner {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		SerializationExample2 se2=new SerializationExample2(101,"BabuPrasath","CS",20000);
		FileOutputStream fout=new FileOutputStream("C:\\eclipse\\NewFile.txt");
		ObjectOutputStream out =new ObjectOutputStream(fout);
		out.writeObject(se2);
		out.flush();
		out.close();
		System.out.println("Success2");
		

	}

}
