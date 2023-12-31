package com.app.java;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		boolean blnFound = false;
		int[][] array = new int[][] { { 1, 2, 3, 4, 5 }, { 10, 20, 40, 50, 30 } };

		System.out.println("Searching '30' ...");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 30) {
					blnFound = true;
					if (blnFound == true)
						System.out.println("'30' found");
				}
			}
		}

	}

}
