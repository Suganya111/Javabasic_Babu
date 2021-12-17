package com.aaludra;

public class ThrowExample extends Exception {
	public void verify(String pwd)throws ThrowExample {
		if(pwd.length()<8) {
			ThrowExample te=new ThrowExample();
			throw te;
			
		}
	}

}
