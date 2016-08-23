package com.tutorial.thiskeyword;

public class HrManager {

	public static void main(String[] args) {
	
		Employee s1 = new Employee(1, "srikanth","20000");
		s1.display();
		
		
		// after 1 year ... incrase pay to 25000
		
		System.out.println("after 1 year ");
	s1.setSalary("25000");
	
	s1.display();
	
		
		
		

	}

}
