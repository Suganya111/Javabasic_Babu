package com.aaludra;

public class Student extends Inheritance{
	private int Dob;
	private String cljname;
	private int Yop;
	public Student(String name,String cljname) {
		
		super(name);
		this.cljname=cljname;
		
	}
	public void setDob(int Dob) {
		this.Dob=Dob;
	}
	public int getDob() {
		return Dob;
	}
	public void setcljname(String cljname) {
		this.cljname=cljname;
	}
	public String getcljname() {
		return cljname;
	}
	public void setYop(int Yop) {
		this.Yop=Yop;
	}
	public int getYop() {
		return Yop;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student("Babu","BDU");
		
		obj.setemail("baburedmi4@gmail.com");
		obj.setmobile(9003712177l);
		obj.setDob(30041999);
		
		obj.setYop(2021);
		System.out.println("Name: "+obj.getname());
		System.out.println("Email: "+obj.getemail());
		System.out.println("Mobile: "+obj.getmobile());
		System.out.println("DOB: "+obj.getDob());
		System.out.println("College: "+obj.getcljname());
		System.out.println("YOP: "+obj.getYop());


	}

}
