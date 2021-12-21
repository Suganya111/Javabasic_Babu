package com.aaludra;

public class NamingThread extends Thread{
	public void run() {
		System.out.println("Naming thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamingThread nt=new NamingThread();
		NamingThread nt2=new NamingThread();
		System.out.println("Name is"+nt.getName());
		System.out.println("Name2 is"+nt2.getName());
		nt.start();
		nt2.start();
		nt.setName("Babu Prasath");
		System.out.println("After"+nt.getName());

	}

}
