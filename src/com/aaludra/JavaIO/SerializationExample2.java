package com.aaludra.JavaIO;

public final class SerializationExample2 extends SerializationExample {
	String course;
	int fee;
	SerializationExample2(int id,String name,String course,int fee){
		super(id,name);
		this.course=course;
		this.fee=fee;
	}

}
