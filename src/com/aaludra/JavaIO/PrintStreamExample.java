package com.aaludra.JavaIO;
import java.io.*;
public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Byte-Oriented Class
		FileOutputStream fout=new FileOutputStream("C:\\eclipse\\java IO\\PrintStream.txt");
		PrintStream ps=new PrintStream(fout);
		ps.println("Welcome Back ");
		ps.println("This is PrintStream");
		fout.close();
		ps.close();
		System.out.println("Printed.........");
		FileInputStream fin=new FileInputStream("C:\\eclipse\\java IO\\PrintStream.txt");
		int i;
		while((i=fin.read())!=-1) {
			System.out.print((char)i);
		}
		fin.close();
		
	
		

	}

}
