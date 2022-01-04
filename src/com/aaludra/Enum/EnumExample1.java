package com.aaludra.Enum;

public class EnumExample1 {
	public enum Season{
		SUMMER,WINTER,SPRING,FALL
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Season s:Season.values()) {
			System.out.println(s);
		}
		System.out.println("----------------------------");
		System.out.println("Values Of Winter: "+Season.valueOf("WINTER"));
		System.out.println("Index Of Winter: "+Season.valueOf("WINTER").ordinal());

	}

}
