package com.aaludra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread4 extends Thread{
	private int num;
	Thread4(int num){
		this.num=num;
	}
	public void run() {
		for(int i=num*1;i<=num*1+5;i++) {
			System.out.print(i+" ");
			
		}
		System.out.println("\n Task "+num+" Done");

	}
	
}

public class FixedThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		executorService.execute(new Thread4(1));
		executorService.execute(new Thread4(2));
		executorService.execute(new Thread4(3));
		executorService.execute(new Thread4(4));

	}

}
