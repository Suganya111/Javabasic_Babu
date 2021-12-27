package com.aaludra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileINExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("C:\\eclipse\\java IO\\Fileout.txt");
			int i;
			while((i=fin.read())!=-1){
			System.out.println((char)i);
			
			}
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
