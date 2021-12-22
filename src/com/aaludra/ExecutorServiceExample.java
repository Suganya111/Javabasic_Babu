package com.aaludra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {//ThreadBasics

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		executorService.execute(new Thread1());
		executorService.execute(new Thread(new Thread2()));
		executorService.shutdown();

	}

}
