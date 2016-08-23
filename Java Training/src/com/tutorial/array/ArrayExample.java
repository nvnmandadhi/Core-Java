package com.tutorial.array;

public class ArrayExample {
	
	
	
	
 public int[] getArray(){

	 
	final int employeeId[] = new int[10] ; // instantiation
	
	
		
	employeeId[0] = 100;
	employeeId[1] = 101;
	employeeId[2] = 102;
	employeeId[3] = 103;
	employeeId[4] = 104;
	
	
	 
	 return employeeId;
			 
 }
	
	
	

}



/****

Array : Its a collection of similar datatypes(int,String,objects) that have contiguos memory location.

If you wnat to create an array , we need to specify size. This size will fixed.


Advantages :

1) Code Optimization : we can retrieve and sort the data easily
2) Random Access : we can randomly access any rows in a box


Disadvantage : Size is fixed


Single Dimension Array

Final keyword with Array : We wont be able to reinstantiate the array once assigned. But can modified the values in it


For Loop ; for (init;condition;increment or decrement) { }

while loop ; while (condition){  }

do - while loop : it will execute the program atleast once and then checks for condition

Enhanced For loop : 
iterator :

***/