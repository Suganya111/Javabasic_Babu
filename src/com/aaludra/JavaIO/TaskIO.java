package com.aaludra.JavaIO;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Files;

import java.util.*;
public class TaskIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File sourceFolder=new File("C:\\eclipse\\java IO\\Task");
		sourceFolder.mkdir();
		try {
			FileOutputStream fout1=new FileOutputStream("C:\\eclipse\\java IO\\Task\\File1.txt");
			FileOutputStream fout2=new FileOutputStream("C:\\eclipse\\java IO\\Task\\File2.txt");
			FileOutputStream fout3=new FileOutputStream("C:\\eclipse\\java IO\\Task\\File3.txt");
			String f1="This is File 1";
			byte[] b=f1.getBytes();
			fout1.write(b);
			String f2="This is File 2";
			byte[] b2=f1.getBytes();
			fout2.write(b2);
			String f3="This is File 3";
			byte[] b3=f1.getBytes();
			fout3.write(b3);
			fout1.close();
			fout2.close();
			fout3.close(); 
			String s="";
			for(File folder:sourceFolder.listFiles()) {
				String name=folder.getName();
				s=name.substring(name.lastIndexOf(".")+1);
				if(s.equals("txt")) { 
					FileInputStream fin=new FileInputStream(name);
					int i;
					while((i=fin.read())!=-1)
					System.out.print((char)i);
				}
				else {
					System.out.println("can't read");
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}