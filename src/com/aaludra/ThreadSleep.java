package com.aaludra;

public class ThreadSleep extends Thread{
	public void run() {
		try {
			
			System.out.println("Thread is started");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 is running");
	}

}
