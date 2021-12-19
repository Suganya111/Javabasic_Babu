package com.aaludra;
/*import java.util.* is never used
 * object name must be meaningful
 */

//import java.util.*;
public class Wrapper implements Comparable<Wrapper>{
	private int rollno;
	private String name;
	private Integer marks;
	Wrapper(int rollno,String name,int marks){
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		
	}
	@Override
	public int compareTo(Wrapper o) {
		return this.marks.compareTo(o.marks);
	}
	public String toString() {
		return "Student{"
	            + "RollNo=" + rollno + ", Name='" + name + '\''
	            + ", Marks=" + marks + '}';
	}

}

