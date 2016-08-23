package com.java.examples;

import java.util.Scanner;
class NumberLogic{

	public void FindFibonacci(int x){
		
			long[] arr=new long[x];
			
			arr[0] = 0;
			arr[1] = 1;
			System.out.println(arr[0]);
			System.out.println(arr[1]);

			for(int i=2;i<x;i++){
				
						arr[i]= arr[i-2] + arr[i-1];				
						System.out.println(arr[i]);
				}
		}
}

public class Fibonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		NumberLogic obj=new NumberLogic();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many first fibonnaci numbers do you want?");
		int i=sc.nextInt();
		
		obj.FindFibonacci(i);
	}

}
