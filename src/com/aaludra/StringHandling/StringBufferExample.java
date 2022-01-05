package com.aaludra.StringHandling;

public class StringBufferExample {//append

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb.capacity());
		sb.append("Babu");
		System.out.println(sb);
		sb.insert(2, "prasath");
		System.out.println(sb);
		sb.replace(1, 4, "selva");
		System.out.println(sb);
		sb.delete(4, 7);
		System.out.println(sb);
		//System.out.println(sb.capacity());
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.append("Hell");
		System.out.println(sb2.capacity());
		sb.append("Java");
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(10);
		System.out.println(sb2.capacity());
		

	}

}
