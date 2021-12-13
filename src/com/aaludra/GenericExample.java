package com.aaludra;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customlist<String> list=new Customlist<>();
		list.add("element 1");
		list.add("element 2");
		String value=list.get(0);
		System.out.println(list);
		System.out.println(value);
		Customlist<Integer> list2=new Customlist<>();
		list2.add(Integer.valueOf(5));
		list2.add(Integer.valueOf(10));
		Integer num=list2.get(1);
		System.out.println(list2);
		System.out.println(num);


	}

}
