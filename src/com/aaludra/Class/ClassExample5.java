package com.aaludra.Class;
class Account{
	int acc_no;
	String name;
	float amount;
	void insert(int ac,String n,float am) {
		acc_no=ac;
		name=n;
		amount=am;
	}
	void deposit(float am) {
		amount=amount+am;
	}
	void widthdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insufficient Amount");
		}
		else {
			amount=amount-amt;
		}
	}
	void check() {
		System.out.println("Balance is "+amount);
	}
	void display() {
		System.out.println(acc_no+" "+name+" "+amount);
	}
}
public class ClassExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account Ac=new Account();
		Ac.insert(12345,"Babu",40000f);
		Ac.display();
		Ac.deposit(2000);
		Ac.display();
		Ac.widthdraw(45000);
		Ac.widthdraw(10000);
		Ac.display();
		

	}

}
