package com.aaludra;
import java.io.*;
public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			Reader r=new FileReader("C:\\eclipse\\java IO\\writer.txt");
			int i=r.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=r.read();
			}
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
