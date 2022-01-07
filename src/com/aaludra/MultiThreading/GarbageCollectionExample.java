package com.aaludra.MultiThreading;

public class GarbageCollectionExample extends Thread{
	protected void finalize() {
		System.out.println("Garbage Collector");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionExample gce=new GarbageCollectionExample();
		GarbageCollectionExample gce2=new GarbageCollectionExample();
		gce=null;
		gce2=null;
		System.gc();
		float f=10.5f%2;
		System.out.println(f);

	}

}
