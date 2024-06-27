package array;

import java.util.Arrays;

public class SwappingTwoIndexesOfArray {
	public static void main(String[] args) {
		int[] arr = { 8, 9, 7, 2, 95, 52, 411 };
//		int firstIdx = 0;
//		int endIdx = arr.length - 1;

//		swap(arr, firstIdx, endIdx);
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}
}
