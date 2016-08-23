package com.java.arrays;

public class Dog implements Animals{
	
	String name;
	String type;
	
	public Dog(String string, String string2) {
		this.name = string;
		this.type = string2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String display() {
		
		return name;
	}
	
}
