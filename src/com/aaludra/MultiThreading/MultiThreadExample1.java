package com.aaludra.MultiThreading;
class Multi1 extends Thread{
	public void run() {
		System.out.println("Thread is Started");
		
	}
}
class Multi2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
		
	}
	
}
public class MultiThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi1 m1=new Multi1();
		m1.start();
		Multi2 m2=new Multi2();
		Thread t1=new Thread(m2);
		t1.start();

	}

}
