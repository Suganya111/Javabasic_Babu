package com.aaludra.MultiThreading;

public class SleepExample extends Thread{
	void sleep() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Welcome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepExample se=new SleepExample();
		se.start();

	}

}
