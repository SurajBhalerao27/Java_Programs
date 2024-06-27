package searching;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {8, 7, 9, 2, 3, 4, 6, 3, 5, 3};
		System.out.println(binarySearch(arr, 3));

		System.out.println(digit(-22458));
	}

	// LinearSearch Example
	static int binarySearch(int[] arr, int element) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	// find digit in a number
	static int digit(int num) {
		if (num < 0) {
			num *= -1; // to change negative number to positive
		}
		return (int) Math.log10(num) + 1;
	}
}