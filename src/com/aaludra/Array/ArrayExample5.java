package com.aaludra.Array;

public class ArrayExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b ={1,2,1,3,5,1,1,6,4,4,4};

		 int[] c = new int [b.length];
		 int visited = -1;
		 for(int i = 0; i < b.length; i++){
			 int count = 1;
			 for(int j = i+1; j < b.length; j++){
				 if(b[i] == b[j]){
					 count++;

					 c[j] = visited;
				 }
			 }
			 if(c[i] != visited) {
				 c[i] = count;
			 }
		 }



		 for(int i = 0; i < c.length; i++){
			 if(c[i] != visited) {
				 System.out.println(b[i] + "-" + c[i]);
			 }
		 }


	}

}
