package com.aaludra.Array;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"Babu","Hari","Karthi","Kishore","Navin"};
		int[] m= {80,93,58,69,70};
		for(int i=0;i<m.length;i++)
		{
			if(m[i]>=90) {
				System.out.println(s[i]+"Grade A");
			}
			else if(m[i]>=80) {
				System.out.println(s[i]+"Grade B");
			}
			else if(m[i]>=60) {
				System.out.println(s[i]+"Grade C");
			}
			else {
				System.out.println(s[i]+"Fail");
			}
		}

	}

}
