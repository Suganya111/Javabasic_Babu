package com.aaludra;

public class ExtendsExample {
	public static <T extends Comparable<T>> T Maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Max of:%d,%d,%d is %d\n\n", 3, 4, 5, Maximum(3, 4, 5));
		System.out.printf("Max of:%.1f,%.1f,%.1f is %.1f\n\n", 5.3f, 3.4, 4.6, Maximum(5.3, 3.4, 4.6));
	}

}
