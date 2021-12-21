package com.aaludra;

public class AgeException {
	int age;
	public AgeException(int age) {
		this.age=age;
	}
	public void valid() throws InvalidAge {
		if(age<18) {
			throw new InvalidAge(age+"Not valid for vote");
		}
		else {
			System.out.println("Valid age for vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeException ae=new AgeException(90);
		try {
			ae.valid();
		} catch (InvalidAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of code");

	}

}
