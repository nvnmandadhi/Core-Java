package questions;

import java.util.Scanner;

class Numbers {

    int a, b, n, i;
    double val, sum, previous;

    Double obj;

    public Numbers() {
	doStuff();
    }

    void doStuff() {

	/*
	 * Enter your code here. Read input from STDIN. Print output to STDOUT.
	 * Your class should be named Solution.
	 */

	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();

	for (int p = 1; p <= t; p++) {

	    a = sc.nextInt();
	    b = sc.nextInt();
	    n = sc.nextInt();

	    for (i = 0; i < n; i++) {

		val = b * Math.pow(2, i);
		previous = (val + previous);
		sum = a + previous;

		obj = new Double(sum);

		System.out.print(obj.intValue() + " ");
	    }

	    System.out.println("");
	    previous = 0;
	    sum = obj = 0.0;
	}
	sc.close();
    }
}

public class App {
    public static void main(String[] args) {
	new Numbers();

    }
}