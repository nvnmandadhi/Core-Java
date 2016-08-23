package com.tutorial.BasicIO;

import java.io.FileWriter;
import java.io.IOException;

public class ExampleWriter {

	public static void main(String[] args) throws IOException {
		
		
		String sample = "Lets write something to a file";
		
		FileWriter fileWriter =  new FileWriter("/Users/srikanthbalagoni/Documents/Edu/Java Interview Questions/JavaStudentWorkspace/JAVA/src/com/tutorial/BasicIO/writerFile.txt");
		
		fileWriter.write(sample);
		
		
		fileWriter.close();
		
		

	}

}
