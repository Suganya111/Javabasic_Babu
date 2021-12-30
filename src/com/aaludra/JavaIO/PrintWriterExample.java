package com.aaludra.JavaIO;
import java.io.*;
public class PrintWriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Character Oriented Class
		FileWriter fw=new FileWriter("C:\\eclipse\\java IO\\PrintWriter.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write("This is PrintWriter");
		fw.close();
		pw.close();
		System.out.println("Written.............");
		System.out.println("\n----------------------------");
		FileReader fr=new FileReader("C:\\eclipse\\java IO\\PrintWriter.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
			
		}
		fr.close();

	}

}
