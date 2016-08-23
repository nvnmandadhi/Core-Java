package com.naveen;

import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) throws IOException {

		int[] arr = { -8, 10, 5, 8, 3, 0, 2, -19 };

		try {
			bubbleSort(arr);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void bubbleSort(int[] arr) throws InterruptedException {

		int temp;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("Iteration: " + (i + 1) + " " + Arrays.toString(arr));
			Thread.sleep(500);
		}
	}
}
