package com.aaludra;
import java.io.*;
public class Transient implements Serializable{
	int roll;
	String name;
	transient int age;
	Transient(int roll,String name,int age){
		this.roll=roll;
		this.name=name;
		this.age=age;
	}

}
