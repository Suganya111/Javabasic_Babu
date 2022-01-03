package com.aaludra.JavaIO;
import java.io.*;
public class FileDescriptor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("C:\\eclipse\\java IO\\FD.txt");
		String s="This is File Descriptor";
		byte[] b=s.getBytes();
		fout.write(b);
		System.out.println(fout.getFD());
		System.out.println(fout.getChannel());
		FileInputStream fin=new FileInputStream("C:\\eclipse\\java IO\\FD.txt");
		System.out.println(fin.getFD());
		System.out.println(fin.getChannel());
		System.out.println(fin.available());
		int i;
		while((i=fin.read())!=-1) {
			System.out.print((char)i);
		}
		
		
	}

}
