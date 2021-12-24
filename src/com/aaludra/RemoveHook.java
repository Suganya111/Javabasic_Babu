package com.aaludra;

public class RemoveHook extends Thread {
	public void run() {
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RemoveHook rh = new RemoveHook();
			Runtime.getRuntime().addShutdownHook(rh);

			System.out.println("The program is beginning ...");

			System.out.println("Waiting for 2 seconds ...");
			Thread.sleep(1000);
			Runtime.getRuntime().removeShutdownHook(rh);

			System.out.println("The program is terminating ...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
