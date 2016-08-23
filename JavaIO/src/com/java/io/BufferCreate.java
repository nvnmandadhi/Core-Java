package com.java.io;

import java.io.*;

public class BufferCreate {

	public static void main(String[] args) throws IOException {

		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter("Hello.txt"));
			br.write("Hello this is a new String");

		} catch (IOException e) {

			e.printStackTrace();
			
		} finally {
			
			br.close();
		}

	}

}
