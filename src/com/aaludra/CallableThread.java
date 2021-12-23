package com.aaludra;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{
	private String name;

	CallableTask(String name){
		this.name=name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Hi"+name;
	}
	
}
public class CallableThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService =Executors.newFixedThreadPool(1);
		Future<String> welcome=executorService.submit(new CallableTask("Babu Prasath"+"\n Welcome"));
		
		String s=welcome.get();
		System.out.println(s);
	}

}
