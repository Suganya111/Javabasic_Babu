package com.aaludra;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SetExample {
	static Set<String> set=Set.of("Babu","Hari","Karthi");

	public void hashset() {
		Set<String> hashset = new HashSet<String>(set);

		hashset.add("Kishore");
		System.out.println(hashset.size());
		System.out.println(hashset);
		Iterator<String> iteratorobj = hashset.iterator();
		while (iteratorobj.hasNext()) {
			if (iteratorobj.next().startsWith("Ka")) {
				iteratorobj.remove();
				System.out.println(hashset);
			}
		}
	}
	public void treeset() {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(10)	;
		set.add(9);
		set.add(8);
		set.add(7);
		System.out.println(set);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetExample obj = new SetExample();
		obj.hashset();
		obj.treeset();

	}

}
