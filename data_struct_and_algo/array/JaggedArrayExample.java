package array;

public class JaggedArrayExample {
	public static void main(String[] args) {
		int[][] mainArray = { { 1, 8, 9 }, { 8, 2, 6, 69, 88 }, { 7, 2 } };

		for (int[] element : mainArray) {
			for (int element2 : element) {
				System.out.print(element2 + " ");
			}
			System.out.println();
		}
	}
}
