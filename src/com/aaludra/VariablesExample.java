package com.aaludra;

/*Class name must be valuable
 *
 */
public class VariablesExample {
	static int a=10;//static

	public void local() {
		float b=2.5f;//local
		System.out.println(b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		double c=10;//global
		String d="Babu";
		System.out.println(a);

		VariablesExample obj = new VariablesExample();
		obj.local();
		System.out.println(c);
		System.out.println(d);

	}

}
