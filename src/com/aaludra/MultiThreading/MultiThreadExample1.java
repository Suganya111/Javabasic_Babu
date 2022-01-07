package com.aaludra.MultiThreading;
class Multi1 extends MultiThreadExample1{
	public void run() {
		
		System.out.println("Thread is Started");
		
	}
}
class Multi2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread is Running");
		
	}
	
}
public class MultiThreadExample1 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi1 m1=new Multi1();
		m1.start();
		m1.setName("THread1");//Name
		System.out.println("Name is: "+m1.getName());
		m1.setPriority(10);
		System.out.println("Priority of m1: "+m1.getPriority());
		Multi2 m2=new Multi2();
		Thread t1=new Thread(m2);
		t1.start();
		System.out.println("Priority of t1:"+t1.getPriority());

	}

}
