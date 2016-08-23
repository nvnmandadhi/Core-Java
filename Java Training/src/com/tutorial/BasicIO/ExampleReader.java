package com.tutorial.BasicIO;

import java.io.FileReader;
import java.io.IOException;

public class ExampleReader {

	public static void main(String[] args) throws IOException {
		
		
		FileReader fileReader = null;
		
		
		try{
			
			fileReader = new FileReader("/Users/srikanthbalagoni/Documents/Edu/Java Interview Questions/JavaStudentWorkspace/JAVA/src/com/tutorial/BasicIO/sample.txt");
			
			int data = fileReader.read(); // This statement actually reads one alphabet at a time
			System.out.println(data);
			while(data !=-1){
				
				System.out.println((char)data); // T
				data = fileReader.read(); // read next char
				System.out.println("-->");
			}
			
		}catch(Exception e){
			
		}finally{
			
			fileReader.close();
			
		}

	}

}


// declare the fileReader or FileInputStream based on character or byte
// assign it to null
// open try catch because we might run into exceptions
// as we open stream or reader connection .. let make sure we close them such that resources are freed after our program .. We use 
// finally block