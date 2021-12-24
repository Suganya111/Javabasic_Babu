package com.aaludra;

public class AddShutdownHookThread extends Thread{
	public void run() {
		System.out.println("ShutdownHook");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AddShutdownHookThread sh=new AddShutdownHookThread();
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(sh);
	for(int i=1;i<10;i++) {
			
			if(i>3) {
				
			System.exit(0);
			}
			System.out.println("Hi");
			Thread.sleep(1000);
		}
		

	}

}