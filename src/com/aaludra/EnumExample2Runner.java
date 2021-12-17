package com.aaludra;

public class EnumExample2Runner {
	
	public  void validsalary(String name, int i) {
		EnumExample2[] ee2 = EnumExample2.values();
		for (int k = 0; k < ee2.length; k++) {
			if (name.equals(ee2[0].string)) {
				if (i >= ee2[0].salary && i <= ee2[0].salary2) {
					System.out.println("Valid Salary For " + ee2[0].string);
					break;
				} else {
					System.out.println("invalid Salary For " + ee2[0].string);
					break;
				}
			}

		}
		for (int k = 0; k < ee2.length; k++) {
			if (name.equals(ee2[1].string)) {
				if (i >= ee2[1].salary && i <= ee2[1].salary2) {
					System.out.println("Valid Salary For " + ee2[1].string);
					break;
				} else {
					System.out.println("invalid Salary For " + ee2[1].string);
					break;
				}
			}

		}
		for (int k = 0; k < ee2.length; k++) {
			if (name.equals(ee2[2].string)) {
				if (i >= ee2[2].salary && i <= ee2[2].salary2) {
					System.out.println("Valid Salary For " + ee2[2].string);
					break;
				} else {
					System.out.println("invalid Salary For " + ee2[2].string);
					break;
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumExample2Runner er2 = new EnumExample2Runner();
		er2.validsalary("Grade3", 25000);

	}

}
