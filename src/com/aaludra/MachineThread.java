package com.aaludra;
import java.util.*;
public class MachineThread {
	private String name;
	private int temp=41;
	private static Random r=new Random();
	public MachineThread(String name) {
		this.name=name;
	}
	public String GetName() {
		return name;
	}
	public double GetTemp() {
		return r.nextDouble()*temp;
	}

}
