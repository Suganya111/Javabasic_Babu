package com.aaludra.Variables;

public class DataTypesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Premitive DataTypes
		boolean bool=true;//1 bit
		byte b=10;//1 byte
		char c='B';//2 bytes
		int d=10;//4 bytes
		float e=2.5f;//4 bytes
		short f=1000;//2 bytes
		long g=1000000L;//8 bytes
		double h=100000;//8 bytes
		//Non-Premitive DataTypes
		String s="Baby Prasath";
		int i[]= {10,20,30,40,50};
		System.out.println("Boolean"+bool);
		System.out.println("Byte"+b);
		System.out.println("Character"+c);
		System.out.println("Integer"+d);
		System.out.println("Floating Poing"+e);
		System.out.println("Short"+f);
		System.out.println("Long"+g);
		System.out.println("Double"+h);
		System.out.println("String"+s);
		for(int j=0;j<i.length;j++)
		System.out.println("Array"+i[j]);
		
		

	}

}
