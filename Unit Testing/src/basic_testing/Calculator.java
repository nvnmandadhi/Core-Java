package basic_testing;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = scanner.nextInt();
		
		System.out.println("Enter second number");
		int b = scanner.nextInt();

		System.out.println("Which operation?");
		String action = scanner.next();

		scanner.close();

		System.out.println("Result is: "+ doFunction(a, b, action));
	}

	private static double doFunction(int a, int b, String action) {
		switch (action) {
		case "add":
			return a + b;
		case "div":
			return (double) a / b;
		case "mult":
			return a * b;
		case "sub":
			return a - b;
		default:
			throw new RuntimeException("Try again!!!!");
		}
	}

}
