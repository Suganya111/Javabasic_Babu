package com.aaludra;
class Thread1 extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.print(i+" ");
			
		}
		System.out.println("\n Task1 Done");

	}
	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=6;i<10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task2 Done");
		
		
	}
	
}
public class ThreadBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Task1 Kicked off");
		Thread1 t=new Thread1();
		System.out.println(t.getState());
		t.setPriority(4);
		System.out.println(t.getPriority());
		t.start();
		System.out.println(t.getState());
		System.out.println("Task2 Kicked off");
		Thread2 t2=new Thread2();
		Thread th=new Thread(t2);
		th.start();
		//wait for task1 complete
		t.join();
		th.join();
		
		System.out.println("Task3 Kicked off");
		for(int i=11;i<15;i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task3 Done");
		
	}

}
