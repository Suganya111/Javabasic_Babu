package com.aaludra;
import java.io.*;
import java.util.*;
import java.util.Collections;
class Student2{
	int rollno;
	String name;
	int age;
	Student2(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
}
class Student3 implements Comparator<Student2>{
	

	@Override
	public int compare(Student2 s1, Student2 s2) {
		// TODO Auto-generated method stub
		
		return s1.name.compareTo(s2.name);
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student2> al1=new ArrayList<Student2>();  
		al1.add(new Student2(101,"Vijay",23));  
		al1.add(new Student2(106,"Ajay",27));  
		al1.add(new Student2(105,"Jai",21));  
		Collections.sort(al1,new Student3());
		Iterator it=al1.iterator();
		while(it.hasNext()) {
			Student2 st=(Student2)it.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
			
		}

	}

}
