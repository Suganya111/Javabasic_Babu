package com.aaludra.CollectionInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample2 {
	int id;
	String name;
	float salary;
	DequeueExample2(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DequeueExample2 de=new DequeueExample2(101,"Babu",3000f);
		DequeueExample2 de2=new DequeueExample2(102,"Karthi",3000f);
		DequeueExample2 de3=new DequeueExample2(103,"Kishore",3000f);
		Deque<DequeueExample2> queue=new ArrayDeque<DequeueExample2>();
		queue.offer(de);
		queue.offer(de2);
		queue.add(de3);
		for(DequeueExample2 dee:queue) {
			System.out.println(dee.id+" "+dee.name+" "+dee.salary);
		}
		

	}

}
