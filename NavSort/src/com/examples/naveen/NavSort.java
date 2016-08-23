package com.examples.naveen;

import java.util.Scanner;

public class NavSort {

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

	private static void bubbleSort(int[] arr) {
		
		boolean swap=true;
		int pass=0;
		int temp;
		
		while(swap){
			
			pass++;
			swap = false;
			
			for(int i=0;i<arr.length-pass;i++){
				
				if(arr[i]>arr[i+1]){
					
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
					swap = true;
				}
			}
		}
		
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]+", ");
		}
	}

}
