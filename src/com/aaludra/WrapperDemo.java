package com.aaludra;

public class WrapperDemo {
	public void print(Object value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperDemo obj=new WrapperDemo();
		obj.print(Integer.valueOf(100));
		obj.print(Float.valueOf(10.5f));
		System.out.println("---------------------");
		//Auto-Boxing
		Integer a=100;
		System.out.println(a);
		//Auto-UnBoxing
		float b=Float.valueOf(10.5f);
		System.out.println(b);
		String s="1234";
		int k=Integer.parseInt(s);
		System.out.println(k);
		

	}

}
