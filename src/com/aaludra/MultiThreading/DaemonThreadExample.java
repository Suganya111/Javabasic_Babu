package com.aaludra.MultiThreading;
import java.util.*;
public class DaemonThreadExample extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread: "+Thread.currentThread().getName());
		}
		else {
			System.out.println("Normal Thread:");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThreadExample dt=new DaemonThreadExample();
		dt.setDaemon(true);
		dt.setName("Daemon");
		dt.start();
		DaemonThreadExample dt2=new DaemonThreadExample();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dt2.setName("Normal");
		dt2.start();
		

	}

}
