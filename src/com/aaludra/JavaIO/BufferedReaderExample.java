package com.aaludra.JavaIO;
import java.io.*;
public class BufferedReaderExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\eclipse\\java IO\\BWriter.txt");
		BufferedReader br=new BufferedReader(fr);
		try {
			int i=br.read();
			while(i!=-1){
				System.out.print((char)i);
				i=br.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
