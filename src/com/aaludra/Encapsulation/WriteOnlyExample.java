package com.aaludra.Encapsulation;

public class WriteOnlyExample {
	private long acno;
	private String name, email;
	private float amt;

	public long getAcno() {
		return acno;
	}

	public void setAcno(long acno) {
		this.acno = acno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteOnlyExample we = new WriteOnlyExample();
		we.setAcno(9405939394L);
		we.setName("BABU");
		we.setEmail("baburedmi@gmail.com");
		we.setAmt(30000f);
		System.out.println(we.getAcno()+" "+we.getName()+" "+we.getEmail()+" "+we.getAmt());

	}

}
