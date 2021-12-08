package com.aaludra;

public class Arrobjrunner extends Arrobj{
	public void tiger() {
		System.out.println("Wild Animal");
		
	}
	public void cat() {
		System.out.println("Pet Animal");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrobj[] obj= {new Arrobjrunner()};
		for(Arrobj object:obj) {
			object.cat();
			
		}
		

	}

}
