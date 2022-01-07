package com.aaludra.MultiThreading;
class Table1 extends SynchronizationExample{
	synchronized void print(int n) {
		for(int i=1;i<5;i++) {
			System.out.println(n*i);
		}
	}
}
class Table2 extends Table1{
	Table1 t;
	Table2(Table1 t){
		t.print(5);
	}
}
class Table3 extends Table1{
	Table1 t;
	Table3(Table1 t){
		t.print(10);
	}
}
public class SynchronizationExample extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table1 t1=new Table1();
		Table2 t2=new Table2(t1);
		Table3 t3=new Table3(t1);
		t2.start();
		t3.start();
		

	}

}
