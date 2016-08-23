package com.tutorial.BasicIO;

import java.io.*;

public class CopyBytes {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream in = null;
		
		try{
			
			in = new FileInputStream("/Users/srikanthbalagoni/Documents/Edu/Java Interview Questions/JavaStudentWorkspace/JAVA/src/com/tutorial/BasicIO/sample.txt");
			
			int i;
			while((i = in.read())!= -1){
				
				System.out.println(i);
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
		} finally{
			
			in.close();
		}
		

	}

}
