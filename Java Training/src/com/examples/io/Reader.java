package com.examples.io;

import java.io.*;

public class Reader {

	public static void main(String[] args) throws IOException {
		
			FileWriter fileWriter = new FileWriter("Hello.txt");
			
			fileWriter.write("This is my first String");
			
			System.out.println("File has been created.");
			
			fileWriter.close();
			
			File file = new File("Hello.txt");
			
			if(file.exists()){
				System.out.println("File exists!");
			}
			
			file = new File("Files");
			file.mkdir();
			
			if(file.exists()){
				System.out.println("Folder exists at : "+file.getAbsoluteFile());
			}

	}
}
