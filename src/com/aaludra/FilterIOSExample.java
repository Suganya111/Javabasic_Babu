package com.aaludra;
import java.io.*;
public class FilterIOSExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("C:\\eclipse\\java IO\\FilterIO.txt");
		FilterOutputStream filout=new DataOutputStream(fout);
		String s="Filter Output Stream";
		byte[] b=s.getBytes();
		filout.write(b);
		filout.flush();
		filout.close();
		fout.close();
		FileInputStream fin=new FileInputStream("C:\\\\eclipse\\\\java IO\\\\FilterIO.txt");
		FilterInputStream filin=new BufferedInputStream(fin);
		int k;
		while((k=filin.read())!=-1) {
			System.out.print((char)k);
			
		}
		
		

	}

}
