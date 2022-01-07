package com.aaludra.MultiThreading;
public class JoinExample extends Thread{
	public void run() {
		for(int i=0;i<2;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread Name is: "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinExample tj1=new JoinExample();
		JoinExample tj2=new JoinExample();
		JoinExample tj3=new JoinExample();
		tj1.start();
		try {
			System.out.println("Current Thread is: "+Thread.currentThread().getName());
			tj1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		tj2.start();
		try {
			System.out.println("Current Thread is: "+Thread.currentThread().getName());
			tj2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current Thread is: "+Thread.currentThread().getName());
		tj3.start();

	}

}
