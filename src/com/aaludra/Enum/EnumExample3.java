package com.aaludra.Enum;
public class EnumExample3 {
	public enum Days{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
		
	}
	Days d;
	public EnumExample3(Days d) {
		this.d=d;
		
	}
	public void test() {
		switch(d){
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
		EnumExample3 obj=new EnumExample3(Days.MONDAY);
		obj.test();
		EnumExample3 obj2=new EnumExample3(Days.WEDNESDAY);
		obj2.test();

		

	}

}
