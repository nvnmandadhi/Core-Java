package questions;

import java.util.Scanner;

public class StringRevererse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		String obj = new Scanner(System.in).next();
		reverse(obj);
	}

	private static void reverse(String obj) {
		char[] in = obj.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin) {
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}

		System.out.println(new String(in));
	}

}
