package com.aaludra.JavaIO;
import java.io.*;
public class PipedExample {
	public static void main(String[] args) throws IOException {  
	            PipedReader pr = new PipedReader();  
	            PipedWriter wr = new PipedWriter();  
	            pr.connect(wr);
	            wr.write(90);
	            wr.write(77);
	            System.out.println((char)pr.read());
	            System.out.println((char)pr.read());
	  
	            
	    } 

}
