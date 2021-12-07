package com.aaludra;
import java.io.*;
import java.util.Arrays;
public class Task {
	private static int[] a=new int[]{50,40,60,70,80};
	public void getFirstValue() {
		
			System.out.println("FirstElement:"+a[0]);	
	}
	public void getLastValue() {
			System.out.println("Last Element"+a[4]);	
	}
	public void getAverage() {
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];	
		}
		int avg=sum/a.length;
		System.out.println("Average: "+avg);
		}
	public void Index() {
		
		int index=3;
		int value=90;
		System.out.println("Before:"+Arrays.toString(a));
		for(int i=a.length-1;i>=index;i--) {
			a[i]=a[i-1];
		}
		a[index]=value;
		
		System.out.println("After:"+Arrays.toString(a));
	}
	public void count() {
		 int[] b ={1,2,1,3,5,1,1,6,4,4,4};  
	       
	        int[] c = new int [b.length];  
	        int visited = -1;  
	        for(int i = 0; i < b.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < b.length; j++){  
	                if(b[i] == b[j]){  
	                    count++;  
	                     
	                    c[j] = visited;  
	                }  
	            }  
	            if(c[i] != visited)  
	                c[i] = count;  
	        }  
	  
	       
	        
	        for(int i = 0; i < c.length; i++){  
	            if(c[i] != visited)  
	                System.out.println(b[i] + "-" + c[i]);  
	        }  
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t=new Task();
		t.getFirstValue();
		System.out.println("--------------------");
		t.getLastValue();
		System.out.println("--------------------");
		t.getAverage();
		System.out.println("--------------------");
		t.Index();
		System.out.println("--------------------");
		t.count();
	

	}

}
