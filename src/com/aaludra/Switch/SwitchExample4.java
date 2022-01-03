package com.aaludra.Switch;

public class SwitchExample4 {
	public enum Day{
		Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day[] now=Day.values();
		for(Day d:now) {
			switch(d) {
			case Sunday:
				System.out.println("Sunday");
				break;
			case Monday:
				System.out.println("Monday");
				break;
			case Tuesday:
				System.out.println("Tuesday");
				break;
			case Wednesday:
				System.out.println("Wednesday");
				break;
			case Thursday:
				System.out.println("Thursday");
				break;
			case Friday:
				System.out.println("Friday");
				
				break;
			case Saturday:
				System.out.println("Saturday");
				break;
			
			default:
				System.out.println("Invalid");
			}
			
		}

	}

}
