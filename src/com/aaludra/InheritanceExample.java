package com.aaludra;

/*
 * use a valuable class name
 * BigDecimal class is not used
 * Unused main method
 * Unused super keyword
 * Declaring a parameterized constructor , then no need to set a value
 */
public class InheritanceExample {
	private String name;
	private String email;
	private long mobile;

	public InheritanceExample(String name) {

		this.name=name;

	}



	public String getname() {
		return name;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public String getemail() {
		return email;

	}
	public void setmobile(long mobile) {
		this.mobile=mobile;
	}
	public long getmobile() {
		return mobile;
	}



}
