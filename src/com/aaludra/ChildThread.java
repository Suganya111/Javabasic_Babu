package com.aaludra;

public class ChildThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainThread mt=new MainThread();
		System.out.println(mt.getState());
		mt.start();
		if(mt.isAlive()) {
			System.out.println("Executing");
			
		}
		System.out.println(mt.getState());
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
		}
		System.out.println(mt.getState());
		mt.setName("Object");
		System.out.println(mt.getName());
		mt.setPriority(5);
		System.out.println(mt.getPriority());

	}

}
