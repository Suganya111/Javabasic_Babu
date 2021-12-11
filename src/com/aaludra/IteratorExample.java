package com.aaludra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Better do not specify numbers in classname
 * It is better to perform it in a method and call the method in main function
 * iterator variable name can be changed
 */
public class IteratorExample {

	public static void print() {
		// TODO Auto-generated method stub

		List<String> name=List.of("Babu","Hari","Kishore");
		System.out.println(name);
		List<String> nameArrayList=new ArrayList<String>(name);
		for(String al:nameArrayList) {
			if(al.endsWith("i")) {
				System.out.println(al);
			}
		}
		Iterator<String> iteratorObj = nameArrayList.iterator();
		while (iteratorObj.hasNext()) {
			if (iteratorObj.next().endsWith("ore")) {
				iteratorObj.remove();
				System.out.println(nameArrayList);
			}
		}
	}

	public static void main(String[] args) {
		print();
	}


}


