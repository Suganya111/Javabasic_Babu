package com.aaludra;
import java.util.*;
public class MachineThreadConversion extends Thread{
	public boolean isContinue=true;
	public int MaxMachine=10;
	public void run() {
		List<MachineThread> machine=new ArrayList<>();
		for(int i=0;i<MaxMachine;i++) {
			String name="Machine-"+(i+1);
			machine.add(new MachineThread(name));
		}
		
		while(isContinue) {
			for(MachineThread mt:machine) {
				double cTemp=mt.GetTemp();
				if(cTemp>40) {
					System.out.println(mt.GetName()+"exceeds 40 degree. Current Temp"+cTemp);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
