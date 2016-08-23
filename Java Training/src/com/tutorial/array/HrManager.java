package com.tutorial.array;

public class HrManager {
	
	
	public Employee[] getTotalRecords(){
		
		
		Employee E1= new Employee(1, "srikanth", "10k");  // one record of paper
		Employee E2= new Employee(1, "srikanth", "10k");  // second record of paper
		Employee E3= new Employee(1, "srikanth", "10k");
		Employee E4= new Employee(1, "srikanth", "10k");
		
		
		Employee[] employee = {E1,E2,E3,E4};
		
		return employee;
	}
}
