package factorial_recursion;

import java.util.Scanner;

/** Factorial using Recursion */
public class Factorial {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");

	int i = sc.nextInt();

	System.out.printf("Factorial is :" + calculateFactorial(i));

	sc.close();
    }

    private static long calculateFactorial(int i) {

	if (i == 1) {
	    return 1;
	}

	return calculateFactorial(i - 1) * i;
    }

}
