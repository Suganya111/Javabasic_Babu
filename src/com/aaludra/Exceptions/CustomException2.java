package com.aaludra.Exceptions;

class AgeException extends Exception{
	public AgeException(String message){
		super(message);
	}
}
class NegativeException extends Exception{
	public NegativeException(String message){
		super(message);
	}
}
public class CustomException2 {
	
	static void valid(int age) throws AgeException, NegativeException {
		if(age<18 && age>1) {
			throw new AgeException("Invalid");
			
		}
		else if(age<0) {
			throw new NegativeException("Negative");
		}
		else {
			System.out.println("Valid");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			valid(19);
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
		catch(NegativeException e) {
			System.out.println(e.getMessage());
		}

	}

}
