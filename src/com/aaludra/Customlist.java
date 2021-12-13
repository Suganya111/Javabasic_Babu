package com.aaludra;
import java.util.ArrayList;
public class Customlist<T> {
	ArrayList<T> name=new ArrayList<>();
	public void add(T a) {
		name.add(a);
	}
	public void remove(T a) {
		name.remove(a);
	}
	public String toString() {
		return name.toString();
		
	}
	public T get(int index) {
		// TODO Auto-generated method stub
		return name.get(index);
	}

}
