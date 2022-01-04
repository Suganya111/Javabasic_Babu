package com.aaludra.Enum;

public class EnumExample2 {
public enum Season{
	WINTER(10),SUMMER(20),FALL(30);
	int values;
	Season(int values){
		this.values=values;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season s[]=Season.values();
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+" "+s[i].values);
		}

	}

}
