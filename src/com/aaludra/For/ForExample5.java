package com.aaludra.For;

public class ForExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aa:
			for(int i=1;i<=3;i++)
				bb:
					for(int j=1;j<=3;j++) {
						if(j==2&&i==2)
							break aa;
						System.out.println(i+"  "+j);
					}
		

	}

}
