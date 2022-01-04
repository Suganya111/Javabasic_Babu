package com.aaludra.Polymorphism;
class Bank{
	int getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}
class ICICI extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}
class AXIS extends Bank{
	int getRateOfInterest() {
		return 9;
	}
}
public class MethodORExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi=new SBI();
		System.out.println(sbi.getRateOfInterest()); 
		ICICI ic=new ICICI();
		System.out.println(ic.getRateOfInterest());

	}

}
