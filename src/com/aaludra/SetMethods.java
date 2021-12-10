package com.aaludra;
import java.util.*;

public class SetMethods {
static List<Character> link=List.of('A','Z','B','A','Z');
public void treeset() {
	Set<Character> treeset=new TreeSet(link);
	System.out.println(treeset);
}
public void linkedhash() {
	Set<Character> linkedhash=new LinkedHashSet(link);
	System.out.println(linkedhash);
}
public void hashset() {
	Set<Character> hashset=new HashSet(link);
	System.out.println(hashset);
}
public void subset() {
	Set<Integer> number=Set.of(49,50,30,68,70);
	TreeSet<Integer> tree=new TreeSet<>(number);
	System.out.println(tree.headSet(50));
	System.out.println(tree.tailSet(50));
	System.out.println(tree.subSet(50,70));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetMethods obj=new SetMethods();
		obj.treeset();
		obj.linkedhash();
		obj.hashset();
		obj.subset();

	}

}
