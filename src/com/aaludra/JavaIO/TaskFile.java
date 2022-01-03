package com.aaludra.JavaIO;

import java.io.*;

public class TaskFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File sourceFolder = new File("C:\\eclipse\\java IO\\Task");
		sourceFolder.mkdir();
		BufferedReader[] b = new BufferedReader[3];
		b[0] = new BufferedReader(new FileReader("C:\\eclipse\\java IO\\Task\\File1.txt"));
		b[1] = new BufferedReader(new FileReader("C:\\eclipse\\java IO\\Task\\File2.txt"));
		b[2] = new BufferedReader(new FileReader("C:\\eclipse\\java IO\\Task\\File3.txt"));
		String s;
		for (File folder : sourceFolder.listFiles()) {
			String name = folder.getName();
			s = name.substring(name.lastIndexOf(".") + 1);
			if (s.equals("txt")) {

				boolean bool = false;
				while (!bool) {
					for (BufferedReader b1 : b) {
						String l = b1.readLine();
						if (l == null) {
							bool = true;
							break;
						}
						System.out.println(l);
					}
				}

			}
		}

	}
}
