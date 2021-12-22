package com.aaludra;

public class DaemonThread extends Thread{
	public void run() {
		
	if(Thread.currentThread().isDaemon()) {
		System.out.println("DaemonThread is working");
		
	}
	else {
		System.out.println("User Thread is working");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread dt1=new DaemonThread();
		DaemonThread dt2=new DaemonThread();
		
		dt1.setDaemon(true);
		dt1.start();
		dt2.start();

	}

}
