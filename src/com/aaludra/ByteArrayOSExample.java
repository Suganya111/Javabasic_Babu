package com.aaludra;
import java.io.*;
public class ByteArrayOSExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout1=new FileOutputStream("C:\\eclipse\\java IO\\Baout1.txt");
		FileOutputStream fout2=new FileOutputStream("C:\\eclipse\\java IO\\Baout2.txt");
		ByteArrayOutputStream baout=new ByteArrayOutputStream();
		String s="Welcome Again";
		byte[] b=s.getBytes();
		baout.write(b);
		baout.writeTo(fout1);
		baout.writeTo(fout2);
		baout.flush();
		baout.close();
		System.out.println("Created.............");
		

	}

}
