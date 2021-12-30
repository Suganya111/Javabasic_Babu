package com.aaludra.JavaIO;
import java.io.*;
public class ByteArrayINSExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] byt= {65,66,67,68,69};
		ByteArrayInputStream bain=new ByteArrayInputStream(byt);
		int i;
		while((i=bain.read())!=-1) {
			System.out.println("value of:"+i+" Ascii Value:"+(char)i);
			
		}

	}

}
