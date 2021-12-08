package com.aaludra;
import java.math.BigDecimal;
public class Inheritance {
	private String name;
	private String email;
	private long mobile;
	public Inheritance(String name) {
		super();
		this.name=name;
		
	}
	public void setname(String name) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	}

}
