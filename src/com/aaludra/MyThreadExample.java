package com.aaludra;

public class MyThreadExample implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new MyThreadExample();
		Thread th=new Thread(r1,"My Thread");
		th.start();
		String str=th.getName();
		System.out.println(str);

	}

}
