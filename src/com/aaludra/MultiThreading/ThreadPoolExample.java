package com.aaludra.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample extends Thread{
	private String msg;
	ThreadPoolExample(String s){
		msg=s;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start Message"+msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"End");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es=Executors.newFixedThreadPool(5);
		for(int i=0;i<5;i++) {
			Runnable work=new ThreadPoolExample(" "+i);
			es.execute(work);
		}
		es.shutdown();
		while(!es.isTerminated()) {
			
		}
System.out.println("Finish");
	}

}
