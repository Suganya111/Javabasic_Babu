package com.aaludra;
import java.io.*;
public class TransientRunner {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Transient t=new Transient(111,"Babu",24);
		FileOutputStream fout=new FileOutputStream("C:\\eclipse\\Transient.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(t);
		out.flush();
		fout.close();
		out.close();
		System.out.println("Created");
		
		
		

	}

}
