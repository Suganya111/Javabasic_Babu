package com.aaludra.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Student{
	int id;
	String name;
	String dept;
	Student(int id,String name,String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
}
public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Babu","CS");
		Student s2=new Student(102,"Karthi","ECE");
		Student s3=new Student(103,"Kishore","EEE");
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Iterator<Student> iter=list.iterator();
		while(iter.hasNext()) {
			Student st=(Student)iter.next();
			System.out.println(st.id+" "+st.name+" "+st.dept);
		}
		

	}

}
