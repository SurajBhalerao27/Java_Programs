package array;

public class MaxNumFromArray {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 91, 9, 4, 666, 3 };
		System.out.println(maxNum(arr));
		System.out.println(maxInRange(arr, 1, 6));
	}

	private static int maxNum(int[] arr) {
		int maxVal = arr[0];
		for (int element : arr) {
			if (element > maxVal) {
				maxVal = element;
			}
		}
		return maxVal;
	}

	private static int maxInRange(int[] arr, int start, int end) {
		int maxVal = arr[start];
		for (int i = start; i < end; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
}
