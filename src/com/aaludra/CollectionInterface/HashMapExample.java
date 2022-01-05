package com.aaludra.CollectionInterface;

import java.util.HashMap;
import java.util.Map;

class Book1{
	int id;
	String author;
	float price;
	Book1(int id,String author,float price){
		this.id=id;
		this.author=author;
		this.price=price;
	}
}
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1=new Book1(101,"Kathi",300f);
		Book1 b2=new Book1(102,"Babu",350f);
		Book1 b3=new Book1(103,"Navin",400f);
		HashMap<Integer,Book1> map=new HashMap<Integer,Book1>();
		map.put(1, b3);
		map.put(2, b2);
		map.put(3, b1);
		for(Map.Entry<Integer, Book1> m:map.entrySet()) {
			int k=m.getKey();
			Book1 b=m.getValue();
			System.out.println(b.id+" "+b.author+" "+b.price);
		}
		
		
		

	}

}
