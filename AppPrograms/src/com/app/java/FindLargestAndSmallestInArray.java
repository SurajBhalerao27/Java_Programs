package com.app.java;

public class FindLargestAndSmallestInArray {
	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 1, 5, 6, 4, 90, 60, 35, 40, 11 };
		int smallest = numbers[0];
		int largest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest)
				largest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
			System.out.println("Largest is " + largest);
			System.out.println("Smallest is " + smallest);
		}
	}
}
