package com.aaludra;

public class Abs extends Abstract{
	int length;
	int width;
	Abs(int l,int w){
		this.length=l;
		this.width=w;
	}
	public void area() {
		System.out.println("Area:"+length*width);
	}
	public void perimeter() {
		System.out.println("Perimeter"+2*(length+width));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abs obj=new Abs(10,20);
		obj.execute();
		
	}

}
