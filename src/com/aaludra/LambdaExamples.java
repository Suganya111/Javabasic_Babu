package com.aaludra;
import java.util.*;
public class LambdaExamples {
	/*public void l1() {
		ArrayList<Integer> number=new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.forEach((n)->System.out.println(n));	
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LambdaExamples obj=new LambdaExamples();
		obj.l1();*/
		FunctionalInterFaceExample id=() -> System.out.println("Lambda Example");
		id.test();
		id.test2();
		FunctionalInterFaceExample.test3();
		

	}

}
