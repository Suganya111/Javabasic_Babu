package com.aaludra.JavaIO;
import java.io.*;
public class FileOSExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout=new FileOutputStream("C:\\eclipse\\java IO\\Fileout.txt",true);
			String s="Welcome";
			byte[] b=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success..........");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
