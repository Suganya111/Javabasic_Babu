package com.aaludra;
import java.io.*;
public class BufferedOSExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout=new FileOutputStream("C:\\eclipse\\java IO\\BOS.txt",true);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="This is Buffered Output Stream";
			byte[] b=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("Created..........");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
