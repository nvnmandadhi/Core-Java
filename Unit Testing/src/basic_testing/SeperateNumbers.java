package basic_testing;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SeperateNumbers {

	public static void main(String[] args) {
		readLline();
	}

	private static void readLline() {

		System.out.println("Enter the line");

		@SuppressWarnings("resource")
		StringTokenizer obj = new StringTokenizer(new Scanner(System.in).nextLine());

		while (obj.hasMoreTokens()) {

			System.out.println(obj.nextToken());

			String[] numData = obj.nextToken().split("[^0-9]");

			for (String num : numData) {
				System.out.println(num);
			}
		}

	}

}
