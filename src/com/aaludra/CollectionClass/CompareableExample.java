package com.aaludra.CollectionClass;
import java.util.*;
class Student implements Comparable<Student>{
	int id;
	String name;
	int age;
	Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(age==st.age)
		return 0;
		else if(age<st.age)
			return 1;
		else
			return -1;
	}
	
}
public class CompareableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(104,"Karthi",24));
		al.add(new Student(102,"Hari",22));
		al.add(new Student(101,"Babu",23));
		Collections.sort(al);
		Iterator<Student> iter=al.iterator();
		for(Student st:al) {
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
		

	}

}
