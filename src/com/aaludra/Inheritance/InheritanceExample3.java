package com.aaludra.Inheritance;
class Human{
	void human() {
		System.out.println("Human Being");
	}
}
class Male extends Human{
	void male() {
		System.out.println("Gender is Male");
	}
}
class Female extends Human{
	void female() {
		System.out.println("Gender is Female");
	}
}
public class InheritanceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Male m=new Male();
		m.human();
		m.male();

	}

}
