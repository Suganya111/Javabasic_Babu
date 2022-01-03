package com.aaludra.While;

public class WhileExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=123456;
		int even=0;
		int odd=0;
		while(i>0) {
			int temp=i%10;
			if(temp%2==0) {
				even++;
			}
			else {
				odd++;
			}
			i=i/10;
		}
		System.out.println("even:"+even);
		System.out.println("Odd:"+odd);

	}

}
