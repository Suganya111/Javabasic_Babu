package com.aaludra;
public class ArrayExample {
	static void printArray()
	{
		String[] s=new String[] {"Babu","Karthi","Kishore","Hari","Navin"};
		float[] marks=new float[]{8.5f,7.4f,6.7f,8.2f,3.7f};
		for (int i = 0; i <= marks.length; i++) {
			if(marks[i]>=8.0) {
				System.out.println(s[i]+" Grade A");
			}
			else if(marks[i]>=6.0) {
				System.out.println(s[i]+" Grade B");
			}
			else if(marks[i]>=4.0) {
				System.out.println(s[i]+" Grade C");
			}
			else {
				System.out.println(s[i]+" Fail");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray();
	}

}
