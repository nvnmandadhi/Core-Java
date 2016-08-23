package com.java.io;

import java.io.*;

public class ReadFromFile {

	public static void main(String[] args) {

		File myFile = new File("Hello.txt");

		try {
			BufferedReader br = new BufferedReader(new FileReader(myFile));

			String str = null;

			while ((str = br.readLine()) != null) {

				System.out.println(str);
			}
			
			br.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
