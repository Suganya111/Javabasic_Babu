package com.aaludra.Serialization;
import java.io.*;
public class TransientRunner {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin = new FileInputStream("C:\\eclipse\\java IO\\transient.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			TransientExample te=(TransientExample)in.readObject();
			System.out.println(te.id+" "+te.name+" "+te.age);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
