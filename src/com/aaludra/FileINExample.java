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
			System.out.println(fin.available());
			System.out.println(fin.skip(2));
			fin.mark(0);
			
			System.out.println(fin.getChannel());
			 boolean check = fin.markSupported();
	            if (fin.markSupported())
	            {
	                // reset() method : repositioning the stram to
	                // marked positions.
	                fin.reset();
	                System.out.println("reset() invoked");
	                System.out.println("Char : "+(char)fin.read());
	                System.out.println("Char : "+(char)fin.read());
	            }
	            else
	                System.out.println("reset() method not supported.");
	  
	  
	            System.out.println("geek.markSupported() supported"+
	                              " reset() : "+check);
	  
			
			while((i=fin.read())!=-1){
			System.out.print((char)i);
			
			}
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
