package com.aaludra.Serialization;
import java.io.*;
public class TransientExample implements Serializable{
	int id;
	String name;
	transient int age;
	TransientExample(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TransientExample te=new TransientExample(101,"Babu Prasath",23);
		try {
			FileOutputStream fout=new FileOutputStream("C:\\eclipse\\java IO\\transient.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(te);
			out.flush();
			out.close();
			fout.close();
			System.out.println("Created..........");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
