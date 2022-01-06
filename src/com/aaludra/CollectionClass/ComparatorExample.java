package com.aaludra.CollectionClass;
import java.util.*;
class Student8{
	int id;
	String name;
	int age;
	Student8(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
}
class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.age==s2.age)
		return 0;
		else if(s1.age>s2.age)
		return 1;
		else
			return -1;
		
	}
	
}
class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
					
		return o1.name.compareTo(o2.name);
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> li=new ArrayList<Student>();
		li.add(new Student(101,"Babu",23));
		li.add(new Student(102,"Karthi",21));
		li.add(new Student(103,"Ari",20));
		Collections.sort(li,new AgeComparator());
		Iterator<Student> it=li.iterator();
		for(Student st:li) {
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
		System.out.println("-----------------------------------");	
		Collections.sort(li,new NameComparator());
		Iterator<Student> it2=li.iterator();
		for(Student st2:li) {
			System.out.println(st2.id+" "+st2.name+" "+st2.age);
		}

	}

}
