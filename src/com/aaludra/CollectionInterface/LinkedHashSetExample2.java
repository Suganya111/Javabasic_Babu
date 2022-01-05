package com.aaludra.CollectionInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample2 {
	int id;
	String name;
	String author;
	float price;
	LinkedHashSetExample2(int id,String name,String author,float price){
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSetExample2 lh1=new LinkedHashSetExample2(1,"C","Dennis Ritchie",300f);
		LinkedHashSetExample2 lh2=new LinkedHashSetExample2(2,"Java","James Gosling",350f);
		LinkedHashSetExample2 lh3=new LinkedHashSetExample2(3,"Python","Guido Van Russom",400f);
		LinkedHashSet<LinkedHashSetExample2> lh=new LinkedHashSet<LinkedHashSetExample2>();
		lh.add(lh1);
		lh.add(lh2);
		lh.add(lh3);
		for(LinkedHashSetExample2 l:lh) {
			System.out.println(l.id+" "+l.name+" "+l.author+" "+l.price);
		}

	}

}
