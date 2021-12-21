package com.aaludra;

public class ThreadSleep2 extends Thread{
	public void run() {
		try {
			
			System.out.println("Thread 2 is started");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 2 is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSleep t1=new ThreadSleep();
		ThreadSleep2 t2=new ThreadSleep2();
		t1.start();
		t2.start();

	}

}
