package com.aaludra;

public class AbstractMain extends AbstractExample {
	int length;
	int width;

	AbstractMain(int l, int w) {
		this.length=l;
		this.width=w;
	}
	@Override
	public void area() {
		System.out.println("Area:"+length*width);
	}
	@Override
	public void perimeter() {
		System.out.println("Perimeter"+2*(length+width));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMain obj = new AbstractMain(10, 20);
		obj.execute();

	}

}
