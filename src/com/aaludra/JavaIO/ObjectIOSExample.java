package com.aaludra.JavaIO;
import java.io.*;
public class ObjectIOSExample implements Serializable{
	transient String name;
	int rollno;
	int k;
	transient int age;
	ObjectIOSExample(String name,int rollno,int age,int k){
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.k=rollno+age;
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			ObjectIOSExample obj=new ObjectIOSExample("Babu",123,23,0);
			FileOutputStream fout=new FileOutputStream("C:\\eclipse\\java IO\\ObjIOS.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(obj);
			objout.close();
			FileInputStream fin=new FileInputStream("C:\\eclipse\\java IO\\ObjIOS.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			ObjectIOSExample in;
			in=(ObjectIOSExample)objin.readObject();
			System.out.println(in.name+" "+in.rollno+" "+in.age+" "+in.k);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
