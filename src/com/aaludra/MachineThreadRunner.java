package com.aaludra;

public class MachineThreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MachineThread m=new MachineThread("Machine-1");
		System.out.println(m.GetName());
		System.out.println(m.GetTemp());
		System.out.println("_________________________");
		MachineThreadConversion mtc=new MachineThreadConversion();
		//mtc.start();
		mtc.stop();

	}

}
