package com.aaludra;

public class ThreadGroupExample implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroupExample tge=new ThreadGroupExample();
		ThreadGroup tg1=new ThreadGroup("Parent Thread");
		Thread t1=new Thread(tg1,tge,"Task 1");
		t1.start();
		Thread t2=new Thread(tg1,tge,"Task 2");
		t2.start();
		Thread t3=new Thread(tg1,tge,"Task 3");
		t3.start();
		System.out.println(tg1.getName());
		tg1.list(); 

	}

	
}
