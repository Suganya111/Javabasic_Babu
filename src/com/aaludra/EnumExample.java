package com.aaludra;

public class EnumExample {
	Day day;
	public EnumExample(Day day) {
		this.day=day;
	}
	public void test() {
		switch(day){
			case MONDAY:
				System.out.println("Day is Monday");
				break;
			case FRIDAY:
				System.out.println("Day is Friday");
				break;
			case SATURDAY: case SUNDAY:
				System.out.println("Weekend");
				break;
			default:
				System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumExample obj=new EnumExample(Day.MONDAY);
		obj.test();
		EnumExample obj2=new EnumExample(Day.WEDNESDAY);
		obj2.test();

	}

}
