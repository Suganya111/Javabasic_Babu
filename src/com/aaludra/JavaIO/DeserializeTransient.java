package com.aaludra.JavaIO;
import java.io.*;
public class DeserializeTransient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\\\eclipse\\\\Transient.txt"));
		Transient t=(Transient)in.readObject();
		System.out.println(t.roll+" "+t.name+" "+t.age);
		in.close();

	}

}
