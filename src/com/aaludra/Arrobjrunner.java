package com.aaludra;
/*
 use camelcase for class
 */

public class Arrobjrunner extends Arrobj{
	@Override
	public void tiger() {
		System.out.println("Wild Animal");

	}
	@Override
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
