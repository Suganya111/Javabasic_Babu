package com.aaludra;

public class StringBufferExample {
	public void join(String[] s) {
		
		StringBuffer sb=new StringBuffer("");
		for(String name:s) {
			
			sb.append(name);
			
		}
		//System.out.println(sentence);
		sb.insert(2, "Navin");
		sb.replace(2, 6,"Selva");
		System.out.println(sb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferExample sbe=new StringBufferExample();
		String[] s= {"Babu","Karthi","Hari"};
		sbe.join(s);

	}

}
