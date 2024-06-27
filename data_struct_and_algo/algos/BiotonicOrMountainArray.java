package algos;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class BiotonicOrMountainArray {
	public static void main(String[] args) {
		int[] arr = {0, 7, 8, 10, 5, 2};
		System.out.println(ansByLinear(arr));
		System.out.println(ansByBinary(arr));
	}

	// this is also right but it is slower and consumes more memory
	// and it returns the number
	static int ansByLinear(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int ansByBinary(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
}
