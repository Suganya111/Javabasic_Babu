package com.aaludra.MultiThreading;

public class ThreadGroupExample implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroupExample runnable=new ThreadGroupExample();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");    
        
        Thread t1 = new Thread(tg1, runnable,"one");    
        t1.start(); 
        try {
        	Thread.sleep(1000);
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Thread t2 = new Thread(tg1, runnable,"two");    
        t2.start();   
        try {
        	Thread.sleep(1000);
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Thread t3 = new Thread(tg1, runnable,"three");    
        t3.start();  
        try {
        	Thread.sleep(1000);
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
               
        System.out.println("Thread Group Name: "+tg1.getName());    
       tg1.list();    
		

	}


}
