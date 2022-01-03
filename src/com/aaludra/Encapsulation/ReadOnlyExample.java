package com.aaludra.Encapsulation;

public class ReadOnlyExample {
	private int rollno=101;
	private String name="Babu";
	private String dept="CS";
	private String clj="BDU";
	public int getRoll() {
		return rollno;	
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getClj() {
		return clj;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadOnlyExample re=new ReadOnlyExample();
		System.out.println(re.getRoll()+" "+re.getName()+" "+re.getDept()+" "+re.getClj());

	}

}
