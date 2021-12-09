package com.aaludra;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=List.of("Babu","Hari","Karthi");
		System.out.println(names);
		List<String> nameArrayList=new ArrayList(names);
		
		nameArrayList.add("Kishore");
		System.out.println(nameArrayList);
		System.out.println(nameArrayList.get(0));
		List<String> nameVector=new Vector(nameArrayList);
		nameVector.add("Navin");
		System.out.println(nameVector);
	    System.out.println(nameVector.get(nameVector.size()-1));
	    List<Integer> numArrayList=new ArrayList<Integer>(5);
	    numArrayList.add(10);
	    numArrayList.add(50);
	    numArrayList.add(30);
	    numArrayList.add(40);
	  
	    System.out.println(numArrayList);
	    List<String> naVector=new Vector<String>(3);
	    naVector.add("Navin");
	    naVector.add("Kannan");
	    naVector.add("Mohan");
	    System.out.println(naVector);
	    naVector.remove("Navin");
	    System.out.println(naVector);
	    System.out.println(naVector.size());
	    naVector.addAll(nameArrayList);
	    System.out.println(naVector);
	    naVector.addAll(nameVector);
	    System.out.println(naVector);
	    naVector.add(nameVector.get(1));
	    System.out.println(naVector);
	    naVector.add(names.get(names.size()-1));
	    System.out.println(naVector);
	    naVector.set(0, "Ganesh");
	    System.out.println(naVector);
	    naVector.remove(0);
	    System.out.println(naVector);
	    for(int i=0;i<names.size();i++) {
	    	System.out.println(names.get(i));
	    }
	    List<String> ch=List.of("U","B","A","B");
	    String a="";
	    String c="";
	    for(int i=0;i<ch.size();i++) {
	    	c=ch.get(i);
	    	a=c+a;		
	    }
	    System.out.println(a);
	    List<Integer> num=List.of(3,-1,-2,-7,5,7,-10,-5);
	    
	   
	    for(int i=0;i<num.size();i++) {
	    	if(num.get(i)>0)
	    		System.out.println(num.get(i));
	    	
	    }
	    System.out.println();
	    for(int i=0;i<num.size();i++) {
	    	if(num.get(i)<0)
	    		
	    		System.out.println(num.get(i));
	    	
	    }
	    /*Collections.sort(num);
	    for(Integer i:num) {
	    	
	    	
	    }*/
	    
	}	
}
