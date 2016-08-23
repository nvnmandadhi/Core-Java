package com.tutorial.array;

public class Employee {
	
	int employeeNum;
	String name;
	String salary;
	
	
	Employee(int employeeNum,String name,String salary){
		
		this.employeeNum=employeeNum;   
		this.name=name;
		this.salary=salary;
		
		
	}
	

	public int getEmployeeNum() {
		return employeeNum;
	}


	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	void display(){
		System.out.println("rollNUm :"+employeeNum);
		System.out.println("Student Name :"+name);
		System.out.println("Salary :"+salary);
	}
	
	
	
	

}
