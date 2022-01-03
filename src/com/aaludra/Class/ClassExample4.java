package com.aaludra.Class;
class Area{
	int length;
	int width;
	void cal(int l,int w) {
		length=l;
		width=w;
	}
	void display() {
		System.out.println("Area: "+length*width);
	}
}

public class ClassExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area ar=new Area();
		ar.cal(10,20);
		ar.display();

	}

}
