package com.aaludra;
import java.lang.*;
	
public class ThreadGroupActiveCount extends Thread{
	ThreadGroupActiveCount(String name,ThreadGroup tgrp){
		super(tgrp,name);
		
	}
		public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg=new ThreadGroup("Parent");
		//ThreadGroup tg1=new ThreadGroup(tg,"Child"); //GroupCount
		ThreadGroupActiveCount t1=new ThreadGroupActiveCount("FirstCount", tg);
		System.out.println("Starting First");
		ThreadGroupActiveCount t2=new ThreadGroupActiveCount("SecoundCount",tg);
		System.out.println("Starting Second");
		System.out.println("Name: "+tg.getName());
		System.out.println("Active Count: "+tg.activeCount());
		

	}

}
