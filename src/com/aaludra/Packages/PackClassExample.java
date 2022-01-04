package com.aaludra.Packages;
import com.aaludra.Encapsulation.ReadOnlyExample;//Access class in another Package
public class PackClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadOnlyExample re=new ReadOnlyExample();
		System.out.println(re.getRoll()+" "+re.getName()+" "+re.getDept()+" "+re.getClj());

	}

}
