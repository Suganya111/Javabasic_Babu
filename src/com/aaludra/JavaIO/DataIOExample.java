package com.aaludra.JavaIO;
import java.io.*;
public class DataIOExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout=new FileOutputStream("C:\\eclipse\\java IO\\DataIO.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			dout.writeInt(10);
			dout.writeUTF("Babu Prasath");
			dout.writeBoolean(false);
			dout.flush();
			dout.close();
			FileInputStream fin=new FileInputStream("C:\\eclipse\\java IO\\DataIO.txt");
			DataInputStream din=new DataInputStream(fin);
			System.out.println(din.readInt());
			System.out.println(din.readUTF());
			System.out.println(din.readBoolean());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
