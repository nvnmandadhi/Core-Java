package com.tutorial.clone;

public class TestRunnerForClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Employee E1 = new Employee(1, "Srikanth");
		Employee E2 =(Employee) E1.clone();
		
		
		System.out.println(E1.employeeId+"fdfadsf"+E1.name);
		System.out.println(E2.employeeId+"fadfdas"+E2.name);

	}

}
