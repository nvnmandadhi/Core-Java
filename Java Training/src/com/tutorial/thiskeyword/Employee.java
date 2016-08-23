package com.tutorial.thiskeyword;

public class Employee extends Wipro {
	
	int employeeNum; // 1set and 1 get
	String name;
	String salary;
	
	Employee(){
		
		System.out.println("I am in default Constructor... Creating object of Employee");
		
	}
	
	
	Employee(int employeeNum,String name,String salary){
		
		super();
		
		System.out.println(" I am in Constructor with Parameters... I am assigning values to rollNum and Name after default constructor create"
				+ "the object");
		
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
