package com.aaludra;
import java.io.*;
public class BufferedINSExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("C:\\\\eclipse\\\\java IO\\\\BOS.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			int i;
			while((i=bin.read())!=-1) {
				System.out.println((char)i);
				
			}
			bin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
