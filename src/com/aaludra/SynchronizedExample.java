package com.aaludra;

public class SynchronizedExample {
	synchronized void printtable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(i*n);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedExample se=new SynchronizedExample();
		Thread t1=new Thread() {
			public void run() {
				se.printtable(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				se.printtable(10);
			}
		};
		t1.start();
		t2.start();

	}

}
