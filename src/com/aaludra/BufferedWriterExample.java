package com.aaludra;
import java.io.*;
public class BufferedWriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 FileWriter writer = new FileWriter("C:\\eclipse\\java IO\\BWriter.txt");  
		    BufferedWriter buffer = new BufferedWriter(writer);  
		    buffer.write("This is BufferedWriter");  
		    buffer.close();  
		    System.out.println("Success");  
		

	}

}
