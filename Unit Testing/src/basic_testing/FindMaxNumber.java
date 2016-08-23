package basic_testing;

public class FindMaxNumber {

	int findMax(int[] list) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.length; i++) {
			if (list.length == 0)
				throw new RuntimeException("Empty List");
			if (list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		FindMaxNumber obj = new FindMaxNumber();
		System.out.println(obj.findMax(new int[] { 60, 7, -8, 9 }));
		System.out.println(obj.findMax(new int[] {}));
	}

}
