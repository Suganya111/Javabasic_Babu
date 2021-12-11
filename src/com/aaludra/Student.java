package com.aaludra;

/*
 * variable name must be small letter(Dob and Yop)
 */
public class Student extends InheritanceExample {
	private int dob;
	private String cljname;
	private int yop;
	public Student(String name,String cljname) {

		super(name);
		this.cljname=cljname;

	}

	public void setdob(int dob) {
		this.dob = dob;
	}

	public int getdob() {
		return dob;
	}

	public void setcljname(String cljname) {
		this.cljname = cljname;
	}
	public String getcljname() {
		return cljname;
	}

	public void setyop(int yop) {
		this.yop = yop;
	}

	public int getyop() {
		return yop;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student("Babu","BDU");

		obj.setemail("baburedmi4@gmail.com");
		obj.setmobile(9003712177L);
		obj.setdob(30041999);
		obj.setyop(2021);

		System.out.println("Name: "+obj.getname());
		System.out.println("Email: "+obj.getemail());
		System.out.println("Mobile: "+obj.getmobile());
		System.out.println("DOB: " + obj.getdob());
		System.out.println("College: "+obj.getcljname());
		System.out.println("YOP: " + obj.getyop());


	}

}
