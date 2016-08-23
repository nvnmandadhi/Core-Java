package com.java.examples;

import java.util.Scanner;

class BubbleSort {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of numbers to be sorted");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the numbers one by one and press enter after each number");
		
		for(int j=0;j<arr.length;j++){
			arr[j]= Integer.parseInt(sc.next());
		}
		
		bubbleSort(arr); //Array is passed by reference in Java
}
	public static void bubbleSort(int[] arr){
		boolean swapped = true;
	      int pass = 0;
	      int tmp;
	      while (swapped) {
	            swapped = false;
	            pass++;
	            for (int i = 0; i < arr.length - pass; i++) {                                       
	                  if (arr[i] > arr[i + 1]) {                          
	                        tmp = arr[i];
	                        arr[i] = arr[i + 1];
	                        arr[i + 1] = tmp;
	                        swapped = true;
	                  }
	            }                
	      }
	      
	      System.out.print("Sorted numbers are: ");
	      
	      for(int p=0;p<arr.length;p++){
	    	  
	    	    System.out.print(arr[p]+" ");
	      }
	}
}

