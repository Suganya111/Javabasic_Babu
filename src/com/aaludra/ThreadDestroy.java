package com.aaludra;
import java.lang.*;
public class ThreadDestroy extends Thread{
	ThreadDestroy(String name,ThreadGroup tgrp){
		super(tgrp,name);
		start();
		for(int i=1;i<10;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadGroup tg=new ThreadGroup("Parent");
		ThreadGroup tg1=new ThreadGroup(tg,"Child");
		ThreadDestroy td=new ThreadDestroy("First",tg);
		System.out.println("First one Executing");
		ThreadDestroy td1=new ThreadDestroy("Second",tg1);
		System.out.println("Second one Executing");
		td.join();
		td1.join();
		System.out.println(tg.getName());
		tg.suspend();
		System.out.println(tg.getName()+"suspended");
		tg1.resume();
		System.out.println(tg1.getName()+"resumed");
		System.out.println(tg1.getName());
		tg.stop();
		System.out.println(tg.getName()+"Stoped");
		tg1.destroy();
		System.out.println(tg1.getName()+"Is Destroyed");
		tg.destroy();
		System.out.println(tg.getName()+"Is Destroyed");
		if(tg.isDestroyed()==true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println("The Parent of "+tg.getName()+" is "+tg.getParent().getName());
	}

}
