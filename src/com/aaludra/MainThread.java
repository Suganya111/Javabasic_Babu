package com.aaludra;

public class MainThread extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			Thread.yield();
			System.out.println("Hi");
		}
	}

}
