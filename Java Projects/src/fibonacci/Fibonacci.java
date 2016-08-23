package fibonacci;

import java.util.Scanner;

/** Naive recursive approach */
public class Fibonacci {

    static int fibo = 0;

    public static void main(String[] args) {

	@SuppressWarnings("resource")
	int n = new Scanner(System.in).nextInt();
	System.out.printf("The value of " + n + "th " + "fibonacci number is: %d%n", fibonacci(n));
    }

    private static int fibonacci(int n) {

	if (n <= 2)
	    return 1;
	else
	    fibo = fibonacci(n - 1) + fibonacci(n - 2);
	return fibo;
    }

}
