package com.tutorial.BasicIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {

	public static void main(String[] args) throws IOException {
		
		FileReader fileReader = new FileReader("/Users/srikanthbalagoni/Documents/Edu/Java Interview Questions/JavaStudentWorkspace/JAVA/src/com/tutorial/BasicIO/sample.txt");
		FileWriter fileWriter =  new FileWriter("/Users/srikanthbalagoni/Documents/Edu/Java Interview Questions/JavaStudentWorkspace/JAVA/src/com/tutorial/BasicIO/writerFile.txt");
		
		int data = fileReader.read();
        while (data!=-1) {
			
        	fileWriter.write((char)data);
        	data = fileReader.read(); 
			
		}
        fileWriter.close();
        fileReader.close();

	}

}
