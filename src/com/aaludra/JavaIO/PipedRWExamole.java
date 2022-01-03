package com.aaludra.JavaIO;

import java.io.*;

public class PipedRWExamole {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PipedWriter pw = new PipedWriter();
		PipedReader pr = new PipedReader();
		pw.connect(pr);
		Thread t1 = new Thread() {
			public void run() {
				try {
					for (int i = 1; i <= 5; i++) {

						pw.write(i);
						System.out.println("\nPipe is Writing " + i);
						Thread.sleep(1000);

					}
					pw.close();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		Thread t2 = new Thread() {
			public void run() {
				int i;
				try {
					while ((i = pr.read()) != -1) {
						System.out.print("Pipe is Reading " + i);

					}
					pr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		t1.start();
		t2.start();

	}

}
