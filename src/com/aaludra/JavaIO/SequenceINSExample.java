package com.aaludra.JavaIO;
import java.io.*;

import java.util.*;
public class SequenceINSExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin1=new FileInputStream("C:\\eclipse\\java IO\\Fileout.txt");
		FileInputStream fin2=new FileInputStream("C:\\eclipse\\java IO\\BOS.txt");
		Vector v=new Vector();
		v.add(fin1);
		v.add(fin2);
		Enumeration e=v.elements();
		SequenceInputStream sis=new SequenceInputStream(e);
		int i;
		while((i=sis.read())!=-1){
			System.out.print((char)i);
		}
		sis.close();
		fin1.close();
		fin2.close();
		

	}

}
