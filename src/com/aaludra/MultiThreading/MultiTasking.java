package com.aaludra.MultiThreading;

public class MultiTasking implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new MultiTasking());//passing annonymous object of TestMultitasking class
		t1.start();
		try {
			Thread.sleep(1000);
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t2=new Thread(new MultiTasking());
		t2.start();
		

	}

	

}
