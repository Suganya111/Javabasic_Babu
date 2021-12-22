package com.aaludra;
public class CustomExceptionRunner {
	int mark;

	public CustomExceptionRunner(int mark) {
		this.mark = mark;
	}

	public void validate() throws CustomException, NegativeException {
		if (mark > 100) {
			throw new CustomException(mark + " Invalid mark");

		} else if (mark < 0) {
			throw new NegativeException(mark + " Negative marks are not valid");
		} else {

			System.out.println("Valid Mark");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomExceptionRunner cer = new CustomExceptionRunner(-90);
		try {
			cer.validate();
		} catch (CustomException ce) {
			// TODO Auto-generated catch block
			System.out.println(ce.getMessage());
		} catch (NegativeException ne) {
			System.out.println(ne.getMessage());
		}
		System.out.println("rest of code");

	}

}
