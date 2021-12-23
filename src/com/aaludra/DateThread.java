package com.aaludra;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread5 implements Runnable{
	private String name;

	Thread5(String name){
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<3;i++) {
				if(i==0) {
					Date dt= new Date();
					SimpleDateFormat sd=new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization time for ThreadName "+name+"="+sd.format(dt));
				}
				else {
					Date dt= new Date();
					SimpleDateFormat sd=new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization time for ThreadName "+ name +"="+ sd.format(dt));
				}
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
public class DateThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Thread5("Task1");
		Runnable r2=new Thread5("Task2");
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		executorService.execute(r1);
		executorService.execute(r2);

	}

}
