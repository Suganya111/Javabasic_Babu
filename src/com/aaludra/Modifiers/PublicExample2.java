package com.aaludra.Modifiers;

public class PublicExample2 extends PublicExample{
	String clj;
	int fee;
	PublicExample2(int roll, String name, int age,String clj,int fee) {
		super(roll, name, age);
		this.clj=clj;
		this.fee=fee;
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println(roll+" "+name+" "+age+" "+clj+" "+fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicExample2 pe=new PublicExample2(101,"babu",23,"BDU",30000);
		//pe2.PublicExample();
		pe.show();
		

	}

}
