package com.aaludra;

public class ThreadJoinExampleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJoinExample th1 = new ThreadJoinExample();
		ThreadJoinExample th2 = new ThreadJoinExample();
		ThreadJoinExample th3 = new ThreadJoinExample();

		th1.start();

		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());

			th1.join();
		}

		catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}

		th2.start();

		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());
			th2.join();
		}

		catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}

		th3.start();
	}

}
