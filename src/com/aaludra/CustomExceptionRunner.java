package com.aaludra;

public class CustomExceptionRunner {
	int mark;

	public CustomExceptionRunner(int mark) {
		this.mark = mark;
	}

	public void validate() throws CustomException {
		if (mark < 0 || mark > 100) {
			throw new CustomException(mark + "Invalid mark");
		} else {
			System.out.println("Valid Mark");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomExceptionRunner cer = new CustomExceptionRunner(90);
		try {
			cer.validate();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of code");

	}

}
